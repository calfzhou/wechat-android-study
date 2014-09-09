package com.tencent.mm.protocal.a;

public final class dd extends vn
{
  public float cGl;
  public float cLm;
  public String epw;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.epw != null)
      parama.I(2, this.epw);
    parama.c(3, this.cLm);
    parama.c(4, this.cGl);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.epw != null)
      i += b.a.a.b.b.a.J(2, this.epw);
    int j = i + (4 + b.a.a.b.b.a.rV(3));
    return j + (4 + b.a.a.b.b.a.rV(4));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.dd
 * JD-Core Version:    0.6.2
 */