package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class ff extends com.tencent.mm.ao.a
{
  public vt hVj;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hVj == null)
      throw new b("Not all required fields were included");
    if (this.hVj != null)
    {
      parama.bv(1, this.hVj.hD());
      this.hVj.a(parama);
    }
  }

  public final int hD()
  {
    vt localvt = this.hVj;
    int i = 0;
    if (localvt != null)
      i = 0 + b.a.a.a.bs(1, this.hVj.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ff
 * JD-Core Version:    0.6.2
 */