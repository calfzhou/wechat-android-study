package com.tencent.mm.platformtools;

import com.tencent.mm.sdk.platformtools.z;

public final class k
{
  private final long dUE = 420000L;
  private final int dUF = 3;
  private long dUG = 0L;
  private int dUH = this.dUF;

  public final boolean get()
  {
    if (ap.ad(this.dUG) < this.dUE)
    {
      z.i("!44@/B4Tb64lLpIs4rU5akH/Kq28MqWPoDJwMR5odbcFtuM=", "frequency limited, last=" + this.dUG + ", cur=" + ap.CN() + ", retries=" + this.dUH);
      if (this.dUH <= 0)
        return false;
    }
    for (this.dUH = (-1 + this.dUH); ; this.dUH = this.dUF)
    {
      this.dUG = ap.CN();
      return true;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.k
 * JD-Core Version:    0.6.2
 */