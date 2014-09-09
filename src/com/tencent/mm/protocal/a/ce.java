package com.tencent.mm.protocal.a;

public final class ce extends vn
{
  public int hOi;
  public String hSc;
  public String hSd;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hSc != null)
      parama.I(2, this.hSc);
    parama.by(3, this.hOi);
    if (this.hSd != null)
      parama.I(4, this.hSd);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hSc != null)
      i += b.a.a.b.b.a.J(2, this.hSc);
    int j = i + b.a.a.a.br(3, this.hOi);
    if (this.hSd != null)
      j += b.a.a.b.b.a.J(4, this.hSd);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ce
 * JD-Core Version:    0.6.2
 */