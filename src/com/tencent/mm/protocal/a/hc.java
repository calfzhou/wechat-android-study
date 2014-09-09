package com.tencent.mm.protocal.a;

public final class hc extends vn
{
  public int ewb;
  public long gDF;
  public String gnq;
  public int hOi;
  public String hWO;
  public int hWP;
  public String hWQ;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.gnq != null)
      parama.I(2, this.gnq);
    parama.by(3, this.hOi);
    parama.by(4, this.ewb);
    if (this.hWO != null)
      parama.I(5, this.hWO);
    parama.by(6, this.hWP);
    parama.k(7, this.gDF);
    if (this.hWQ != null)
      parama.I(8, this.hWQ);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.gnq != null)
      i += b.a.a.b.b.a.J(2, this.gnq);
    int j = i + b.a.a.a.br(3, this.hOi) + b.a.a.a.br(4, this.ewb);
    if (this.hWO != null)
      j += b.a.a.b.b.a.J(5, this.hWO);
    int k = j + b.a.a.a.br(6, this.hWP) + b.a.a.a.i(7, this.gDF);
    if (this.hWQ != null)
      k += b.a.a.b.b.a.J(8, this.hWQ);
    return k;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.hc
 * JD-Core Version:    0.6.2
 */