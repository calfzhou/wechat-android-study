package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class lk extends vn
{
  public int hOi;
  public ws hPj;
  public int hVY;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hPj == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hPj != null)
    {
      parama.bv(2, this.hPj.hD());
      this.hPj.a(parama);
    }
    parama.by(3, this.hVY);
    parama.by(4, this.hOi);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hPj != null)
      i += b.a.a.a.bs(2, this.hPj.hD());
    return i + b.a.a.a.br(3, this.hVY) + b.a.a.a.br(4, this.hOi);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.lk
 * JD-Core Version:    0.6.2
 */