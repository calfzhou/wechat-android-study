package com.tencent.mm.protocal.a;

public final class my extends vn
{
  public String hOh;
  public String hTk;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hTk != null)
      parama.I(2, this.hTk);
    if (this.hOh != null)
      parama.I(3, this.hOh);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hTk != null)
      i += b.a.a.b.b.a.J(2, this.hTk);
    if (this.hOh != null)
      i += b.a.a.b.b.a.J(3, this.hOh);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.my
 * JD-Core Version:    0.6.2
 */