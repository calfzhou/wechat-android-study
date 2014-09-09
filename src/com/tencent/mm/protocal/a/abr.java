package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class abr extends com.tencent.mm.ao.a
{
  public int ifI;
  public vt ivi;

  public final void a(b.a.a.c.a parama)
  {
    if (this.ivi == null)
      throw new b("Not all required fields were included");
    parama.by(1, this.ifI);
    if (this.ivi != null)
    {
      parama.bv(2, this.ivi.hD());
      this.ivi.a(parama);
    }
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.ifI);
    if (this.ivi != null)
      i += b.a.a.a.bs(2, this.ivi.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.abr
 * JD-Core Version:    0.6.2
 */