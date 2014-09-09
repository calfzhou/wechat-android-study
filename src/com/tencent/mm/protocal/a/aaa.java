package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class aaa extends vn
{
  public int hTp;
  public ws hTq;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hTq == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hTp);
    if (this.hTq != null)
    {
      parama.bv(3, this.hTq.hD());
      this.hTq.a(parama);
    }
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hTp);
    if (this.hTq != null)
      j += b.a.a.a.bs(3, this.hTq.hD());
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aaa
 * JD-Core Version:    0.6.2
 */