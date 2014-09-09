package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class adq extends vn
{
  public vt hOP;
  public vt hOQ;
  public int hOR;
  public String hOW;
  public ws hQi;
  public int hQk;
  public int hQm;
  public String hQq;
  public int hQs;
  public int hUu;
  public String hXp;
  public int icN;
  public int isa;
  public int itA;
  public int iwA;
  public String iwB;
  public vt iws;
  public String iwt;
  public String iwu;
  public int iwv;
  public int iww;
  public String iwx;
  public int iwy;
  public int iwz;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.iws == null) || (this.hOP == null) || (this.hOQ == null) || (this.hQi == null))
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.iws != null)
    {
      parama.bv(2, this.iws.hD());
      this.iws.a(parama);
    }
    if (this.hOP != null)
    {
      parama.bv(3, this.hOP.hD());
      this.hOP.a(parama);
    }
    if (this.hOQ != null)
    {
      parama.bv(4, this.hOQ.hD());
      this.hOQ.a(parama);
    }
    parama.by(5, this.hQk);
    parama.by(6, this.hUu);
    parama.by(7, this.hQs);
    if (this.hQi != null)
    {
      parama.bv(8, this.hQi.hD());
      this.hQi.a(parama);
    }
    parama.by(9, this.hOR);
    if (this.hOW != null)
      parama.I(10, this.hOW);
    parama.by(11, this.icN);
    parama.by(12, this.isa);
    parama.by(13, this.itA);
    if (this.hQq != null)
      parama.I(14, this.hQq);
    if (this.iwt != null)
      parama.I(15, this.iwt);
    if (this.iwu != null)
      parama.I(16, this.iwu);
    if (this.hXp != null)
      parama.I(17, this.hXp);
    parama.by(18, this.hQm);
    parama.by(19, this.iwv);
    parama.by(20, this.iww);
    if (this.iwx != null)
      parama.I(21, this.iwx);
    parama.by(22, this.iwy);
    parama.by(23, this.iwz);
    parama.by(24, this.iwA);
    if (this.iwB != null)
      parama.I(25, this.iwB);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.iws != null)
      i += b.a.a.a.bs(2, this.iws.hD());
    if (this.hOP != null)
      i += b.a.a.a.bs(3, this.hOP.hD());
    if (this.hOQ != null)
      i += b.a.a.a.bs(4, this.hOQ.hD());
    int j = i + b.a.a.a.br(5, this.hQk) + b.a.a.a.br(6, this.hUu) + b.a.a.a.br(7, this.hQs);
    if (this.hQi != null)
      j += b.a.a.a.bs(8, this.hQi.hD());
    int k = j + b.a.a.a.br(9, this.hOR);
    if (this.hOW != null)
      k += b.a.a.b.b.a.J(10, this.hOW);
    int m = k + b.a.a.a.br(11, this.icN) + b.a.a.a.br(12, this.isa) + b.a.a.a.br(13, this.itA);
    if (this.hQq != null)
      m += b.a.a.b.b.a.J(14, this.hQq);
    if (this.iwt != null)
      m += b.a.a.b.b.a.J(15, this.iwt);
    if (this.iwu != null)
      m += b.a.a.b.b.a.J(16, this.iwu);
    if (this.hXp != null)
      m += b.a.a.b.b.a.J(17, this.hXp);
    int n = m + b.a.a.a.br(18, this.hQm) + b.a.a.a.br(19, this.iwv) + b.a.a.a.br(20, this.iww);
    if (this.iwx != null)
      n += b.a.a.b.b.a.J(21, this.iwx);
    int i1 = n + b.a.a.a.br(22, this.iwy) + b.a.a.a.br(23, this.iwz) + b.a.a.a.br(24, this.iwA);
    if (this.iwB != null)
      i1 += b.a.a.b.b.a.J(25, this.iwB);
    return i1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.adq
 * JD-Core Version:    0.6.2
 */