package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class mm extends vn
{
  public double KL;
  public double KM;
  public int hOi;
  public int hQF;
  public String icA;
  public ws icz;

  public final void a(b.a.a.c.a parama)
  {
    if (this.icz == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hOi);
    parama.by(3, this.hQF);
    if (this.icA != null)
      parama.I(4, this.icA);
    if (this.icz != null)
    {
      parama.bv(5, this.icz.hD());
      this.icz.a(parama);
    }
    parama.a(6, this.KM);
    parama.a(7, this.KL);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hOi) + b.a.a.a.br(3, this.hQF);
    if (this.icA != null)
      j += b.a.a.b.b.a.J(4, this.icA);
    if (this.icz != null)
      j += b.a.a.a.bs(5, this.icz.hD());
    int k = j + (8 + b.a.a.b.b.a.rV(6));
    return k + (8 + b.a.a.b.b.a.rV(7));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.mm
 * JD-Core Version:    0.6.2
 */