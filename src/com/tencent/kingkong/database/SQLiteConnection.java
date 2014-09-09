package com.tencent.kingkong.database;

import com.tencent.kingkong.CursorWindow;
import com.tencent.kingkong.DatabaseUtils;
import com.tencent.kingkong.ParcelFileDescriptor;
import com.tencent.kingkong.support.CancellationSignal;
import com.tencent.kingkong.support.CancellationSignal.OnCancelListener;
import com.tencent.kingkong.support.Log;
import com.tencent.mm.dbsupport.newcursor.b;
import com.tencent.mm.dbsupport.newcursor.e;
import com.tencent.mm.dbsupport.newcursor.f;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class SQLiteConnection
  implements CancellationSignal.OnCancelListener
{
  private static final boolean DEBUG = false;
  private static final byte[] EMPTY_BYTE_ARRAY;
  private static final String[] EMPTY_STRING_ARRAY;
  private static final String TAG = "MicroMsg.kkdb.SQLiteConnection";
  private static final Pattern TRIM_SQL_PATTERN;
  e currentFillingDbCursor;
  b currentFillingWindow;
  private int mArithmetic;
  private int mCancellationSignalAttachCount;
  private final SQLiteDatabaseConfiguration mConfiguration;
  private final int mConnectionId;
  private int mConnectionPtr;
  private boolean mIsInitWaited;
  private final boolean mIsPrimaryConnection;
  private final boolean mIsReadOnlyConnection;
  private boolean mOnlyAllowReadOnlyOperations;
  private String mPassword;
  private final SQLiteConnectionPool mPool;
  private final SQLiteConnection.PreparedStatementCache mPreparedStatementCache;
  private SQLiteConnection.PreparedStatement mPreparedStatementPool;
  private final SQLiteConnection.OperationLog mRecentOperations = new SQLiteConnection.OperationLog(null);
  private int mlockedDevice;
  f rb;
  public int windowAllocatedSize;

  static
  {
    if (!SQLiteConnection.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      EMPTY_STRING_ARRAY = new String[0];
      EMPTY_BYTE_ARRAY = new byte[0];
      TRIM_SQL_PATTERN = Pattern.compile("[\\s]*\\n+[\\s]*");
      return;
    }
  }

  private SQLiteConnection(SQLiteConnectionPool paramSQLiteConnectionPool, SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration, int paramInt1, boolean paramBoolean1, int paramInt2, String paramString, int paramInt3, boolean paramBoolean2)
  {
    this.mIsInitWaited = paramBoolean2;
    this.mPassword = paramString;
    this.mArithmetic = paramInt3;
    this.mlockedDevice = paramInt2;
    this.mPool = paramSQLiteConnectionPool;
    this.mConfiguration = new SQLiteDatabaseConfiguration(paramSQLiteDatabaseConfiguration);
    this.mConnectionId = paramInt1;
    this.mIsPrimaryConnection = paramBoolean1;
    if ((0x1 & paramSQLiteDatabaseConfiguration.openFlags) != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.mIsReadOnlyConnection = bool;
      this.mPreparedStatementCache = new SQLiteConnection.PreparedStatementCache(this, this.mConfiguration.maxSqlCacheSize);
      return;
    }
  }

  private SQLiteConnection.PreparedStatement acquirePreparedStatement(String paramString)
  {
    SQLiteConnection.PreparedStatement localPreparedStatement = (SQLiteConnection.PreparedStatement)this.mPreparedStatementCache.get(paramString);
    if (localPreparedStatement != null)
      if (!localPreparedStatement.mInUse)
        return localPreparedStatement;
    for (int i = 1; ; i = 0)
    {
      int j = nativePrepareStatement(this.mConnectionPtr, paramString);
      try
      {
        int k = nativeGetParameterCount(this.mConnectionPtr, j);
        int m = DatabaseUtils.getSqlStatementType(paramString);
        localPreparedStatement = obtainPreparedStatement(paramString, j, k, m, nativeIsReadOnly(this.mConnectionPtr, j));
        if ((i == 0) && (isCacheable(m)))
        {
          this.mPreparedStatementCache.put(paramString, localPreparedStatement);
          localPreparedStatement.mInCache = true;
        }
        localPreparedStatement.mInUse = true;
        return localPreparedStatement;
      }
      catch (RuntimeException localRuntimeException)
      {
        if ((localPreparedStatement == null) || (!localPreparedStatement.mInCache))
          nativeFinalizeStatement(this.mConnectionPtr, j);
        throw localRuntimeException;
      }
    }
  }

  private void applyBlockGuardPolicy(SQLiteConnection.PreparedStatement paramPreparedStatement)
  {
    this.mConfiguration.isInMemoryDb();
  }

  private void attachCancellationSignal(CancellationSignal paramCancellationSignal)
  {
    if (paramCancellationSignal != null)
    {
      paramCancellationSignal.throwIfCanceled();
      this.mCancellationSignalAttachCount = (1 + this.mCancellationSignalAttachCount);
      if (this.mCancellationSignalAttachCount == 1)
      {
        nativeResetCancel(this.mConnectionPtr, true);
        paramCancellationSignal.setOnCancelListener(this);
      }
    }
  }

  private void bindArguments(SQLiteConnection.PreparedStatement paramPreparedStatement, Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject != null);
    for (int i = paramArrayOfObject.length; i != paramPreparedStatement.mNumParameters; i = 0)
      throw new SQLiteBindOrColumnIndexOutOfRangeException("Expected " + paramPreparedStatement.mNumParameters + " bind arguments but " + i + " were provided.");
    if (i == 0);
    int j;
    int k;
    do
    {
      return;
      j = paramPreparedStatement.mStatementPtr;
      k = 0;
    }
    while (k >= i);
    Object localObject = paramArrayOfObject[k];
    int i1;
    switch (DatabaseUtils.getTypeOfObject(localObject))
    {
    case 3:
    default:
      if ((localObject instanceof Boolean))
      {
        int m = this.mConnectionPtr;
        int n = k + 1;
        if (((Boolean)localObject).booleanValue())
        {
          i1 = 1;
          label162: nativeBindLong(m, j, n, i1);
        }
      }
      break;
    case 0:
    case 1:
    case 2:
    case 4:
    }
    while (true)
    {
      k++;
      break;
      nativeBindNull(this.mConnectionPtr, j, k + 1);
      continue;
      nativeBindLong(this.mConnectionPtr, j, k + 1, ((Number)localObject).longValue());
      continue;
      nativeBindDouble(this.mConnectionPtr, j, k + 1, ((Number)localObject).doubleValue());
      continue;
      nativeBindBlob(this.mConnectionPtr, j, k + 1, (byte[])localObject);
      continue;
      i1 = 0;
      break label162;
      nativeBindString(this.mConnectionPtr, j, k + 1, localObject.toString());
    }
  }

  private static String canonicalizeSyncMode(String paramString)
  {
    if (paramString.equals("0"))
      paramString = "OFF";
    do
    {
      return paramString;
      if (paramString.equals("1"))
        return "NORMAL";
    }
    while (!paramString.equals("2"));
    return "FULL";
  }

  private void detachCancellationSignal(CancellationSignal paramCancellationSignal)
  {
    if (paramCancellationSignal != null)
    {
      assert (this.mCancellationSignalAttachCount > 0);
      this.mCancellationSignalAttachCount = (-1 + this.mCancellationSignalAttachCount);
      if (this.mCancellationSignalAttachCount == 0)
      {
        paramCancellationSignal.setOnCancelListener(null);
        nativeResetCancel(this.mConnectionPtr, false);
      }
    }
  }

  private void dispose(boolean paramBoolean)
  {
    int i;
    if (this.mConnectionPtr != 0)
      i = this.mRecentOperations.beginOperation("close", null, null).mCookie;
    try
    {
      this.mPreparedStatementCache.evictAll();
      nativeClose(this.mConnectionPtr);
      this.mConnectionPtr = 0;
      return;
    }
    finally
    {
      this.mRecentOperations.endOperation(this.mConfiguration.path, i);
    }
  }

  private void finalizePreparedStatement(SQLiteConnection.PreparedStatement paramPreparedStatement)
  {
    nativeFinalizeStatement(this.mConnectionPtr, paramPreparedStatement.mStatementPtr);
    recyclePreparedStatement(paramPreparedStatement);
  }

  private SQLiteDebug.DbStats getMainDbStatsUnsafe(int paramInt, long paramLong1, long paramLong2)
  {
    String str = this.mConfiguration.path;
    if (!this.mIsPrimaryConnection)
      str = str + " (" + this.mConnectionId + ")";
    return new SQLiteDebug.DbStats(str, paramLong1, paramLong2, paramInt, this.mPreparedStatementCache.hitCount(), this.mPreparedStatementCache.missCount(), this.mPreparedStatementCache.size());
  }

  private void initDb()
  {
    setForeignKeyModeFromConfiguration();
    setWalModeFromConfiguration();
    setJournalSizeLimit();
    setAutoCheckpointInterval();
    setLocaleFromConfiguration();
    int i = this.mConfiguration.customFunctions.size();
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return;
      SQLiteCustomFunction localSQLiteCustomFunction = (SQLiteCustomFunction)this.mConfiguration.customFunctions.get(j);
      nativeRegisterCustomFunction(this.mConnectionPtr, localSQLiteCustomFunction);
    }
  }

  private static boolean isCacheable(int paramInt)
  {
    return (paramInt == 2) || (paramInt == 1);
  }

  private static native void nativeBindBlob(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte);

  private static native void nativeBindDouble(int paramInt1, int paramInt2, int paramInt3, double paramDouble);

  private static native void nativeBindLong(int paramInt1, int paramInt2, int paramInt3, long paramLong);

  private static native void nativeBindNull(int paramInt1, int paramInt2, int paramInt3);

  private static native void nativeBindString(int paramInt1, int paramInt2, int paramInt3, String paramString);

  private static native void nativeCancel(int paramInt);

  private static native void nativeClose(int paramInt);

  private static native void nativeExecute(int paramInt1, int paramInt2);

  private static native int nativeExecuteForBlobFileDescriptor(int paramInt1, int paramInt2);

  private static native int nativeExecuteForChangedRowCount(int paramInt1, int paramInt2);

  private native long nativeExecuteForCursorDataWindow(int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  private static native long nativeExecuteForCursorWindow(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean);

  private static native long nativeExecuteForLastInsertedRowId(int paramInt1, int paramInt2);

  private static native long nativeExecuteForLong(int paramInt1, int paramInt2);

  private static native String nativeExecuteForString(int paramInt1, int paramInt2);

  private static native void nativeFinalizeStatement(int paramInt1, int paramInt2);

  private static native int nativeGetColumnCount(int paramInt1, int paramInt2);

  private static native String nativeGetColumnName(int paramInt1, int paramInt2, int paramInt3);

  private static native int nativeGetDbLookaside(int paramInt);

  private static native int nativeGetParameterCount(int paramInt1, int paramInt2);

  private static native boolean nativeIsReadOnly(int paramInt1, int paramInt2);

  private static native int nativeOpen(String paramString1, int paramInt, String paramString2, boolean paramBoolean1, boolean paramBoolean2);

  private static native int nativePrepareStatement(int paramInt, String paramString);

  private static native void nativeRegisterCustomFunction(int paramInt, SQLiteCustomFunction paramSQLiteCustomFunction);

  private static native void nativeRegisterLocalizedCollators(int paramInt, String paramString);

  private static native void nativeResetCancel(int paramInt, boolean paramBoolean);

  private static native void nativeResetStatementAndClearBindings(int paramInt1, int paramInt2);

  private static native void nativeSetKey(int paramInt1, int paramInt2, String paramString, int paramInt3);

  private SQLiteConnection.PreparedStatement obtainPreparedStatement(String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    SQLiteConnection.PreparedStatement localPreparedStatement = this.mPreparedStatementPool;
    if (localPreparedStatement != null)
    {
      this.mPreparedStatementPool = localPreparedStatement.mPoolNext;
      localPreparedStatement.mPoolNext = null;
      localPreparedStatement.mInCache = false;
    }
    while (true)
    {
      localPreparedStatement.mSql = paramString;
      localPreparedStatement.mStatementPtr = paramInt1;
      localPreparedStatement.mNumParameters = paramInt2;
      localPreparedStatement.mType = paramInt3;
      localPreparedStatement.mReadOnly = paramBoolean;
      return localPreparedStatement;
      localPreparedStatement = new SQLiteConnection.PreparedStatement(null);
    }
  }

  static SQLiteConnection open(SQLiteConnectionPool paramSQLiteConnectionPool, SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration, int paramInt1, boolean paramBoolean1, int paramInt2, String paramString, int paramInt3, boolean paramBoolean2)
  {
    SQLiteConnection localSQLiteConnection = new SQLiteConnection(paramSQLiteConnectionPool, paramSQLiteDatabaseConfiguration, paramInt1, paramBoolean1, paramInt2, paramString, paramInt3, paramBoolean2);
    try
    {
      localSQLiteConnection.open();
      return localSQLiteConnection;
    }
    catch (SQLiteException localSQLiteException)
    {
      localSQLiteConnection.dispose(false);
      throw localSQLiteException;
    }
  }

  private void open()
  {
    this.mConnectionPtr = nativeOpen(this.mConfiguration.path, this.mConfiguration.openFlags, this.mConfiguration.label, false, false);
    setPageSize();
    nativeSetKey(this.mConnectionPtr, this.mlockedDevice, this.mPassword, this.mArithmetic);
    if (!this.mIsInitWaited)
      initDb();
  }

  private void recyclePreparedStatement(SQLiteConnection.PreparedStatement paramPreparedStatement)
  {
    paramPreparedStatement.mSql = null;
    paramPreparedStatement.mPoolNext = this.mPreparedStatementPool;
    this.mPreparedStatementPool = paramPreparedStatement;
  }

  private void releasePreparedStatement(SQLiteConnection.PreparedStatement paramPreparedStatement)
  {
    paramPreparedStatement.mInUse = false;
    if (paramPreparedStatement.mInCache)
      try
      {
        nativeResetStatementAndClearBindings(this.mConnectionPtr, paramPreparedStatement.mStatementPtr);
        return;
      }
      catch (SQLiteException localSQLiteException)
      {
        this.mPreparedStatementCache.remove(paramPreparedStatement.mSql);
        return;
      }
    finalizePreparedStatement(paramPreparedStatement);
  }

  private void setAutoCheckpointInterval()
  {
    if ((!this.mConfiguration.isInMemoryDb()) && (!this.mIsReadOnlyConnection))
    {
      long l = SQLiteGlobal.getWALAutoCheckpoint();
      if (executeForLong("PRAGMA wal_autocheckpoint", null, null) != l)
        executeForLong("PRAGMA wal_autocheckpoint=" + l, null, null);
    }
  }

  private void setForeignKeyModeFromConfiguration()
  {
    if (!this.mIsReadOnlyConnection)
      if (!this.mConfiguration.foreignKeyConstraintsEnabled)
        break label60;
    label60: for (int i = 1; ; i = 0)
    {
      long l = i;
      if (executeForLong("PRAGMA foreign_keys", null, null) != l)
        execute("PRAGMA foreign_keys=" + l, null, null);
      return;
    }
  }

  private void setJournalMode(String paramString)
  {
    String str = executeForString("PRAGMA journal_mode", null, null);
    if (!str.equalsIgnoreCase(paramString));
    try
    {
      boolean bool = executeForString("PRAGMA journal_mode=" + paramString, null, null).equalsIgnoreCase(paramString);
      if (bool)
        return;
    }
    catch (SQLiteDatabaseLockedException localSQLiteDatabaseLockedException)
    {
      Log.w("MicroMsg.kkdb.SQLiteConnection", "Could not change the database journal mode of '" + this.mConfiguration.label + "' from '" + str + "' to '" + paramString + "' because the database is locked.  This usually means that there are other open connections to the database which prevents the database from enabling or disabling write-ahead logging mode.  Proceeding without changing the journal mode.");
    }
  }

  private void setJournalSizeLimit()
  {
    if ((!this.mConfiguration.isInMemoryDb()) && (!this.mIsReadOnlyConnection))
    {
      long l = SQLiteGlobal.getJournalSizeLimit();
      if (executeForLong("PRAGMA journal_size_limit", null, null) != l)
        executeForLong("PRAGMA journal_size_limit=" + l, null, null);
    }
  }

  // ERROR //
  private void setLocaleFromConfiguration()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 102	com/tencent/kingkong/database/SQLiteConnection:mConfiguration	Lcom/tencent/kingkong/database/SQLiteDatabaseConfiguration;
    //   4: astore_1
    //   5: aload_1
    //   6: bipush 16
    //   8: aload_1
    //   9: getfield 109	com/tencent/kingkong/database/SQLiteDatabaseConfiguration:openFlags	I
    //   12: ior
    //   13: putfield 109	com/tencent/kingkong/database/SQLiteDatabaseConfiguration:openFlags	I
    //   16: bipush 16
    //   18: aload_0
    //   19: getfield 102	com/tencent/kingkong/database/SQLiteConnection:mConfiguration	Lcom/tencent/kingkong/database/SQLiteDatabaseConfiguration;
    //   22: getfield 109	com/tencent/kingkong/database/SQLiteDatabaseConfiguration:openFlags	I
    //   25: iand
    //   26: ifeq +4 -> 30
    //   29: return
    //   30: aload_0
    //   31: getfield 102	com/tencent/kingkong/database/SQLiteConnection:mConfiguration	Lcom/tencent/kingkong/database/SQLiteDatabaseConfiguration;
    //   34: getfield 525	com/tencent/kingkong/database/SQLiteDatabaseConfiguration:locale	Ljava/util/Locale;
    //   37: invokevirtual 528	java/util/Locale:toString	()Ljava/lang/String;
    //   40: astore_2
    //   41: aload_0
    //   42: getfield 149	com/tencent/kingkong/database/SQLiteConnection:mConnectionPtr	I
    //   45: aload_2
    //   46: invokestatic 530	com/tencent/kingkong/database/SQLiteConnection:nativeRegisterLocalizedCollators	(ILjava/lang/String;)V
    //   49: aload_0
    //   50: getfield 111	com/tencent/kingkong/database/SQLiteConnection:mIsReadOnlyConnection	Z
    //   53: ifne -24 -> 29
    //   56: aload_0
    //   57: ldc_w 532
    //   60: aconst_null
    //   61: aconst_null
    //   62: invokevirtual 485	com/tencent/kingkong/database/SQLiteConnection:execute	(Ljava/lang/String;[Ljava/lang/Object;Lcom/tencent/kingkong/support/CancellationSignal;)V
    //   65: aload_0
    //   66: ldc_w 534
    //   69: aconst_null
    //   70: aconst_null
    //   71: invokevirtual 494	com/tencent/kingkong/database/SQLiteConnection:executeForString	(Ljava/lang/String;[Ljava/lang/Object;Lcom/tencent/kingkong/support/CancellationSignal;)Ljava/lang/String;
    //   74: astore 4
    //   76: aload 4
    //   78: ifnull +12 -> 90
    //   81: aload 4
    //   83: aload_2
    //   84: invokevirtual 288	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   87: ifne -58 -> 29
    //   90: aload_0
    //   91: ldc_w 536
    //   94: aconst_null
    //   95: aconst_null
    //   96: invokevirtual 485	com/tencent/kingkong/database/SQLiteConnection:execute	(Ljava/lang/String;[Ljava/lang/Object;Lcom/tencent/kingkong/support/CancellationSignal;)V
    //   99: aload_0
    //   100: ldc_w 538
    //   103: aconst_null
    //   104: aconst_null
    //   105: invokevirtual 485	com/tencent/kingkong/database/SQLiteConnection:execute	(Ljava/lang/String;[Ljava/lang/Object;Lcom/tencent/kingkong/support/CancellationSignal;)V
    //   108: aload_0
    //   109: ldc_w 540
    //   112: iconst_1
    //   113: anewarray 4	java/lang/Object
    //   116: dup
    //   117: iconst_0
    //   118: aload_2
    //   119: aastore
    //   120: aconst_null
    //   121: invokevirtual 485	com/tencent/kingkong/database/SQLiteConnection:execute	(Ljava/lang/String;[Ljava/lang/Object;Lcom/tencent/kingkong/support/CancellationSignal;)V
    //   124: aload_0
    //   125: ldc_w 542
    //   128: aconst_null
    //   129: aconst_null
    //   130: invokevirtual 485	com/tencent/kingkong/database/SQLiteConnection:execute	(Ljava/lang/String;[Ljava/lang/Object;Lcom/tencent/kingkong/support/CancellationSignal;)V
    //   133: aload_0
    //   134: ldc_w 544
    //   137: aconst_null
    //   138: aconst_null
    //   139: invokevirtual 485	com/tencent/kingkong/database/SQLiteConnection:execute	(Ljava/lang/String;[Ljava/lang/Object;Lcom/tencent/kingkong/support/CancellationSignal;)V
    //   142: return
    //   143: astore_3
    //   144: new 434	com/tencent/kingkong/database/SQLiteException
    //   147: dup
    //   148: new 216	java/lang/StringBuilder
    //   151: dup
    //   152: ldc_w 546
    //   155: invokespecial 221	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   158: aload_0
    //   159: getfield 102	com/tencent/kingkong/database/SQLiteConnection:mConfiguration	Lcom/tencent/kingkong/database/SQLiteDatabaseConfiguration;
    //   162: getfield 443	com/tencent/kingkong/database/SQLiteDatabaseConfiguration:label	Ljava/lang/String;
    //   165: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: ldc_w 506
    //   171: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: aload_2
    //   175: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: ldc_w 548
    //   181: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: invokevirtual 236	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   187: aload_3
    //   188: invokespecial 551	com/tencent/kingkong/database/SQLiteException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   191: athrow
    //   192: astore 5
    //   194: aload_0
    //   195: ldc_w 553
    //   198: aconst_null
    //   199: aconst_null
    //   200: invokevirtual 485	com/tencent/kingkong/database/SQLiteConnection:execute	(Ljava/lang/String;[Ljava/lang/Object;Lcom/tencent/kingkong/support/CancellationSignal;)V
    //   203: aload 5
    //   205: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   56	76	143	java/lang/RuntimeException
    //   81	90	143	java/lang/RuntimeException
    //   90	99	143	java/lang/RuntimeException
    //   133	142	143	java/lang/RuntimeException
    //   194	206	143	java/lang/RuntimeException
    //   99	133	192	finally
  }

  private void setPageSize()
  {
    if ((!this.mConfiguration.isInMemoryDb()) && (!this.mIsReadOnlyConnection))
    {
      long l = SQLiteGlobal.getDefaultPageSize();
      if (executeForLong("PRAGMA page_size", null, null) != l)
        execute("PRAGMA page_size=" + l, null, null);
    }
  }

  private void setSyncMode(String paramString)
  {
    if (!canonicalizeSyncMode(executeForString("PRAGMA synchronous", null, null)).equalsIgnoreCase(canonicalizeSyncMode(paramString)))
      execute("PRAGMA synchronous=" + paramString, null, null);
  }

  private void setWalModeFromConfiguration()
  {
    if ((!this.mConfiguration.isInMemoryDb()) && (!this.mIsReadOnlyConnection))
    {
      if ((0x20000000 & this.mConfiguration.openFlags) != 0)
      {
        setJournalMode("WAL");
        setSyncMode(SQLiteGlobal.getWALSyncMode());
      }
    }
    else
      return;
    setJournalMode(SQLiteGlobal.getDefaultJournalMode());
    setSyncMode(SQLiteGlobal.getDefaultSyncMode());
  }

  private void throwIfStatementForbidden(SQLiteConnection.PreparedStatement paramPreparedStatement)
  {
    if ((this.mOnlyAllowReadOnlyOperations) && (!paramPreparedStatement.mReadOnly))
      throw new SQLiteException("Cannot execute this statement because it might modify the database but the connection is read-only.");
  }

  private static String trimSqlForDisplay(String paramString)
  {
    return TRIM_SQL_PATTERN.matcher(paramString).replaceAll(" ");
  }

  final void OverInitWaitedDefault()
  {
    if (this.mIsInitWaited)
    {
      boolean bool = this.mOnlyAllowReadOnlyOperations;
      if (bool)
        this.mOnlyAllowReadOnlyOperations = false;
      initDb();
      if (bool)
        this.mOnlyAllowReadOnlyOperations = bool;
    }
  }

  public final void allDataEnd(int paramInt1, int paramInt2)
  {
    if (this.currentFillingWindow != null)
    {
      this.currentFillingWindow.Ca();
      this.windowAllocatedSize = (paramInt2 + this.windowAllocatedSize);
      return;
    }
    this.currentFillingDbCursor = null;
    this.rb = null;
    this.currentFillingWindow = null;
  }

  final void close()
  {
    dispose(false);
  }

  final void collectDbStats(ArrayList paramArrayList)
  {
    int i = nativeGetDbLookaside(this.mConnectionPtr);
    long l1 = 0L;
    long l2 = 0L;
    try
    {
      l1 = executeForLong("PRAGMA page_count;", null, null);
      long l7 = executeForLong("PRAGMA page_size;", null, null);
      l2 = l7;
      label38: paramArrayList.add(getMainDbStatsUnsafe(i, l1, l2));
      CursorWindow localCursorWindow = new CursorWindow("collectDbStats");
      try
      {
        executeForCursorWindow("PRAGMA database_list;", null, localCursorWindow, 0, 0, false, null);
        int j = 1;
        while (true)
        {
          int k = localCursorWindow.getNumRows();
          if (j >= k)
            return;
          String str1 = localCursorWindow.getString(j, 1);
          String str2 = localCursorWindow.getString(j, 2);
          long l3 = 0L;
          long l4 = 0L;
          try
          {
            l3 = executeForLong("PRAGMA " + str1 + ".page_count;", null, null);
            long l6 = executeForLong("PRAGMA " + str1 + ".page_size;", null, null);
            l4 = l6;
            l5 = l3;
            String str3 = "  (attached) " + str1;
            if (str2.length() != 0)
              str3 = str3 + ": " + str2;
            paramArrayList.add(new SQLiteDebug.DbStats(str3, l5, l4, 0, 0, 0, 0));
            j++;
          }
          catch (SQLiteException localSQLiteException3)
          {
            while (true)
              long l5 = l3;
          }
        }
      }
      catch (SQLiteException localSQLiteException2)
      {
      }
      finally
      {
        localCursorWindow.close();
      }
    }
    catch (SQLiteException localSQLiteException1)
    {
      break label38;
    }
  }

  final void collectDbStatsUnsafe(ArrayList paramArrayList)
  {
    paramArrayList.add(getMainDbStatsUnsafe(0, 0L, 0L));
  }

  final String describeCurrentOperationUnsafe()
  {
    return this.mRecentOperations.describeCurrentOperation();
  }

  public final void dump(boolean paramBoolean)
  {
    dumpUnsafe(paramBoolean);
  }

  final void dumpUnsafe(boolean paramBoolean)
  {
    Log.i("MicroMsg.kkdb.SQLiteConnection", "Connection #" + this.mConnectionId + ":");
    if (paramBoolean)
      Log.i("MicroMsg.kkdb.SQLiteConnection", "  connectionPtr: 0x" + Integer.toHexString(this.mConnectionPtr));
    Log.i("MicroMsg.kkdb.SQLiteConnection", "  isPrimaryConnection: " + this.mIsPrimaryConnection);
    Log.i("MicroMsg.kkdb.SQLiteConnection", "  onlyAllowReadOnlyOperations: " + this.mOnlyAllowReadOnlyOperations);
    this.mRecentOperations.dump(paramBoolean);
    if (paramBoolean)
      this.mPreparedStatementCache.dump();
  }

  public final void execute(String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    if (paramString == null)
      throw new IllegalArgumentException("sql must not be null.");
    SQLiteConnection.Operation localOperation = this.mRecentOperations.beginOperation("execute", paramString, paramArrayOfObject);
    int i = localOperation.mCookie;
    try
    {
      SQLiteConnection.PreparedStatement localPreparedStatement = acquirePreparedStatement(paramString);
      localOperation.bindStamentType(localPreparedStatement.mType);
      try
      {
        throwIfStatementForbidden(localPreparedStatement);
        bindArguments(localPreparedStatement, paramArrayOfObject);
        applyBlockGuardPolicy(localPreparedStatement);
        attachCancellationSignal(paramCancellationSignal);
        try
        {
          nativeExecute(this.mConnectionPtr, localPreparedStatement.mStatementPtr);
          detachCancellationSignal(paramCancellationSignal);
          releasePreparedStatement(localPreparedStatement);
          return;
        }
        finally
        {
        }
      }
      finally
      {
        releasePreparedStatement(localPreparedStatement);
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      if ((((localRuntimeException instanceof SQLiteDatabaseLockedException)) || ((localRuntimeException instanceof SQLiteTableLockedException))) && (this.mPool != null))
        this.mPool.logConnectionPoolBusy();
      this.mRecentOperations.failOperation(i, localRuntimeException);
      throw localRuntimeException;
    }
    finally
    {
      this.mRecentOperations.endOperation(this.mConfiguration.path, i);
    }
  }

  public final ParcelFileDescriptor executeForBlobFileDescriptor(String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    if (paramString == null)
      throw new IllegalArgumentException("sql must not be null.");
    SQLiteConnection.Operation localOperation = this.mRecentOperations.beginOperation("executeForBlobFileDescriptor", paramString, paramArrayOfObject);
    int i = localOperation.mCookie;
    try
    {
      SQLiteConnection.PreparedStatement localPreparedStatement = acquirePreparedStatement(paramString);
      localOperation.bindStamentType(localPreparedStatement.mType);
      try
      {
        throwIfStatementForbidden(localPreparedStatement);
        bindArguments(localPreparedStatement, paramArrayOfObject);
        applyBlockGuardPolicy(localPreparedStatement);
        attachCancellationSignal(paramCancellationSignal);
        try
        {
          int j = nativeExecuteForBlobFileDescriptor(this.mConnectionPtr, localPreparedStatement.mStatementPtr);
          ParcelFileDescriptor localParcelFileDescriptor1;
          if (j >= 0)
            localParcelFileDescriptor1 = ParcelFileDescriptor.adoptFd(j);
          for (ParcelFileDescriptor localParcelFileDescriptor2 = localParcelFileDescriptor1; ; localParcelFileDescriptor2 = null)
          {
            detachCancellationSignal(paramCancellationSignal);
            releasePreparedStatement(localPreparedStatement);
            return localParcelFileDescriptor2;
          }
        }
        finally
        {
        }
      }
      finally
      {
        releasePreparedStatement(localPreparedStatement);
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      if ((((localRuntimeException instanceof SQLiteDatabaseLockedException)) || ((localRuntimeException instanceof SQLiteTableLockedException))) && (this.mPool != null))
        this.mPool.logConnectionPoolBusy();
      this.mRecentOperations.failOperation(i, localRuntimeException);
      throw localRuntimeException;
    }
    finally
    {
      this.mRecentOperations.endOperation(this.mConfiguration.path, i);
    }
  }

  public final int executeForChangedRowCount(String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    if (paramString == null)
      throw new IllegalArgumentException("sql must not be null.");
    int i = 0;
    SQLiteConnection.Operation localOperation = this.mRecentOperations.beginOperation("executeForChangedRowCount", paramString, paramArrayOfObject);
    int j = localOperation.mCookie;
    try
    {
      SQLiteConnection.PreparedStatement localPreparedStatement = acquirePreparedStatement(paramString);
      localOperation.bindStamentType(localPreparedStatement.mType);
      try
      {
        throwIfStatementForbidden(localPreparedStatement);
        bindArguments(localPreparedStatement, paramArrayOfObject);
        applyBlockGuardPolicy(localPreparedStatement);
        attachCancellationSignal(paramCancellationSignal);
        try
        {
          int k = nativeExecuteForChangedRowCount(this.mConnectionPtr, localPreparedStatement.mStatementPtr);
          i = k;
          detachCancellationSignal(paramCancellationSignal);
          releasePreparedStatement(localPreparedStatement);
          return i;
        }
        finally
        {
        }
      }
      finally
      {
        releasePreparedStatement(localPreparedStatement);
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      if ((((localRuntimeException instanceof SQLiteDatabaseLockedException)) || ((localRuntimeException instanceof SQLiteTableLockedException))) && (this.mPool != null))
        this.mPool.logConnectionPoolBusy();
      this.mRecentOperations.failOperation(j, localRuntimeException);
      throw localRuntimeException;
    }
    finally
    {
      if (this.mRecentOperations.endOperationDeferLog(this.mConfiguration.path, j))
        this.mRecentOperations.logOperation(j, "changedRows=" + i);
    }
  }

  // ERROR //
  public final int executeForCursorWindow(String paramString, Object[] paramArrayOfObject, int paramInt1, int paramInt2, int paramInt3, b paramb, e parame)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore 8
    //   3: aload_1
    //   4: ifnonnull +14 -> 18
    //   7: new 696	java/lang/IllegalArgumentException
    //   10: dup
    //   11: ldc_w 698
    //   14: invokespecial 699	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   17: athrow
    //   18: aload 6
    //   20: ifnull +8 -> 28
    //   23: aload 6
    //   25: invokevirtual 759	com/tencent/mm/dbsupport/newcursor/b:acquireReference	()V
    //   28: aload_0
    //   29: getfield 85	com/tencent/kingkong/database/SQLiteConnection:mRecentOperations	Lcom/tencent/kingkong/database/SQLiteConnection$OperationLog;
    //   32: ldc_w 760
    //   35: aload_1
    //   36: aload_2
    //   37: invokevirtual 310	com/tencent/kingkong/database/SQLiteConnection$OperationLog:beginOperation	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Lcom/tencent/kingkong/database/SQLiteConnection$Operation;
    //   40: astore 10
    //   42: aload 10
    //   44: getfield 315	com/tencent/kingkong/database/SQLiteConnection$Operation:mCookie	I
    //   47: istore 11
    //   49: aload_0
    //   50: aload_1
    //   51: invokespecial 702	com/tencent/kingkong/database/SQLiteConnection:acquirePreparedStatement	(Ljava/lang/String;)Lcom/tencent/kingkong/database/SQLiteConnection$PreparedStatement;
    //   54: astore 16
    //   56: aload 10
    //   58: aload 16
    //   60: getfield 425	com/tencent/kingkong/database/SQLiteConnection$PreparedStatement:mType	I
    //   63: invokevirtual 705	com/tencent/kingkong/database/SQLiteConnection$Operation:bindStamentType	(I)V
    //   66: aload_0
    //   67: aload 16
    //   69: invokespecial 707	com/tencent/kingkong/database/SQLiteConnection:throwIfStatementForbidden	(Lcom/tencent/kingkong/database/SQLiteConnection$PreparedStatement;)V
    //   72: aload_0
    //   73: aload 16
    //   75: aload_2
    //   76: invokespecial 709	com/tencent/kingkong/database/SQLiteConnection:bindArguments	(Lcom/tencent/kingkong/database/SQLiteConnection$PreparedStatement;[Ljava/lang/Object;)V
    //   79: aload_0
    //   80: aload 16
    //   82: invokespecial 711	com/tencent/kingkong/database/SQLiteConnection:applyBlockGuardPolicy	(Lcom/tencent/kingkong/database/SQLiteConnection$PreparedStatement;)V
    //   85: aload_0
    //   86: aload 6
    //   88: putfield 604	com/tencent/kingkong/database/SQLiteConnection:currentFillingWindow	Lcom/tencent/mm/dbsupport/newcursor/b;
    //   91: aload_0
    //   92: aload 7
    //   94: putfield 613	com/tencent/kingkong/database/SQLiteConnection:currentFillingDbCursor	Lcom/tencent/mm/dbsupport/newcursor/e;
    //   97: aload_0
    //   98: aload_0
    //   99: getfield 149	com/tencent/kingkong/database/SQLiteConnection:mConnectionPtr	I
    //   102: aload 16
    //   104: getfield 240	com/tencent/kingkong/database/SQLiteConnection$PreparedStatement:mStatementPtr	I
    //   107: iload 4
    //   109: iload 5
    //   111: invokespecial 762	com/tencent/kingkong/database/SQLiteConnection:nativeExecuteForCursorDataWindow	(IIII)J
    //   114: lstore 18
    //   116: lload 18
    //   118: bipush 32
    //   120: lshr
    //   121: l2i
    //   122: istore 14
    //   124: lload 18
    //   126: l2i
    //   127: istore 13
    //   129: aload 6
    //   131: ifnull +17 -> 148
    //   134: aload 6
    //   136: invokevirtual 765	com/tencent/mm/dbsupport/newcursor/b:BW	()I
    //   139: istore 8
    //   141: aload 6
    //   143: iload 14
    //   145: invokevirtual 768	com/tencent/mm/dbsupport/newcursor/b:setStartPosition	(I)V
    //   148: aload_0
    //   149: aload 16
    //   151: invokespecial 719	com/tencent/kingkong/database/SQLiteConnection:releasePreparedStatement	(Lcom/tencent/kingkong/database/SQLiteConnection$PreparedStatement;)V
    //   154: aload_0
    //   155: aconst_null
    //   156: putfield 604	com/tencent/kingkong/database/SQLiteConnection:currentFillingWindow	Lcom/tencent/mm/dbsupport/newcursor/b;
    //   159: aload_0
    //   160: aconst_null
    //   161: putfield 613	com/tencent/kingkong/database/SQLiteConnection:currentFillingDbCursor	Lcom/tencent/mm/dbsupport/newcursor/e;
    //   164: aload_0
    //   165: getfield 85	com/tencent/kingkong/database/SQLiteConnection:mRecentOperations	Lcom/tencent/kingkong/database/SQLiteConnection$OperationLog;
    //   168: aload_0
    //   169: getfield 102	com/tencent/kingkong/database/SQLiteConnection:mConfiguration	Lcom/tencent/kingkong/database/SQLiteDatabaseConfiguration;
    //   172: getfield 325	com/tencent/kingkong/database/SQLiteDatabaseConfiguration:path	Ljava/lang/String;
    //   175: iload 11
    //   177: invokevirtual 750	com/tencent/kingkong/database/SQLiteConnection$OperationLog:endOperationDeferLog	(Ljava/lang/String;I)Z
    //   180: ifeq +74 -> 254
    //   183: aload_0
    //   184: getfield 85	com/tencent/kingkong/database/SQLiteConnection:mRecentOperations	Lcom/tencent/kingkong/database/SQLiteConnection$OperationLog;
    //   187: iload 11
    //   189: new 216	java/lang/StringBuilder
    //   192: dup
    //   193: ldc_w 770
    //   196: invokespecial 221	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   199: aload 6
    //   201: invokevirtual 773	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   204: ldc_w 775
    //   207: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: iload 4
    //   212: invokevirtual 225	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   215: ldc_w 777
    //   218: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: iload 14
    //   223: invokevirtual 225	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   226: ldc_w 779
    //   229: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: iload 8
    //   234: invokevirtual 225	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   237: ldc_w 781
    //   240: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   243: iload 13
    //   245: invokevirtual 225	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   248: invokevirtual 236	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   251: invokevirtual 755	com/tencent/kingkong/database/SQLiteConnection$OperationLog:logOperation	(ILjava/lang/String;)V
    //   254: aload 6
    //   256: ifnull +8 -> 264
    //   259: aload 6
    //   261: invokevirtual 784	com/tencent/mm/dbsupport/newcursor/b:releaseReference	()V
    //   264: iload 13
    //   266: ireturn
    //   267: astore 17
    //   269: iload 8
    //   271: istore 13
    //   273: iload 8
    //   275: istore 14
    //   277: aload_0
    //   278: aload 16
    //   280: invokespecial 719	com/tencent/kingkong/database/SQLiteConnection:releasePreparedStatement	(Lcom/tencent/kingkong/database/SQLiteConnection$PreparedStatement;)V
    //   283: aload_0
    //   284: aconst_null
    //   285: putfield 604	com/tencent/kingkong/database/SQLiteConnection:currentFillingWindow	Lcom/tencent/mm/dbsupport/newcursor/b;
    //   288: aload_0
    //   289: aconst_null
    //   290: putfield 613	com/tencent/kingkong/database/SQLiteConnection:currentFillingDbCursor	Lcom/tencent/mm/dbsupport/newcursor/e;
    //   293: aload 17
    //   295: athrow
    //   296: astore 12
    //   298: aload 12
    //   300: instanceof 488
    //   303: ifne +11 -> 314
    //   306: aload 12
    //   308: instanceof 721
    //   311: ifeq +17 -> 328
    //   314: aload_0
    //   315: getfield 95	com/tencent/kingkong/database/SQLiteConnection:mPool	Lcom/tencent/kingkong/database/SQLiteConnectionPool;
    //   318: ifnull +10 -> 328
    //   321: aload_0
    //   322: getfield 95	com/tencent/kingkong/database/SQLiteConnection:mPool	Lcom/tencent/kingkong/database/SQLiteConnectionPool;
    //   325: invokevirtual 726	com/tencent/kingkong/database/SQLiteConnectionPool:logConnectionPoolBusy	()V
    //   328: aload_0
    //   329: getfield 85	com/tencent/kingkong/database/SQLiteConnection:mRecentOperations	Lcom/tencent/kingkong/database/SQLiteConnection$OperationLog;
    //   332: iload 11
    //   334: aload 12
    //   336: invokevirtual 730	com/tencent/kingkong/database/SQLiteConnection$OperationLog:failOperation	(ILjava/lang/Exception;)V
    //   339: aload 12
    //   341: athrow
    //   342: astore 15
    //   344: aload_0
    //   345: getfield 85	com/tencent/kingkong/database/SQLiteConnection:mRecentOperations	Lcom/tencent/kingkong/database/SQLiteConnection$OperationLog;
    //   348: aload_0
    //   349: getfield 102	com/tencent/kingkong/database/SQLiteConnection:mConfiguration	Lcom/tencent/kingkong/database/SQLiteDatabaseConfiguration;
    //   352: getfield 325	com/tencent/kingkong/database/SQLiteDatabaseConfiguration:path	Ljava/lang/String;
    //   355: iload 11
    //   357: invokevirtual 750	com/tencent/kingkong/database/SQLiteConnection$OperationLog:endOperationDeferLog	(Ljava/lang/String;I)Z
    //   360: ifeq +74 -> 434
    //   363: aload_0
    //   364: getfield 85	com/tencent/kingkong/database/SQLiteConnection:mRecentOperations	Lcom/tencent/kingkong/database/SQLiteConnection$OperationLog;
    //   367: iload 11
    //   369: new 216	java/lang/StringBuilder
    //   372: dup
    //   373: ldc_w 770
    //   376: invokespecial 221	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   379: aload 6
    //   381: invokevirtual 773	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   384: ldc_w 775
    //   387: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   390: iload 4
    //   392: invokevirtual 225	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   395: ldc_w 777
    //   398: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   401: iload 14
    //   403: invokevirtual 225	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   406: ldc_w 779
    //   409: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   412: iload 8
    //   414: invokevirtual 225	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   417: ldc_w 781
    //   420: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   423: iload 13
    //   425: invokevirtual 225	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   428: invokevirtual 236	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   431: invokevirtual 755	com/tencent/kingkong/database/SQLiteConnection$OperationLog:logOperation	(ILjava/lang/String;)V
    //   434: aload 15
    //   436: athrow
    //   437: astore 9
    //   439: aload 6
    //   441: ifnull +8 -> 449
    //   444: aload 6
    //   446: invokevirtual 784	com/tencent/mm/dbsupport/newcursor/b:releaseReference	()V
    //   449: aload 9
    //   451: athrow
    //   452: astore 15
    //   454: iload 8
    //   456: istore 13
    //   458: iload 8
    //   460: istore 14
    //   462: goto -118 -> 344
    //   465: astore 12
    //   467: iload 8
    //   469: istore 13
    //   471: iload 8
    //   473: istore 14
    //   475: goto -177 -> 298
    //   478: astore 17
    //   480: goto -203 -> 277
    //
    // Exception table:
    //   from	to	target	type
    //   85	116	267	finally
    //   148	164	296	java/lang/RuntimeException
    //   277	296	296	java/lang/RuntimeException
    //   148	164	342	finally
    //   277	296	342	finally
    //   298	314	342	finally
    //   314	328	342	finally
    //   328	342	342	finally
    //   28	49	437	finally
    //   164	254	437	finally
    //   344	434	437	finally
    //   434	437	437	finally
    //   49	85	452	finally
    //   49	85	465	java/lang/RuntimeException
    //   134	148	478	finally
  }

  // ERROR //
  public final int executeForCursorWindow(String paramString, Object[] paramArrayOfObject, CursorWindow paramCursorWindow, int paramInt1, int paramInt2, boolean paramBoolean, CancellationSignal paramCancellationSignal)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +14 -> 15
    //   4: new 696	java/lang/IllegalArgumentException
    //   7: dup
    //   8: ldc_w 698
    //   11: invokespecial 699	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   14: athrow
    //   15: aload_3
    //   16: ifnonnull +14 -> 30
    //   19: new 696	java/lang/IllegalArgumentException
    //   22: dup
    //   23: ldc_w 786
    //   26: invokespecial 699	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   29: athrow
    //   30: aload_3
    //   31: invokevirtual 787	com/tencent/kingkong/CursorWindow:acquireReference	()V
    //   34: iconst_m1
    //   35: istore 8
    //   37: iconst_m1
    //   38: istore 9
    //   40: iconst_m1
    //   41: istore 10
    //   43: aload_0
    //   44: getfield 85	com/tencent/kingkong/database/SQLiteConnection:mRecentOperations	Lcom/tencent/kingkong/database/SQLiteConnection$OperationLog;
    //   47: ldc_w 760
    //   50: aload_1
    //   51: aload_2
    //   52: invokevirtual 310	com/tencent/kingkong/database/SQLiteConnection$OperationLog:beginOperation	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Lcom/tencent/kingkong/database/SQLiteConnection$Operation;
    //   55: astore 12
    //   57: aload 12
    //   59: getfield 315	com/tencent/kingkong/database/SQLiteConnection$Operation:mCookie	I
    //   62: istore 13
    //   64: aload_0
    //   65: aload_1
    //   66: invokespecial 702	com/tencent/kingkong/database/SQLiteConnection:acquirePreparedStatement	(Ljava/lang/String;)Lcom/tencent/kingkong/database/SQLiteConnection$PreparedStatement;
    //   69: astore 16
    //   71: aload 12
    //   73: aload 16
    //   75: getfield 425	com/tencent/kingkong/database/SQLiteConnection$PreparedStatement:mType	I
    //   78: invokevirtual 705	com/tencent/kingkong/database/SQLiteConnection$Operation:bindStamentType	(I)V
    //   81: aload_0
    //   82: aload 16
    //   84: invokespecial 707	com/tencent/kingkong/database/SQLiteConnection:throwIfStatementForbidden	(Lcom/tencent/kingkong/database/SQLiteConnection$PreparedStatement;)V
    //   87: aload_0
    //   88: aload 16
    //   90: aload_2
    //   91: invokespecial 709	com/tencent/kingkong/database/SQLiteConnection:bindArguments	(Lcom/tencent/kingkong/database/SQLiteConnection$PreparedStatement;[Ljava/lang/Object;)V
    //   94: aload_0
    //   95: aload 16
    //   97: invokespecial 711	com/tencent/kingkong/database/SQLiteConnection:applyBlockGuardPolicy	(Lcom/tencent/kingkong/database/SQLiteConnection$PreparedStatement;)V
    //   100: aload_0
    //   101: aload 7
    //   103: invokespecial 713	com/tencent/kingkong/database/SQLiteConnection:attachCancellationSignal	(Lcom/tencent/kingkong/support/CancellationSignal;)V
    //   106: aload_0
    //   107: getfield 149	com/tencent/kingkong/database/SQLiteConnection:mConnectionPtr	I
    //   110: aload 16
    //   112: getfield 240	com/tencent/kingkong/database/SQLiteConnection$PreparedStatement:mStatementPtr	I
    //   115: aload_3
    //   116: getfield 790	com/tencent/kingkong/CursorWindow:mWindowPtr	I
    //   119: iload 4
    //   121: iload 5
    //   123: iload 6
    //   125: invokestatic 792	com/tencent/kingkong/database/SQLiteConnection:nativeExecuteForCursorWindow	(IIIIIZ)J
    //   128: lstore 22
    //   130: lload 22
    //   132: bipush 32
    //   134: lshr
    //   135: l2i
    //   136: istore 21
    //   138: lload 22
    //   140: l2i
    //   141: istore 20
    //   143: aload_3
    //   144: invokevirtual 641	com/tencent/kingkong/CursorWindow:getNumRows	()I
    //   147: istore 24
    //   149: iload 24
    //   151: istore 19
    //   153: aload_3
    //   154: iload 21
    //   156: invokevirtual 793	com/tencent/kingkong/CursorWindow:setStartPosition	(I)V
    //   159: aload_0
    //   160: aload 7
    //   162: invokespecial 717	com/tencent/kingkong/database/SQLiteConnection:detachCancellationSignal	(Lcom/tencent/kingkong/support/CancellationSignal;)V
    //   165: aload_0
    //   166: aload 16
    //   168: invokespecial 719	com/tencent/kingkong/database/SQLiteConnection:releasePreparedStatement	(Lcom/tencent/kingkong/database/SQLiteConnection$PreparedStatement;)V
    //   171: aload_0
    //   172: getfield 85	com/tencent/kingkong/database/SQLiteConnection:mRecentOperations	Lcom/tencent/kingkong/database/SQLiteConnection$OperationLog;
    //   175: aload_0
    //   176: getfield 102	com/tencent/kingkong/database/SQLiteConnection:mConfiguration	Lcom/tencent/kingkong/database/SQLiteDatabaseConfiguration;
    //   179: getfield 325	com/tencent/kingkong/database/SQLiteDatabaseConfiguration:path	Ljava/lang/String;
    //   182: iload 13
    //   184: invokevirtual 750	com/tencent/kingkong/database/SQLiteConnection$OperationLog:endOperationDeferLog	(Ljava/lang/String;I)Z
    //   187: ifeq +73 -> 260
    //   190: aload_0
    //   191: getfield 85	com/tencent/kingkong/database/SQLiteConnection:mRecentOperations	Lcom/tencent/kingkong/database/SQLiteConnection$OperationLog;
    //   194: iload 13
    //   196: new 216	java/lang/StringBuilder
    //   199: dup
    //   200: ldc_w 770
    //   203: invokespecial 221	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   206: aload_3
    //   207: invokevirtual 773	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   210: ldc_w 775
    //   213: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: iload 4
    //   218: invokevirtual 225	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   221: ldc_w 777
    //   224: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: iload 21
    //   229: invokevirtual 225	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   232: ldc_w 779
    //   235: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: iload 19
    //   240: invokevirtual 225	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   243: ldc_w 781
    //   246: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   249: iload 20
    //   251: invokevirtual 225	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   254: invokevirtual 236	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   257: invokevirtual 755	com/tencent/kingkong/database/SQLiteConnection$OperationLog:logOperation	(ILjava/lang/String;)V
    //   260: aload_3
    //   261: invokevirtual 794	com/tencent/kingkong/CursorWindow:releaseReference	()V
    //   264: iload 20
    //   266: ireturn
    //   267: astore 18
    //   269: iload 10
    //   271: istore 19
    //   273: iload 9
    //   275: istore 20
    //   277: iload 8
    //   279: istore 21
    //   281: aload_0
    //   282: aload 7
    //   284: invokespecial 717	com/tencent/kingkong/database/SQLiteConnection:detachCancellationSignal	(Lcom/tencent/kingkong/support/CancellationSignal;)V
    //   287: aload 18
    //   289: athrow
    //   290: astore 17
    //   292: iload 19
    //   294: istore 10
    //   296: iload 20
    //   298: istore 9
    //   300: iload 21
    //   302: istore 8
    //   304: aload_0
    //   305: aload 16
    //   307: invokespecial 719	com/tencent/kingkong/database/SQLiteConnection:releasePreparedStatement	(Lcom/tencent/kingkong/database/SQLiteConnection$PreparedStatement;)V
    //   310: aload 17
    //   312: athrow
    //   313: astore 15
    //   315: aload 15
    //   317: instanceof 488
    //   320: ifne +11 -> 331
    //   323: aload 15
    //   325: instanceof 721
    //   328: ifeq +17 -> 345
    //   331: aload_0
    //   332: getfield 95	com/tencent/kingkong/database/SQLiteConnection:mPool	Lcom/tencent/kingkong/database/SQLiteConnectionPool;
    //   335: ifnull +10 -> 345
    //   338: aload_0
    //   339: getfield 95	com/tencent/kingkong/database/SQLiteConnection:mPool	Lcom/tencent/kingkong/database/SQLiteConnectionPool;
    //   342: invokevirtual 726	com/tencent/kingkong/database/SQLiteConnectionPool:logConnectionPoolBusy	()V
    //   345: aload_0
    //   346: getfield 85	com/tencent/kingkong/database/SQLiteConnection:mRecentOperations	Lcom/tencent/kingkong/database/SQLiteConnection$OperationLog;
    //   349: iload 13
    //   351: aload 15
    //   353: invokevirtual 730	com/tencent/kingkong/database/SQLiteConnection$OperationLog:failOperation	(ILjava/lang/Exception;)V
    //   356: aload 15
    //   358: athrow
    //   359: astore 14
    //   361: aload_0
    //   362: getfield 85	com/tencent/kingkong/database/SQLiteConnection:mRecentOperations	Lcom/tencent/kingkong/database/SQLiteConnection$OperationLog;
    //   365: aload_0
    //   366: getfield 102	com/tencent/kingkong/database/SQLiteConnection:mConfiguration	Lcom/tencent/kingkong/database/SQLiteDatabaseConfiguration;
    //   369: getfield 325	com/tencent/kingkong/database/SQLiteDatabaseConfiguration:path	Ljava/lang/String;
    //   372: iload 13
    //   374: invokevirtual 750	com/tencent/kingkong/database/SQLiteConnection$OperationLog:endOperationDeferLog	(Ljava/lang/String;I)Z
    //   377: ifeq +73 -> 450
    //   380: aload_0
    //   381: getfield 85	com/tencent/kingkong/database/SQLiteConnection:mRecentOperations	Lcom/tencent/kingkong/database/SQLiteConnection$OperationLog;
    //   384: iload 13
    //   386: new 216	java/lang/StringBuilder
    //   389: dup
    //   390: ldc_w 770
    //   393: invokespecial 221	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   396: aload_3
    //   397: invokevirtual 773	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   400: ldc_w 775
    //   403: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   406: iload 4
    //   408: invokevirtual 225	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   411: ldc_w 777
    //   414: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   417: iload 8
    //   419: invokevirtual 225	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   422: ldc_w 779
    //   425: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   428: iload 10
    //   430: invokevirtual 225	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   433: ldc_w 781
    //   436: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   439: iload 9
    //   441: invokevirtual 225	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   444: invokevirtual 236	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   447: invokevirtual 755	com/tencent/kingkong/database/SQLiteConnection$OperationLog:logOperation	(ILjava/lang/String;)V
    //   450: aload 14
    //   452: athrow
    //   453: astore 11
    //   455: aload_3
    //   456: invokevirtual 794	com/tencent/kingkong/CursorWindow:releaseReference	()V
    //   459: aload 11
    //   461: athrow
    //   462: astore 14
    //   464: iload 19
    //   466: istore 10
    //   468: iload 20
    //   470: istore 9
    //   472: iload 21
    //   474: istore 8
    //   476: goto -115 -> 361
    //   479: astore 15
    //   481: iload 19
    //   483: istore 10
    //   485: iload 20
    //   487: istore 9
    //   489: iload 21
    //   491: istore 8
    //   493: goto -178 -> 315
    //   496: astore 17
    //   498: goto -194 -> 304
    //   501: astore 18
    //   503: iload 10
    //   505: istore 19
    //   507: goto -226 -> 281
    //   510: astore 18
    //   512: goto -231 -> 281
    //
    // Exception table:
    //   from	to	target	type
    //   106	130	267	finally
    //   159	165	290	finally
    //   281	290	290	finally
    //   64	81	313	java/lang/RuntimeException
    //   304	313	313	java/lang/RuntimeException
    //   64	81	359	finally
    //   304	313	359	finally
    //   315	331	359	finally
    //   331	345	359	finally
    //   345	359	359	finally
    //   43	64	453	finally
    //   171	260	453	finally
    //   361	450	453	finally
    //   450	453	453	finally
    //   165	171	462	finally
    //   165	171	479	java/lang/RuntimeException
    //   81	106	496	finally
    //   143	149	501	finally
    //   153	159	510	finally
  }

  public final long executeForLastInsertedRowId(String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    if (paramString == null)
      throw new IllegalArgumentException("sql must not be null.");
    SQLiteConnection.Operation localOperation = this.mRecentOperations.beginOperation("executeForLastInsertedRowId", paramString, paramArrayOfObject);
    int i = localOperation.mCookie;
    try
    {
      SQLiteConnection.PreparedStatement localPreparedStatement = acquirePreparedStatement(paramString);
      localOperation.bindStamentType(localPreparedStatement.mType);
      try
      {
        throwIfStatementForbidden(localPreparedStatement);
        bindArguments(localPreparedStatement, paramArrayOfObject);
        applyBlockGuardPolicy(localPreparedStatement);
        attachCancellationSignal(paramCancellationSignal);
        try
        {
          long l = nativeExecuteForLastInsertedRowId(this.mConnectionPtr, localPreparedStatement.mStatementPtr);
          detachCancellationSignal(paramCancellationSignal);
          releasePreparedStatement(localPreparedStatement);
          return l;
        }
        finally
        {
        }
      }
      finally
      {
        releasePreparedStatement(localPreparedStatement);
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      if ((((localRuntimeException instanceof SQLiteDatabaseLockedException)) || ((localRuntimeException instanceof SQLiteTableLockedException))) && (this.mPool != null))
        this.mPool.logConnectionPoolBusy();
      this.mRecentOperations.failOperation(i, localRuntimeException);
      throw localRuntimeException;
    }
    finally
    {
      this.mRecentOperations.endOperation(this.mConfiguration.path, i);
    }
  }

  public final long executeForLong(String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    if (paramString == null)
      throw new IllegalArgumentException("sql must not be null.");
    SQLiteConnection.Operation localOperation = this.mRecentOperations.beginOperation("executeForLong", paramString, paramArrayOfObject);
    int i = localOperation.mCookie;
    try
    {
      SQLiteConnection.PreparedStatement localPreparedStatement = acquirePreparedStatement(paramString);
      localOperation.bindStamentType(localPreparedStatement.mType);
      try
      {
        throwIfStatementForbidden(localPreparedStatement);
        bindArguments(localPreparedStatement, paramArrayOfObject);
        applyBlockGuardPolicy(localPreparedStatement);
        attachCancellationSignal(paramCancellationSignal);
        try
        {
          long l = nativeExecuteForLong(this.mConnectionPtr, localPreparedStatement.mStatementPtr);
          detachCancellationSignal(paramCancellationSignal);
          releasePreparedStatement(localPreparedStatement);
          return l;
        }
        finally
        {
        }
      }
      finally
      {
        releasePreparedStatement(localPreparedStatement);
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      if ((((localRuntimeException instanceof SQLiteDatabaseLockedException)) || ((localRuntimeException instanceof SQLiteTableLockedException))) && (this.mPool != null))
        this.mPool.logConnectionPoolBusy();
      this.mRecentOperations.failOperation(i, localRuntimeException);
      throw localRuntimeException;
    }
    finally
    {
      this.mRecentOperations.endOperation(this.mConfiguration.path, i);
    }
  }

  public final String executeForString(String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    if (paramString == null)
      throw new IllegalArgumentException("sql must not be null.");
    SQLiteConnection.Operation localOperation = this.mRecentOperations.beginOperation("executeForString", paramString, paramArrayOfObject);
    int i = localOperation.mCookie;
    try
    {
      SQLiteConnection.PreparedStatement localPreparedStatement = acquirePreparedStatement(paramString);
      localOperation.bindStamentType(localPreparedStatement.mType);
      try
      {
        throwIfStatementForbidden(localPreparedStatement);
        bindArguments(localPreparedStatement, paramArrayOfObject);
        applyBlockGuardPolicy(localPreparedStatement);
        attachCancellationSignal(paramCancellationSignal);
        try
        {
          String str = nativeExecuteForString(this.mConnectionPtr, localPreparedStatement.mStatementPtr);
          detachCancellationSignal(paramCancellationSignal);
          releasePreparedStatement(localPreparedStatement);
          return str;
        }
        finally
        {
        }
      }
      finally
      {
        releasePreparedStatement(localPreparedStatement);
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      if ((((localRuntimeException instanceof SQLiteDatabaseLockedException)) || ((localRuntimeException instanceof SQLiteTableLockedException))) && (this.mPool != null))
        this.mPool.logConnectionPoolBusy();
      this.mRecentOperations.failOperation(i, localRuntimeException);
      throw localRuntimeException;
    }
    finally
    {
      this.mRecentOperations.endOperation(this.mConfiguration.path, i);
    }
  }

  public final void fillRowBlob(int paramInt, byte[] paramArrayOfByte)
  {
    if (this.currentFillingWindow != null)
      this.currentFillingWindow.c(paramInt, paramArrayOfByte);
    while (this.rb == null)
      return;
    this.rb.Q(paramArrayOfByte);
  }

  public final void fillRowDouble(int paramInt, double paramDouble)
  {
    if (this.currentFillingWindow != null)
      this.currentFillingWindow.BY();
    while (this.rb == null)
      return;
    this.rb.Q(Double.valueOf(paramDouble));
  }

  public final void fillRowEnd(int paramInt1, int paramInt2)
  {
    if (this.currentFillingWindow != null)
      this.currentFillingWindow.s(paramInt1, paramInt2);
  }

  public final void fillRowFloat(int paramInt, float paramFloat)
  {
    if (this.currentFillingWindow != null)
      this.currentFillingWindow.BX();
    while (this.rb == null)
      return;
    this.rb.Q(Float.valueOf(paramFloat));
  }

  public final void fillRowInt(int paramInt, long paramLong)
  {
    if (this.currentFillingWindow != null)
      this.currentFillingWindow.a(paramInt, paramLong);
    while (this.rb == null)
      return;
    this.rb.Q(Long.valueOf(paramLong));
  }

  public final void fillRowLong(int paramInt, long paramLong)
  {
    if (this.currentFillingWindow != null)
      this.currentFillingWindow.b(paramInt, paramLong);
    while (this.rb == null)
      return;
    this.rb.Q(Long.valueOf(paramLong));
  }

  public final void fillRowNull(int paramInt)
  {
    if (this.currentFillingWindow != null)
      this.currentFillingWindow.BZ();
    while (this.rb == null)
      return;
    this.rb.Q(null);
  }

  public final void fillRowStart(int paramInt)
  {
    if (this.currentFillingWindow != null)
      this.currentFillingWindow.cy(paramInt);
    while (this.currentFillingDbCursor == null)
      return;
    this.rb = this.currentFillingDbCursor.cz(paramInt);
  }

  public final void fillRowString(int paramInt, String paramString)
  {
    if (this.currentFillingWindow != null)
      this.currentFillingWindow.f(paramInt, paramString);
    while (this.rb == null)
      return;
    this.rb.Q(paramString);
  }

  protected final void finalize()
  {
    try
    {
      if ((this.mPool != null) && (this.mConnectionPtr != 0))
        this.mPool.onConnectionLeaked();
      dispose(true);
      return;
    }
    finally
    {
      super.finalize();
    }
  }

  public final int getConnectionId()
  {
    return this.mConnectionId;
  }

  public final int getCurrentConnectionPtr()
  {
    return this.mConnectionPtr;
  }

  final boolean isPreparedStatementInCache(String paramString)
  {
    return this.mPreparedStatementCache.get(paramString) != null;
  }

  public final boolean isPrimaryConnection()
  {
    return this.mIsPrimaryConnection;
  }

  public final void onCancel()
  {
    nativeCancel(this.mConnectionPtr);
  }

  public final void prepare(String paramString, SQLiteStatementInfo paramSQLiteStatementInfo)
  {
    if (paramString == null)
      throw new IllegalArgumentException("sql must not be null.");
    SQLiteConnection.Operation localOperation = this.mRecentOperations.beginOperation("prepare", paramString, null);
    int i = localOperation.mCookie;
    try
    {
      SQLiteConnection.PreparedStatement localPreparedStatement = acquirePreparedStatement(paramString);
      localOperation.bindStamentType(localPreparedStatement.mType);
      if (paramSQLiteStatementInfo != null);
      try
      {
        paramSQLiteStatementInfo.numParameters = localPreparedStatement.mNumParameters;
        paramSQLiteStatementInfo.readOnly = localPreparedStatement.mReadOnly;
        int j = nativeGetColumnCount(this.mConnectionPtr, localPreparedStatement.mStatementPtr);
        if (j == 0)
          paramSQLiteStatementInfo.columnNames = EMPTY_STRING_ARRAY;
        while (true)
        {
          releasePreparedStatement(localPreparedStatement);
          return;
          paramSQLiteStatementInfo.columnNames = new String[j];
          for (int k = 0; k < j; k++)
            paramSQLiteStatementInfo.columnNames[k] = nativeGetColumnName(this.mConnectionPtr, localPreparedStatement.mStatementPtr, k);
        }
      }
      finally
      {
        releasePreparedStatement(localPreparedStatement);
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      if ((((localRuntimeException instanceof SQLiteDatabaseLockedException)) || ((localRuntimeException instanceof SQLiteTableLockedException))) && (this.mPool != null))
        this.mPool.logConnectionPoolBusy();
      this.mRecentOperations.failOperation(i, localRuntimeException);
      throw localRuntimeException;
    }
    finally
    {
      this.mRecentOperations.endOperation(this.mConfiguration.path, i);
    }
  }

  final void reconfigure(SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration)
  {
    this.mOnlyAllowReadOnlyOperations = false;
    int i = paramSQLiteDatabaseConfiguration.customFunctions.size();
    int j = 0;
    boolean bool1;
    int k;
    label56: int m;
    if (j >= i)
    {
      bool1 = paramSQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled ^ this.mConfiguration.foreignKeyConstraintsEnabled;
      if ((0x20000000 & (paramSQLiteDatabaseConfiguration.openFlags ^ this.mConfiguration.openFlags)) == 0)
        break label170;
      k = 1;
      boolean bool2 = paramSQLiteDatabaseConfiguration.locale.equals(this.mConfiguration.locale);
      m = 0;
      if (!bool2)
        break label176;
    }
    while (true)
    {
      this.mConfiguration.updateParametersFrom(paramSQLiteDatabaseConfiguration);
      this.mPreparedStatementCache.resize(paramSQLiteDatabaseConfiguration.maxSqlCacheSize);
      if (bool1)
        setForeignKeyModeFromConfiguration();
      if (k != 0)
        setWalModeFromConfiguration();
      if (m != 0)
        setLocaleFromConfiguration();
      return;
      SQLiteCustomFunction localSQLiteCustomFunction = (SQLiteCustomFunction)paramSQLiteDatabaseConfiguration.customFunctions.get(j);
      if (!this.mConfiguration.customFunctions.contains(localSQLiteCustomFunction))
        nativeRegisterCustomFunction(this.mConnectionPtr, localSQLiteCustomFunction);
      j++;
      break;
      label170: k = 0;
      break label56;
      label176: m = 1;
    }
  }

  final void setOnlyAllowReadOnlyOperations(boolean paramBoolean)
  {
    this.mOnlyAllowReadOnlyOperations = paramBoolean;
  }

  public final String toString()
  {
    return "SQLiteConnection: " + this.mConfiguration.path + " (" + this.mConnectionId + ")";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteConnection
 * JD-Core Version:    0.6.2
 */