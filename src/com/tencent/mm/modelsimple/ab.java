package com.tencent.mm.modelsimple;

import com.tencent.mm.c.a.mi;
import com.tencent.mm.model.bg;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.aed;
import com.tencent.mm.protocal.a.na;
import com.tencent.mm.protocal.a.nb;
import com.tencent.mm.protocal.a.sy;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;

public final class ab extends x
  implements com.tencent.mm.network.ab
{
  private String dCF;
  private m dlH;
  private com.tencent.mm.o.a dmI;

  public ab(String paramString)
  {
    this.dCF = paramString;
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new na());
    localb.b(new nb());
    localb.fi("/cgi-bin/micromsg-bin/getprofile");
    localb.de(302);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    ((na)this.dmI.sO()).gnq = paramString;
  }

  public final int a(r paramr, m paramm)
  {
    if (ch.jb(this.dCF))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvgKkSVyEYaE8tCGiV+YIaQI=", "null or empty username");
      return -1;
    }
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvgKkSVyEYaE8tCGiV+YIaQI=", "get profile ret: errType=" + paramInt2 + " errCode=" + paramInt3 + " errMsg=" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      nb localnb = (nb)this.dmI.sP();
      mi localmi = new mi();
      localmi.cPc.cPd = localnb;
      com.tencent.mm.sdk.c.a.aGB().g(localmi);
      bg.qW().oQ().set(64, Integer.valueOf(localnb.idm.hRo));
      bg.qW().oQ().set(144385, Integer.valueOf(localnb.idm.iwX));
      bg.qW().oQ().set(40, Integer.valueOf(localnb.idl.imT));
      bg.qW().oQ().set(208903, localnb.idm.hQI);
      bg.qW().oQ().set(274433, localnb.idm.imh);
      bg.qW().oQ().set(274434, localnb.idm.img);
      bg.qW().oQ().set(274436, localnb.idm.iwY);
    }
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 302;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.ab
 * JD-Core Version:    0.6.2
 */