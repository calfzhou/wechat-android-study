package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class xm extends vn
{
  public aa irD;
  public String irE;

  public final void a(b.a.a.c.a parama)
  {
    if (this.irD == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.irD != null)
    {
      parama.bv(2, this.irD.hD());
      this.irD.a(parama);
    }
    if (this.irE != null)
      parama.I(3, this.irE);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.irD != null)
      i += b.a.a.a.bs(2, this.irD.hD());
    if (this.irE != null)
      i += b.a.a.b.b.a.J(3, this.irE);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.xm
 * JD-Core Version:    0.6.2
 */