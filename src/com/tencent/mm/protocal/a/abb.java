package com.tencent.mm.protocal.a;

public final class abb extends vn
{
  public ze iva;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.iva != null)
    {
      parama.bv(2, this.iva.hD());
      this.iva.a(parama);
    }
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.iva != null)
      i += b.a.a.a.bs(2, this.iva.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.abb
 * JD-Core Version:    0.6.2
 */