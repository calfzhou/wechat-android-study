package com.tencent.mm.modelsimple;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.hc;
import com.tencent.mm.protocal.a.hd;
import com.tencent.mm.sdk.platformtools.z;

public final class v extends x
  implements ab
{
  private m dlH;
  private a dmI;

  public v(String paramString, int paramInt1, int paramInt2, long paramLong)
  {
    zl();
    hc localhc = (hc)this.dmI.sO();
    localhc.gnq = paramString;
    localhc.hWP = 0;
    localhc.hWO = "";
    localhc.hOi = paramInt1;
    localhc.gDF = paramLong;
    localhc.ewb = paramInt2;
    z.d("!32@/B4Tb64lLpK+IBX8XDgnvpGpsaW1OpJE", "expose username:" + paramString + ", scene:" + paramInt1 + ", type:" + paramInt2 + " snsId " + paramLong);
  }

  public v(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    zl();
    hc localhc = (hc)this.dmI.sO();
    localhc.gnq = paramString1;
    localhc.hOi = paramInt1;
    localhc.ewb = paramInt2;
    localhc.hWQ = paramString2;
  }

  private void zl()
  {
    b localb = new b();
    localb.a(new hc());
    localb.b(new hd());
    localb.fi("/cgi-bin/micromsg-bin/expose");
    localb.de(166);
    localb.df(59);
    localb.dg(1000000059);
    this.dmI = localb.sU();
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.d("!32@/B4Tb64lLpK+IBX8XDgnvpGpsaW1OpJE", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 166;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.v
 * JD-Core Version:    0.6.2
 */