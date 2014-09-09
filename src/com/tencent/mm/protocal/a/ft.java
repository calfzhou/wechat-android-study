package com.tencent.mm.protocal.a;

public final class ft extends vn
{
  public int ewb;
  public String gnq;
  public String hOd;
  public int hPr;
  public int hQk;
  public String hQq;
  public int hQs;
  public int hUu;
  public String hVA;
  public int hVB;
  public int hVC;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hOd != null)
      parama.I(2, this.hOd);
    parama.by(3, this.hPr);
    if (this.hQq != null)
      parama.I(4, this.hQq);
    if (this.gnq != null)
      parama.I(5, this.gnq);
    parama.by(6, this.hQk);
    parama.by(7, this.hUu);
    parama.by(8, this.hQs);
    if (this.hVA != null)
      parama.I(9, this.hVA);
    parama.by(10, this.hVB);
    parama.by(11, this.ewb);
    parama.by(12, this.hVC);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hOd != null)
      i += b.a.a.b.b.a.J(2, this.hOd);
    int j = i + b.a.a.a.br(3, this.hPr);
    if (this.hQq != null)
      j += b.a.a.b.b.a.J(4, this.hQq);
    if (this.gnq != null)
      j += b.a.a.b.b.a.J(5, this.gnq);
    int k = j + b.a.a.a.br(6, this.hQk) + b.a.a.a.br(7, this.hUu) + b.a.a.a.br(8, this.hQs);
    if (this.hVA != null)
      k += b.a.a.b.b.a.J(9, this.hVA);
    return k + b.a.a.a.br(10, this.hVB) + b.a.a.a.br(11, this.ewb) + b.a.a.a.br(12, this.hVC);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ft
 * JD-Core Version:    0.6.2
 */