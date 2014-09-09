package com.tencent.mm.sdk.platformtools;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Process;
import android.util.Log;

public final class z
{
  private static final String gHc = localStringBuilder.toString();
  public static cr ieQ;
  private static ac ieR;
  private static ac ieS;
  private static int level = 6;

  static
  {
    aa localaa = new aa();
    ieR = localaa;
    ieS = localaa;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("VERSION.RELEASE:[" + Build.VERSION.RELEASE);
    localStringBuilder.append("] VERSION.CODENAME:[" + Build.VERSION.CODENAME);
    localStringBuilder.append("] VERSION.INCREMENTAL:[" + Build.VERSION.INCREMENTAL);
    localStringBuilder.append("] BOARD:[" + Build.BOARD);
    localStringBuilder.append("] DEVICE:[" + Build.DEVICE);
    localStringBuilder.append("] DISPLAY:[" + Build.DISPLAY);
    localStringBuilder.append("] FINGERPRINT:[" + Build.FINGERPRINT);
    localStringBuilder.append("] HOST:[" + Build.HOST);
    localStringBuilder.append("] MANUFACTURER:[" + Build.MANUFACTURER);
    localStringBuilder.append("] MODEL:[" + Build.MODEL);
    localStringBuilder.append("] PRODUCT:[" + Build.PRODUCT);
    localStringBuilder.append("] TAGS:[" + Build.TAGS);
    localStringBuilder.append("] TYPE:[" + Build.TYPE);
    localStringBuilder.append("] USER:[" + Build.USER + "]");
  }

  public static void a(ac paramac)
  {
    ieS = paramac;
  }

  public static void a(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if ((ieS != null) && (ieS.getLogLevel() <= 1))
    {
      String str1 = String.format(paramString2, paramArrayOfObject);
      if (str1 == null)
        str1 = "";
      String str2 = xc(paramString1);
      String str3 = str1 + "  " + ch.aHN();
      ieS.logI(str2, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str3);
    }
  }

  public static ac aGX()
  {
    return ieS;
  }

  public static String aGY()
  {
    return gHc;
  }

  public static void appenderClose()
  {
    if (ieS != null)
      ieS.appenderClose();
  }

  public static void appenderFlush()
  {
    if (ieS != null)
      ieS.appenderFlush();
  }

  public static void appenderFlushSync()
  {
    if (ieS != null)
      ieS.appenderFlushSync();
  }

  public static void b(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if ((ieS != null) && (ieS.getLogLevel() <= 2))
    {
      String str1 = String.format(paramString2, paramArrayOfObject);
      if (str1 == null)
        str1 = "";
      String str2 = xc(paramString1);
      String str3 = str1 + "  " + ch.aHN();
      ieS.logI(str2, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str3);
    }
  }

  public static void d(String paramString1, String paramString2)
  {
    d(paramString1, paramString2, null);
  }

  public static void d(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if ((ieS != null) && (ieS.getLogLevel() <= 1))
      if (paramArrayOfObject != null)
        break label72;
    label72: for (String str1 = paramString2; ; str1 = String.format(paramString2, paramArrayOfObject))
    {
      if (str1 == null)
        str1 = "";
      String str2 = xc(paramString1);
      ieS.logD(str2, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str1);
      return;
    }
  }

  public static void e(String paramString1, String paramString2)
  {
    e(paramString1, paramString2, null);
  }

  public static void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if ((ieS != null) && (ieS.getLogLevel() <= 4))
      if (paramArrayOfObject != null)
        break label72;
    label72: for (String str1 = paramString2; ; str1 = String.format(paramString2, paramArrayOfObject))
    {
      if (str1 == null)
        str1 = "";
      String str2 = xc(paramString1);
      ieS.logE(str2, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str1);
      return;
    }
  }

  public static void f(String paramString1, String paramString2)
  {
    f(paramString1, paramString2, null);
  }

  public static void f(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if ((ieS != null) && (ieS.getLogLevel() <= 5))
      if (paramArrayOfObject != null)
        break label75;
    label75: for (String str1 = paramString2; ; str1 = String.format(paramString2, paramArrayOfObject))
    {
      String str2 = xc(paramString1);
      ieS.logF(str2, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str1);
      am.h(new ab());
      return;
    }
  }

  public static int getLogLevel()
  {
    if (ieS != null)
      return ieS.getLogLevel();
    return 6;
  }

  public static void i(String paramString1, String paramString2)
  {
    i(paramString1, paramString2, null);
  }

  public static void i(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if ((ieS != null) && (ieS.getLogLevel() <= 2))
      if (paramArrayOfObject != null)
        break label72;
    label72: for (String str1 = paramString2; ; str1 = String.format(paramString2, paramArrayOfObject))
    {
      if (str1 == null)
        str1 = "";
      String str2 = xc(paramString1);
      ieS.logI(str2, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str1);
      return;
    }
  }

  public static void nQ(int paramInt)
  {
    level = paramInt;
  }

  public static void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object[] paramArrayOfObject)
  {
    if ((ieS != null) && (ieS.getLogLevel() <= 4))
    {
      String str1 = String.format(paramString2, paramArrayOfObject);
      if (str1 == null)
        str1 = "";
      String str2 = xc(paramString1);
      String str3 = str1 + "  " + Log.getStackTraceString(paramThrowable);
      ieS.logE(str2, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str3);
    }
  }

  public static void v(String paramString1, String paramString2)
  {
    v(paramString1, paramString2, null);
  }

  public static void v(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if ((ieS != null) && (ieS.getLogLevel() <= 0))
      if (paramArrayOfObject != null)
        break label71;
    label71: for (String str1 = paramString2; ; str1 = String.format(paramString2, paramArrayOfObject))
    {
      if (str1 == null)
        str1 = "";
      String str2 = xc(paramString1);
      ieS.logV(str2, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str1);
      return;
    }
  }

  public static void w(String paramString1, String paramString2)
  {
    w(paramString1, paramString2, null);
  }

  public static void w(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if ((ieS != null) && (ieS.getLogLevel() <= 3))
      if (paramArrayOfObject != null)
        break label72;
    label72: for (String str1 = paramString2; ; str1 = String.format(paramString2, paramArrayOfObject))
    {
      if (str1 == null)
        str1 = "";
      String str2 = xc(paramString1);
      ieS.logW(str2, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str1);
      return;
    }
  }

  private static String xc(String paramString)
  {
    if (ieQ != null)
      paramString = ieQ.xc(paramString);
    return paramString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.z
 * JD-Core Version:    0.6.2
 */