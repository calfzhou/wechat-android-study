package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class oi extends vn
{
  public String gnq;
  public int hOi;
  public ws hRJ;
  public ws iau;
  public String iep;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRJ == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hRJ != null)
    {
      parama.bv(2, this.hRJ.hD());
      this.hRJ.a(parama);
    }
    if (this.gnq != null)
      parama.I(3, this.gnq);
    parama.by(4, this.hOi);
    if (this.iep != null)
      parama.I(5, this.iep);
    if (this.iau != null)
    {
      parama.bv(6, this.iau.hD());
      this.iau.a(parama);
    }
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hRJ != null)
      i += b.a.a.a.bs(2, this.hRJ.hD());
    if (this.gnq != null)
      i += b.a.a.b.b.a.J(3, this.gnq);
    int j = i + b.a.a.a.br(4, this.hOi);
    if (this.iep != null)
      j += b.a.a.b.b.a.J(5, this.iep);
    if (this.iau != null)
      j += b.a.a.a.bs(6, this.iau.hD());
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.oi
 * JD-Core Version:    0.6.2
 */