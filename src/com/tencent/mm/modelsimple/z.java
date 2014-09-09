package com.tencent.mm.modelsimple;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.le;
import com.tencent.mm.protocal.a.lf;

public final class z extends x
  implements ab
{
  public String cOA;
  public String cOz;
  public String dCE;
  private m dlH;
  private a dmI;

  public z(double paramDouble1, double paramDouble2)
  {
    b localb = new b();
    localb.a(new le());
    localb.b(new lf());
    localb.fi("/cgi-bin/micromsg-bin/getcurlocation");
    localb.de(665);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    le localle = (le)this.dmI.sO();
    localle.KL = paramDouble1;
    localle.KM = paramDouble2;
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvprceLg5xBOMBKMckcpjxzE=", "latitude:" + paramDouble1 + ", longitude:" + paramDouble2);
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvprceLg5xBOMBKMckcpjxzE=", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      lf locallf = (lf)this.dmI.sP();
      this.cOA = locallf.Kt;
      this.dCE = locallf.dtm;
      this.cOz = locallf.Ks;
    }
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 665;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.z
 * JD-Core Version:    0.6.2
 */