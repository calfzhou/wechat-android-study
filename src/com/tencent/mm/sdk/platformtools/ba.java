package com.tencent.mm.sdk.platformtools;

import android.os.Debug;
import android.os.Handler;

final class ba
  implements Runnable
{
  private static final String dEv = localStringBuilder.toString();
  final Thread dIw;
  final Handler handler;
  final String iEG;
  final Object iEH;
  String iEI;
  long iEJ;
  final bb iEK;
  long iEL;
  long iEM;
  long iEN;
  long iEO;
  final Runnable igH;
  int priority;

  static
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("taskName = %s");
    localStringBuilder.append("|token = %s");
    localStringBuilder.append("|handler = %s");
    localStringBuilder.append("|threadName = %s");
    localStringBuilder.append("|threadId = %d");
    localStringBuilder.append("|priority = %d");
    localStringBuilder.append("|addTime = %d");
    localStringBuilder.append("|delayTime = %d");
    localStringBuilder.append("|usedTime = %d");
    localStringBuilder.append("|cpuTime = %d");
  }

  ba(Runnable paramRunnable, Object paramObject, Handler paramHandler, Thread paramThread, bb parambb)
  {
    this.igH = paramRunnable;
    String str1 = paramRunnable.getClass().getName();
    String str2 = paramRunnable.toString();
    if (!ch.jb(str2))
    {
      int i = str2.indexOf('|');
      if (i > 0)
        str1 = str1 + str2.substring(i);
    }
    this.iEG = str1;
    this.iEH = paramObject;
    this.handler = paramHandler;
    this.dIw = paramThread;
    if (paramThread != null)
    {
      this.iEI = paramThread.getName();
      this.iEJ = paramThread.getId();
      this.priority = paramThread.getPriority();
    }
    this.iEK = parambb;
    this.iEL = System.currentTimeMillis();
  }

  public final void run()
  {
    this.iEN = System.currentTimeMillis();
    this.iEO = Debug.threadCpuTimeNanos();
    this.igH.run();
    this.iEN = (System.currentTimeMillis() - this.iEN);
    this.iEO = (Debug.threadCpuTimeNanos() - this.iEO);
    if (this.iEK != null)
    {
      this.iEK.a(this.igH, this);
      this.iEK.a(this, this.dIw, this.iEN, this.iEO);
    }
  }

  public final String toString()
  {
    String str = dEv;
    Object[] arrayOfObject = new Object[10];
    arrayOfObject[0] = this.iEG;
    arrayOfObject[1] = this.iEH;
    arrayOfObject[2] = this.handler;
    arrayOfObject[3] = this.iEI;
    arrayOfObject[4] = Long.valueOf(this.iEJ);
    arrayOfObject[5] = Integer.valueOf(this.priority);
    arrayOfObject[6] = Long.valueOf(this.iEL);
    arrayOfObject[7] = Long.valueOf(this.iEM);
    arrayOfObject[8] = Long.valueOf(this.iEN);
    arrayOfObject[9] = Long.valueOf(this.iEO);
    return String.format(str, arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ba
 * JD-Core Version:    0.6.2
 */