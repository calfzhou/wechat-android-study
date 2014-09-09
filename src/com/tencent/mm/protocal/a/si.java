package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class si extends com.tencent.mm.ao.a
{
  public int dZy;
  public vt hOC;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hOC == null)
      throw new b("Not all required fields were included");
    if (this.hOC != null)
    {
      parama.bv(1, this.hOC.hD());
      this.hOC.a(parama);
    }
    parama.by(2, this.dZy);
  }

  public final int hD()
  {
    vt localvt = this.hOC;
    int i = 0;
    if (localvt != null)
      i = 0 + b.a.a.a.bs(1, this.hOC.hD());
    return i + b.a.a.a.br(2, this.dZy);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.si
 * JD-Core Version:    0.6.2
 */