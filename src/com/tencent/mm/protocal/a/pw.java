package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class pw extends vn
{
  public ws hRd;
  public int ifC;
  public ws ifD;
  public ws ifE;

  public final void a(b.a.a.c.a parama)
  {
    if (this.ifD == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.ifC);
    if (this.ifD != null)
    {
      parama.bv(3, this.ifD.hD());
      this.ifD.a(parama);
    }
    if (this.hRd != null)
    {
      parama.bv(4, this.hRd.hD());
      this.hRd.a(parama);
    }
    if (this.ifE != null)
    {
      parama.bv(5, this.ifE.hD());
      this.ifE.a(parama);
    }
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.ifC);
    if (this.ifD != null)
      j += b.a.a.a.bs(3, this.ifD.hD());
    if (this.hRd != null)
      j += b.a.a.a.bs(4, this.hRd.hD());
    if (this.ifE != null)
      j += b.a.a.a.bs(5, this.ifE.hD());
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.pw
 * JD-Core Version:    0.6.2
 */