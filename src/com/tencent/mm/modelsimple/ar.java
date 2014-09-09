package com.tencent.mm.modelsimple;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.yo;
import com.tencent.mm.protocal.a.yp;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class ar extends x
  implements ab
{
  private m dlH;
  private final a dmI;

  public ar(String paramString1, String paramString2)
  {
    b localb = new b();
    localb.a(new yo());
    localb.b(new yp());
    localb.fi("/cgi-bin/micromsg-bin/newsetpasswd");
    localb.de(383);
    localb.df(180);
    localb.dg(1000000180);
    this.dmI = localb.sU();
    yo localyo = (yo)this.dmI.sO();
    localyo.inU = ch.je(paramString1);
    localyo.hVL = paramString2;
    z.d("!32@/B4Tb64lLpK+IBX8XDgnvidumzRLfqw0", "md5 " + paramString1 + " ticket " + paramString2);
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.d("!32@/B4Tb64lLpK+IBX8XDgnvidumzRLfqw0", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 383;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.ar
 * JD-Core Version:    0.6.2
 */