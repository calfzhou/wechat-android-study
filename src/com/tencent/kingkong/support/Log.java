package com.tencent.kingkong.support;

import android.os.Looper;
import android.os.Process;

public class Log
{
  public static final int LEVEL_DEBUG = 1;
  public static final int LEVEL_ERROR = 4;
  public static final int LEVEL_FATAL = 5;
  public static final int LEVEL_INFO = 2;
  public static final int LEVEL_NONE = 6;
  public static final int LEVEL_VERBOSE = 0;
  public static final int LEVEL_WARNING = 3;
  private static final String TAG = "MicroMsg.SDK.Log";
  private static Log.LogImp debugLog = local1;
  private static int level = 3;
  private static Log.LogImp logImp = local1;

  static
  {
    Log.1 local1 = new Log.1();
  }

  public static void appenderClose()
  {
    if (logImp != null)
      logImp.appenderClose();
  }

  public static void appenderFlush()
  {
    if (logImp != null)
      logImp.appenderFlush();
  }

  public static void d(String paramString1, String paramString2)
  {
    d(paramString1, paramString2, null);
  }

  public static void d(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if ((logImp != null) && (logImp.getLogLevel() <= 1))
      if (paramArrayOfObject != null)
        break label65;
    label65: for (String str = paramString2; ; str = String.format(paramString2, paramArrayOfObject))
    {
      if (str == null)
        str = "";
      logImp.logD(paramString1, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str);
      return;
    }
  }

  public static void e(String paramString1, String paramString2)
  {
    e(paramString1, paramString2, null);
  }

  public static void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if ((logImp != null) && (logImp.getLogLevel() <= 4))
      if (paramArrayOfObject != null)
        break label65;
    label65: for (String str = paramString2; ; str = String.format(paramString2, paramArrayOfObject))
    {
      if (str == null)
        str = "";
      logImp.logE(paramString1, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str);
      return;
    }
  }

  public static void f(String paramString1, String paramString2)
  {
    f(paramString1, paramString2, null);
  }

  public static void f(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if ((logImp != null) && (logImp.getLogLevel() <= 5))
      if (paramArrayOfObject != null)
        break label58;
    label58: for (String str = paramString2; ; str = String.format(paramString2, paramArrayOfObject))
    {
      logImp.logF(paramString1, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str);
      return;
    }
  }

  public static int getLogLevel()
  {
    if (logImp != null)
      return logImp.getLogLevel();
    return 6;
  }

  public static void i(String paramString1, String paramString2)
  {
    i(paramString1, paramString2, null);
  }

  public static void i(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if ((logImp != null) && (logImp.getLogLevel() <= 2))
      if (paramArrayOfObject != null)
        break label65;
    label65: for (String str = paramString2; ; str = String.format(paramString2, paramArrayOfObject))
    {
      if (str == null)
        str = "";
      logImp.logI(paramString1, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str);
      return;
    }
  }

  public static void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object[] paramArrayOfObject)
  {
    if ((logImp != null) && (logImp.getLogLevel() <= 4))
      if (paramArrayOfObject != null)
        break label98;
    label98: for (String str1 = paramString2; ; str1 = String.format(paramString2, paramArrayOfObject))
    {
      if (str1 == null)
        str1 = "";
      String str2 = str1 + "  " + android.util.Log.getStackTraceString(paramThrowable);
      logImp.logE(paramString1, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
      return;
    }
  }

  public static void setLevel(int paramInt, boolean paramBoolean)
  {
    level = paramInt;
  }

  public static void setLogImp(Log.LogImp paramLogImp)
  {
    logImp = paramLogImp;
  }

  public static void v(String paramString1, String paramString2)
  {
    v(paramString1, paramString2, null);
  }

  public static void v(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if ((logImp != null) && (logImp.getLogLevel() <= 0))
      if (paramArrayOfObject != null)
        break label64;
    label64: for (String str = paramString2; ; str = String.format(paramString2, paramArrayOfObject))
    {
      if (str == null)
        str = "";
      logImp.logV(paramString1, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str);
      return;
    }
  }

  public static void w(String paramString1, String paramString2)
  {
    w(paramString1, paramString2, null);
  }

  public static void w(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if ((logImp != null) && (logImp.getLogLevel() <= 3))
      if (paramArrayOfObject != null)
        break label65;
    label65: for (String str = paramString2; ; str = String.format(paramString2, paramArrayOfObject))
    {
      if (str == null)
        str = "";
      logImp.logW(paramString1, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.support.Log
 * JD-Core Version:    0.6.2
 */