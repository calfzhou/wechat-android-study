package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class su extends com.tencent.mm.ao.a
{
  public int dZy;
  public vt hVf;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hVf == null)
      throw new b("Not all required fields were included");
    if (this.hVf != null)
    {
      parama.bv(1, this.hVf.hD());
      this.hVf.a(parama);
    }
    parama.by(2, this.dZy);
  }

  public final int hD()
  {
    vt localvt = this.hVf;
    int i = 0;
    if (localvt != null)
      i = 0 + b.a.a.a.bs(1, this.hVf.hD());
    return i + b.a.a.a.br(2, this.dZy);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.su
 * JD-Core Version:    0.6.2
 */