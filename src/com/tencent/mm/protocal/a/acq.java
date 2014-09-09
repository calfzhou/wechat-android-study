package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class acq extends vn
{
  public qf iwc;

  public final void a(b.a.a.c.a parama)
  {
    if (this.iwc == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.iwc != null)
    {
      parama.bv(2, this.iwc.hD());
      this.iwc.a(parama);
    }
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.iwc != null)
      i += b.a.a.a.bs(2, this.iwc.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.acq
 * JD-Core Version:    0.6.2
 */