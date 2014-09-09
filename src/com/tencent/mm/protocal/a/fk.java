package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class fk extends com.tencent.mm.ao.a
{
  public vt hVf;
  public vt hVm;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hVf == null) || (this.hVm == null))
      throw new b("Not all required fields were included");
    if (this.hVf != null)
    {
      parama.bv(1, this.hVf.hD());
      this.hVf.a(parama);
    }
    if (this.hVm != null)
    {
      parama.bv(2, this.hVm.hD());
      this.hVm.a(parama);
    }
  }

  public final int hD()
  {
    vt localvt = this.hVf;
    int i = 0;
    if (localvt != null)
      i = 0 + b.a.a.a.bs(1, this.hVf.hD());
    if (this.hVm != null)
      i += b.a.a.a.bs(2, this.hVm.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.fk
 * JD-Core Version:    0.6.2
 */