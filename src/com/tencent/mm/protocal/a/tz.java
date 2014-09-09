package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class tz extends com.tencent.mm.ao.a
{
  public vt hUp;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hUp == null)
      throw new b("Not all required fields were included");
    if (this.hUp != null)
    {
      parama.bv(1, this.hUp.hD());
      this.hUp.a(parama);
    }
  }

  public final int hD()
  {
    vt localvt = this.hUp;
    int i = 0;
    if (localvt != null)
      i = 0 + b.a.a.a.bs(1, this.hUp.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.tz
 * JD-Core Version:    0.6.2
 */