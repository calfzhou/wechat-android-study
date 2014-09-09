package com.tencent.mm.sandbox.updater;

import com.tencent.mm.sdk.platformtools.z;

final class aj
  implements Runnable
{
  aj(ah paramah, long paramLong)
  {
  }

  public final void run()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(this.iCl);
    z.d("!44@/B4Tb64lLpIoz7uBiEqQZS70cVT/Q61Ax49vraaHmec=", "onUpstreamTraffic upstream : %s", arrayOfObject);
    ah.a(this.iCk, Math.max(0L, this.iCl));
    ah.a(this.iCk, false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.aj
 * JD-Core Version:    0.6.2
 */