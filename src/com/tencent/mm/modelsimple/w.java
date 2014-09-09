package com.tencent.mm.modelsimple;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.jl;
import com.tencent.mm.protocal.a.jm;
import com.tencent.mm.sdk.platformtools.z;

public final class w extends x
  implements ab
{
  private m dlH;
  private a dmI;

  public w(String paramString)
  {
    b localb = new b();
    localb.a(new jl());
    localb.b(new jm());
    localb.fi("/cgi-bin/micromsg-bin/generalset");
    localb.de(177);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    jl localjl = (jl)this.dmI.sO();
    localjl.ial = 1;
    localjl.iam = paramString;
  }

  public final int a(r paramr, m paramm)
  {
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvvBax83J6oZpOopQy9KgDkQ=", "doScene");
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvvBax83J6oZpOopQy9KgDkQ=", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 177;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.w
 * JD-Core Version:    0.6.2
 */