package com.tencent.mm.protocal.a;

public final class ul extends vn
{
  public String ipw;
  public String ipx;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.ipw != null)
      parama.I(2, this.ipw);
    if (this.ipx != null)
      parama.I(3, this.ipx);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.ipw != null)
      i += b.a.a.b.b.a.J(2, this.ipw);
    if (this.ipx != null)
      i += b.a.a.b.b.a.J(3, this.ipx);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ul
 * JD-Core Version:    0.6.2
 */