package com.tencent.mm.protocal.a;

public final class jr extends vn
{
  public double KL;
  public double KM;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.a(2, this.KM);
    parama.a(3, this.KL);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + (8 + b.a.a.b.b.a.rV(2));
    return j + (8 + b.a.a.b.b.a.rV(3));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.jr
 * JD-Core Version:    0.6.2
 */