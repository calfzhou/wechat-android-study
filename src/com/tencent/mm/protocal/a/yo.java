package com.tencent.mm.protocal.a;

public final class yo extends vn
{
  public String hVL;
  public String inU;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.inU != null)
      parama.I(2, this.inU);
    if (this.hVL != null)
      parama.I(3, this.hVL);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.inU != null)
      i += b.a.a.b.b.a.J(2, this.inU);
    if (this.hVL != null)
      i += b.a.a.b.b.a.J(3, this.hVL);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.yo
 * JD-Core Version:    0.6.2
 */