package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class of extends vn
{
  public ws hRd;
  public vt hVf;
  public vt iem;
  public vt ien;
  public ws ieo;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hVf == null) || (this.iem == null))
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hVf != null)
    {
      parama.bv(2, this.hVf.hD());
      this.hVf.a(parama);
    }
    if (this.iem != null)
    {
      parama.bv(3, this.iem.hD());
      this.iem.a(parama);
    }
    if (this.ien != null)
    {
      parama.bv(4, this.ien.hD());
      this.ien.a(parama);
    }
    if (this.hRd != null)
    {
      parama.bv(5, this.hRd.hD());
      this.hRd.a(parama);
    }
    if (this.ieo != null)
    {
      parama.bv(6, this.ieo.hD());
      this.ieo.a(parama);
    }
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hVf != null)
      i += b.a.a.a.bs(2, this.hVf.hD());
    if (this.iem != null)
      i += b.a.a.a.bs(3, this.iem.hD());
    if (this.ien != null)
      i += b.a.a.a.bs(4, this.ien.hD());
    if (this.hRd != null)
      i += b.a.a.a.bs(5, this.hRd.hD());
    if (this.ieo != null)
      i += b.a.a.a.bs(6, this.ieo.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.of
 * JD-Core Version:    0.6.2
 */