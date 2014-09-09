package com.tencent.mm.protocal.a;

public final class fz extends vn
{
  public int hOO;
  public long hOY;
  public String hPt;
  public int hQd;
  public int hQh;

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.hOO);
    parama.by(2, this.hQd);
    parama.by(3, this.hQh);
    if (this.hPt != null)
      parama.I(4, this.hPt);
    if (this.hRy != null)
    {
      parama.bv(5, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.k(6, this.hOY);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hOO) + b.a.a.a.br(2, this.hQd) + b.a.a.a.br(3, this.hQh);
    if (this.hPt != null)
      i += b.a.a.b.b.a.J(4, this.hPt);
    if (this.hRy != null)
      i += b.a.a.a.bs(5, this.hRy.hD());
    return i + b.a.a.a.i(6, this.hOY);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.fz
 * JD-Core Version:    0.6.2
 */