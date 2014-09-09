package com.tencent.mm.protocal.a;

public final class xo extends vn
{
  public String fxG;
  public String gnq;
  public int hEu;
  public int inN;
  public String irF;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.gnq != null)
      parama.I(2, this.gnq);
    if (this.fxG != null)
      parama.I(3, this.fxG);
    parama.by(4, this.inN);
    parama.by(5, this.hEu);
    if (this.irF != null)
      parama.I(6, this.irF);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.gnq != null)
      i += b.a.a.b.b.a.J(2, this.gnq);
    if (this.fxG != null)
      i += b.a.a.b.b.a.J(3, this.fxG);
    int j = i + b.a.a.a.br(4, this.inN) + b.a.a.a.br(5, this.hEu);
    if (this.irF != null)
      j += b.a.a.b.b.a.J(6, this.irF);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.xo
 * JD-Core Version:    0.6.2
 */