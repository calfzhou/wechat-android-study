package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class aal extends vn
{
  public int ewb;
  public String hOJ;
  public String hOd;
  public String hPB;
  public ws hPZ;
  public int hQk;
  public int hUu;
  public int ilw;
  public int ilx;
  public int isa;
  public int itA;
  public ach itB;
  public int itf;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hPZ == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.ewb);
    parama.by(3, this.hUu);
    parama.by(4, this.hQk);
    if (this.hPZ != null)
    {
      parama.bv(5, this.hPZ.hD());
      this.hPZ.a(parama);
    }
    if (this.hOJ != null)
      parama.I(6, this.hOJ);
    parama.by(7, this.ilw);
    parama.by(8, this.ilx);
    if (this.hPB != null)
      parama.I(9, this.hPB);
    parama.by(10, this.itA);
    parama.by(11, this.isa);
    if (this.itB != null)
    {
      parama.bv(12, this.itB.hD());
      this.itB.a(parama);
    }
    if (this.hOd != null)
      parama.I(13, this.hOd);
    parama.by(14, this.itf);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.ewb) + b.a.a.a.br(3, this.hUu) + b.a.a.a.br(4, this.hQk);
    if (this.hPZ != null)
      j += b.a.a.a.bs(5, this.hPZ.hD());
    if (this.hOJ != null)
      j += b.a.a.b.b.a.J(6, this.hOJ);
    int k = j + b.a.a.a.br(7, this.ilw) + b.a.a.a.br(8, this.ilx);
    if (this.hPB != null)
      k += b.a.a.b.b.a.J(9, this.hPB);
    int m = k + b.a.a.a.br(10, this.itA) + b.a.a.a.br(11, this.isa);
    if (this.itB != null)
      m += b.a.a.a.bs(12, this.itB.hD());
    if (this.hOd != null)
      m += b.a.a.b.b.a.J(13, this.hOd);
    return m + b.a.a.a.br(14, this.itf);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aal
 * JD-Core Version:    0.6.2
 */