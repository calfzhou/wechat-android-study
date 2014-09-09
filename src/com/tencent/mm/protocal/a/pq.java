package com.tencent.mm.protocal.a;

public final class pq extends vn
{
  public String dtg;
  public String hOh;
  public String hSt;
  public String hsT;
  public String ifx;
  public String ify;
  public String ifz;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hsT != null)
      parama.I(2, this.hsT);
    if (this.hOh != null)
      parama.I(3, this.hOh);
    if (this.hSt != null)
      parama.I(4, this.hSt);
    if (this.dtg != null)
      parama.I(5, this.dtg);
    if (this.ifx != null)
      parama.I(6, this.ifx);
    if (this.ify != null)
      parama.I(7, this.ify);
    if (this.ifz != null)
      parama.I(8, this.ifz);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hsT != null)
      i += b.a.a.b.b.a.J(2, this.hsT);
    if (this.hOh != null)
      i += b.a.a.b.b.a.J(3, this.hOh);
    if (this.hSt != null)
      i += b.a.a.b.b.a.J(4, this.hSt);
    if (this.dtg != null)
      i += b.a.a.b.b.a.J(5, this.dtg);
    if (this.ifx != null)
      i += b.a.a.b.b.a.J(6, this.ifx);
    if (this.ify != null)
      i += b.a.a.b.b.a.J(7, this.ify);
    if (this.ifz != null)
      i += b.a.a.b.b.a.J(8, this.ifz);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.pq
 * JD-Core Version:    0.6.2
 */