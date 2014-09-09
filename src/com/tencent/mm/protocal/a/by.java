package com.tencent.mm.protocal.a;

public final class by extends vn
{
  public String eJv;
  public String gnq;
  public int hQH;
  public String hQV;
  public String hQW;
  public int hQX;
  public String hQY;
  public String hQZ;
  public int hRa;
  public String hRb;
  public String hRc;
  public ws hRd;
  public int hRe;
  public int hRf;
  public String hRg;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.gnq != null)
      parama.I(2, this.gnq);
    if (this.hQV != null)
      parama.I(3, this.hQV);
    parama.by(4, this.hQH);
    if (this.hQW != null)
      parama.I(5, this.hQW);
    parama.by(6, this.hQX);
    if (this.hQY != null)
      parama.I(7, this.hQY);
    if (this.hQZ != null)
      parama.I(8, this.hQZ);
    parama.by(9, this.hRa);
    if (this.hRb != null)
      parama.I(10, this.hRb);
    if (this.hRc != null)
      parama.I(11, this.hRc);
    if (this.hRd != null)
    {
      parama.bv(12, this.hRd.hD());
      this.hRd.a(parama);
    }
    if (this.eJv != null)
      parama.I(13, this.eJv);
    parama.by(14, this.hRe);
    parama.by(15, this.hRf);
    if (this.hRg != null)
      parama.I(16, this.hRg);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.gnq != null)
      i += b.a.a.b.b.a.J(2, this.gnq);
    if (this.hQV != null)
      i += b.a.a.b.b.a.J(3, this.hQV);
    int j = i + b.a.a.a.br(4, this.hQH);
    if (this.hQW != null)
      j += b.a.a.b.b.a.J(5, this.hQW);
    int k = j + b.a.a.a.br(6, this.hQX);
    if (this.hQY != null)
      k += b.a.a.b.b.a.J(7, this.hQY);
    if (this.hQZ != null)
      k += b.a.a.b.b.a.J(8, this.hQZ);
    int m = k + b.a.a.a.br(9, this.hRa);
    if (this.hRb != null)
      m += b.a.a.b.b.a.J(10, this.hRb);
    if (this.hRc != null)
      m += b.a.a.b.b.a.J(11, this.hRc);
    if (this.hRd != null)
      m += b.a.a.a.bs(12, this.hRd.hD());
    if (this.eJv != null)
      m += b.a.a.b.b.a.J(13, this.eJv);
    int n = m + b.a.a.a.br(14, this.hRe) + b.a.a.a.br(15, this.hRf);
    if (this.hRg != null)
      n += b.a.a.b.b.a.J(16, this.hRg);
    return n;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.by
 * JD-Core Version:    0.6.2
 */