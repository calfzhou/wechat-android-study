package com.tencent.mm.m;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.bq;
import com.tencent.mm.protocal.a.br;

public final class a extends x
  implements ab
{
  public static int dmJ = 1;
  public static int dmK = 2;
  private m dlH;
  private com.tencent.mm.o.a dmI;

  public a(int paramInt, String paramString)
  {
    b localb = new b();
    localb.a(new bq());
    localb.b(new br());
    localb.fi("/cgi-bin/micromsg-bin/bindemail");
    localb.de(256);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    bq localbq = (bq)this.dmI.sO();
    localbq.hQF = paramInt;
    localbq.hQG = paramString;
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
    return 256;
  }

  public final int sg()
  {
    return ((bq)this.dmI.sO()).hQF;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.m.a
 * JD-Core Version:    0.6.2
 */