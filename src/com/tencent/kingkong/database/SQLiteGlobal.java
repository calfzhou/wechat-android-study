package com.tencent.kingkong.database;

import android.content.res.Resources;
import android.os.StatFs;
import java.lang.reflect.Method;

public final class SQLiteGlobal
{
  private static final String TAG = "SQLiteGlobal";
  private static boolean forceOptimization = false;
  private static boolean optimization = false;
  private static int sDefaultPageSize;
  private static final Object sLock = new Object();

  public static void disableForceOptimization()
  {
    forceOptimization = false;
  }

  public static void disableOptimization()
  {
    optimization = false;
  }

  public static void enableForceOptimization()
  {
    forceOptimization = true;
  }

  public static void enableOptimization()
  {
    optimization = true;
  }

  public static String getDefaultJournalMode()
  {
    return getStringAndroidSystemProperties("db_default_journal_mode", "debug.sqlite.journalmode", "MEMORY");
  }

  public static int getDefaultPageSize()
  {
    synchronized (sLock)
    {
      if (sDefaultPageSize == 0)
        sDefaultPageSize = new StatFs("/data").getBlockSize();
      int i = sDefaultPageSize;
      try
      {
        Class localClass = Class.forName("android.os.SystemProperties");
        Class[] arrayOfClass = new Class[2];
        arrayOfClass[0] = String.class;
        arrayOfClass[1] = Integer.TYPE;
        Method localMethod = localClass.getMethod("getInt", arrayOfClass);
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = "debug.sqlite.pagesize";
        arrayOfObject[1] = Integer.valueOf(i);
        int k = ((Integer)localMethod.invoke(localClass, arrayOfObject)).intValue();
        j = k;
        return j;
      }
      catch (Exception localException)
      {
        while (true)
          int j = i;
      }
    }
  }

  public static String getDefaultSyncMode()
  {
    if (optimization)
      return "OFF";
    return getStringAndroidSystemProperties("db_default_sync_mode", "debug.sqlite.syncmode", "OFF");
  }

  private static int getIntAndroidSystemProperties(String paramString1, String paramString2, int paramInt)
  {
    int i = Resources.getSystem().getIdentifier(paramString1, "integer", "android");
    int j;
    if (i != 0)
      j = Resources.getSystem().getInteger(i);
    try
    {
      while (true)
      {
        Class localClass = Class.forName("android.os.SystemProperties");
        Class[] arrayOfClass = new Class[2];
        arrayOfClass[0] = String.class;
        arrayOfClass[1] = Integer.TYPE;
        Method localMethod = localClass.getMethod("getInt", arrayOfClass);
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = paramString2;
        arrayOfObject[1] = Integer.valueOf(j);
        int k = ((Integer)localMethod.invoke(localClass, arrayOfObject)).intValue();
        return k;
        j = paramInt;
      }
    }
    catch (Exception localException)
    {
    }
    return j;
  }

  public static int getJournalSizeLimit()
  {
    return getIntAndroidSystemProperties("db_journal_size_limit", "debug.sqlite.journalsizelimit", 524288);
  }

  private static String getStringAndroidSystemProperties(String paramString1, String paramString2, String paramString3)
  {
    if (forceOptimization)
      return paramString3;
    int i = Resources.getSystem().getIdentifier(paramString1, "string", "android");
    String str1;
    if (i != 0)
      str1 = Resources.getSystem().getString(i);
    try
    {
      while (true)
      {
        Class localClass = Class.forName("android.os.SystemProperties");
        str2 = (String)localClass.getMethod("get", new Class[] { String.class, String.class }).invoke(localClass, new Object[] { paramString2, str1 });
        return str2;
        str1 = paramString3;
      }
    }
    catch (Exception localException)
    {
      while (true)
        String str2 = str1;
    }
  }

  public static int getWALAutoCheckpoint()
  {
    return Math.max(1, getIntAndroidSystemProperties("db_wal_autocheckpoint", "debug.sqlite.wal.autocheckpoint", 100));
  }

  public static int getWALConnectionPoolSize()
  {
    return Math.max(2, getIntAndroidSystemProperties("db_connection_pool_size", "debug.sqlite.wal.poolsize", 1));
  }

  public static String getWALSyncMode()
  {
    if (optimization)
      return "OFF";
    return getStringAndroidSystemProperties("db_wal_sync_mode", "debug.sqlite.wal.syncmode", "OFF");
  }

  private static native int nativeReleaseMemory();

  public static int releaseMemory()
  {
    return nativeReleaseMemory();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.database.SQLiteGlobal
 * JD-Core Version:    0.6.2
 */