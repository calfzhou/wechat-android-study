package com.tencent.kingkong.database;

import android.content.ContentValues;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.kingkong.Cursor;
import com.tencent.kingkong.DatabaseErrorHandler;
import com.tencent.kingkong.DatabaseUtils;
import com.tencent.kingkong.DefaultDatabaseErrorHandler;
import com.tencent.kingkong.SQLException;
import com.tencent.kingkong.support.CancellationSignal;
import com.tencent.kingkong.support.Log;
import com.tencent.mm.dbsupport.newcursor.m;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class SQLiteDatabase extends SQLiteClosable
{
  public static final int CONFLICT_ABORT = 2;
  public static final int CONFLICT_FAIL = 3;
  public static final int CONFLICT_IGNORE = 4;
  public static final int CONFLICT_NONE = 0;
  public static final int CONFLICT_REPLACE = 5;
  public static final int CONFLICT_ROLLBACK = 1;
  private static final String[] CONFLICT_VALUES;
  public static final int CREATE_IF_NECESSARY = 268435456;
  public static final int ENABLE_WRITE_AHEAD_LOGGING = 536870912;
  public static final String KeyEmpty = "";
  public static final int MAX_SQL_CACHE_SIZE = 100;
  public static final int NO_LOCALIZED_COLLATORS = 16;
  public static final int OPEN_READONLY = 1;
  public static final int OPEN_READWRITE = 0;
  private static final int OPEN_READ_MASK = 1;
  public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
  private static final String TAG = "MicroMsg.kkdb.SQLiteDatabase";
  private static boolean isLoaded;
  private static WeakHashMap sActiveDatabases;
  private boolean isEncrypt;
  private final SQLiteDatabaseConfiguration mConfigurationLocked;
  private SQLiteConnectionPool mConnectionPoolLocked;
  private final SQLiteDatabase.CursorFactory mCursorFactory;
  private final DatabaseErrorHandler mErrorHandler;
  private boolean mHasAttachedDbsLocked;
  private final Object mLock = new Object();
  private final ThreadLocal mThreadSession = new SQLiteDatabase.1(this);

  static
  {
    if (!SQLiteDatabase.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      isLoaded = false;
      sActiveDatabases = new WeakHashMap();
      CONFLICT_VALUES = new String[] { "", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE " };
      return;
    }
  }

  private SQLiteDatabase(String paramString, int paramInt, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    this.mCursorFactory = paramCursorFactory;
    if (paramDatabaseErrorHandler != null);
    while (true)
    {
      this.mErrorHandler = paramDatabaseErrorHandler;
      this.mConfigurationLocked = new SQLiteDatabaseConfiguration(paramString, paramInt);
      return;
      paramDatabaseErrorHandler = new DefaultDatabaseErrorHandler();
    }
  }

  public static boolean LoadLib(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0) && (!isLoaded))
    {
      System.loadLibrary(paramString);
      isLoaded = true;
    }
    return isLoaded;
  }

  private void beginTransaction(SQLiteTransactionListener paramSQLiteTransactionListener, boolean paramBoolean)
  {
    acquireReference();
    try
    {
      SQLiteSession localSQLiteSession = getThreadSession();
      if (paramBoolean);
      for (int i = 2; ; i = 1)
      {
        localSQLiteSession.beginTransaction(i, paramSQLiteTransactionListener, getThreadDefaultConnectionFlags(false), null);
        return;
      }
    }
    finally
    {
      releaseReference();
    }
  }

  private void collectDbStats(ArrayList paramArrayList)
  {
    synchronized (this.mLock)
    {
      if (this.mConnectionPoolLocked != null)
        this.mConnectionPoolLocked.collectDbStats(paramArrayList);
      return;
    }
  }

  public static SQLiteDatabase create(SQLiteDatabase.CursorFactory paramCursorFactory)
  {
    return openDatabase(":memory:", paramCursorFactory, 268435456);
  }

  public static SQLiteDatabase create(SQLiteDatabase.CursorFactory paramCursorFactory, SQLiteDatabase.LockedDevice paramLockedDevice, String paramString, SQLiteDatabase.Arithmetic paramArithmetic, boolean paramBoolean)
  {
    return openDatabase(":memory:", paramLockedDevice, paramString, paramArithmetic, paramCursorFactory, 268435456, null, paramBoolean, 1);
  }

  public static boolean deleteDatabase(File paramFile)
  {
    if (paramFile == null)
      throw new IllegalArgumentException("file must not be null");
    boolean bool1 = false | paramFile.delete() | new File(paramFile.getPath() + "-journal").delete() | new File(paramFile.getPath() + "-shm").delete() | new File(paramFile.getPath() + "-wal").delete();
    File localFile = paramFile.getParentFile();
    File[] arrayOfFile;
    int i;
    int j;
    if (localFile != null)
    {
      arrayOfFile = localFile.listFiles(new SQLiteDatabase.2(paramFile.getName() + "-mj"));
      i = arrayOfFile.length;
      j = 0;
    }
    while (true)
    {
      if (j >= i)
        return bool1;
      boolean bool2 = bool1 | arrayOfFile[j].delete();
      j++;
      bool1 = bool2;
    }
  }

  public static void disableForceOptimization()
  {
    SQLiteGlobal.disableForceOptimization();
  }

  public static void disableOptimization()
  {
    SQLiteGlobal.disableOptimization();
  }

  private void dispose(boolean paramBoolean)
  {
    SQLiteConnectionPool localSQLiteConnectionPool;
    synchronized (this.mLock)
    {
      localSQLiteConnectionPool = this.mConnectionPoolLocked;
      this.mConnectionPoolLocked = null;
      if (paramBoolean);
    }
    synchronized (sActiveDatabases)
    {
      sActiveDatabases.remove(this);
      if (localSQLiteConnectionPool != null)
        localSQLiteConnectionPool.close();
      return;
      localObject2 = finally;
      throw localObject2;
    }
  }

  private void dump(boolean paramBoolean)
  {
    synchronized (this.mLock)
    {
      if (this.mConnectionPoolLocked != null)
        this.mConnectionPoolLocked.dump(paramBoolean);
      return;
    }
  }

  public static void dumpAll(boolean paramBoolean)
  {
    Iterator localIterator = getActiveDatabases().iterator();
    while (true)
    {
      if (!localIterator.hasNext())
        return;
      ((SQLiteDatabase)localIterator.next()).dump(paramBoolean);
    }
  }

  public static void enableForceOptimization()
  {
    SQLiteGlobal.enableForceOptimization();
  }

  public static void enableOptimization()
  {
    SQLiteGlobal.enableOptimization();
  }

  // ERROR //
  private int executeSql(String paramString, Object[] paramArrayOfObject)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_0
    //   3: invokevirtual 136	com/tencent/kingkong/database/SQLiteDatabase:acquireReference	()V
    //   6: aload_1
    //   7: invokestatic 281	com/tencent/kingkong/DatabaseUtils:getSqlStatementType	(Ljava/lang/String;)I
    //   10: iconst_3
    //   11: if_icmpne +35 -> 46
    //   14: aload_0
    //   15: getfield 105	com/tencent/kingkong/database/SQLiteDatabase:mLock	Ljava/lang/Object;
    //   18: astore 8
    //   20: aload 8
    //   22: monitorenter
    //   23: aload_0
    //   24: getfield 283	com/tencent/kingkong/database/SQLiteDatabase:mHasAttachedDbsLocked	Z
    //   27: ifne +77 -> 104
    //   30: aload_0
    //   31: iconst_1
    //   32: putfield 283	com/tencent/kingkong/database/SQLiteDatabase:mHasAttachedDbsLocked	Z
    //   35: aload 8
    //   37: monitorexit
    //   38: iload_3
    //   39: ifeq +7 -> 46
    //   42: aload_0
    //   43: invokevirtual 286	com/tencent/kingkong/database/SQLiteDatabase:disableWriteAheadLogging	()V
    //   46: new 288	com/tencent/kingkong/database/SQLiteStatement
    //   49: dup
    //   50: aload_0
    //   51: aload_1
    //   52: aload_2
    //   53: invokespecial 291	com/tencent/kingkong/database/SQLiteStatement:<init>	(Lcom/tencent/kingkong/database/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/Object;)V
    //   56: astore 5
    //   58: aload 5
    //   60: invokevirtual 294	com/tencent/kingkong/database/SQLiteStatement:executeUpdateDelete	()I
    //   63: istore 7
    //   65: aload 5
    //   67: invokevirtual 295	com/tencent/kingkong/database/SQLiteStatement:close	()V
    //   70: aload_0
    //   71: invokevirtual 152	com/tencent/kingkong/database/SQLiteDatabase:releaseReference	()V
    //   74: iload 7
    //   76: ireturn
    //   77: astore 9
    //   79: aload 8
    //   81: monitorexit
    //   82: aload 9
    //   84: athrow
    //   85: astore 4
    //   87: aload_0
    //   88: invokevirtual 152	com/tencent/kingkong/database/SQLiteDatabase:releaseReference	()V
    //   91: aload 4
    //   93: athrow
    //   94: astore 6
    //   96: aload 5
    //   98: invokevirtual 295	com/tencent/kingkong/database/SQLiteStatement:close	()V
    //   101: aload 6
    //   103: athrow
    //   104: iconst_0
    //   105: istore_3
    //   106: goto -71 -> 35
    //
    // Exception table:
    //   from	to	target	type
    //   23	35	77	finally
    //   35	38	77	finally
    //   6	23	85	finally
    //   42	46	85	finally
    //   46	58	85	finally
    //   65	70	85	finally
    //   79	85	85	finally
    //   96	104	85	finally
    //   58	65	94	finally
  }

  public static String findEditTable(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      int i = paramString.indexOf(' ');
      int j = paramString.indexOf(',');
      if ((i > 0) && ((i < j) || (j < 0)))
        paramString = paramString.substring(0, i);
      while ((j <= 0) || ((j >= i) && (i >= 0)))
        return paramString;
      return paramString.substring(0, j);
    }
    throw new IllegalStateException("Invalid tables");
  }

  private static ArrayList getActiveDatabases()
  {
    ArrayList localArrayList = new ArrayList();
    synchronized (sActiveDatabases)
    {
      localArrayList.addAll(sActiveDatabases.keySet());
      return localArrayList;
    }
  }

  static ArrayList getDbStats()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = getActiveDatabases().iterator();
    while (true)
    {
      if (!localIterator.hasNext())
        return localArrayList;
      ((SQLiteDatabase)localIterator.next()).collectDbStats(localArrayList);
    }
  }

  private static boolean isMainThread()
  {
    Looper localLooper = Looper.myLooper();
    return (localLooper != null) && (localLooper == Looper.getMainLooper());
  }

  private boolean isReadOnlyLocked()
  {
    return (0x1 & this.mConfigurationLocked.openFlags) == 1;
  }

  private Set keySet(ContentValues paramContentValues)
  {
    try
    {
      Field localField = Class.forName("android.content.ContentValues").getDeclaredField("mValues");
      localField.setAccessible(true);
      localHashMap = (HashMap)localField.get(paramContentValues);
      return localHashMap.keySet();
    }
    catch (Exception localException)
    {
      while (true)
        HashMap localHashMap = null;
    }
  }

  private void open(SQLiteDatabase.LockedDevice paramLockedDevice, String paramString, SQLiteDatabase.Arithmetic paramArithmetic, boolean paramBoolean, int paramInt)
  {
    try
    {
      openInner(paramLockedDevice, paramString, paramArithmetic, paramBoolean, paramInt);
      return;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      onCorruption();
      openInner(paramLockedDevice, paramString, paramArithmetic, paramBoolean, paramInt);
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      Log.e("MicroMsg.kkdb.SQLiteDatabase", "Failed to open database '" + getLabel() + "'.", new Object[] { localSQLiteException });
      close();
      throw localSQLiteException;
    }
  }

  public static SQLiteDatabase openDatabase(String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    return openDatabase(paramString, paramCursorFactory, paramInt, null);
  }

  public static SQLiteDatabase openDatabase(String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    return openDatabase(paramString, SQLiteDatabase.LockedDevice.DEFAULT, null, SQLiteDatabase.Arithmetic.UNKNOWN, paramCursorFactory, paramInt, paramDatabaseErrorHandler, false, 1);
  }

  public static SQLiteDatabase openDatabase(String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt1, DatabaseErrorHandler paramDatabaseErrorHandler, int paramInt2)
  {
    return openDatabase(paramString, SQLiteDatabase.LockedDevice.DEFAULT, null, SQLiteDatabase.Arithmetic.UNKNOWN, paramCursorFactory, paramInt1, paramDatabaseErrorHandler, false, paramInt2);
  }

  public static SQLiteDatabase openDatabase(String paramString1, SQLiteDatabase.LockedDevice paramLockedDevice, String paramString2, SQLiteDatabase.Arithmetic paramArithmetic, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt, DatabaseErrorHandler paramDatabaseErrorHandler, boolean paramBoolean)
  {
    return openDatabase(paramString1, paramLockedDevice, paramString2, paramArithmetic, paramCursorFactory, paramInt, paramDatabaseErrorHandler, paramBoolean, 1);
  }

  public static SQLiteDatabase openDatabase(String paramString1, SQLiteDatabase.LockedDevice paramLockedDevice, String paramString2, SQLiteDatabase.Arithmetic paramArithmetic, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt1, DatabaseErrorHandler paramDatabaseErrorHandler, boolean paramBoolean, int paramInt2)
  {
    SQLiteDatabase localSQLiteDatabase = new SQLiteDatabase(paramString1, paramInt1, paramCursorFactory, paramDatabaseErrorHandler);
    localSQLiteDatabase.open(paramLockedDevice, paramString2, paramArithmetic, paramBoolean, paramInt2);
    return localSQLiteDatabase;
  }

  private void openInner(SQLiteDatabase.LockedDevice paramLockedDevice, String paramString, SQLiteDatabase.Arithmetic paramArithmetic, boolean paramBoolean, int paramInt)
  {
    synchronized (this.mLock)
    {
      if ((!$assertionsDisabled) && (this.mConnectionPoolLocked != null))
        throw new AssertionError();
    }
    boolean bool;
    if (TextUtils.isEmpty(paramString))
      bool = false;
    while (true)
    {
      this.isEncrypt = bool;
      this.mConnectionPoolLocked = SQLiteConnectionPool.open(this.mConfigurationLocked, paramLockedDevice, paramString, paramArithmetic, paramBoolean, paramInt);
      synchronized (sActiveDatabases)
      {
        sActiveDatabases.put(this, null);
        return;
        bool = true;
      }
    }
  }

  public static SQLiteDatabase openOrCreateDatabase(File paramFile, SQLiteDatabase.Arithmetic paramArithmetic, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    return openOrCreateDatabase(paramFile, SQLiteDatabase.LockedDevice.DEFAULT, paramArithmetic, paramCursorFactory, paramDatabaseErrorHandler);
  }

  public static SQLiteDatabase openOrCreateDatabase(File paramFile, SQLiteDatabase.CursorFactory paramCursorFactory)
  {
    return openOrCreateDatabase(paramFile.getPath(), paramCursorFactory);
  }

  public static SQLiteDatabase openOrCreateDatabase(File paramFile, SQLiteDatabase.LockedDevice paramLockedDevice, SQLiteDatabase.Arithmetic paramArithmetic, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    return openOrCreateDatabase(paramFile, paramLockedDevice, null, paramArithmetic, paramCursorFactory, paramDatabaseErrorHandler, true);
  }

  public static SQLiteDatabase openOrCreateDatabase(File paramFile, SQLiteDatabase.LockedDevice paramLockedDevice, String paramString, SQLiteDatabase.Arithmetic paramArithmetic, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler, int paramInt)
  {
    return openOrCreateDatabase(paramFile, paramLockedDevice, paramString, paramArithmetic, paramCursorFactory, paramDatabaseErrorHandler, false);
  }

  public static SQLiteDatabase openOrCreateDatabase(File paramFile, SQLiteDatabase.LockedDevice paramLockedDevice, String paramString, SQLiteDatabase.Arithmetic paramArithmetic, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler, boolean paramBoolean)
  {
    return openOrCreateDatabase(paramFile.getPath(), paramLockedDevice, paramString, paramArithmetic, paramCursorFactory, paramDatabaseErrorHandler, paramBoolean, 1);
  }

  public static SQLiteDatabase openOrCreateDatabase(File paramFile, String paramString, SQLiteDatabase.Arithmetic paramArithmetic, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    return openOrCreateDatabase(paramFile, SQLiteDatabase.LockedDevice.DEFAULT, paramString, paramArithmetic, paramCursorFactory, paramDatabaseErrorHandler, 1);
  }

  public static SQLiteDatabase openOrCreateDatabase(File paramFile, String paramString, SQLiteDatabase.Arithmetic paramArithmetic, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler, int paramInt)
  {
    return openOrCreateDatabase(paramFile, SQLiteDatabase.LockedDevice.DEFAULT, paramString, paramArithmetic, paramCursorFactory, paramDatabaseErrorHandler, paramInt);
  }

  public static SQLiteDatabase openOrCreateDatabase(File paramFile, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    return openOrCreateDatabase(paramFile, paramString, SQLiteDatabase.Arithmetic.DEFAULT, paramCursorFactory, paramDatabaseErrorHandler);
  }

  public static SQLiteDatabase openOrCreateDatabase(String paramString, SQLiteDatabase.Arithmetic paramArithmetic, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    return openOrCreateDatabase(paramString, SQLiteDatabase.LockedDevice.DEFAULT, paramArithmetic, paramCursorFactory, paramDatabaseErrorHandler, 1);
  }

  public static SQLiteDatabase openOrCreateDatabase(String paramString, SQLiteDatabase.CursorFactory paramCursorFactory)
  {
    return openDatabase(paramString, SQLiteDatabase.LockedDevice.DEFAULT, null, SQLiteDatabase.Arithmetic.UNKNOWN, paramCursorFactory, 268435456, null, false, 1);
  }

  public static SQLiteDatabase openOrCreateDatabase(String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    return openDatabase(paramString, SQLiteDatabase.LockedDevice.DEFAULT, null, SQLiteDatabase.Arithmetic.UNKNOWN, paramCursorFactory, 268435456, null, false, paramInt);
  }

  public static SQLiteDatabase openOrCreateDatabase(String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    return openDatabase(paramString, paramCursorFactory, 268435456, paramDatabaseErrorHandler);
  }

  public static SQLiteDatabase openOrCreateDatabase(String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, boolean paramBoolean)
  {
    int i = 268435456;
    if (paramBoolean)
      i = 805306368;
    return openDatabase(paramString, SQLiteDatabase.LockedDevice.DEFAULT, null, SQLiteDatabase.Arithmetic.UNKNOWN, paramCursorFactory, i, null, false, 1);
  }

  public static SQLiteDatabase openOrCreateDatabase(String paramString, SQLiteDatabase.LockedDevice paramLockedDevice, SQLiteDatabase.Arithmetic paramArithmetic, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler, int paramInt)
  {
    return openOrCreateDatabase(paramString, paramLockedDevice, null, paramArithmetic, paramCursorFactory, paramDatabaseErrorHandler, true, paramInt);
  }

  public static SQLiteDatabase openOrCreateDatabase(String paramString1, SQLiteDatabase.LockedDevice paramLockedDevice, String paramString2, SQLiteDatabase.Arithmetic paramArithmetic, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler, int paramInt)
  {
    return openOrCreateDatabase(paramString1, paramLockedDevice, paramString2, paramArithmetic, paramCursorFactory, paramDatabaseErrorHandler, false, paramInt);
  }

  public static SQLiteDatabase openOrCreateDatabase(String paramString1, SQLiteDatabase.LockedDevice paramLockedDevice, String paramString2, SQLiteDatabase.Arithmetic paramArithmetic, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler, boolean paramBoolean, int paramInt)
  {
    return openDatabase(paramString1, paramLockedDevice, paramString2, paramArithmetic, paramCursorFactory, 268435456, paramDatabaseErrorHandler, paramBoolean, paramInt);
  }

  public static SQLiteDatabase openOrCreateDatabase(String paramString1, String paramString2, SQLiteDatabase.Arithmetic paramArithmetic, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    return openOrCreateDatabase(paramString1, SQLiteDatabase.LockedDevice.DEFAULT, paramString2, paramArithmetic, paramCursorFactory, paramDatabaseErrorHandler, 1);
  }

  public static SQLiteDatabase openOrCreateDatabase(String paramString1, String paramString2, SQLiteDatabase.Arithmetic paramArithmetic, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler, int paramInt)
  {
    return openOrCreateDatabase(paramString1, SQLiteDatabase.LockedDevice.DEFAULT, paramString2, paramArithmetic, paramCursorFactory, paramDatabaseErrorHandler, paramInt);
  }

  public static SQLiteDatabase openOrCreateDatabase(String paramString1, String paramString2, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    return openOrCreateDatabase(paramString1, paramString2, SQLiteDatabase.Arithmetic.DEFAULT, paramCursorFactory, paramDatabaseErrorHandler);
  }

  public static SQLiteDatabase openOrCreateDatabaseInWalMode(String paramString, SQLiteDatabase.CursorFactory paramCursorFactory)
  {
    return openDatabase(paramString, SQLiteDatabase.LockedDevice.DEFAULT, null, SQLiteDatabase.Arithmetic.UNKNOWN, paramCursorFactory, 805306368, null, false, SQLiteGlobal.getWALConnectionPoolSize());
  }

  public static SQLiteDatabase openOrCreateDatabaseInWalMode(String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    return openDatabase(paramString, SQLiteDatabase.LockedDevice.DEFAULT, null, SQLiteDatabase.Arithmetic.UNKNOWN, paramCursorFactory, 805306368, null, false, paramInt);
  }

  public static SQLiteDatabase openOrCreateDatabaseInWalMode(String paramString1, String paramString2, SQLiteDatabase.Arithmetic paramArithmetic, SQLiteDatabase.CursorFactory paramCursorFactory)
  {
    return openDatabase(paramString1, SQLiteDatabase.LockedDevice.DEFAULT, paramString2, paramArithmetic, paramCursorFactory, 805306368, null, false, SQLiteGlobal.getWALConnectionPoolSize());
  }

  public static SQLiteDatabase openOrCreateDatabaseInWalMode(String paramString1, String paramString2, SQLiteDatabase.Arithmetic paramArithmetic, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    return openDatabase(paramString1, SQLiteDatabase.LockedDevice.DEFAULT, paramString2, paramArithmetic, paramCursorFactory, 805306368, null, false, paramInt);
  }

  public static SQLiteDatabase openOrCreateMemoryDatabaseInWalMode(SQLiteDatabase.CursorFactory paramCursorFactory)
  {
    return openDatabase(":memory:", SQLiteDatabase.LockedDevice.DEFAULT, null, SQLiteDatabase.Arithmetic.UNKNOWN, paramCursorFactory, 805306368, null, false, 1);
  }

  public static int releaseMemory()
  {
    return SQLiteGlobal.releaseMemory();
  }

  private void throwIfNotOpenLocked()
  {
    if (this.mConnectionPoolLocked == null)
      throw new IllegalStateException("The database '" + this.mConfigurationLocked.label + "' is not open.");
  }

  private boolean yieldIfContendedHelper(boolean paramBoolean, long paramLong)
  {
    acquireReference();
    try
    {
      boolean bool = getThreadSession().yieldTransaction(paramLong, paramBoolean, null);
      return bool;
    }
    finally
    {
      releaseReference();
    }
  }

  public final void OverInitWaitedDefault()
  {
    this.mConnectionPoolLocked.OverInitWaitedDefault();
  }

  public final void addCustomFunction(String paramString, int paramInt, SQLiteDatabase.CustomFunction paramCustomFunction)
  {
    SQLiteCustomFunction localSQLiteCustomFunction = new SQLiteCustomFunction(paramString, paramInt, paramCustomFunction);
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      this.mConfigurationLocked.customFunctions.add(localSQLiteCustomFunction);
      try
      {
        this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        this.mConfigurationLocked.customFunctions.remove(localSQLiteCustomFunction);
        throw localRuntimeException;
      }
    }
  }

  public final void beginTransaction()
  {
    beginTransaction(null, true);
  }

  public final void beginTransactionNonExclusive()
  {
    beginTransaction(null, false);
  }

  public final void beginTransactionWithListener(SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    beginTransaction(paramSQLiteTransactionListener, true);
  }

  public final void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    beginTransaction(paramSQLiteTransactionListener, false);
  }

  public final SQLiteStatement compileStatement(String paramString)
  {
    acquireReference();
    try
    {
      SQLiteStatement localSQLiteStatement = new SQLiteStatement(this, paramString, null);
      return localSQLiteStatement;
    }
    finally
    {
      releaseReference();
    }
  }

  final SQLiteSession createSession()
  {
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      SQLiteConnectionPool localSQLiteConnectionPool = this.mConnectionPoolLocked;
      return new SQLiteSession(localSQLiteConnectionPool);
    }
  }

  public final int delete(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    acquireReference();
    try
    {
      StringBuilder localStringBuilder = new StringBuilder("DELETE FROM ").append(paramString1);
      if (!TextUtils.isEmpty(paramString2))
      {
        str = " WHERE " + paramString2;
        localSQLiteStatement = new SQLiteStatement(this, str, paramArrayOfString);
      }
    }
    finally
    {
      try
      {
        int i = localSQLiteStatement.executeUpdateDelete();
        localSQLiteStatement.close();
        return i;
        String str = "";
      }
      finally
      {
        SQLiteStatement localSQLiteStatement;
        localSQLiteStatement.close();
      }
      releaseReference();
    }
  }

  public final void disableWriteAheadLogging()
  {
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      if ((0x20000000 & this.mConfigurationLocked.openFlags) == 0)
        return;
      SQLiteDatabaseConfiguration localSQLiteDatabaseConfiguration1 = this.mConfigurationLocked;
      localSQLiteDatabaseConfiguration1.openFlags = (0xDFFFFFFF & localSQLiteDatabaseConfiguration1.openFlags);
    }
    try
    {
      this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
      return;
      localObject2 = finally;
      throw localObject2;
    }
    catch (RuntimeException localRuntimeException)
    {
      SQLiteDatabaseConfiguration localSQLiteDatabaseConfiguration2 = this.mConfigurationLocked;
      localSQLiteDatabaseConfiguration2.openFlags = (0x20000000 | localSQLiteDatabaseConfiguration2.openFlags);
      throw localRuntimeException;
    }
  }

  public final boolean enableWriteAheadLogging()
  {
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      if ((0x20000000 & this.mConfigurationLocked.openFlags) != 0)
        return true;
      if (isReadOnlyLocked())
        return false;
      if (this.mConfigurationLocked.isInMemoryDb())
      {
        Log.i("MicroMsg.kkdb.SQLiteDatabase", "can't enable WAL for memory databases.");
        return false;
      }
      if (this.mHasAttachedDbsLocked)
      {
        Log.i("MicroMsg.kkdb.SQLiteDatabase", "this database: " + this.mConfigurationLocked.label + " has attached databases. can't  enable WAL.");
        return false;
      }
      SQLiteDatabaseConfiguration localSQLiteDatabaseConfiguration1 = this.mConfigurationLocked;
      localSQLiteDatabaseConfiguration1.openFlags = (0x20000000 | localSQLiteDatabaseConfiguration1.openFlags);
    }
    try
    {
      this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
      return true;
      localObject2 = finally;
      throw localObject2;
    }
    catch (RuntimeException localRuntimeException)
    {
      SQLiteDatabaseConfiguration localSQLiteDatabaseConfiguration2 = this.mConfigurationLocked;
      localSQLiteDatabaseConfiguration2.openFlags = (0xDFFFFFFF & localSQLiteDatabaseConfiguration2.openFlags);
      throw localRuntimeException;
    }
  }

  public final void endTransaction()
  {
    acquireReference();
    try
    {
      getThreadSession().endTransaction(null);
      return;
    }
    finally
    {
      releaseReference();
    }
  }

  public final void execSQL(String paramString)
  {
    executeSql(paramString, null);
  }

  public final void execSQL(String paramString, Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null)
      throw new IllegalArgumentException("Empty bindArgs");
    executeSql(paramString, paramArrayOfObject);
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

  // ERROR //
  public final java.util.List getAttachedDbs()
  {
    // Byte code:
    //   0: new 253	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 317	java/util/ArrayList:<init>	()V
    //   7: astore_1
    //   8: aload_0
    //   9: getfield 105	com/tencent/kingkong/database/SQLiteDatabase:mLock	Ljava/lang/Object;
    //   12: astore_2
    //   13: aload_2
    //   14: monitorenter
    //   15: aload_0
    //   16: getfield 156	com/tencent/kingkong/database/SQLiteDatabase:mConnectionPoolLocked	Lcom/tencent/kingkong/database/SQLiteConnectionPool;
    //   19: ifnonnull +7 -> 26
    //   22: aload_2
    //   23: monitorexit
    //   24: aconst_null
    //   25: areturn
    //   26: aload_0
    //   27: getfield 283	com/tencent/kingkong/database/SQLiteDatabase:mHasAttachedDbsLocked	Z
    //   30: ifne +29 -> 59
    //   33: aload_1
    //   34: new 570	android/util/Pair
    //   37: dup
    //   38: ldc_w 572
    //   41: aload_0
    //   42: getfield 116	com/tencent/kingkong/database/SQLiteDatabase:mConfigurationLocked	Lcom/tencent/kingkong/database/SQLiteDatabaseConfiguration;
    //   45: getfield 575	com/tencent/kingkong/database/SQLiteDatabaseConfiguration:path	Ljava/lang/String;
    //   48: invokespecial 578	android/util/Pair:<init>	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   51: invokevirtual 511	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   54: pop
    //   55: aload_2
    //   56: monitorexit
    //   57: aload_1
    //   58: areturn
    //   59: aload_0
    //   60: invokevirtual 136	com/tencent/kingkong/database/SQLiteDatabase:acquireReference	()V
    //   63: aload_2
    //   64: monitorexit
    //   65: aload_0
    //   66: ldc_w 580
    //   69: aconst_null
    //   70: invokevirtual 584	com/tencent/kingkong/database/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Lcom/tencent/kingkong/Cursor;
    //   73: astore 8
    //   75: aload 8
    //   77: invokeinterface 589 1 0
    //   82: istore 9
    //   84: iload 9
    //   86: ifne +26 -> 112
    //   89: aload 8
    //   91: ifnull +10 -> 101
    //   94: aload 8
    //   96: invokeinterface 590 1 0
    //   101: aload_0
    //   102: invokevirtual 152	com/tencent/kingkong/database/SQLiteDatabase:releaseReference	()V
    //   105: aload_1
    //   106: areturn
    //   107: astore_3
    //   108: aload_2
    //   109: monitorexit
    //   110: aload_3
    //   111: athrow
    //   112: aload_1
    //   113: new 570	android/util/Pair
    //   116: dup
    //   117: aload 8
    //   119: iconst_1
    //   120: invokeinterface 594 2 0
    //   125: aload 8
    //   127: iconst_2
    //   128: invokeinterface 594 2 0
    //   133: invokespecial 578	android/util/Pair:<init>	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   136: invokevirtual 511	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   139: pop
    //   140: goto -65 -> 75
    //   143: astore 5
    //   145: aload 8
    //   147: astore 6
    //   149: aload 6
    //   151: ifnull +10 -> 161
    //   154: aload 6
    //   156: invokeinterface 590 1 0
    //   161: aload 5
    //   163: athrow
    //   164: astore 7
    //   166: aload_0
    //   167: invokevirtual 152	com/tencent/kingkong/database/SQLiteDatabase:releaseReference	()V
    //   170: aload 7
    //   172: athrow
    //   173: astore 4
    //   175: aload 4
    //   177: astore 5
    //   179: aconst_null
    //   180: astore 6
    //   182: goto -33 -> 149
    //
    // Exception table:
    //   from	to	target	type
    //   15	24	107	finally
    //   26	57	107	finally
    //   59	65	107	finally
    //   75	84	143	finally
    //   112	140	143	finally
    //   94	101	164	finally
    //   154	161	164	finally
    //   161	164	164	finally
    //   65	75	173	finally
  }

  final String getLabel()
  {
    synchronized (this.mLock)
    {
      String str = this.mConfigurationLocked.label;
      return str;
    }
  }

  public final long getMaximumSize()
  {
    return DatabaseUtils.longForQuery(this, "PRAGMA max_page_count;", null) * getPageSize();
  }

  public final int getNativeDbHandle()
  {
    assert (this.mConnectionPoolLocked != null);
    return this.mConnectionPoolLocked.getNativeHandle();
  }

  public final long getPageSize()
  {
    return DatabaseUtils.longForQuery(this, "PRAGMA page_size;", null);
  }

  public final String getPath()
  {
    synchronized (this.mLock)
    {
      String str = this.mConfigurationLocked.path;
      return str;
    }
  }

  @Deprecated
  public final Map getSyncedTables()
  {
    return new HashMap(0);
  }

  final int getThreadDefaultConnectionFlags(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 1; ; i = 2)
    {
      if (isMainThread())
        i |= 4;
      return i;
    }
  }

  final SQLiteSession getThreadSession()
  {
    return (SQLiteSession)this.mThreadSession.get();
  }

  public final int getVersion()
  {
    return Long.valueOf(DatabaseUtils.longForQuery(this, "PRAGMA user_version;", null)).intValue();
  }

  public final boolean inTransaction()
  {
    acquireReference();
    try
    {
      boolean bool = getThreadSession().hasTransaction();
      return bool;
    }
    finally
    {
      releaseReference();
    }
  }

  public final long insert(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    try
    {
      long l = insertWithOnConflict(paramString1, paramString2, paramContentValues, 0);
      return l;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      throw localSQLiteDatabaseCorruptException;
    }
    catch (SQLException localSQLException)
    {
      String str = "Error inserting error is %s" + paramContentValues;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localSQLException.getMessage();
      Log.e("MicroMsg.kkdb.SQLiteDatabase", str, arrayOfObject);
    }
    return -1L;
  }

  public final long insertOrThrow(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    return insertWithOnConflict(paramString1, paramString2, paramContentValues, 0);
  }

  // ERROR //
  public final long insertWithOnConflict(String paramString1, String paramString2, ContentValues paramContentValues, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 136	com/tencent/kingkong/database/SQLiteDatabase:acquireReference	()V
    //   4: new 187	java/lang/StringBuilder
    //   7: dup
    //   8: invokespecial 658	java/lang/StringBuilder:<init>	()V
    //   11: astore 5
    //   13: aload 5
    //   15: ldc_w 660
    //   18: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: pop
    //   22: aload 5
    //   24: getstatic 91	com/tencent/kingkong/database/SQLiteDatabase:CONFLICT_VALUES	[Ljava/lang/String;
    //   27: iload 4
    //   29: aaload
    //   30: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: pop
    //   34: aload 5
    //   36: ldc_w 662
    //   39: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: pop
    //   43: aload 5
    //   45: aload_1
    //   46: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: pop
    //   50: aload 5
    //   52: bipush 40
    //   54: invokevirtual 665	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   57: pop
    //   58: aload_3
    //   59: ifnull +120 -> 179
    //   62: aload_3
    //   63: invokevirtual 670	android/content/ContentValues:size	()I
    //   66: ifle +113 -> 179
    //   69: aload_3
    //   70: invokevirtual 670	android/content/ContentValues:size	()I
    //   73: istore 12
    //   75: iload 12
    //   77: ifle +184 -> 261
    //   80: iload 12
    //   82: anewarray 102	java/lang/Object
    //   85: astore 13
    //   87: aload_0
    //   88: aload_3
    //   89: invokespecial 672	com/tencent/kingkong/database/SQLiteDatabase:keySet	(Landroid/content/ContentValues;)Ljava/util/Set;
    //   92: invokeinterface 675 1 0
    //   97: astore 14
    //   99: iconst_0
    //   100: istore 15
    //   102: aload 14
    //   104: invokeinterface 262 1 0
    //   109: ifne +76 -> 185
    //   112: aload 5
    //   114: bipush 41
    //   116: invokevirtual 665	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   119: pop
    //   120: aload 5
    //   122: ldc_w 677
    //   125: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: pop
    //   129: iconst_0
    //   130: istore 23
    //   132: goto +180 -> 312
    //   135: aload 5
    //   137: bipush 41
    //   139: invokevirtual 665	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   142: pop
    //   143: new 288	com/tencent/kingkong/database/SQLiteStatement
    //   146: dup
    //   147: aload_0
    //   148: aload 5
    //   150: invokevirtual 205	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   153: aload 26
    //   155: invokespecial 291	com/tencent/kingkong/database/SQLiteStatement:<init>	(Lcom/tencent/kingkong/database/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/Object;)V
    //   158: astore 28
    //   160: aload 28
    //   162: invokevirtual 680	com/tencent/kingkong/database/SQLiteStatement:executeInsert	()J
    //   165: lstore 30
    //   167: aload 28
    //   169: invokevirtual 295	com/tencent/kingkong/database/SQLiteStatement:close	()V
    //   172: aload_0
    //   173: invokevirtual 152	com/tencent/kingkong/database/SQLiteDatabase:releaseReference	()V
    //   176: lload 30
    //   178: lreturn
    //   179: iconst_0
    //   180: istore 12
    //   182: goto -107 -> 75
    //   185: aload 14
    //   187: invokeinterface 266 1 0
    //   192: checkcast 79	java/lang/String
    //   195: astore 16
    //   197: iload 15
    //   199: ifle +127 -> 326
    //   202: ldc_w 682
    //   205: astore 17
    //   207: aload 5
    //   209: aload 17
    //   211: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: pop
    //   215: aload 5
    //   217: aload 16
    //   219: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   222: pop
    //   223: iload 15
    //   225: iconst_1
    //   226: iadd
    //   227: istore 20
    //   229: aload 13
    //   231: iload 15
    //   233: aload_3
    //   234: aload 16
    //   236: invokevirtual 685	android/content/ContentValues:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   239: aastore
    //   240: iload 20
    //   242: istore 15
    //   244: goto -142 -> 102
    //   247: aload 5
    //   249: aload 24
    //   251: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   254: pop
    //   255: iinc 23 1
    //   258: goto +54 -> 312
    //   261: aload 5
    //   263: new 187	java/lang/StringBuilder
    //   266: dup
    //   267: aload_2
    //   268: invokestatic 195	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   271: invokespecial 196	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   274: ldc_w 687
    //   277: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   280: invokevirtual 205	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   283: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   286: pop
    //   287: aconst_null
    //   288: astore 26
    //   290: goto -155 -> 135
    //   293: astore 6
    //   295: aload_0
    //   296: invokevirtual 152	com/tencent/kingkong/database/SQLiteDatabase:releaseReference	()V
    //   299: aload 6
    //   301: athrow
    //   302: astore 29
    //   304: aload 28
    //   306: invokevirtual 295	com/tencent/kingkong/database/SQLiteStatement:close	()V
    //   309: aload 29
    //   311: athrow
    //   312: iload 23
    //   314: iload 12
    //   316: if_icmplt +17 -> 333
    //   319: aload 13
    //   321: astore 26
    //   323: goto -188 -> 135
    //   326: ldc 29
    //   328: astore 17
    //   330: goto -123 -> 207
    //   333: iload 23
    //   335: ifle +11 -> 346
    //   338: ldc_w 689
    //   341: astore 24
    //   343: goto -96 -> 247
    //   346: ldc_w 691
    //   349: astore 24
    //   351: goto -104 -> 247
    //
    // Exception table:
    //   from	to	target	type
    //   4	58	293	finally
    //   62	75	293	finally
    //   80	99	293	finally
    //   102	129	293	finally
    //   135	160	293	finally
    //   167	172	293	finally
    //   185	197	293	finally
    //   207	223	293	finally
    //   229	240	293	finally
    //   247	255	293	finally
    //   261	287	293	finally
    //   304	312	293	finally
    //   160	167	302	finally
  }

  // ERROR //
  public final boolean isDatabaseIntegrityOk()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 136	com/tencent/kingkong/database/SQLiteDatabase:acquireReference	()V
    //   4: aload_0
    //   5: invokevirtual 694	com/tencent/kingkong/database/SQLiteDatabase:getAttachedDbs	()Ljava/util/List;
    //   8: astore 13
    //   10: aload 13
    //   12: ifnonnull +269 -> 281
    //   15: new 313	java/lang/IllegalStateException
    //   18: dup
    //   19: new 187	java/lang/StringBuilder
    //   22: dup
    //   23: ldc_w 696
    //   26: invokespecial 196	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   29: aload_0
    //   30: invokevirtual 697	com/tencent/kingkong/database/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   33: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: ldc_w 699
    //   39: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: invokevirtual 205	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   45: invokespecial 316	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   48: athrow
    //   49: astore_2
    //   50: new 253	java/util/ArrayList
    //   53: dup
    //   54: invokespecial 317	java/util/ArrayList:<init>	()V
    //   57: astore_3
    //   58: aload_3
    //   59: new 570	android/util/Pair
    //   62: dup
    //   63: ldc_w 572
    //   66: aload_0
    //   67: invokevirtual 697	com/tencent/kingkong/database/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   70: invokespecial 578	android/util/Pair:<init>	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   73: invokeinterface 702 2 0
    //   78: pop
    //   79: aload_3
    //   80: astore 5
    //   82: goto +203 -> 285
    //   85: aload 5
    //   87: invokeinterface 703 1 0
    //   92: istore 7
    //   94: iload 6
    //   96: iload 7
    //   98: if_icmplt +9 -> 107
    //   101: aload_0
    //   102: invokevirtual 152	com/tencent/kingkong/database/SQLiteDatabase:releaseReference	()V
    //   105: iconst_1
    //   106: ireturn
    //   107: aload 5
    //   109: iload 6
    //   111: invokeinterface 706 2 0
    //   116: checkcast 570	android/util/Pair
    //   119: astore 8
    //   121: aload_0
    //   122: new 187	java/lang/StringBuilder
    //   125: dup
    //   126: ldc_w 708
    //   129: invokespecial 196	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   132: aload 8
    //   134: getfield 711	android/util/Pair:first	Ljava/lang/Object;
    //   137: checkcast 79	java/lang/String
    //   140: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: ldc_w 713
    //   146: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: invokevirtual 205	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   152: invokevirtual 715	com/tencent/kingkong/database/SQLiteDatabase:compileStatement	(Ljava/lang/String;)Lcom/tencent/kingkong/database/SQLiteStatement;
    //   155: astore 11
    //   157: aload 11
    //   159: astore 10
    //   161: aload 10
    //   163: invokevirtual 718	com/tencent/kingkong/database/SQLiteStatement:simpleQueryForString	()Ljava/lang/String;
    //   166: astore 12
    //   168: aload 12
    //   170: ldc_w 720
    //   173: invokevirtual 723	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   176: ifne +84 -> 260
    //   179: ldc 41
    //   181: new 187	java/lang/StringBuilder
    //   184: dup
    //   185: ldc_w 725
    //   188: invokespecial 196	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   191: aload 8
    //   193: getfield 728	android/util/Pair:second	Ljava/lang/Object;
    //   196: checkcast 79	java/lang/String
    //   199: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: ldc_w 730
    //   205: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   208: aload 12
    //   210: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   213: invokevirtual 205	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   216: invokestatic 732	com/tencent/kingkong/support/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   219: aload 10
    //   221: ifnull +8 -> 229
    //   224: aload 10
    //   226: invokevirtual 295	com/tencent/kingkong/database/SQLiteStatement:close	()V
    //   229: aload_0
    //   230: invokevirtual 152	com/tencent/kingkong/database/SQLiteDatabase:releaseReference	()V
    //   233: iconst_0
    //   234: ireturn
    //   235: astore 9
    //   237: aconst_null
    //   238: astore 10
    //   240: aload 10
    //   242: ifnull +8 -> 250
    //   245: aload 10
    //   247: invokevirtual 295	com/tencent/kingkong/database/SQLiteStatement:close	()V
    //   250: aload 9
    //   252: athrow
    //   253: astore_1
    //   254: aload_0
    //   255: invokevirtual 152	com/tencent/kingkong/database/SQLiteDatabase:releaseReference	()V
    //   258: aload_1
    //   259: athrow
    //   260: aload 10
    //   262: ifnull +8 -> 270
    //   265: aload 10
    //   267: invokevirtual 295	com/tencent/kingkong/database/SQLiteStatement:close	()V
    //   270: iinc 6 1
    //   273: goto -188 -> 85
    //   276: astore 9
    //   278: goto -38 -> 240
    //   281: aload 13
    //   283: astore 5
    //   285: iconst_0
    //   286: istore 6
    //   288: goto -203 -> 85
    //
    // Exception table:
    //   from	to	target	type
    //   4	10	49	com/tencent/kingkong/database/SQLiteException
    //   15	49	49	com/tencent/kingkong/database/SQLiteException
    //   121	157	235	finally
    //   4	10	253	finally
    //   15	49	253	finally
    //   50	79	253	finally
    //   85	94	253	finally
    //   107	121	253	finally
    //   224	229	253	finally
    //   245	250	253	finally
    //   250	253	253	finally
    //   265	270	253	finally
    //   161	219	276	finally
  }

  public final boolean isDbLockedByCurrentThread()
  {
    acquireReference();
    try
    {
      boolean bool = getThreadSession().hasConnection();
      return bool;
    }
    finally
    {
      releaseReference();
    }
  }

  @Deprecated
  public final boolean isDbLockedByOtherThreads()
  {
    return false;
  }

  public final boolean isInMemoryDatabase()
  {
    synchronized (this.mLock)
    {
      boolean bool = this.mConfigurationLocked.isInMemoryDb();
      return bool;
    }
  }

  public final boolean isOpen()
  {
    synchronized (this.mLock)
    {
      if (this.mConnectionPoolLocked != null)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }

  public final boolean isReadOnly()
  {
    synchronized (this.mLock)
    {
      boolean bool = isReadOnlyLocked();
      return bool;
    }
  }

  public final boolean isWriteAheadLoggingEnabled()
  {
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      if ((0x20000000 & this.mConfigurationLocked.openFlags) != 0)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }

  @Deprecated
  public final void markTableSyncable(String paramString1, String paramString2)
  {
  }

  @Deprecated
  public final void markTableSyncable(String paramString1, String paramString2, String paramString3)
  {
  }

  public final boolean needUpgrade(int paramInt)
  {
    return paramInt > getVersion();
  }

  protected final void onAllReferencesReleased()
  {
    dispose(false);
  }

  final void onCorruption()
  {
    this.mErrorHandler.onCorruption(this, this.isEncrypt);
  }

  public final Cursor query(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5)
  {
    return query(false, paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, null);
  }

  public final Cursor query(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    return query(false, paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, paramString6);
  }

  public final Cursor query(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean)
  {
    return query(false, paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, null, paramBoolean);
  }

  public final Cursor query(boolean paramBoolean, String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    return queryWithFactory(null, paramBoolean, paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, paramString6, null);
  }

  public final Cursor query(boolean paramBoolean, String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5, String paramString6, CancellationSignal paramCancellationSignal)
  {
    return query(paramBoolean, paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, paramString6, paramCancellationSignal, false);
  }

  public final Cursor query(boolean paramBoolean1, String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5, String paramString6, CancellationSignal paramCancellationSignal, boolean paramBoolean2)
  {
    return queryWithFactory(null, paramBoolean1, paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, paramString6, paramCancellationSignal, paramBoolean2);
  }

  public final Cursor query(boolean paramBoolean1, String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5, String paramString6, boolean paramBoolean2)
  {
    return queryWithFactory(null, paramBoolean1, paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, paramString6, null, paramBoolean2);
  }

  public final Cursor queryWithFactory(SQLiteDatabase.CursorFactory paramCursorFactory, boolean paramBoolean, String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    return queryWithFactory(paramCursorFactory, paramBoolean, paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, paramString6, null);
  }

  public final Cursor queryWithFactory(SQLiteDatabase.CursorFactory paramCursorFactory, boolean paramBoolean, String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5, String paramString6, CancellationSignal paramCancellationSignal)
  {
    return queryWithFactory(paramCursorFactory, paramBoolean, paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, paramString6, paramCancellationSignal, false);
  }

  public final Cursor queryWithFactory(SQLiteDatabase.CursorFactory paramCursorFactory, boolean paramBoolean1, String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5, String paramString6, CancellationSignal paramCancellationSignal, boolean paramBoolean2)
  {
    acquireReference();
    try
    {
      Cursor localCursor = rawQueryWithFactory(paramCursorFactory, SQLiteQueryBuilder.buildQueryString(paramBoolean1, paramString1, paramArrayOfString1, paramString2, paramString3, paramString4, paramString5, paramString6), paramArrayOfString2, findEditTable(paramString1), paramCancellationSignal, paramBoolean2);
      return localCursor;
    }
    finally
    {
      releaseReference();
    }
  }

  public final Cursor rawQuery(String paramString, String[] paramArrayOfString)
  {
    return rawQueryWithFactory(null, paramString, paramArrayOfString, null, null);
  }

  public final Cursor rawQuery(String paramString, String[] paramArrayOfString, CancellationSignal paramCancellationSignal)
  {
    return rawQueryWithFactory(null, paramString, paramArrayOfString, null, paramCancellationSignal);
  }

  public final Cursor rawQuery(String paramString, String[] paramArrayOfString, boolean paramBoolean)
  {
    return rawQueryWithFactory(null, paramString, paramArrayOfString, null, null, true);
  }

  public final Cursor rawQueryWithFactory(SQLiteDatabase.CursorFactory paramCursorFactory, String paramString1, String[] paramArrayOfString, String paramString2)
  {
    return rawQueryWithFactory(paramCursorFactory, paramString1, paramArrayOfString, paramString2, null);
  }

  public final Cursor rawQueryWithFactory(SQLiteDatabase.CursorFactory paramCursorFactory, String paramString1, String[] paramArrayOfString, String paramString2, CancellationSignal paramCancellationSignal)
  {
    return rawQueryWithFactory(paramCursorFactory, paramString1, paramArrayOfString, paramString2, paramCancellationSignal, false);
  }

  public final Cursor rawQueryWithFactory(SQLiteDatabase.CursorFactory paramCursorFactory, String paramString1, String[] paramArrayOfString, String paramString2, CancellationSignal paramCancellationSignal, boolean paramBoolean)
  {
    acquireReference();
    if (paramBoolean);
    while (true)
    {
      try
      {
        Object localObject1 = new m(this, paramString1, paramString2, paramCancellationSignal);
        break label80;
        Cursor localCursor = ((SQLiteCursorDriver)localObject1).query(paramCursorFactory, paramArrayOfString);
        return localCursor;
        localObject1 = new SQLiteDirectCursorDriver(this, paramString1, paramString2, paramCancellationSignal);
      }
      finally
      {
        releaseReference();
      }
      label80: 
      while (paramCursorFactory == null)
      {
        paramCursorFactory = this.mCursorFactory;
        break;
      }
    }
  }

  public final void reopenReadWrite()
  {
    int i;
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      if (!isReadOnlyLocked())
        return;
      i = this.mConfigurationLocked.openFlags;
      this.mConfigurationLocked.openFlags = (0xFFFFFFFE & this.mConfigurationLocked.openFlags);
    }
    try
    {
      this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
      return;
      localObject2 = finally;
      throw localObject2;
    }
    catch (RuntimeException localRuntimeException)
    {
      this.mConfigurationLocked.openFlags = i;
      throw localRuntimeException;
    }
  }

  public final long replace(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    try
    {
      long l = insertWithOnConflict(paramString1, paramString2, paramContentValues, 5);
      return l;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      throw localSQLiteDatabaseCorruptException;
    }
    catch (SQLException localSQLException)
    {
      Log.e("MicroMsg.kkdb.SQLiteDatabase", "Error inserting " + paramContentValues, new Object[] { localSQLException });
    }
    return -1L;
  }

  public final long replaceOrThrow(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    return insertWithOnConflict(paramString1, paramString2, paramContentValues, 5);
  }

  public final void setForeignKeyConstraintsEnabled(boolean paramBoolean)
  {
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      if (this.mConfigurationLocked.foreignKeyConstraintsEnabled == paramBoolean)
        return;
      this.mConfigurationLocked.foreignKeyConstraintsEnabled = paramBoolean;
    }
    SQLiteDatabaseConfiguration localSQLiteDatabaseConfiguration;
    try
    {
      this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
      return;
      localObject2 = finally;
      throw localObject2;
    }
    catch (RuntimeException localRuntimeException)
    {
      localSQLiteDatabaseConfiguration = this.mConfigurationLocked;
      if (!paramBoolean);
    }
    for (boolean bool = false; ; bool = true)
    {
      localSQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled = bool;
      throw localRuntimeException;
    }
  }

  public final void setLocale(Locale paramLocale)
  {
    if (paramLocale == null)
      throw new IllegalArgumentException("locale must not be null.");
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      Locale localLocale = this.mConfigurationLocked.locale;
      this.mConfigurationLocked.locale = paramLocale;
      try
      {
        this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        this.mConfigurationLocked.locale = localLocale;
        throw localRuntimeException;
      }
    }
  }

  @Deprecated
  public final void setLockingEnabled(boolean paramBoolean)
  {
  }

  public final void setMaxSqlCacheSize(int paramInt)
  {
    if ((paramInt > 100) || (paramInt < 0))
      throw new IllegalStateException("expected value between 0 and 100");
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      int i = this.mConfigurationLocked.maxSqlCacheSize;
      this.mConfigurationLocked.maxSqlCacheSize = paramInt;
      try
      {
        this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        this.mConfigurationLocked.maxSqlCacheSize = i;
        throw localRuntimeException;
      }
    }
  }

  public final long setMaximumSize(long paramLong)
  {
    long l1 = getPageSize();
    long l2 = paramLong / l1;
    if (paramLong % l1 != 0L)
      l2 += 1L;
    return l1 * DatabaseUtils.longForQuery(this, "PRAGMA max_page_count = " + l2, null);
  }

  public final void setPageSize(long paramLong)
  {
    execSQL("PRAGMA page_size = " + paramLong);
  }

  public final void setTransactionSuccessful()
  {
    acquireReference();
    try
    {
      getThreadSession().setTransactionSuccessful();
      return;
    }
    finally
    {
      releaseReference();
    }
  }

  public final void setVersion(int paramInt)
  {
    execSQL("PRAGMA user_version = " + paramInt);
  }

  public final String toString()
  {
    return "SQLiteDatabase: " + getPath();
  }

  public final int update(String paramString1, ContentValues paramContentValues, String paramString2, String[] paramArrayOfString)
  {
    return updateWithOnConflict(paramString1, paramContentValues, paramString2, paramArrayOfString, 0);
  }

  public final int updateWithOnConflict(String paramString1, ContentValues paramContentValues, String paramString2, String[] paramArrayOfString, int paramInt)
  {
    if ((paramContentValues == null) || (paramContentValues.size() == 0))
      throw new IllegalArgumentException("Empty values");
    acquireReference();
    while (true)
    {
      int j;
      int n;
      String str2;
      try
      {
        localStringBuilder = new StringBuilder(120);
        localStringBuilder.append("UPDATE ");
        localStringBuilder.append(CONFLICT_VALUES[paramInt]);
        localStringBuilder.append(paramString1);
        localStringBuilder.append(" SET ");
        i = paramContentValues.size();
        if (paramArrayOfString == null)
        {
          j = i;
          arrayOfObject = new Object[j];
          localIterator = keySet(paramContentValues).iterator();
          k = 0;
          if (localIterator.hasNext())
            continue;
          if (paramArrayOfString != null)
          {
            n = i;
            break label312;
          }
          if (!TextUtils.isEmpty(paramString2))
          {
            localStringBuilder.append(" WHERE ");
            localStringBuilder.append(paramString2);
          }
          localSQLiteStatement = new SQLiteStatement(this, localStringBuilder.toString(), arrayOfObject);
        }
      }
      finally
      {
        try
        {
          StringBuilder localStringBuilder;
          int i;
          Object[] arrayOfObject;
          Iterator localIterator;
          int m = localSQLiteStatement.executeUpdateDelete();
          localSQLiteStatement.close();
          return m;
          j = i + paramArrayOfString.length;
          continue;
          String str1 = (String)localIterator.next();
          if (k <= 0)
            break label322;
          str2 = ",";
          localStringBuilder.append(str2);
          localStringBuilder.append(str1);
          int i1 = k + 1;
          arrayOfObject[k] = paramContentValues.get(str1);
          localStringBuilder.append("=?");
          int k = i1;
          continue;
          arrayOfObject[n] = paramArrayOfString[(n - i)];
          n++;
        }
        finally
        {
          SQLiteStatement localSQLiteStatement;
          localSQLiteStatement.close();
        }
        releaseReference();
      }
      label312: if (n >= j)
      {
        continue;
        label322: str2 = "";
      }
    }
  }

  @Deprecated
  public final boolean yieldIfContended()
  {
    return yieldIfContendedHelper(false, -1L);
  }

  public final boolean yieldIfContendedSafely()
  {
    return yieldIfContendedHelper(true, -1L);
  }

  public final boolean yieldIfContendedSafely(long paramLong)
  {
    return yieldIfContendedHelper(true, paramLong);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteDatabase
 * JD-Core Version:    0.6.2
 */