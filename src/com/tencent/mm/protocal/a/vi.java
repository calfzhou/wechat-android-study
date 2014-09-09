package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class vi extends com.tencent.mm.ao.a
{
  public vt hOC;
  public vt hVf;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hOC == null) || (this.hVf == null))
      throw new b("Not all required fields were included");
    if (this.hOC != null)
    {
      parama.bv(1, this.hOC.hD());
      this.hOC.a(parama);
    }
    if (this.hVf != null)
    {
      parama.bv(2, this.hVf.hD());
      this.hVf.a(parama);
    }
  }

  public final int hD()
  {
    vt localvt = this.hOC;
    int i = 0;
    if (localvt != null)
      i = 0 + b.a.a.a.bs(1, this.hOC.hD());
    if (this.hVf != null)
      i += b.a.a.a.bs(2, this.hVf.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.vi
 * JD-Core Version:    0.6.2
 */