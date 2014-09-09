package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class ks extends vn
{
  public ws hRd;
  public int ibj;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRd == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hRd != null)
    {
      parama.bv(2, this.hRd.hD());
      this.hRd.a(parama);
    }
    parama.by(3, this.ibj);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hRd != null)
      i += b.a.a.a.bs(2, this.hRd.hD());
    return i + b.a.a.a.br(3, this.ibj);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ks
 * JD-Core Version:    0.6.2
 */