package com.tencent.mm.protocal.a;

public final class qq extends vn
{
  public int hQF;
  public float hXd;
  public float hXe;
  public int hXf;
  public String hXg;
  public String hXh;
  public int hXi;
  public String igi;
  public int igj;
  public int igk;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hQF);
    parama.c(3, this.hXd);
    parama.c(4, this.hXe);
    parama.by(5, this.hXf);
    if (this.hXg != null)
      parama.I(6, this.hXg);
    if (this.hXh != null)
      parama.I(7, this.hXh);
    parama.by(8, this.hXi);
    if (this.igi != null)
      parama.I(9, this.igi);
    parama.by(10, this.igj);
    parama.by(11, this.igk);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hQF);
    int k = j + (4 + b.a.a.b.b.a.rV(3));
    int m = k + (4 + b.a.a.b.b.a.rV(4)) + b.a.a.a.br(5, this.hXf);
    if (this.hXg != null)
      m += b.a.a.b.b.a.J(6, this.hXg);
    if (this.hXh != null)
      m += b.a.a.b.b.a.J(7, this.hXh);
    int n = m + b.a.a.a.br(8, this.hXi);
    if (this.igi != null)
      n += b.a.a.b.b.a.J(9, this.igi);
    return n + b.a.a.a.br(10, this.igj) + b.a.a.a.br(11, this.igk);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.qq
 * JD-Core Version:    0.6.2
 */