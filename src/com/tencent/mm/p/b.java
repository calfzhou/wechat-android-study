package com.tencent.mm.p;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.acm;
import com.tencent.mm.protocal.a.acn;

public final class b extends x
  implements ab
{
  private m dlH;
  private a dmI;

  public b(String paramString)
  {
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new acm());
    localb.b(new acn());
    localb.fi("/cgi-bin/micromsg-bin/unbindqq");
    localb.de(253);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    ((acm)this.dmI.sO()).hVL = paramString;
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
    return 253;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.p.b
 * JD-Core Version:    0.6.2
 */