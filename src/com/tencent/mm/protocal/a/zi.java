package com.tencent.mm.protocal.a;

public final class zi extends vn
{
  public String isH;
  public long isI;
  public String isJ;
  public int isK;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.isH != null)
      parama.I(2, this.isH);
    parama.k(3, this.isI);
    if (this.isJ != null)
      parama.I(4, this.isJ);
    parama.by(5, this.isK);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.isH != null)
      i += b.a.a.b.b.a.J(2, this.isH);
    int j = i + b.a.a.a.i(3, this.isI);
    if (this.isJ != null)
      j += b.a.a.b.b.a.J(4, this.isJ);
    return j + b.a.a.a.br(5, this.isK);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.zi
 * JD-Core Version:    0.6.2
 */