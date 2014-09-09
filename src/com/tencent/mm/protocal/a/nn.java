package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class nn extends vn
{
  public String eJv;
  public ws hRd;
  public String hRg;
  public String hwV;
  public String idA;
  public int idB;
  public String idw;
  public String idx;
  public String idy;
  public String idz;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRd == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hRd != null)
    {
      parama.bv(2, this.hRd.hD());
      this.hRd.a(parama);
    }
    if (this.idw != null)
      parama.I(3, this.idw);
    if (this.idx != null)
      parama.I(4, this.idx);
    if (this.hwV != null)
      parama.I(5, this.hwV);
    if (this.idy != null)
      parama.I(6, this.idy);
    if (this.idz != null)
      parama.I(7, this.idz);
    if (this.idA != null)
      parama.I(8, this.idA);
    parama.by(9, this.idB);
    if (this.eJv != null)
      parama.I(10, this.eJv);
    if (this.hRg != null)
      parama.I(11, this.hRg);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hRd != null)
      i += b.a.a.a.bs(2, this.hRd.hD());
    if (this.idw != null)
      i += b.a.a.b.b.a.J(3, this.idw);
    if (this.idx != null)
      i += b.a.a.b.b.a.J(4, this.idx);
    if (this.hwV != null)
      i += b.a.a.b.b.a.J(5, this.hwV);
    if (this.idy != null)
      i += b.a.a.b.b.a.J(6, this.idy);
    if (this.idz != null)
      i += b.a.a.b.b.a.J(7, this.idz);
    if (this.idA != null)
      i += b.a.a.b.b.a.J(8, this.idA);
    int j = i + b.a.a.a.br(9, this.idB);
    if (this.eJv != null)
      j += b.a.a.b.b.a.J(10, this.eJv);
    if (this.hRg != null)
      j += b.a.a.b.b.a.J(11, this.hRg);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.nn
 * JD-Core Version:    0.6.2
 */