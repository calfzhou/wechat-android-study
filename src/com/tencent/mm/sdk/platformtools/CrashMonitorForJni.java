package com.tencent.mm.sdk.platformtools;

import com.tencent.mm.sdk.b.b;
import java.io.PrintWriter;
import java.io.StringWriter;

class CrashMonitorForJni
{
  private static final String TAG = "!44@/B4Tb64lLpIdghwcJC06L4vQgeacnU04YoXZEn7MWNo=";
  public static m callback = null;

  private static void OnCrash(int paramInt, String paramString)
  {
    new StringBuilder("OnCrash sig:").append(paramInt).append("  stack:").append(paramString);
    b.b(paramInt, paramString);
  }

  public static String getCrashThreadJavaStack()
  {
    StringWriter localStringWriter = new StringWriter();
    PrintWriter localPrintWriter = new PrintWriter(localStringWriter);
    Throwable localThrowable = new Throwable("\n******* Java stack for JNI crash *******");
    StackTraceElement[] arrayOfStackTraceElement1 = localThrowable.getStackTrace();
    if (arrayOfStackTraceElement1.length > 1)
    {
      StackTraceElement[] arrayOfStackTraceElement2 = new StackTraceElement[-1 + arrayOfStackTraceElement1.length];
      for (int i = 0; i < arrayOfStackTraceElement2.length; i++)
        arrayOfStackTraceElement2[i] = arrayOfStackTraceElement1[(i + 1)];
      localThrowable.setStackTrace(arrayOfStackTraceElement2);
    }
    localThrowable.printStackTrace(localPrintWriter);
    return localStringWriter.toString() + "\n";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.CrashMonitorForJni
 * JD-Core Version:    0.6.2
 */