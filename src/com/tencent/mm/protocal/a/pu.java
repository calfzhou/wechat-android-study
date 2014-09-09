package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class pu extends vn
{
  public String hOh;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hOh == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hOh != null)
      parama.I(2, this.hOh);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hOh != null)
      i += b.a.a.b.b.a.J(2, this.hOh);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.pu
 * JD-Core Version:    0.6.2
 */