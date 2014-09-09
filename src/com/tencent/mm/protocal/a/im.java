package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class im extends com.tencent.mm.ao.a
{
  public int hTp;
  public ws hTq;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hTq == null)
      throw new b("Not all required fields were included");
    parama.by(1, this.hTp);
    if (this.hTq != null)
    {
      parama.bv(3, this.hTq.hD());
      this.hTq.a(parama);
    }
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hTp);
    if (this.hTq != null)
      i += b.a.a.a.bs(3, this.hTq.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.im
 * JD-Core Version:    0.6.2
 */