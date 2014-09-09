package com.tencent.mm.modelsimple;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.xq;
import com.tencent.mm.protocal.a.xr;
import com.tencent.mm.sdk.platformtools.z;

public final class an extends x
  implements ab
{
  private m dlH;
  private final a dmI;

  public an(String paramString1, String paramString2)
  {
    b localb = new b();
    localb.a(new xq());
    localb.b(new xr());
    localb.fi("/cgi-bin/micromsg-bin/sendfeedback");
    localb.de(153);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    xq localxq = (xq)this.dmI.sO();
    localxq.irG = paramString1;
    localxq.fxG = paramString2;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.d("!44@/B4Tb64lLpJXp0jKkDqDsNnCSfgBeZLms2OyrAnnvc4=", "onGYNetEnd type:" + paramInt2 + " code:" + paramInt3);
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 153;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.an
 * JD-Core Version:    0.6.2
 */