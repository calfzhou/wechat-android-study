package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class jh extends vo
{
  public final void a(b.a.a.c.a parama)
  {
    if (this.hRz == null)
      throw new b("Not all required fields were included");
    if (this.hRz != null)
    {
      parama.bv(1, this.hRz.hD());
      this.hRz.a(parama);
    }
  }

  public final int hD()
  {
    bb localbb = this.hRz;
    int i = 0;
    if (localbb != null)
      i = 0 + b.a.a.a.bs(1, this.hRz.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.jh
 * JD-Core Version:    0.6.2
 */