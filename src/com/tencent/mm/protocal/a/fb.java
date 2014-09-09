package com.tencent.mm.protocal.a;

public final class fb extends vn
{
  public String hVh;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hVh != null)
      parama.I(2, this.hVh);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hVh != null)
      i += b.a.a.b.b.a.J(2, this.hVh);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.fb
 * JD-Core Version:    0.6.2
 */