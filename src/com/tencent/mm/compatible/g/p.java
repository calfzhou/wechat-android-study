package com.tencent.mm.compatible.g;

import java.util.concurrent.atomic.AtomicInteger;

final class p
  implements Thread.UncaughtExceptionHandler
{
  private Thread.UncaughtExceptionHandler dPc;

  public p(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler)
  {
    this.dPc = paramUncaughtExceptionHandler;
  }

  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    boolean bool = paramThrowable instanceof UnsatisfiedLinkError;
    int i = 0;
    if (bool)
    {
      int j = o.nR().get();
      i = 0;
      if (j != 0);
    }
    try
    {
      o.nS();
      i = 1;
      if (i != 0)
        paramThrowable = new UnsatisfiedLinkError("Invalid JNI libraries detected and recovered.").initCause(paramThrowable);
      this.dPc.uncaughtException(paramThread, paramThrowable);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        i = 0;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.g.p
 * JD-Core Version:    0.6.2
 */