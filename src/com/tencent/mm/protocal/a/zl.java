package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class zl extends vn
{
  public String hOJ;
  public zg isP;

  public final void a(b.a.a.c.a parama)
  {
    if (this.isP == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.isP != null)
    {
      parama.bv(2, this.isP.hD());
      this.isP.a(parama);
    }
    if (this.hOJ != null)
      parama.I(3, this.hOJ);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.isP != null)
      i += b.a.a.a.bs(2, this.isP.hD());
    if (this.hOJ != null)
      i += b.a.a.b.b.a.J(3, this.hOJ);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.zl
 * JD-Core Version:    0.6.2
 */