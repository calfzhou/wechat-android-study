package com.tencent.mm.plugin.exdevice.b;

import com.tencent.mm.plugin.exdevice.service.k;
import com.tencent.mm.plugin.exdevice.service.l;

final class h extends l
{
  h(f paramf, int paramInt, String paramString, long paramLong, boolean paramBoolean)
  {
    super(paramInt);
  }

  public final void onServiceConnected()
  {
    f.a(this.eIN).a(null);
    this.eIN.b(this.eIO, this.eIQ, this.eKm, this.eIR);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.h
 * JD-Core Version:    0.6.2
 */