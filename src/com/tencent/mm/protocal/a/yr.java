package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class yr extends vn
{
  public ws hPZ;
  public int irV;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hPZ == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hPZ != null)
    {
      parama.bv(2, this.hPZ.hD());
      this.hPZ.a(parama);
    }
    parama.by(3, this.irV);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hPZ != null)
      i += b.a.a.a.bs(2, this.hPZ.hD());
    return i + b.a.a.a.br(3, this.irV);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.yr
 * JD-Core Version:    0.6.2
 */