package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class gz extends vo
{
  public String hTm;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRz == null)
      throw new b("Not all required fields were included");
    if (this.hRz != null)
    {
      parama.bv(1, this.hRz.hD());
      this.hRz.a(parama);
    }
    if (this.hTm != null)
      parama.I(2, this.hTm);
  }

  public final int hD()
  {
    bb localbb = this.hRz;
    int i = 0;
    if (localbb != null)
      i = 0 + b.a.a.a.bs(1, this.hRz.hD());
    if (this.hTm != null)
      i += b.a.a.b.b.a.J(2, this.hTm);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.gz
 * JD-Core Version:    0.6.2
 */