package com.tencent.mm.modelsimple;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.vf;
import com.tencent.mm.protocal.a.vg;

public final class ad extends x
  implements ab
{
  private int dCH = 1;
  private m dlH;
  private a dmI;

  public ad(int paramInt)
  {
    b localb = new b();
    localb.a(new vf());
    localb.b(new vg());
    localb.fi("/cgi-bin/micromsg-bin/queryhaspasswd");
    localb.de(255);
    localb.df(132);
    localb.dg(1000000132);
    this.dmI = localb.sU();
    ((vf)this.dmI.sO()).hOi = paramInt;
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

  public final void ee(int paramInt)
  {
    this.dCH = paramInt;
  }

  public final int getType()
  {
    return 255;
  }

  public final int zy()
  {
    return this.dCH;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.ad
 * JD-Core Version:    0.6.2
 */