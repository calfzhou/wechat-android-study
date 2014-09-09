package com.tencent.mm.plugin.exdevice.f;

import com.tencent.mm.plugin.exdevice.a.i;
import com.tencent.mm.plugin.exdevice.b.ad;
import com.tencent.mm.plugin.exdevice.service.af;

public final class j extends ad
{
  private a eKW;
  private i eKX;

  public j(int paramInt1, int paramInt2, long paramLong)
  {
    this.eKX = new i(paramInt1, paramInt2, paramLong);
  }

  public final boolean a(af paramaf, d paramd)
  {
    this.eKW = new b(this.eKX, paramd);
    return this.eKW.c(paramaf);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.j
 * JD-Core Version:    0.6.2
 */