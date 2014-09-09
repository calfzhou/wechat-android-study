package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class abx extends vn
{
  public int hOR;
  public int hQk;
  public ws hUR;
  public int hUu;
  public int hVH;
  public String ihr;
  public int ipy;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hUR == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hOR);
    parama.by(3, this.ipy);
    if (this.hUR != null)
    {
      parama.bv(4, this.hUR.hD());
      this.hUR.a(parama);
    }
    parama.by(5, this.hUu);
    parama.by(6, this.hQk);
    if (this.ihr != null)
      parama.I(7, this.ihr);
    parama.by(8, this.hVH);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hOR) + b.a.a.a.br(3, this.ipy);
    if (this.hUR != null)
      j += b.a.a.a.bs(4, this.hUR.hD());
    int k = j + b.a.a.a.br(5, this.hUu) + b.a.a.a.br(6, this.hQk);
    if (this.ihr != null)
      k += b.a.a.b.b.a.J(7, this.ihr);
    return k + b.a.a.a.br(8, this.hVH);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.abx
 * JD-Core Version:    0.6.2
 */