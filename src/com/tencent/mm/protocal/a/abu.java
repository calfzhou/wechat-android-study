package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class abu extends vn
{
  public int ivl;
  public int ivm;
  public ws ivn;
  public ws ivo;

  public final void a(b.a.a.c.a parama)
  {
    if (this.ivn == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.ivl);
    parama.by(3, this.ivm);
    if (this.ivn != null)
    {
      parama.bv(4, this.ivn.hD());
      this.ivn.a(parama);
    }
    if (this.ivo != null)
    {
      parama.bv(5, this.ivo.hD());
      this.ivo.a(parama);
    }
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.ivl) + b.a.a.a.br(3, this.ivm);
    if (this.ivn != null)
      j += b.a.a.a.bs(4, this.ivn.hD());
    if (this.ivo != null)
      j += b.a.a.a.bs(5, this.ivo.hD());
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.abu
 * JD-Core Version:    0.6.2
 */