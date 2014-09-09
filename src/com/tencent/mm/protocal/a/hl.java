package com.tencent.mm.protocal.a;

public final class hl extends vn
{
  public int hQF;
  public String hVL;
  public String hXc;
  public float hXd;
  public float hXe;
  public int hXf;
  public String hXg;
  public String hXh;
  public int hXi;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hQF);
    if (this.hXc != null)
      parama.I(3, this.hXc);
    parama.c(4, this.hXd);
    parama.c(5, this.hXe);
    parama.by(6, this.hXf);
    if (this.hXg != null)
      parama.I(7, this.hXg);
    if (this.hXh != null)
      parama.I(8, this.hXh);
    parama.by(9, this.hXi);
    if (this.hVL != null)
      parama.I(10, this.hVL);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hQF);
    if (this.hXc != null)
      j += b.a.a.b.b.a.J(3, this.hXc);
    int k = j + (4 + b.a.a.b.b.a.rV(4));
    int m = k + (4 + b.a.a.b.b.a.rV(5)) + b.a.a.a.br(6, this.hXf);
    if (this.hXg != null)
      m += b.a.a.b.b.a.J(7, this.hXg);
    if (this.hXh != null)
      m += b.a.a.b.b.a.J(8, this.hXh);
    int n = m + b.a.a.a.br(9, this.hXi);
    if (this.hVL != null)
      n += b.a.a.b.b.a.J(10, this.hVL);
    return n;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.hl
 * JD-Core Version:    0.6.2
 */