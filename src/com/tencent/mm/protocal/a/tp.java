package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class tp extends vn
{
  public int hSg;
  public ws hSh;
  public int hSj;
  public int hSk;
  public String ioB;
  public String ioC;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hSh == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hSg);
    if (this.hSh != null)
    {
      parama.bv(3, this.hSh.hD());
      this.hSh.a(parama);
    }
    parama.by(4, this.hSj);
    if (this.ioB != null)
      parama.I(5, this.ioB);
    if (this.ioC != null)
      parama.I(6, this.ioC);
    parama.by(7, this.hSk);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hSg);
    if (this.hSh != null)
      j += b.a.a.a.bs(3, this.hSh.hD());
    int k = j + b.a.a.a.br(4, this.hSj);
    if (this.ioB != null)
      k += b.a.a.b.b.a.J(5, this.ioB);
    if (this.ioC != null)
      k += b.a.a.b.b.a.J(6, this.ioC);
    return k + b.a.a.a.br(7, this.hSk);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.tp
 * JD-Core Version:    0.6.2
 */