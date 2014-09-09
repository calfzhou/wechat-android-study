package com.tencent.kingkong.database;

import android.os.SystemClock;
import com.tencent.kingkong.support.CancellationSignal;
import com.tencent.kingkong.support.Log;
import com.tencent.kingkong.support.OperationCanceledException;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

public final class SQLiteConnectionPool
  implements Closeable
{
  public static final int CONNECTION_FLAG_INTERACTIVE = 4;
  public static final int CONNECTION_FLAG_PRIMARY_CONNECTION_AFFINITY = 2;
  public static final int CONNECTION_FLAG_READ_ONLY = 1;
  private static final long CONNECTION_POOL_BUSY_MILLIS = 30000L;
  private static final String TAG = "MicroMsg.kkdb.SQLiteConnectionPool";
  private final WeakHashMap mAcquiredConnections = new WeakHashMap();
  private int mArithmetic;
  private final ArrayList mAvailableNonPrimaryConnections = new ArrayList();
  private SQLiteConnection mAvailablePrimaryConnection;
  private final SQLiteDatabaseConfiguration mConfiguration;
  private final AtomicBoolean mConnectionLeaked = new AtomicBoolean();
  private SQLiteConnectionPool.ConnectionWaiter mConnectionWaiterPool;
  private SQLiteConnectionPool.ConnectionWaiter mConnectionWaiterQueue;
  private boolean mIsInitWaited;
  private boolean mIsOpen;
  private final Object mLock = new Object();
  private int mMaxConnectionPoolSize;
  private int mNextConnectionId;
  private String mPassword;
  private int mlockedDevice;

  static
  {
    if (!SQLiteConnectionPool.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }

  private SQLiteConnectionPool(SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration, int paramInt)
  {
    this.mConfiguration = new SQLiteDatabaseConfiguration(paramSQLiteDatabaseConfiguration);
    setMaxConnectionPoolSizeLocked(paramInt);
  }

  private void cancelConnectionWaiterLocked(SQLiteConnectionPool.ConnectionWaiter paramConnectionWaiter)
  {
    if ((paramConnectionWaiter.mAssignedConnection != null) || (paramConnectionWaiter.mException != null))
      return;
    Object localObject1 = null;
    Object localObject2 = this.mConnectionWaiterQueue;
    if (localObject2 == paramConnectionWaiter)
    {
      if (localObject1 == null)
        break label94;
      localObject1.mNext = paramConnectionWaiter.mNext;
    }
    while (true)
    {
      paramConnectionWaiter.mException = new OperationCanceledException();
      LockSupport.unpark(paramConnectionWaiter.mThread);
      wakeConnectionWaitersLocked();
      return;
      assert (localObject2 != null);
      SQLiteConnectionPool.ConnectionWaiter localConnectionWaiter = ((SQLiteConnectionPool.ConnectionWaiter)localObject2).mNext;
      localObject1 = localObject2;
      localObject2 = localConnectionWaiter;
      break;
      label94: this.mConnectionWaiterQueue = paramConnectionWaiter.mNext;
    }
  }

  private void closeAvailableConnectionsAndLogExceptionsLocked()
  {
    closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
    if (this.mAvailablePrimaryConnection != null)
    {
      closeConnectionAndLogExceptionsLocked(this.mAvailablePrimaryConnection);
      this.mAvailablePrimaryConnection = null;
    }
  }

  private void closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked()
  {
    int i = this.mAvailableNonPrimaryConnections.size();
    for (int j = 0; ; j++)
    {
      if (j >= i)
      {
        this.mAvailableNonPrimaryConnections.clear();
        return;
      }
      closeConnectionAndLogExceptionsLocked((SQLiteConnection)this.mAvailableNonPrimaryConnections.get(j));
    }
  }

  private void closeConnectionAndLogExceptionsLocked(SQLiteConnection paramSQLiteConnection)
  {
    try
    {
      paramSQLiteConnection.close();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      Log.e("MicroMsg.kkdb.SQLiteConnectionPool", "Failed to close connection, its fate is now in the hands of the merciful GC: " + paramSQLiteConnection, new Object[] { localRuntimeException });
    }
  }

  private void closeExcessConnectionsAndLogExceptionsLocked()
  {
    int j;
    for (int i = this.mAvailableNonPrimaryConnections.size(); ; i = j)
    {
      j = i - 1;
      if (i <= -1 + this.mMaxConnectionPoolSize)
        return;
      closeConnectionAndLogExceptionsLocked((SQLiteConnection)this.mAvailableNonPrimaryConnections.remove(j));
    }
  }

  private void discardAcquiredConnectionsLocked()
  {
    markAcquiredConnectionsLocked(SQLiteConnectionPool.AcquiredConnectionStatus.DISCARD);
  }

  private void dispose(boolean paramBoolean)
  {
    if (!paramBoolean);
    synchronized (this.mLock)
    {
      throwIfClosedLocked();
      this.mIsOpen = false;
      closeAvailableConnectionsAndLogExceptionsLocked();
      int i = this.mAcquiredConnections.size();
      if (i != 0)
        Log.i("MicroMsg.kkdb.SQLiteConnectionPool", "The connection pool for " + this.mConfiguration.label + " has been closed but there are still " + i + " connections in use.  They will be closed as they are released back to the pool.");
      wakeConnectionWaitersLocked();
      return;
    }
  }

  private void finishAcquireConnectionLocked(SQLiteConnection paramSQLiteConnection, int paramInt)
  {
    boolean bool;
    if ((paramInt & 0x1) != 0)
      bool = true;
    try
    {
      while (true)
      {
        paramSQLiteConnection.setOnlyAllowReadOnlyOperations(bool);
        this.mAcquiredConnections.put(paramSQLiteConnection, SQLiteConnectionPool.AcquiredConnectionStatus.NORMAL);
        return;
        bool = false;
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      Log.e("MicroMsg.kkdb.SQLiteConnectionPool", "Failed to prepare acquired connection for session, closing it: " + paramSQLiteConnection + ", connectionFlags=" + paramInt);
      closeConnectionAndLogExceptionsLocked(paramSQLiteConnection);
      throw localRuntimeException;
    }
  }

  private static int getPriority(int paramInt)
  {
    if ((paramInt & 0x4) != 0)
      return 1;
    return 0;
  }

  private boolean isSessionBlockingImportantConnectionWaitersLocked(boolean paramBoolean, int paramInt)
  {
    SQLiteConnectionPool.ConnectionWaiter localConnectionWaiter = this.mConnectionWaiterQueue;
    if (localConnectionWaiter != null)
    {
      int i = getPriority(paramInt);
      do
      {
        if (i > localConnectionWaiter.mPriority)
          break;
        if ((paramBoolean) || (!localConnectionWaiter.mWantPrimaryConnection))
          return true;
        localConnectionWaiter = localConnectionWaiter.mNext;
      }
      while (localConnectionWaiter != null);
    }
    return false;
  }

  private void logConnectionPoolBusyLocked(long paramLong, int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramLong != 0L)
    {
      Thread localThread = Thread.currentThread();
      localStringBuilder.append("The connection pool for database '").append(this.mConfiguration.label);
      localStringBuilder.append("' has been unable to grant a connection to thread ");
      localStringBuilder.append(localThread.getId()).append(" (").append(localThread.getName()).append(") ");
      localStringBuilder.append("with flags 0x").append(Integer.toHexString(paramInt));
      localStringBuilder.append(" for ").append(0.001F * (float)paramLong).append(" seconds.\n");
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator2;
    int i;
    int j;
    if (!this.mAcquiredConnections.isEmpty())
    {
      localIterator2 = this.mAcquiredConnections.keySet().iterator();
      i = 0;
      j = 0;
      if (localIterator2.hasNext());
    }
    while (true)
    {
      int k = this.mAvailableNonPrimaryConnections.size();
      if (this.mAvailablePrimaryConnection != null)
        k++;
      localStringBuilder.append("Connections: ").append(j).append(" active, ");
      localStringBuilder.append(i).append(" idle, ");
      localStringBuilder.append(k).append(" available.\n");
      Iterator localIterator1;
      if (!localArrayList.isEmpty())
      {
        localStringBuilder.append("\nRequests in progress:\n");
        localIterator1 = localArrayList.iterator();
      }
      while (true)
      {
        if (!localIterator1.hasNext())
        {
          Log.w("MicroMsg.kkdb.SQLiteConnectionPool", localStringBuilder.toString());
          return;
          String str2 = ((SQLiteConnection)localIterator2.next()).describeCurrentOperationUnsafe();
          if (str2 != null)
          {
            localArrayList.add(str2);
            j++;
            break;
          }
          i++;
          break;
        }
        String str1 = (String)localIterator1.next();
        localStringBuilder.append("  ").append(str1).append("\n");
      }
      i = 0;
      j = 0;
    }
  }

  private void markAcquiredConnectionsLocked(SQLiteConnectionPool.AcquiredConnectionStatus paramAcquiredConnectionStatus)
  {
    ArrayList localArrayList;
    Iterator localIterator;
    int i;
    if (!this.mAcquiredConnections.isEmpty())
    {
      localArrayList = new ArrayList(this.mAcquiredConnections.size());
      localIterator = this.mAcquiredConnections.entrySet().iterator();
      if (localIterator.hasNext())
        break label64;
      i = localArrayList.size();
    }
    for (int j = 0; ; j++)
    {
      if (j >= i)
      {
        return;
        label64: Map.Entry localEntry = (Map.Entry)localIterator.next();
        SQLiteConnectionPool.AcquiredConnectionStatus localAcquiredConnectionStatus = (SQLiteConnectionPool.AcquiredConnectionStatus)localEntry.getValue();
        if ((paramAcquiredConnectionStatus == localAcquiredConnectionStatus) || (localAcquiredConnectionStatus == SQLiteConnectionPool.AcquiredConnectionStatus.DISCARD))
          break;
        localArrayList.add((SQLiteConnection)localEntry.getKey());
        break;
      }
      this.mAcquiredConnections.put((SQLiteConnection)localArrayList.get(j), paramAcquiredConnectionStatus);
    }
  }

  private SQLiteConnectionPool.ConnectionWaiter obtainConnectionWaiterLocked(Thread paramThread, long paramLong, int paramInt1, boolean paramBoolean, String paramString, int paramInt2)
  {
    SQLiteConnectionPool.ConnectionWaiter localConnectionWaiter = this.mConnectionWaiterPool;
    if (localConnectionWaiter != null)
    {
      this.mConnectionWaiterPool = localConnectionWaiter.mNext;
      localConnectionWaiter.mNext = null;
    }
    while (true)
    {
      localConnectionWaiter.mThread = paramThread;
      localConnectionWaiter.mStartTime = paramLong;
      localConnectionWaiter.mPriority = paramInt1;
      localConnectionWaiter.mWantPrimaryConnection = paramBoolean;
      localConnectionWaiter.mSql = paramString;
      localConnectionWaiter.mConnectionFlags = paramInt2;
      return localConnectionWaiter;
      localConnectionWaiter = new SQLiteConnectionPool.ConnectionWaiter(null);
    }
  }

  public static SQLiteConnectionPool open(SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration, SQLiteDatabase.LockedDevice paramLockedDevice, String paramString, SQLiteDatabase.Arithmetic paramArithmetic, boolean paramBoolean)
  {
    return open(paramSQLiteDatabaseConfiguration, paramLockedDevice, paramString, paramArithmetic, paramBoolean, 1);
  }

  public static SQLiteConnectionPool open(SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration, SQLiteDatabase.LockedDevice paramLockedDevice, String paramString, SQLiteDatabase.Arithmetic paramArithmetic, boolean paramBoolean, int paramInt)
  {
    if (paramSQLiteDatabaseConfiguration == null)
      throw new IllegalArgumentException("configuration must not be null.");
    SQLiteConnectionPool localSQLiteConnectionPool = new SQLiteConnectionPool(paramSQLiteDatabaseConfiguration, paramInt);
    localSQLiteConnectionPool.mIsInitWaited = paramBoolean;
    localSQLiteConnectionPool.mlockedDevice = paramLockedDevice.getValue();
    localSQLiteConnectionPool.mPassword = paramString;
    localSQLiteConnectionPool.mArithmetic = paramArithmetic.getValue();
    localSQLiteConnectionPool.open();
    return localSQLiteConnectionPool;
  }

  private void open()
  {
    this.mAvailablePrimaryConnection = openConnectionLocked(this.mConfiguration, true);
    this.mIsOpen = true;
  }

  private SQLiteConnection openConnectionLocked(SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration, boolean paramBoolean)
  {
    int i = this.mNextConnectionId;
    this.mNextConnectionId = (i + 1);
    return SQLiteConnection.open(this, paramSQLiteDatabaseConfiguration, i, paramBoolean, this.mlockedDevice, this.mPassword, this.mArithmetic, this.mIsInitWaited);
  }

  private void reconfigureAllConnectionsLocked()
  {
    if (this.mAvailablePrimaryConnection != null);
    while (true)
    {
      int i;
      int j;
      SQLiteConnection localSQLiteConnection;
      try
      {
        this.mAvailablePrimaryConnection.reconfigure(this.mConfiguration);
        i = this.mAvailableNonPrimaryConnections.size();
        j = 0;
        if (j >= i)
        {
          markAcquiredConnectionsLocked(SQLiteConnectionPool.AcquiredConnectionStatus.RECONFIGURE);
          return;
        }
      }
      catch (RuntimeException localRuntimeException2)
      {
        Log.e("MicroMsg.kkdb.SQLiteConnectionPool", "Failed to reconfigure available primary connection, closing it: " + this.mAvailablePrimaryConnection, new Object[] { localRuntimeException2 });
        closeConnectionAndLogExceptionsLocked(this.mAvailablePrimaryConnection);
        this.mAvailablePrimaryConnection = null;
        continue;
        localSQLiteConnection = (SQLiteConnection)this.mAvailableNonPrimaryConnections.get(j);
      }
      try
      {
        localSQLiteConnection.reconfigure(this.mConfiguration);
        k = j;
        m = i;
        int n = k + 1;
        i = m;
        j = n;
      }
      catch (RuntimeException localRuntimeException1)
      {
        while (true)
        {
          Log.e("MicroMsg.kkdb.SQLiteConnectionPool", "Failed to reconfigure available non-primary connection, closing it: " + localSQLiteConnection, new Object[] { localRuntimeException1 });
          closeConnectionAndLogExceptionsLocked(localSQLiteConnection);
          ArrayList localArrayList = this.mAvailableNonPrimaryConnections;
          int k = j - 1;
          localArrayList.remove(j);
          int m = i - 1;
        }
      }
    }
  }

  private boolean recycleConnectionLocked(SQLiteConnection paramSQLiteConnection, SQLiteConnectionPool.AcquiredConnectionStatus paramAcquiredConnectionStatus)
  {
    if (paramAcquiredConnectionStatus == SQLiteConnectionPool.AcquiredConnectionStatus.RECONFIGURE);
    try
    {
      paramSQLiteConnection.reconfigure(this.mConfiguration);
      if (paramAcquiredConnectionStatus == SQLiteConnectionPool.AcquiredConnectionStatus.DISCARD)
      {
        closeConnectionAndLogExceptionsLocked(paramSQLiteConnection);
        return false;
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
      {
        Log.e("MicroMsg.kkdb.SQLiteConnectionPool", "Failed to reconfigure released connection, closing it: " + paramSQLiteConnection, new Object[] { localRuntimeException });
        paramAcquiredConnectionStatus = SQLiteConnectionPool.AcquiredConnectionStatus.DISCARD;
      }
    }
    return true;
  }

  private void recycleConnectionWaiterLocked(SQLiteConnectionPool.ConnectionWaiter paramConnectionWaiter)
  {
    paramConnectionWaiter.mNext = this.mConnectionWaiterPool;
    paramConnectionWaiter.mThread = null;
    paramConnectionWaiter.mSql = null;
    paramConnectionWaiter.mAssignedConnection = null;
    paramConnectionWaiter.mException = null;
    paramConnectionWaiter.mNonce = (1 + paramConnectionWaiter.mNonce);
    this.mConnectionWaiterPool = paramConnectionWaiter;
  }

  private void setMaxConnectionPoolSizeLocked(int paramInt)
  {
    if ((0x20000000 & this.mConfiguration.openFlags) != 0)
    {
      this.mMaxConnectionPoolSize = paramInt;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      Log.i("MicroMsg.kkdb.SQLiteConnectionPool", "main connectionPoolOpen in WAL,pool size is %d ", arrayOfObject2);
      return;
    }
    this.mMaxConnectionPoolSize = paramInt;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    Log.i("MicroMsg.kkdb.SQLiteConnectionPool", "main connectionPoolOpen ,pool size is %d ", arrayOfObject1);
  }

  private void throwIfClosedLocked()
  {
    if (!this.mIsOpen)
      throw new IllegalStateException("Cannot perform this operation because the connection pool has been closed.");
  }

  private SQLiteConnection tryAcquireNonPrimaryConnectionLocked(String paramString, int paramInt)
  {
    int i = this.mAvailableNonPrimaryConnections.size();
    if ((i > 1) && (paramString != null));
    for (int k = 0; ; k++)
    {
      if (k >= i)
      {
        if (i <= 0)
          break;
        SQLiteConnection localSQLiteConnection2 = (SQLiteConnection)this.mAvailableNonPrimaryConnections.remove(i - 1);
        finishAcquireConnectionLocked(localSQLiteConnection2, paramInt);
        return localSQLiteConnection2;
      }
      SQLiteConnection localSQLiteConnection3 = (SQLiteConnection)this.mAvailableNonPrimaryConnections.get(k);
      if (localSQLiteConnection3.isPreparedStatementInCache(paramString))
      {
        this.mAvailableNonPrimaryConnections.remove(k);
        finishAcquireConnectionLocked(localSQLiteConnection3, paramInt);
        return localSQLiteConnection3;
      }
    }
    int j = this.mAcquiredConnections.size();
    if (this.mAvailablePrimaryConnection != null)
      j++;
    if (j >= this.mMaxConnectionPoolSize)
      return null;
    SQLiteConnection localSQLiteConnection1 = openConnectionLocked(this.mConfiguration, false);
    finishAcquireConnectionLocked(localSQLiteConnection1, paramInt);
    return localSQLiteConnection1;
  }

  private SQLiteConnection tryAcquirePrimaryConnectionLocked(int paramInt)
  {
    SQLiteConnection localSQLiteConnection1 = this.mAvailablePrimaryConnection;
    if (localSQLiteConnection1 != null)
    {
      this.mAvailablePrimaryConnection = null;
      finishAcquireConnectionLocked(localSQLiteConnection1, paramInt);
      return localSQLiteConnection1;
    }
    Iterator localIterator = this.mAcquiredConnections.keySet().iterator();
    do
      if (!localIterator.hasNext())
      {
        SQLiteConnection localSQLiteConnection2 = openConnectionLocked(this.mConfiguration, true);
        finishAcquireConnectionLocked(localSQLiteConnection2, paramInt);
        return localSQLiteConnection2;
      }
    while (!((SQLiteConnection)localIterator.next()).isPrimaryConnection());
    return null;
  }

  // ERROR //
  private SQLiteConnection waitForConnection(String paramString, int paramInt, CancellationSignal paramCancellationSignal)
  {
    // Byte code:
    //   0: iload_2
    //   1: iconst_2
    //   2: iand
    //   3: ifeq +442 -> 445
    //   6: iconst_1
    //   7: istore 4
    //   9: aload_0
    //   10: getfield 62	com/tencent/kingkong/database/SQLiteConnectionPool:mLock	Ljava/lang/Object;
    //   13: astore 5
    //   15: aload 5
    //   17: monitorenter
    //   18: aload_0
    //   19: invokespecial 200	com/tencent/kingkong/database/SQLiteConnectionPool:throwIfClosedLocked	()V
    //   22: aload_3
    //   23: ifnull +7 -> 30
    //   26: aload_3
    //   27: invokevirtual 471	com/tencent/kingkong/support/CancellationSignal:throwIfCanceled	()V
    //   30: aconst_null
    //   31: astore 7
    //   33: iload 4
    //   35: ifne +11 -> 46
    //   38: aload_0
    //   39: aload_1
    //   40: iload_2
    //   41: invokespecial 473	com/tencent/kingkong/database/SQLiteConnectionPool:tryAcquireNonPrimaryConnectionLocked	(Ljava/lang/String;I)Lcom/tencent/kingkong/database/SQLiteConnection;
    //   44: astore 7
    //   46: aload 7
    //   48: ifnonnull +10 -> 58
    //   51: aload_0
    //   52: iload_2
    //   53: invokespecial 475	com/tencent/kingkong/database/SQLiteConnectionPool:tryAcquirePrimaryConnectionLocked	(I)Lcom/tencent/kingkong/database/SQLiteConnection;
    //   56: astore 7
    //   58: aload 7
    //   60: ifnull +9 -> 69
    //   63: aload 5
    //   65: monitorexit
    //   66: aload 7
    //   68: areturn
    //   69: iload_2
    //   70: invokestatic 248	com/tencent/kingkong/database/SQLiteConnectionPool:getPriority	(I)I
    //   73: istore 8
    //   75: invokestatic 480	android/os/SystemClock:uptimeMillis	()J
    //   78: lstore 9
    //   80: aload_0
    //   81: invokestatic 263	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   84: lload 9
    //   86: iload 8
    //   88: iload 4
    //   90: aload_1
    //   91: iload_2
    //   92: invokespecial 482	com/tencent/kingkong/database/SQLiteConnectionPool:obtainConnectionWaiterLocked	(Ljava/lang/Thread;JIZLjava/lang/String;I)Lcom/tencent/kingkong/database/SQLiteConnectionPool$ConnectionWaiter;
    //   95: astore 11
    //   97: aload_0
    //   98: getfield 107	com/tencent/kingkong/database/SQLiteConnectionPool:mConnectionWaiterQueue	Lcom/tencent/kingkong/database/SQLiteConnectionPool$ConnectionWaiter;
    //   101: astore 12
    //   103: aconst_null
    //   104: astore 13
    //   106: goto +345 -> 451
    //   109: aload 13
    //   111: ifnull +214 -> 325
    //   114: aload 13
    //   116: aload 11
    //   118: putfield 110	com/tencent/kingkong/database/SQLiteConnectionPool$ConnectionWaiter:mNext	Lcom/tencent/kingkong/database/SQLiteConnectionPool$ConnectionWaiter;
    //   121: aload 11
    //   123: getfield 432	com/tencent/kingkong/database/SQLiteConnectionPool$ConnectionWaiter:mNonce	I
    //   126: istore 14
    //   128: aload 5
    //   130: monitorexit
    //   131: aload_3
    //   132: ifnull +19 -> 151
    //   135: aload_3
    //   136: new 484	com/tencent/kingkong/database/SQLiteConnectionPool$1
    //   139: dup
    //   140: aload_0
    //   141: aload 11
    //   143: iload 14
    //   145: invokespecial 487	com/tencent/kingkong/database/SQLiteConnectionPool$1:<init>	(Lcom/tencent/kingkong/database/SQLiteConnectionPool;Lcom/tencent/kingkong/database/SQLiteConnectionPool$ConnectionWaiter;I)V
    //   148: invokevirtual 491	com/tencent/kingkong/support/CancellationSignal:setOnCancelListener	(Lcom/tencent/kingkong/support/CancellationSignal$OnCancelListener;)V
    //   151: ldc2_w 19
    //   154: aload 11
    //   156: getfield 367	com/tencent/kingkong/database/SQLiteConnectionPool$ConnectionWaiter:mStartTime	J
    //   159: ladd
    //   160: lstore 16
    //   162: ldc2_w 19
    //   165: lstore 18
    //   167: lload 16
    //   169: lstore 20
    //   171: aload_0
    //   172: getfield 67	com/tencent/kingkong/database/SQLiteConnectionPool:mConnectionLeaked	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   175: iconst_1
    //   176: iconst_0
    //   177: invokevirtual 495	java/util/concurrent/atomic/AtomicBoolean:compareAndSet	(ZZ)Z
    //   180: ifeq +19 -> 199
    //   183: aload_0
    //   184: getfield 62	com/tencent/kingkong/database/SQLiteConnectionPool:mLock	Ljava/lang/Object;
    //   187: astore 39
    //   189: aload 39
    //   191: monitorenter
    //   192: aload_0
    //   193: invokespecial 126	com/tencent/kingkong/database/SQLiteConnectionPool:wakeConnectionWaitersLocked	()V
    //   196: aload 39
    //   198: monitorexit
    //   199: lload 18
    //   201: ldc2_w 496
    //   204: lmul
    //   205: lstore 22
    //   207: lload 22
    //   209: invokestatic 501	java/util/concurrent/locks/LockSupport:parkNanos	(J)V
    //   212: invokestatic 504	java/lang/Thread:interrupted	()Z
    //   215: pop
    //   216: aload_0
    //   217: getfield 62	com/tencent/kingkong/database/SQLiteConnectionPool:mLock	Ljava/lang/Object;
    //   220: astore 25
    //   222: aload 25
    //   224: monitorenter
    //   225: aload_0
    //   226: invokespecial 200	com/tencent/kingkong/database/SQLiteConnectionPool:throwIfClosedLocked	()V
    //   229: aload 11
    //   231: getfield 101	com/tencent/kingkong/database/SQLiteConnectionPool$ConnectionWaiter:mAssignedConnection	Lcom/tencent/kingkong/database/SQLiteConnection;
    //   234: astore 27
    //   236: aload 11
    //   238: getfield 105	com/tencent/kingkong/database/SQLiteConnectionPool$ConnectionWaiter:mException	Ljava/lang/RuntimeException;
    //   241: astore 28
    //   243: aload 27
    //   245: ifnonnull +8 -> 253
    //   248: aload 28
    //   250: ifnull +117 -> 367
    //   253: aload_0
    //   254: aload 11
    //   256: invokespecial 506	com/tencent/kingkong/database/SQLiteConnectionPool:recycleConnectionWaiterLocked	(Lcom/tencent/kingkong/database/SQLiteConnectionPool$ConnectionWaiter;)V
    //   259: aload 27
    //   261: ifnull +95 -> 356
    //   264: aload 25
    //   266: monitorexit
    //   267: aload_3
    //   268: ifnull +174 -> 442
    //   271: aload_3
    //   272: aconst_null
    //   273: invokevirtual 491	com/tencent/kingkong/support/CancellationSignal:setOnCancelListener	(Lcom/tencent/kingkong/support/CancellationSignal$OnCancelListener;)V
    //   276: aload 27
    //   278: areturn
    //   279: iload 8
    //   281: aload 12
    //   283: getfield 251	com/tencent/kingkong/database/SQLiteConnectionPool$ConnectionWaiter:mPriority	I
    //   286: if_icmple +21 -> 307
    //   289: aload 11
    //   291: aload 12
    //   293: putfield 110	com/tencent/kingkong/database/SQLiteConnectionPool$ConnectionWaiter:mNext	Lcom/tencent/kingkong/database/SQLiteConnectionPool$ConnectionWaiter;
    //   296: goto -187 -> 109
    //   299: astore 6
    //   301: aload 5
    //   303: monitorexit
    //   304: aload 6
    //   306: athrow
    //   307: aload 12
    //   309: getfield 110	com/tencent/kingkong/database/SQLiteConnectionPool$ConnectionWaiter:mNext	Lcom/tencent/kingkong/database/SQLiteConnectionPool$ConnectionWaiter;
    //   312: astore 41
    //   314: aload 12
    //   316: astore 13
    //   318: aload 41
    //   320: astore 12
    //   322: goto +129 -> 451
    //   325: aload_0
    //   326: aload 11
    //   328: putfield 107	com/tencent/kingkong/database/SQLiteConnectionPool:mConnectionWaiterQueue	Lcom/tencent/kingkong/database/SQLiteConnectionPool$ConnectionWaiter;
    //   331: goto -210 -> 121
    //   334: astore 40
    //   336: aload 39
    //   338: monitorexit
    //   339: aload 40
    //   341: athrow
    //   342: astore 15
    //   344: aload_3
    //   345: ifnull +8 -> 353
    //   348: aload_3
    //   349: aconst_null
    //   350: invokevirtual 491	com/tencent/kingkong/support/CancellationSignal:setOnCancelListener	(Lcom/tencent/kingkong/support/CancellationSignal$OnCancelListener;)V
    //   353: aload 15
    //   355: athrow
    //   356: aload 28
    //   358: athrow
    //   359: astore 26
    //   361: aload 25
    //   363: monitorexit
    //   364: aload 26
    //   366: athrow
    //   367: invokestatic 480	android/os/SystemClock:uptimeMillis	()J
    //   370: lstore 29
    //   372: lload 29
    //   374: lload 20
    //   376: lcmp
    //   377: ifge +36 -> 413
    //   380: lload 29
    //   382: lload 20
    //   384: lsub
    //   385: lstore 37
    //   387: lload 20
    //   389: lstore 33
    //   391: lload 37
    //   393: lstore 31
    //   395: aload 25
    //   397: monitorexit
    //   398: lload 33
    //   400: lstore 35
    //   402: lload 31
    //   404: lstore 18
    //   406: lload 35
    //   408: lstore 20
    //   410: goto -239 -> 171
    //   413: aload_0
    //   414: lload 29
    //   416: aload 11
    //   418: getfield 367	com/tencent/kingkong/database/SQLiteConnectionPool$ConnectionWaiter:mStartTime	J
    //   421: lsub
    //   422: iload_2
    //   423: invokespecial 508	com/tencent/kingkong/database/SQLiteConnectionPool:logConnectionPoolBusyLocked	(JI)V
    //   426: ldc2_w 19
    //   429: lstore 31
    //   431: ldc2_w 19
    //   434: lload 29
    //   436: ladd
    //   437: lstore 33
    //   439: goto -44 -> 395
    //   442: aload 27
    //   444: areturn
    //   445: iconst_0
    //   446: istore 4
    //   448: goto -439 -> 9
    //   451: aload 12
    //   453: ifnonnull -174 -> 279
    //   456: goto -347 -> 109
    //
    // Exception table:
    //   from	to	target	type
    //   18	22	299	finally
    //   26	30	299	finally
    //   38	46	299	finally
    //   51	58	299	finally
    //   63	66	299	finally
    //   69	103	299	finally
    //   114	121	299	finally
    //   121	131	299	finally
    //   279	296	299	finally
    //   307	314	299	finally
    //   325	331	299	finally
    //   192	199	334	finally
    //   151	162	342	finally
    //   171	192	342	finally
    //   207	225	342	finally
    //   336	342	342	finally
    //   361	367	342	finally
    //   225	243	359	finally
    //   253	259	359	finally
    //   264	267	359	finally
    //   356	359	359	finally
    //   367	372	359	finally
    //   395	398	359	finally
    //   413	426	359	finally
  }

  private void wakeConnectionWaitersLocked()
  {
    Object localObject1 = this.mConnectionWaiterQueue;
    int i = 0;
    int j = 0;
    Object localObject2 = null;
    int k;
    int m;
    int n;
    label33: SQLiteConnectionPool.ConnectionWaiter localConnectionWaiter;
    while (true)
    {
      if (localObject1 == null)
        return;
      if (this.mIsOpen)
        break;
      k = j;
      m = i;
      n = 1;
      localConnectionWaiter = ((SQLiteConnectionPool.ConnectionWaiter)localObject1).mNext;
      if (n == 0)
        break label210;
      if (localObject2 == null)
        break label201;
      localObject2.mNext = localConnectionWaiter;
      label56: ((SQLiteConnectionPool.ConnectionWaiter)localObject1).mNext = null;
      LockSupport.unpark(((SQLiteConnectionPool.ConnectionWaiter)localObject1).mThread);
      label68: i = m;
      localObject1 = localConnectionWaiter;
      j = k;
    }
    while (true)
    {
      try
      {
        if ((((SQLiteConnectionPool.ConnectionWaiter)localObject1).mWantPrimaryConnection) || (i != 0))
          break label216;
        localSQLiteConnection = tryAcquireNonPrimaryConnectionLocked(((SQLiteConnectionPool.ConnectionWaiter)localObject1).mSql, ((SQLiteConnectionPool.ConnectionWaiter)localObject1).mConnectionFlags);
        if (localSQLiteConnection == null)
          i = 1;
        if ((localSQLiteConnection == null) && (j == 0))
        {
          localSQLiteConnection = tryAcquirePrimaryConnectionLocked(((SQLiteConnectionPool.ConnectionWaiter)localObject1).mConnectionFlags);
          if (localSQLiteConnection == null)
            j = 1;
        }
        if (localSQLiteConnection != null)
        {
          ((SQLiteConnectionPool.ConnectionWaiter)localObject1).mAssignedConnection = localSQLiteConnection;
          k = j;
          m = i;
          n = 1;
          break label33;
        }
        if ((i != 0) && (j != 0))
          break;
        k = j;
        m = i;
        n = 0;
      }
      catch (RuntimeException localRuntimeException)
      {
        ((SQLiteConnectionPool.ConnectionWaiter)localObject1).mException = localRuntimeException;
        k = j;
        m = i;
        n = 1;
      }
      break label33;
      label201: this.mConnectionWaiterQueue = localConnectionWaiter;
      break label56;
      label210: localObject2 = localObject1;
      break label68;
      label216: SQLiteConnection localSQLiteConnection = null;
    }
  }

  public final void OverInitWaitedDefault()
  {
    this.mAvailablePrimaryConnection.OverInitWaitedDefault();
  }

  public final SQLiteConnection acquireConnection(String paramString, int paramInt, CancellationSignal paramCancellationSignal)
  {
    return waitForConnection(paramString, paramInt, paramCancellationSignal);
  }

  public final void close()
  {
    dispose(false);
  }

  public final void collectDbStats(ArrayList paramArrayList)
  {
    while (true)
    {
      Iterator localIterator2;
      synchronized (this.mLock)
      {
        if (this.mAvailablePrimaryConnection != null)
          this.mAvailablePrimaryConnection.collectDbStats(paramArrayList);
        Iterator localIterator1 = this.mAvailableNonPrimaryConnections.iterator();
        if (!localIterator1.hasNext())
        {
          localIterator2 = this.mAcquiredConnections.keySet().iterator();
          if (localIterator2.hasNext());
        }
        else
        {
          ((SQLiteConnection)localIterator1.next()).collectDbStats(paramArrayList);
        }
      }
      ((SQLiteConnection)localIterator2.next()).collectDbStatsUnsafe(paramArrayList);
    }
  }

  public final void dump(boolean paramBoolean)
  {
    while (true)
    {
      int j;
      int k;
      Iterator localIterator;
      long l;
      SQLiteConnectionPool.ConnectionWaiter localConnectionWaiter;
      int i;
      synchronized (this.mLock)
      {
        Log.i("MicroMsg.kkdb.SQLiteConnectionPool", "Connection pool for " + this.mConfiguration.path + ":");
        Log.i("MicroMsg.kkdb.SQLiteConnectionPool", "  Open: " + this.mIsOpen);
        Log.i("MicroMsg.kkdb.SQLiteConnectionPool", "  Max connections: " + this.mMaxConnectionPoolSize);
        Log.i("MicroMsg.kkdb.SQLiteConnectionPool", "  Available primary connection:");
        if (this.mAvailablePrimaryConnection != null)
        {
          this.mAvailablePrimaryConnection.dump(paramBoolean);
          Log.i("MicroMsg.kkdb.SQLiteConnectionPool", "  Available non-primary connections:");
          if (this.mAvailableNonPrimaryConnections.isEmpty())
            break label262;
          j = this.mAvailableNonPrimaryConnections.size();
          k = 0;
          break label455;
          Log.i("MicroMsg.kkdb.SQLiteConnectionPool", "  Acquired connections:");
          if (this.mAcquiredConnections.isEmpty())
            break label330;
          localIterator = this.mAcquiredConnections.entrySet().iterator();
          if (localIterator.hasNext())
            break label273;
          Log.i("MicroMsg.kkdb.SQLiteConnectionPool", "  Connection waiters:");
          if (this.mConnectionWaiterQueue == null)
            break label444;
          l = SystemClock.uptimeMillis();
          localConnectionWaiter = this.mConnectionWaiterQueue;
          i = 0;
          break label465;
          label221: return;
        }
        Log.i("MicroMsg.kkdb.SQLiteConnectionPool", "<none>");
      }
      label240: ((SQLiteConnection)this.mAvailableNonPrimaryConnections.get(k)).dump(paramBoolean);
      k++;
      break label455;
      label262: Log.i("MicroMsg.kkdb.SQLiteConnectionPool", "<none>");
      continue;
      label273: Map.Entry localEntry = (Map.Entry)localIterator.next();
      ((SQLiteConnection)localEntry.getKey()).dumpUnsafe(paramBoolean);
      Log.i("MicroMsg.kkdb.SQLiteConnectionPool", "  Status: " + localEntry.getValue());
      continue;
      label330: Log.i("MicroMsg.kkdb.SQLiteConnectionPool", "<none>");
      continue;
      label444: label455: label465: 
      do
      {
        Log.i("MicroMsg.kkdb.SQLiteConnectionPool", i + ": waited for " + 0.001F * (float)(l - localConnectionWaiter.mStartTime) + " ms - thread=" + localConnectionWaiter.mThread + ", priority=" + localConnectionWaiter.mPriority + ", sql='" + localConnectionWaiter.mSql + "'");
        localConnectionWaiter = localConnectionWaiter.mNext;
        i++;
        continue;
        Log.i("MicroMsg.kkdb.SQLiteConnectionPool", "<none>");
        break label221;
        if (k < j)
          break label240;
        break;
      }
      while (localConnectionWaiter != null);
    }
  }

  protected final void finalize()
  {
    try
    {
      dispose(true);
      return;
    }
    finally
    {
      super.finalize();
    }
  }

  public final int getNativeHandle()
  {
    assert (this.mAvailablePrimaryConnection != null);
    return this.mAvailablePrimaryConnection.getCurrentConnectionPtr();
  }

  public final void logConnectionPoolBusy()
  {
    synchronized (this.mLock)
    {
      logConnectionPoolBusyLocked(0L, 0);
      return;
    }
  }

  final void onConnectionLeaked()
  {
    Log.w("MicroMsg.kkdb.SQLiteConnectionPool", "A SQLiteConnection object for database '" + this.mConfiguration.label + "' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed.");
    this.mConnectionLeaked.set(true);
  }

  public final void reconfigure(SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration)
  {
    int i = 1;
    if (paramSQLiteDatabaseConfiguration == null)
      throw new IllegalArgumentException("configuration must not be null.");
    while (true)
    {
      synchronized (this.mLock)
      {
        throwIfClosedLocked();
        if ((0x20000000 & (paramSQLiteDatabaseConfiguration.openFlags ^ this.mConfiguration.openFlags)) != 0)
        {
          if (i == 0)
            break label112;
          if (this.mAcquiredConnections.isEmpty())
            break;
          throw new IllegalStateException("Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
        }
      }
      i = 0;
    }
    closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
    assert (this.mAvailableNonPrimaryConnections.isEmpty());
    label112: if (((paramSQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled ^ this.mConfiguration.foreignKeyConstraintsEnabled)) && (!this.mAcquiredConnections.isEmpty()))
      throw new IllegalStateException("Foreign Key Constraints cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
    if (this.mConfiguration.openFlags != paramSQLiteDatabaseConfiguration.openFlags)
    {
      if (i != 0)
        closeAvailableConnectionsAndLogExceptionsLocked();
      SQLiteConnection localSQLiteConnection = openConnectionLocked(paramSQLiteDatabaseConfiguration, true);
      closeAvailableConnectionsAndLogExceptionsLocked();
      discardAcquiredConnectionsLocked();
      this.mAvailablePrimaryConnection = localSQLiteConnection;
      this.mConfiguration.updateParametersFrom(paramSQLiteDatabaseConfiguration);
      setMaxConnectionPoolSizeLocked(1);
    }
    while (true)
    {
      wakeConnectionWaitersLocked();
      return;
      this.mConfiguration.updateParametersFrom(paramSQLiteDatabaseConfiguration);
      setMaxConnectionPoolSizeLocked(1);
      closeExcessConnectionsAndLogExceptionsLocked();
      reconfigureAllConnectionsLocked();
    }
  }

  public final void releaseConnection(SQLiteConnection paramSQLiteConnection)
  {
    SQLiteConnectionPool.AcquiredConnectionStatus localAcquiredConnectionStatus;
    synchronized (this.mLock)
    {
      localAcquiredConnectionStatus = (SQLiteConnectionPool.AcquiredConnectionStatus)this.mAcquiredConnections.remove(paramSQLiteConnection);
      if (localAcquiredConnectionStatus == null)
        throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
    }
    if (!this.mIsOpen)
      closeConnectionAndLogExceptionsLocked(paramSQLiteConnection);
    while (true)
    {
      return;
      if (paramSQLiteConnection.isPrimaryConnection())
      {
        if (recycleConnectionLocked(paramSQLiteConnection, localAcquiredConnectionStatus))
        {
          assert (this.mAvailablePrimaryConnection == null);
          this.mAvailablePrimaryConnection = paramSQLiteConnection;
        }
        wakeConnectionWaitersLocked();
      }
      else if (this.mAvailableNonPrimaryConnections.size() >= -1 + this.mMaxConnectionPoolSize)
      {
        closeConnectionAndLogExceptionsLocked(paramSQLiteConnection);
      }
      else
      {
        if (recycleConnectionLocked(paramSQLiteConnection, localAcquiredConnectionStatus))
          this.mAvailableNonPrimaryConnections.add(paramSQLiteConnection);
        wakeConnectionWaitersLocked();
      }
    }
  }

  public final boolean shouldYieldConnection(SQLiteConnection paramSQLiteConnection, int paramInt)
  {
    synchronized (this.mLock)
    {
      if (!this.mAcquiredConnections.containsKey(paramSQLiteConnection))
        throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
    }
    if (!this.mIsOpen)
      return false;
    boolean bool = isSessionBlockingImportantConnectionWaitersLocked(paramSQLiteConnection.isPrimaryConnection(), paramInt);
    return bool;
  }

  public final String toString()
  {
    return "SQLiteConnectionPool: " + this.mConfiguration.path;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteConnectionPool
 * JD-Core Version:    0.6.2
 */