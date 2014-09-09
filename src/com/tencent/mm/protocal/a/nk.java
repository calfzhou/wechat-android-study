package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class nk extends vn
{
  public ws hRd;
  public String hRg;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRd == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hRg != null)
      parama.I(2, this.hRg);
    if (this.hRd != null)
    {
      parama.bv(3, this.hRd.hD());
      this.hRd.a(parama);
    }
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hRg != null)
      i += b.a.a.b.b.a.J(2, this.hRg);
    if (this.hRd != null)
      i += b.a.a.a.bs(3, this.hRd.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.nk
 * JD-Core Version:    0.6.2
 */