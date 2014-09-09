package com.tencent.mm.modelsimple;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.yc;
import com.tencent.mm.protocal.a.yd;

public final class ap extends x
  implements ab
{
  private m dlH;
  private final a dmI;

  public ap(String paramString)
  {
    b localb = new b();
    localb.a(new yc());
    localb.b(new yd());
    localb.fi("/cgi-bin/micromsg-bin/sendverifyemail");
    localb.de(108);
    localb.df(43);
    localb.dg(1000000043);
    this.dmI = localb.sU();
    ((yc)this.dmI.sO()).hVf = new vt().wF(paramString);
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 108;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.ap
 * JD-Core Version:    0.6.2
 */