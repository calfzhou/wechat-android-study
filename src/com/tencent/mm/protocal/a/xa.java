package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class xa extends vn
{
  public ws hPj;
  public int hQF;
  public vt hVf;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hVf == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hVf != null)
    {
      parama.bv(2, this.hVf.hD());
      this.hVf.a(parama);
    }
    parama.by(3, this.hQF);
    if (this.hPj != null)
    {
      parama.bv(4, this.hPj.hD());
      this.hPj.a(parama);
    }
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hVf != null)
      i += b.a.a.a.bs(2, this.hVf.hD());
    int j = i + b.a.a.a.br(3, this.hQF);
    if (this.hPj != null)
      j += b.a.a.a.bs(4, this.hPj.hD());
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.xa
 * JD-Core Version:    0.6.2
 */