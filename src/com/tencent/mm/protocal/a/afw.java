package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class afw extends vn
{
  public long ixH;
  public afv ixU;
  public afv iyr;
  public afv iys;
  public afv iyt;

  public final void a(b.a.a.c.a parama)
  {
    if (this.ixU == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.ixU != null)
    {
      parama.bv(2, this.ixU.hD());
      this.ixU.a(parama);
    }
    if (this.iyr != null)
    {
      parama.bv(3, this.iyr.hD());
      this.iyr.a(parama);
    }
    if (this.iys != null)
    {
      parama.bv(4, this.iys.hD());
      this.iys.a(parama);
    }
    if (this.iyt != null)
    {
      parama.bv(5, this.iyt.hD());
      this.iyt.a(parama);
    }
    parama.k(6, this.ixH);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.ixU != null)
      i += b.a.a.a.bs(2, this.ixU.hD());
    if (this.iyr != null)
      i += b.a.a.a.bs(3, this.iyr.hD());
    if (this.iys != null)
      i += b.a.a.a.bs(4, this.iys.hD());
    if (this.iyt != null)
      i += b.a.a.a.bs(5, this.iyt.hD());
    return i + b.a.a.a.i(6, this.ixH);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.afw
 * JD-Core Version:    0.6.2
 */