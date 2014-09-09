package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class xi extends vn
{
  public ws hPj;
  public int hQF;
  public vt ifj;
  public int iry;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.ifj == null) || (this.hPj == null))
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.ifj != null)
    {
      parama.bv(2, this.ifj.hD());
      this.ifj.a(parama);
    }
    parama.by(3, this.hQF);
    parama.by(4, this.iry);
    if (this.hPj != null)
    {
      parama.bv(5, this.hPj.hD());
      this.hPj.a(parama);
    }
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.ifj != null)
      i += b.a.a.a.bs(2, this.ifj.hD());
    int j = i + b.a.a.a.br(3, this.hQF) + b.a.a.a.br(4, this.iry);
    if (this.hPj != null)
      j += b.a.a.a.bs(5, this.hPj.hD());
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.xi
 * JD-Core Version:    0.6.2
 */