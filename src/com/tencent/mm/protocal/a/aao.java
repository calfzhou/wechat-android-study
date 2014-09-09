package com.tencent.mm.protocal.a;

public final class aao extends vn
{
  public int hPv;
  public String hRk;
  public String isH;
  public long isI;
  public long itx;
  public int ity;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.isH != null)
      parama.I(2, this.isH);
    if (this.hRk != null)
      parama.I(3, this.hRk);
    parama.k(4, this.isI);
    parama.by(5, this.hPv);
    parama.k(6, this.itx);
    parama.by(7, this.ity);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.isH != null)
      i += b.a.a.b.b.a.J(2, this.isH);
    if (this.hRk != null)
      i += b.a.a.b.b.a.J(3, this.hRk);
    return i + b.a.a.a.i(4, this.isI) + b.a.a.a.br(5, this.hPv) + b.a.a.a.i(6, this.itx) + b.a.a.a.br(7, this.ity);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aao
 * JD-Core Version:    0.6.2
 */