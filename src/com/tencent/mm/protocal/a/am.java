package com.tencent.mm.protocal.a;

public final class am extends vn
{
  public int ewb;
  public String hPI;
  public int hPJ;
  public String hPt;
  public int hQd;
  public int hQe;
  public int hQf;
  public int hQg;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hPI != null)
      parama.I(2, this.hPI);
    parama.by(3, this.hPJ);
    if (this.hPt != null)
      parama.I(4, this.hPt);
    parama.by(5, this.hQd);
    parama.by(6, this.hQe);
    parama.by(7, this.hQf);
    parama.by(8, this.ewb);
    parama.by(9, this.hQg);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hPI != null)
      i += b.a.a.b.b.a.J(2, this.hPI);
    int j = i + b.a.a.a.br(3, this.hPJ);
    if (this.hPt != null)
      j += b.a.a.b.b.a.J(4, this.hPt);
    return j + b.a.a.a.br(5, this.hQd) + b.a.a.a.br(6, this.hQe) + b.a.a.a.br(7, this.hQf) + b.a.a.a.br(8, this.ewb) + b.a.a.a.br(9, this.hQg);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.am
 * JD-Core Version:    0.6.2
 */