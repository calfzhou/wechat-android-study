package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class xs extends vn
{
  public oy hQL;
  public ws ieU;
  public pc irI;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hQL == null) || (this.irI == null) || (this.ieU == null))
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hQL != null)
    {
      parama.bv(2, this.hQL.hD());
      this.hQL.a(parama);
    }
    if (this.irI != null)
    {
      parama.bv(3, this.irI.hD());
      this.irI.a(parama);
    }
    if (this.ieU != null)
    {
      parama.bv(4, this.ieU.hD());
      this.ieU.a(parama);
    }
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hQL != null)
      i += b.a.a.a.bs(2, this.hQL.hD());
    if (this.irI != null)
      i += b.a.a.a.bs(3, this.irI.hD());
    if (this.ieU != null)
      i += b.a.a.a.bs(4, this.ieU.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.xs
 * JD-Core Version:    0.6.2
 */