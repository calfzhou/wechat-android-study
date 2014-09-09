package com.tencent.mm.compatible.g;

import android.os.SystemClock;

public final class l
{
  private long dOT = SystemClock.elapsedRealtime();

  public final long nM()
  {
    return SystemClock.elapsedRealtime() - this.dOT;
  }

  public final void reset()
  {
    this.dOT = SystemClock.elapsedRealtime();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.g.l
 * JD-Core Version:    0.6.2
 */