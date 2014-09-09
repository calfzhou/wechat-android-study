package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class xg extends com.tencent.mm.ao.a
{
  public long hSK;
  public String irs;
  public qk irt;

  public final void a(b.a.a.c.a parama)
  {
    if (this.irs == null)
      throw new b("Not all required fields were included");
    parama.k(1, this.hSK);
    if (this.irs != null)
      parama.I(2, this.irs);
    if (this.irt != null)
    {
      parama.bv(3, this.irt.hD());
      this.irt.a(parama);
    }
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.i(1, this.hSK);
    if (this.irs != null)
      i += b.a.a.b.b.a.J(2, this.irs);
    if (this.irt != null)
      i += b.a.a.a.bs(3, this.irt.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.xg
 * JD-Core Version:    0.6.2
 */