package com.tencent.mm.plugin.exdevice.b;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.xe;
import com.tencent.mm.protocal.a.xf;
import com.tencent.mm.sdk.platformtools.z;

public final class u extends x
  implements ab
{
  private m dlH = null;
  private a dmI = null;

  public u(String paramString)
  {
    b localb = new b();
    localb.a(new xe());
    localb.b(new xf());
    localb.fi("/cgi-bin/micromsg-bin/searchharddevice");
    localb.de(540);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    ((xe)this.dmI.sO()).irv = paramString;
  }

  public final xf Pl()
  {
    if ((this.dmI != null) && (this.dmI.sP() != null))
      return (xf)this.dmI.sP();
    return null;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.i("!64@/B4Tb64lLpLHXwcx366fGjbfKZDnni8XaZET3fd7w/u/u+MvvFpsYOdbaaksac5+", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 540;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.u
 * JD-Core Version:    0.6.2
 */