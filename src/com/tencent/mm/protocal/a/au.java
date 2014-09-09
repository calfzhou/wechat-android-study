package com.tencent.mm.protocal.a;

public final class au extends vn
{
  public String hPI;
  public String hPK;
  public int hPS;
  public int hPT;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hPI != null)
      parama.I(2, this.hPI);
    if (this.hPK != null)
      parama.I(3, this.hPK);
    parama.by(4, this.hPS);
    parama.by(5, this.hPT);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hPI != null)
      i += b.a.a.b.b.a.J(2, this.hPI);
    if (this.hPK != null)
      i += b.a.a.b.b.a.J(3, this.hPK);
    return i + b.a.a.a.br(4, this.hPS) + b.a.a.a.br(5, this.hPT);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.au
 * JD-Core Version:    0.6.2
 */