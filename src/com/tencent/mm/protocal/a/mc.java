package com.tencent.mm.protocal.a;

public final class mc extends vn
{
  public int Height;
  public int Width;
  public String eJv;
  public float hXd;
  public float hXe;
  public int icH;
  public int icI;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.c(2, this.hXd);
    parama.c(3, this.hXe);
    parama.by(4, this.Width);
    parama.by(5, this.Height);
    if (this.eJv != null)
      parama.I(6, this.eJv);
    parama.by(7, this.icH);
    parama.by(8, this.icI);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + (4 + b.a.a.b.b.a.rV(2));
    int k = j + (4 + b.a.a.b.b.a.rV(3)) + b.a.a.a.br(4, this.Width) + b.a.a.a.br(5, this.Height);
    if (this.eJv != null)
      k += b.a.a.b.b.a.J(6, this.eJv);
    return k + b.a.a.a.br(7, this.icH) + b.a.a.a.br(8, this.icI);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.mc
 * JD-Core Version:    0.6.2
 */