package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class aw extends vn
{
  public String hPI;
  public int hPJ;
  public int hQd;
  public int hQf;
  public int hQh;
  public ws hQi;
  public int hQj;
  public String hQq;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hQi == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hPI != null)
      parama.I(2, this.hPI);
    parama.by(3, this.hQd);
    parama.by(4, this.hQh);
    if (this.hQq != null)
      parama.I(5, this.hQq);
    if (this.hQi != null)
    {
      parama.bv(6, this.hQi.hD());
      this.hQi.a(parama);
    }
    parama.by(7, this.hQj);
    parama.by(8, this.hQf);
    parama.by(9, this.hPJ);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hPI != null)
      i += b.a.a.b.b.a.J(2, this.hPI);
    int j = i + b.a.a.a.br(3, this.hQd) + b.a.a.a.br(4, this.hQh);
    if (this.hQq != null)
      j += b.a.a.b.b.a.J(5, this.hQq);
    if (this.hQi != null)
      j += b.a.a.a.bs(6, this.hQi.hD());
    return j + b.a.a.a.br(7, this.hQj) + b.a.a.a.br(8, this.hQf) + b.a.a.a.br(9, this.hPJ);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aw
 * JD-Core Version:    0.6.2
 */