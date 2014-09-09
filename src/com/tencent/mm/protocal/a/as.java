package com.tencent.mm.protocal.a;

public final class as extends vn
{
  public String hPI;
  public int hPJ;
  public int hQp;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hPI != null)
      parama.I(2, this.hPI);
    parama.by(3, this.hPJ);
    parama.by(4, this.hQp);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hPI != null)
      i += b.a.a.b.b.a.J(2, this.hPI);
    return i + b.a.a.a.br(3, this.hPJ) + b.a.a.a.br(4, this.hQp);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.as
 * JD-Core Version:    0.6.2
 */