package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class lw extends vn
{
  public String hTk;
  public String icl;
  public s icm;

  public final void a(b.a.a.c.a parama)
  {
    if (this.icm == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.icl != null)
      parama.I(2, this.icl);
    if (this.hTk != null)
      parama.I(3, this.hTk);
    if (this.icm != null)
    {
      parama.bv(4, this.icm.hD());
      this.icm.a(parama);
    }
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.icl != null)
      i += b.a.a.b.b.a.J(2, this.icl);
    if (this.hTk != null)
      i += b.a.a.b.b.a.J(3, this.hTk);
    if (this.icm != null)
      i += b.a.a.a.bs(4, this.icm.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.lw
 * JD-Core Version:    0.6.2
 */