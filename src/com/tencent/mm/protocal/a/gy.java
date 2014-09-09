package com.tencent.mm.protocal.a;

public final class gy extends vn
{
  public int hOi;
  public String hWN;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hWN != null)
      parama.I(2, this.hWN);
    parama.by(3, this.hOi);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hWN != null)
      i += b.a.a.b.b.a.J(2, this.hWN);
    return i + b.a.a.a.br(3, this.hOi);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.gy
 * JD-Core Version:    0.6.2
 */