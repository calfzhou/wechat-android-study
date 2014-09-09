package com.tencent.mm.sdk.platformtools;

import android.os.Process;
import com.tencent.mm.sdk.b.a;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public final class aw
  implements Thread.UncaughtExceptionHandler
{
  private a iEA;
  private boolean iEB = false;
  private ax iEC;
  private Thread.UncaughtExceptionHandler iEz = null;

  public aw(ax paramax)
  {
    Thread.setDefaultUncaughtExceptionHandler(this);
    this.iEA = null;
    this.iEC = paramax;
  }

  private static String AS(String paramString)
  {
    if (paramString == null)
      paramString = null;
    label65: 
    while (true)
    {
      return paramString;
      char[] arrayOfChar = paramString.toCharArray();
      if (arrayOfChar == null)
        return null;
      int i = 0;
      if (i < arrayOfChar.length)
        if (arrayOfChar[i] > '')
          arrayOfChar[i] = '\000';
      for (int j = 1; ; j = 0)
      {
        if (j == 0)
          break label65;
        return new String(arrayOfChar, 0, i);
        i++;
        break;
      }
    }
  }

  public final void a(a parama)
  {
    this.iEA = parama;
  }

  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    Object[] arrayOfObject1 = new Object[4];
    arrayOfObject1[0] = Boolean.valueOf(this.iEB);
    arrayOfObject1[1] = Integer.valueOf(Process.myPid());
    arrayOfObject1[2] = Long.valueOf(paramThread.getId());
    arrayOfObject1[3] = paramThrowable.getMessage();
    z.e("!24@/B4Tb64lLpJPSMxSBMKrrg==", "uncaught exception error, hasBeenReport=%b pid=%d threadId=%d, err=%s", arrayOfObject1);
    if (this.iEB)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = paramThrowable.getMessage();
      z.w("!24@/B4Tb64lLpJPSMxSBMKrrg==", "uncaughtException has been report once , process broken  , do not report again. :%s", arrayOfObject2);
      return;
    }
    this.iEB = true;
    try
    {
      localByteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream localPrintStream = new PrintStream(localByteArrayOutputStream);
      while (paramThrowable.getCause() != null)
        paramThrowable = paramThrowable.getCause();
      paramThrowable.printStackTrace(localPrintStream);
      str = AS(localByteArrayOutputStream.toString());
    }
    catch (Exception localException1)
    {
      try
      {
        ByteArrayOutputStream localByteArrayOutputStream;
        String str;
        if ((this.iEA != null) && (str != null))
          this.iEA.ei(str);
        label159: if ((this.iEC != null) && (str != null))
          this.iEC.av(str);
        localByteArrayOutputStream.close();
        while (true)
        {
          z.appenderClose();
          Process.killProcess(Process.myPid());
          System.exit(0);
          return;
          localException1 = localException1;
        }
      }
      catch (Exception localException2)
      {
        break label159;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.aw
 * JD-Core Version:    0.6.2
 */