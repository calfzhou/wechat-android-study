package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class sm extends com.tencent.mm.ao.a
{
  public fp imt;

  public final void a(b.a.a.c.a parama)
  {
    if (this.imt == null)
      throw new b("Not all required fields were included");
    if (this.imt != null)
    {
      parama.bv(1, this.imt.hD());
      this.imt.a(parama);
    }
  }

  public final int hD()
  {
    fp localfp = this.imt;
    int i = 0;
    if (localfp != null)
      i = 0 + b.a.a.a.bs(1, this.imt.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.sm
 * JD-Core Version:    0.6.2
 */