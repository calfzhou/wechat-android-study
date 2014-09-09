package com.tencent.kingkong.database;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Method;

public final class SQLiteDebug
{
  public static final int CHILD_THREAD_SLOW_QUERY_THRESHOLD = 500;
  public static final int CHILD_THREAD_SLOW_UPDATE_THRESHOLD = 1000;
  public static final boolean DEBUG_LOG_SLOW_QUERIES = false;
  public static final boolean DEBUG_SQL_LOG = false;
  public static final boolean DEBUG_SQL_STATEMENTS = false;
  public static final boolean DEBUG_SQL_TIME = false;
  public static final int MAIN_THREAD_SLOW_ATTACH_DB_THRESHOLD = 1000;
  public static final int MAIN_THREAD_SLOW_PRAGMA_THRESHOLD = 1000;
  public static final int MAIN_THREAD_SLOW_QUERY_THRESHOLD = 300;
  public static final int MAIN_THREAD_SLOW_TRACSATION_THRESHOLD = 2000;
  public static final int MAIN_THREAD_SLOW_UPDATE_THRESHOLD = 500;

  static
  {
    int i = 1;
    DEBUG_SQL_LOG = Log.isLoggable("SQLiteLog", 2);
    DEBUG_SQL_STATEMENTS = Log.isLoggable("SQLiteStatements", 2);
    DEBUG_SQL_TIME = Log.isLoggable("SQLiteTime", 2);
    if (getSystemDebuggable() == i);
    while (true)
    {
      DEBUG_LOG_SLOW_QUERIES = i;
      return;
      i = 0;
    }
  }

  public static void dump(String[] paramArrayOfString)
  {
    boolean bool = false;
    int i = paramArrayOfString.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
      {
        SQLiteDatabase.dumpAll(bool);
        return;
      }
      if (paramArrayOfString[j].equals("-v"))
        bool = true;
    }
  }

  public static SQLiteDebug.PagerStats getDatabaseInfo()
  {
    SQLiteDebug.PagerStats localPagerStats = new SQLiteDebug.PagerStats();
    nativeGetPagerStats(localPagerStats);
    localPagerStats.dbStats = SQLiteDatabase.getDbStats();
    return localPagerStats;
  }

  private static final int getSystemDebuggable()
  {
    try
    {
      Class localClass = Class.forName("android.os.SystemProperties");
      Class[] arrayOfClass = new Class[2];
      arrayOfClass[0] = String.class;
      arrayOfClass[1] = Integer.TYPE;
      Method localMethod = localClass.getMethod("getInt", arrayOfClass);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = "ro.debuggable";
      arrayOfObject[1] = Integer.valueOf(0);
      int i = ((Integer)localMethod.invoke(localClass, arrayOfObject)).intValue();
      return i;
    }
    catch (Exception localException)
    {
    }
    return 0;
  }

  private static native void nativeGetPagerStats(SQLiteDebug.PagerStats paramPagerStats);

  public static final boolean shouldLogSlowAttach(long paramLong)
  {
    return paramLong > 1000L;
  }

  public static final boolean shouldLogSlowPragma(long paramLong)
  {
    return paramLong > 1000L;
  }

  public static final boolean shouldLogSlowQuery(long paramLong)
  {
    if (paramLong > 300L)
      if (paramLong <= 500L);
    while (true)
    {
      return true;
      if (Looper.myLooper() == Looper.getMainLooper());
      for (int i = 1; i == 0; i = 0)
        return false;
    }
  }

  public static final boolean shouldLogSlowTransation(long paramLong)
  {
    if (Looper.myLooper() == Looper.getMainLooper());
    for (int i = 1; (i != 0) && (paramLong > 2000L); i = 0)
      return true;
    return false;
  }

  public static final boolean shouldLogSlowUpdate(long paramLong)
  {
    if (paramLong > 500L)
      if (paramLong <= 1000L);
    while (true)
    {
      return true;
      if (Looper.myLooper() == Looper.getMainLooper());
      for (int i = 1; i == 0; i = 0)
        return false;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteDebug
 * JD-Core Version:    0.6.2
 */