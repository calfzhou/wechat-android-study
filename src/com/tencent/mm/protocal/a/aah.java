package com.tencent.mm.protocal.a;

public final class aah extends vn
{
  public int hQF;
  public String imz;
  public long itu;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hQF);
    parama.k(3, this.itu);
    if (this.imz != null)
      parama.I(4, this.imz);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hQF) + b.a.a.a.i(3, this.itu);
    if (this.imz != null)
      j += b.a.a.b.b.a.J(4, this.imz);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aah
 * JD-Core Version:    0.6.2
 */