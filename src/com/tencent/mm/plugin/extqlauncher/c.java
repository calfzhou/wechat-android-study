package com.tencent.mm.plugin.extqlauncher;

import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.f.ap;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;

final class c
  implements as
{
  c(b paramb)
  {
  }

  public final void a(int paramInt, ap paramap, Object paramObject)
  {
    z.d("!44@/B4Tb64lLpIAhUt0Bg2QTqyk2VFFNI8farTpuVFOhY8=", "onNotifyChange");
    if (b.b(this.eNa));
    while (paramap != bg.qW().oW())
      return;
    if ((paramap == null) || (paramObject == null))
    {
      z.e("!44@/B4Tb64lLpIAhUt0Bg2QTqyk2VFFNI8farTpuVFOhY8=", "onConversationChange, wrong args");
      return;
    }
    if ((ak.getContext() == null) || (!bg.oE()))
    {
      z.w("!44@/B4Tb64lLpIAhUt0Bg2QTqyk2VFFNI8farTpuVFOhY8=", "wrong account status");
      return;
    }
    this.eNa.Qp();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.extqlauncher.c
 * JD-Core Version:    0.6.2
 */