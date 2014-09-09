package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class ci extends vn
{
  public int hQd;
  public int hQj;
  public int hRB;
  public int hSg;
  public ws hSh;
  public int hSi;
  public int hSj;
  public int hSk;

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
    parama.by(4, this.hSi);
    parama.by(5, this.hQd);
    parama.by(6, this.hQj);
    parama.by(7, this.hSj);
    parama.by(8, this.hRB);
    parama.by(9, this.hSk);
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
    return j + b.a.a.a.br(4, this.hSi) + b.a.a.a.br(5, this.hQd) + b.a.a.a.br(6, this.hQj) + b.a.a.a.br(7, this.hSj) + b.a.a.a.br(8, this.hRB) + b.a.a.a.br(9, this.hSk);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ci
 * JD-Core Version:    0.6.2
 */