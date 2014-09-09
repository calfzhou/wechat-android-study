package com.tencent.mm.protocal.a;

public final class fi extends vn
{
  public String hVl;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hVl != null)
      parama.I(2, this.hVl);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hVl != null)
      i += b.a.a.b.b.a.J(2, this.hVl);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.fi
 * JD-Core Version:    0.6.2
 */