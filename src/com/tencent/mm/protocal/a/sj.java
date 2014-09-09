package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class sj extends com.tencent.mm.ao.a
{
  public vt hOC;
  public vt ilY;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hOC == null) || (this.ilY == null))
      throw new b("Not all required fields were included");
    if (this.hOC != null)
    {
      parama.bv(1, this.hOC.hD());
      this.hOC.a(parama);
    }
    if (this.ilY != null)
    {
      parama.bv(2, this.ilY.hD());
      this.ilY.a(parama);
    }
  }

  public final int hD()
  {
    vt localvt = this.hOC;
    int i = 0;
    if (localvt != null)
      i = 0 + b.a.a.a.bs(1, this.hOC.hD());
    if (this.ilY != null)
      i += b.a.a.a.bs(2, this.ilY.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.sj
 * JD-Core Version:    0.6.2
 */