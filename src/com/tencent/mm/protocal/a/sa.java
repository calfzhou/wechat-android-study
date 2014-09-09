package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class sa extends com.tencent.mm.ao.a
{
  public int ewb;
  public String fxG;
  public vt hOQ;
  public int hOV;
  public String hOW;
  public int ilT;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hOQ == null)
      throw new b("Not all required fields were included");
    if (this.hOQ != null)
    {
      parama.bv(1, this.hOQ.hD());
      this.hOQ.a(parama);
    }
    if (this.fxG != null)
      parama.I(2, this.fxG);
    parama.by(3, this.ewb);
    parama.by(4, this.hOV);
    parama.by(5, this.ilT);
    if (this.hOW != null)
      parama.I(6, this.hOW);
  }

  public final int hD()
  {
    vt localvt = this.hOQ;
    int i = 0;
    if (localvt != null)
      i = 0 + b.a.a.a.bs(1, this.hOQ.hD());
    if (this.fxG != null)
      i += b.a.a.b.b.a.J(2, this.fxG);
    int j = i + b.a.a.a.br(3, this.ewb) + b.a.a.a.br(4, this.hOV) + b.a.a.a.br(5, this.ilT);
    if (this.hOW != null)
      j += b.a.a.b.b.a.J(6, this.hOW);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.sa
 * JD-Core Version:    0.6.2
 */