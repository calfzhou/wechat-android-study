package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class ads extends vn
{
  public String hOW;
  public String hPq;
  public String hPs;
  public String hPt;
  public int hQm;
  public int hVF;
  public String hXp;
  public int ihv;
  public int ihw;
  public ws ihx;
  public int ihy;
  public int iwA;
  public String iwB;
  public int iwC;
  public int iwD;
  public ws iwE;
  public int iwF;
  public int iwG;
  public String iwH;
  public String iwI;
  public int iwJ;
  public int iwy;
  public int iwz;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.ihx == null) || (this.iwE == null))
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hPt != null)
      parama.I(2, this.hPt);
    if (this.hPq != null)
      parama.I(3, this.hPq);
    if (this.hPs != null)
      parama.I(4, this.hPs);
    parama.by(5, this.ihv);
    parama.by(6, this.ihw);
    if (this.ihx != null)
    {
      parama.bv(7, this.ihx.hD());
      this.ihx.a(parama);
    }
    parama.by(8, this.iwC);
    parama.by(9, this.iwD);
    if (this.iwE != null)
    {
      parama.bv(10, this.iwE.hD());
      this.iwE.a(parama);
    }
    parama.by(11, this.iwF);
    parama.by(12, this.hVF);
    parama.by(13, this.ihy);
    parama.by(14, this.iwG);
    if (this.hOW != null)
      parama.I(15, this.hOW);
    if (this.iwH != null)
      parama.I(16, this.iwH);
    if (this.hXp != null)
      parama.I(17, this.hXp);
    parama.by(18, this.hQm);
    if (this.iwI != null)
      parama.I(19, this.iwI);
    parama.by(20, this.iwy);
    parama.by(21, this.iwz);
    parama.by(22, this.iwA);
    if (this.iwB != null)
      parama.I(23, this.iwB);
    parama.by(24, this.iwJ);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hPt != null)
      i += b.a.a.b.b.a.J(2, this.hPt);
    if (this.hPq != null)
      i += b.a.a.b.b.a.J(3, this.hPq);
    if (this.hPs != null)
      i += b.a.a.b.b.a.J(4, this.hPs);
    int j = i + b.a.a.a.br(5, this.ihv) + b.a.a.a.br(6, this.ihw);
    if (this.ihx != null)
      j += b.a.a.a.bs(7, this.ihx.hD());
    int k = j + b.a.a.a.br(8, this.iwC) + b.a.a.a.br(9, this.iwD);
    if (this.iwE != null)
      k += b.a.a.a.bs(10, this.iwE.hD());
    int m = k + b.a.a.a.br(11, this.iwF) + b.a.a.a.br(12, this.hVF) + b.a.a.a.br(13, this.ihy) + b.a.a.a.br(14, this.iwG);
    if (this.hOW != null)
      m += b.a.a.b.b.a.J(15, this.hOW);
    if (this.iwH != null)
      m += b.a.a.b.b.a.J(16, this.iwH);
    if (this.hXp != null)
      m += b.a.a.b.b.a.J(17, this.hXp);
    int n = m + b.a.a.a.br(18, this.hQm);
    if (this.iwI != null)
      n += b.a.a.b.b.a.J(19, this.iwI);
    int i1 = n + b.a.a.a.br(20, this.iwy) + b.a.a.a.br(21, this.iwz) + b.a.a.a.br(22, this.iwA);
    if (this.iwB != null)
      i1 += b.a.a.b.b.a.J(23, this.iwB);
    return i1 + b.a.a.a.br(24, this.iwJ);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ads
 * JD-Core Version:    0.6.2
 */