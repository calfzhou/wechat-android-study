package com.tencent.mm.modelsimple;

import com.tencent.mm.model.bg;
import com.tencent.mm.n.c;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.o.a;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.bb;
import com.tencent.mm.protocal.a.hj;
import com.tencent.mm.protocal.a.hk;
import com.tencent.mm.protocal.a.vo;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;

public final class r extends x
  implements ab
{
  private int cDf;
  private m dlH;
  private a dmI;

  public r(int paramInt, String paramString)
  {
    this.cDf = paramInt;
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new hj());
    localb.b(new hk());
    localb.fi("/cgi-bin/micromsg-bin/facebookauth");
    localb.de(183);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    hj localhj = (hj)this.dmI.sO();
    if (ch.jb(paramString))
      paramString = "";
    localhj.hWY = paramString;
    localhj.hWX = paramInt;
  }

  public final int a(com.tencent.mm.network.r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvm2HKZo87aD+SXtk58CwKnc=", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      hk localhk = (hk)this.dmI.sP();
      int i = localhk.hRz.hQw;
      if (i != 0)
      {
        z.e("!44@/B4Tb64lLpK+IBX8XDgnvm2HKZo87aD+SXtk58CwKnc=", "baseresponse.ret = " + i);
        this.dlH.a(4, i, paramString, this);
        return;
      }
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvm2HKZo87aD+SXtk58CwKnc=", "fbuserid = " + localhk.hXa + ", fbusername = " + localhk.hXb);
      if ((this.cDf == 0) || (this.cDf == 1))
      {
        bg.qW().oQ().set(65825, localhk.hXa);
        c.eG(localhk.hXa);
        bg.qW().oQ().set(65826, localhk.hXb);
      }
    }
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 183;
  }

  public final int wy()
  {
    return this.cDf;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.r
 * JD-Core Version:    0.6.2
 */