package com.tencent.mm.protocal.a;

public final class bu extends vn
{
  public String hQK;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hQK != null)
      parama.I(4, this.hQK);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hQK != null)
      i += b.a.a.b.b.a.J(4, this.hQK);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.bu
 * JD-Core Version:    0.6.2
 */