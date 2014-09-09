package com.tencent.mm.protocal.a;

public final class ca extends vn
{
  public String hRA;
  public int hRB;
  public vt hRC;
  public ws hRD;
  public int hRE;
  public String hRb;
  public String hRc;
  public String hRj;
  public int hRv;
  public String hRw;
  public String hRx;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hRv);
    if (this.hRj != null)
      parama.I(3, this.hRj);
    if (this.hRw != null)
      parama.I(4, this.hRw);
    if (this.hRx != null)
      parama.I(5, this.hRx);
    if (this.hRA != null)
      parama.I(6, this.hRA);
    parama.by(7, this.hRB);
    if (this.hRC != null)
    {
      parama.bv(8, this.hRC.hD());
      this.hRC.a(parama);
    }
    if (this.hRD != null)
    {
      parama.bv(9, this.hRD.hD());
      this.hRD.a(parama);
    }
    parama.by(10, this.hRE);
    if (this.hRb != null)
      parama.I(11, this.hRb);
    if (this.hRc != null)
      parama.I(12, this.hRc);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hRv);
    if (this.hRj != null)
      j += b.a.a.b.b.a.J(3, this.hRj);
    if (this.hRw != null)
      j += b.a.a.b.b.a.J(4, this.hRw);
    if (this.hRx != null)
      j += b.a.a.b.b.a.J(5, this.hRx);
    if (this.hRA != null)
      j += b.a.a.b.b.a.J(6, this.hRA);
    int k = j + b.a.a.a.br(7, this.hRB);
    if (this.hRC != null)
      k += b.a.a.a.bs(8, this.hRC.hD());
    if (this.hRD != null)
      k += b.a.a.a.bs(9, this.hRD.hD());
    int m = k + b.a.a.a.br(10, this.hRE);
    if (this.hRb != null)
      m += b.a.a.b.b.a.J(11, this.hRb);
    if (this.hRc != null)
      m += b.a.a.b.b.a.J(12, this.hRc);
    return m;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ca
 * JD-Core Version:    0.6.2
 */