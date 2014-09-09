package com.tencent.mm.modelsimple;

import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.protocal.a.aax;
import com.tencent.mm.protocal.a.aay;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class aw extends com.tencent.mm.o.x
  implements ab
{
  private final String cIM;
  private m dlH;
  private final a dmI;

  public aw(String paramString, int paramInt)
  {
    this.cIM = paramString;
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new aax());
    localb.b(new aay());
    localb.fi("/cgi-bin/micromsg-bin/statusnotify");
    localb.de(251);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    aax localaax = (aax)this.dmI.sO();
    localaax.hPq = com.tencent.mm.model.x.pG();
    localaax.iuO = paramInt;
    localaax.hPs = paramString;
    localaax.hPt = System.currentTimeMillis();
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvsbbSDwBSohlAIPfXzVYGL0=", "toUserName = " + paramString);
  }

  public static void u(String paramString, int paramInt)
  {
    if ((ch.jb(paramString)) || (y.dP(paramString)));
    while (bg.qW().oD() == 0)
      return;
    aw localaw = new aw(paramString, paramInt);
    bg.qX().d(localaw);
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    if ((paramInt2 != 0) || (paramInt3 != 0))
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvsbbSDwBSohlAIPfXzVYGL0=", "StatusNotify Error. userName=" + this.cIM);
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 251;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.aw
 * JD-Core Version:    0.6.2
 */