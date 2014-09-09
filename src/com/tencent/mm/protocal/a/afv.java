package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class afv extends com.tencent.mm.ao.a
{
  public vt ivi;

  public final void a(b.a.a.c.a parama)
  {
    if (this.ivi == null)
      throw new b("Not all required fields were included");
    if (this.ivi != null)
    {
      parama.bv(1, this.ivi.hD());
      this.ivi.a(parama);
    }
  }

  public final int hD()
  {
    vt localvt = this.ivi;
    int i = 0;
    if (localvt != null)
      i = 0 + b.a.a.a.bs(1, this.ivi.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.afv
 * JD-Core Version:    0.6.2
 */