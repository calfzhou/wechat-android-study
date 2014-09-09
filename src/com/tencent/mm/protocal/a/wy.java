package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class wy extends vo
{
  public int ewb;
  public String hSl;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRz == null)
      throw new b("Not all required fields were included");
    if (this.hRz != null)
    {
      parama.bv(1, this.hRz.hD());
      this.hRz.a(parama);
    }
    parama.by(2, this.ewb);
    if (this.hSl != null)
      parama.I(3, this.hSl);
  }

  public final int hD()
  {
    bb localbb = this.hRz;
    int i = 0;
    if (localbb != null)
      i = 0 + b.a.a.a.bs(1, this.hRz.hD());
    int j = i + b.a.a.a.br(2, this.ewb);
    if (this.hSl != null)
      j += b.a.a.b.b.a.J(3, this.hSl);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.wy
 * JD-Core Version:    0.6.2
 */