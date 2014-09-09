package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class ma extends vn
{
  public int hOi;
  public int hQH;
  public qj hVa;
  public String icA;
  public int icB;
  public ws icz;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hVa == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hQH);
    parama.by(3, this.hOi);
    if (this.icz != null)
    {
      parama.bv(4, this.icz.hD());
      this.icz.a(parama);
    }
    if (this.hVa != null)
    {
      parama.bv(5, this.hVa.hD());
      this.hVa.a(parama);
    }
    if (this.icA != null)
      parama.I(6, this.icA);
    parama.by(7, this.icB);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hQH) + b.a.a.a.br(3, this.hOi);
    if (this.icz != null)
      j += b.a.a.a.bs(4, this.icz.hD());
    if (this.hVa != null)
      j += b.a.a.a.bs(5, this.hVa.hD());
    if (this.icA != null)
      j += b.a.a.b.b.a.J(6, this.icA);
    return j + b.a.a.a.br(7, this.icB);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ma
 * JD-Core Version:    0.6.2
 */