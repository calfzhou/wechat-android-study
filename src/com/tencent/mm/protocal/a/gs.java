package com.tencent.mm.protocal.a;

public final class gs extends vn
{
  public String hOd;
  public String hWJ;
  public int hWK;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hWJ != null)
      parama.I(2, this.hWJ);
    if (this.hOd != null)
      parama.I(3, this.hOd);
    parama.by(4, this.hWK);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hWJ != null)
      i += b.a.a.b.b.a.J(2, this.hWJ);
    if (this.hOd != null)
      i += b.a.a.b.b.a.J(3, this.hOd);
    return i + b.a.a.a.br(4, this.hWK);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.gs
 * JD-Core Version:    0.6.2
 */