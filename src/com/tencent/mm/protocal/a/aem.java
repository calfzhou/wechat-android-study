package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class aem extends vn
{
  public String hSc;
  public String ipH;
  public String ipI;
  public int ipJ;
  public String ipK;
  public int ipg;
  public ws ixi;
  public int ixj;
  public int ixk;
  public String ixl;

  public final void a(b.a.a.c.a parama)
  {
    if (this.ixi == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.ixi != null)
    {
      parama.bv(2, this.ixi.hD());
      this.ixi.a(parama);
    }
    if (this.hSc != null)
      parama.I(3, this.hSc);
    parama.by(4, this.ixj);
    parama.by(5, this.ipg);
    if (this.ipH != null)
      parama.I(6, this.ipH);
    if (this.ipI != null)
      parama.I(7, this.ipI);
    if (this.ipK != null)
      parama.I(8, this.ipK);
    parama.by(9, this.ixk);
    if (this.ixl != null)
      parama.I(10, this.ixl);
    parama.by(11, this.ipJ);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.ixi != null)
      i += b.a.a.a.bs(2, this.ixi.hD());
    if (this.hSc != null)
      i += b.a.a.b.b.a.J(3, this.hSc);
    int j = i + b.a.a.a.br(4, this.ixj) + b.a.a.a.br(5, this.ipg);
    if (this.ipH != null)
      j += b.a.a.b.b.a.J(6, this.ipH);
    if (this.ipI != null)
      j += b.a.a.b.b.a.J(7, this.ipI);
    if (this.ipK != null)
      j += b.a.a.b.b.a.J(8, this.ipK);
    int k = j + b.a.a.a.br(9, this.ixk);
    if (this.ixl != null)
      k += b.a.a.b.b.a.J(10, this.ixl);
    return k + b.a.a.a.br(11, this.ipJ);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aem
 * JD-Core Version:    0.6.2
 */