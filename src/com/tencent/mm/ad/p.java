package com.tencent.mm.ad;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class p extends g
{
  private static long dbk = 86400000L;

  public p()
  {
    super(0);
  }

  private static boolean lx()
  {
    return 1000L * ch.ab(Long.valueOf(ch.a((Long)bg.qW().oQ().get(81938))).longValue()) > dbk;
  }

  public final boolean a(com.tencent.mm.sdk.c.e parame)
  {
    z.d("!64@/B4Tb64lLpIuznxMDiXSbBa88WdSZ7LyzgWb9yHmxfTVKu9hM7P5arz68R/5voSX", "callback expired : " + lx());
    if (lx())
      c.yG().update();
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ad.p
 * JD-Core Version:    0.6.2
 */