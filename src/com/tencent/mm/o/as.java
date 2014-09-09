package com.tencent.mm.o;

import com.tencent.mm.network.aj;
import com.tencent.mm.protocal.l;
import com.tencent.mm.sdk.platformtools.z;

final class as
  implements Runnable
{
  as(ar paramar, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    l locall = (l)ar.a(this.dpu).sS();
    if (locall == null)
    {
      z.f("!32@/B4Tb64lLpLuAV0nhTaszeUVkUq5bkNM", "null auth.resp");
      return;
    }
    i.sZ().a(locall, this.dpd, this.dpe);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.as
 * JD-Core Version:    0.6.2
 */