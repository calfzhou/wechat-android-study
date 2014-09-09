package com.tencent.mm.plugin.f.b;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.b;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.nl;
import com.tencent.mm.protocal.a.nm;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;

public final class m extends x
  implements ab
{
  private com.tencent.mm.o.m dlH;
  private final com.tencent.mm.o.a dmI;

  public m()
  {
    b localb = new b();
    localb.a(new nl());
    localb.b(new nm());
    localb.fi("/cgi-bin/micromsg-bin/reportstrategy");
    localb.de(308);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    nl localnl = (nl)this.dmI.sO();
    localnl.hSn = com.tencent.mm.protocal.a.hrh;
    localnl.hSm = com.tencent.mm.protocal.a.hri;
    localnl.hSp = com.tencent.mm.protocal.a.hrl;
    localnl.hSq = y.aGW();
    localnl.hSo = com.tencent.mm.protocal.a.hrk;
  }

  public final int a(r paramr, com.tencent.mm.o.m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0))
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvvtFySmc3tNd/ZmPvIPT6PY=", "get report strategy ok");
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final LinkedList aeR()
  {
    return ((nm)this.dmI.sP()).hQc;
  }

  public final int getType()
  {
    return 308;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.b.m
 * JD-Core Version:    0.6.2
 */