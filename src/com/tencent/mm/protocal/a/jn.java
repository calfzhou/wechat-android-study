package com.tencent.mm.protocal.a;

public final class jn extends vn
{
  public String gnq;
  public int hOi;
  public int hQF;
  public ws hRJ;
  public vt ian;
  public vt iao;
  public vt iap;
  public vt iaq;
  public String iar;
  public int ias;
  public String iat;
  public ws iau;
  public int iav;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hQF);
    if (this.hRJ != null)
    {
      parama.bv(3, this.hRJ.hD());
      this.hRJ.a(parama);
    }
    if (this.ian != null)
    {
      parama.bv(4, this.ian.hD());
      this.ian.a(parama);
    }
    if (this.iao != null)
    {
      parama.bv(5, this.iao.hD());
      this.iao.a(parama);
    }
    if (this.iap != null)
    {
      parama.bv(6, this.iap.hD());
      this.iap.a(parama);
    }
    if (this.iaq != null)
    {
      parama.bv(7, this.iaq.hD());
      this.iaq.a(parama);
    }
    if (this.iar != null)
      parama.I(8, this.iar);
    parama.by(9, this.ias);
    parama.by(10, this.hOi);
    if (this.gnq != null)
      parama.I(11, this.gnq);
    if (this.iat != null)
      parama.I(12, this.iat);
    if (this.iau != null)
    {
      parama.bv(13, this.iau.hD());
      this.iau.a(parama);
    }
    parama.by(14, this.iav);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hQF);
    if (this.hRJ != null)
      j += b.a.a.a.bs(3, this.hRJ.hD());
    if (this.ian != null)
      j += b.a.a.a.bs(4, this.ian.hD());
    if (this.iao != null)
      j += b.a.a.a.bs(5, this.iao.hD());
    if (this.iap != null)
      j += b.a.a.a.bs(6, this.iap.hD());
    if (this.iaq != null)
      j += b.a.a.a.bs(7, this.iaq.hD());
    if (this.iar != null)
      j += b.a.a.b.b.a.J(8, this.iar);
    int k = j + b.a.a.a.br(9, this.ias) + b.a.a.a.br(10, this.hOi);
    if (this.gnq != null)
      k += b.a.a.b.b.a.J(11, this.gnq);
    if (this.iat != null)
      k += b.a.a.b.b.a.J(12, this.iat);
    if (this.iau != null)
      k += b.a.a.a.bs(13, this.iau.hD());
    return k + b.a.a.a.br(14, this.iav);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.jn
 * JD-Core Version:    0.6.2
 */