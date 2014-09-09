package com.tencent.mm.protocal.a;

public final class kl extends vn
{
  public String ibe;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.ibe != null)
      parama.I(2, this.ibe);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.ibe != null)
      i += b.a.a.b.b.a.J(2, this.ibe);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.kl
 * JD-Core Version:    0.6.2
 */