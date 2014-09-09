package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class aau extends vn
{
  public aas iuJ;
  public aar iuK;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.iuJ == null) || (this.iuK == null))
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.iuJ != null)
    {
      parama.bv(2, this.iuJ.hD());
      this.iuJ.a(parama);
    }
    if (this.iuK != null)
    {
      parama.bv(3, this.iuK.hD());
      this.iuK.a(parama);
    }
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.iuJ != null)
      i += b.a.a.a.bs(2, this.iuJ.hD());
    if (this.iuK != null)
      i += b.a.a.a.bs(3, this.iuK.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aau
 * JD-Core Version:    0.6.2
 */