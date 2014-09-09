package com.tencent.mm.protocal.a;

public final class ji extends vn
{
  public String hOd;
  public String hQR;
  public String hTI;
  public String hTO;
  public String hTR;
  public String hTS;
  public String hTT;
  public String hTU;
  public String iag;
  public int iah;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hOd != null)
      parama.I(2, this.hOd);
    if (this.hTR != null)
      parama.I(3, this.hTR);
    if (this.hQR != null)
      parama.I(4, this.hQR);
    if (this.hTS != null)
      parama.I(5, this.hTS);
    if (this.hTT != null)
      parama.I(6, this.hTT);
    if (this.hTU != null)
      parama.I(7, this.hTU);
    if (this.hTO != null)
      parama.I(8, this.hTO);
    if (this.iag != null)
      parama.I(9, this.iag);
    parama.by(10, this.iah);
    if (this.hTI != null)
      parama.I(11, this.hTI);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hOd != null)
      i += b.a.a.b.b.a.J(2, this.hOd);
    if (this.hTR != null)
      i += b.a.a.b.b.a.J(3, this.hTR);
    if (this.hQR != null)
      i += b.a.a.b.b.a.J(4, this.hQR);
    if (this.hTS != null)
      i += b.a.a.b.b.a.J(5, this.hTS);
    if (this.hTT != null)
      i += b.a.a.b.b.a.J(6, this.hTT);
    if (this.hTU != null)
      i += b.a.a.b.b.a.J(7, this.hTU);
    if (this.hTO != null)
      i += b.a.a.b.b.a.J(8, this.hTO);
    if (this.iag != null)
      i += b.a.a.b.b.a.J(9, this.iag);
    int j = i + b.a.a.a.br(10, this.iah);
    if (this.hTI != null)
      j += b.a.a.b.b.a.J(11, this.hTI);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ji
 * JD-Core Version:    0.6.2
 */