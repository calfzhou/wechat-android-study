package com.tencent.mm.protocal.a;

public final class o extends vn
{
  public int ewb;
  public String hOJ;
  public int hOK;
  public String hOL;
  public String hOM;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hOJ != null)
      parama.I(2, this.hOJ);
    parama.by(3, this.ewb);
    parama.by(4, this.hOK);
    if (this.hOL != null)
      parama.I(5, this.hOL);
    if (this.hOM != null)
      parama.I(6, this.hOM);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hOJ != null)
      i += b.a.a.b.b.a.J(2, this.hOJ);
    int j = i + b.a.a.a.br(3, this.ewb) + b.a.a.a.br(4, this.hOK);
    if (this.hOL != null)
      j += b.a.a.b.b.a.J(5, this.hOL);
    if (this.hOM != null)
      j += b.a.a.b.b.a.J(6, this.hOM);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.o
 * JD-Core Version:    0.6.2
 */