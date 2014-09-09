package com.tencent.mm.plugin.exdevice.f;

import com.tencent.mm.plugin.exdevice.a.h;
import com.tencent.mm.plugin.exdevice.b.ad;
import com.tencent.mm.plugin.exdevice.service.af;

public final class i extends ad
{
  private a eKT;
  private h eKV;

  public i(int paramInt)
  {
    this.eKV = new h(paramInt);
  }

  public final boolean a(af paramaf, d paramd)
  {
    this.eKT = new a(this.eKV, paramd);
    return this.eKT.c(paramaf);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.i
 * JD-Core Version:    0.6.2
 */