package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class ti extends vn
{
  public String eJv;
  public String gnq;
  public ws iof;
  public ws iog;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.iof == null) || (this.iog == null))
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.gnq != null)
      parama.I(2, this.gnq);
    if (this.iof != null)
    {
      parama.bv(3, this.iof.hD());
      this.iof.a(parama);
    }
    if (this.iog != null)
    {
      parama.bv(4, this.iog.hD());
      this.iog.a(parama);
    }
    if (this.eJv != null)
      parama.I(5, this.eJv);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.gnq != null)
      i += b.a.a.b.b.a.J(2, this.gnq);
    if (this.iof != null)
      i += b.a.a.a.bs(3, this.iof.hD());
    if (this.iog != null)
      i += b.a.a.a.bs(4, this.iog.hD());
    if (this.eJv != null)
      i += b.a.a.b.b.a.J(5, this.eJv);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ti
 * JD-Core Version:    0.6.2
 */