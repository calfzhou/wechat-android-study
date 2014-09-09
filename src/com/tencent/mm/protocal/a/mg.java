package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class mg extends vn
{
  public int hOO;
  public vt hOP;
  public vt hOQ;
  public long hOY;
  public int hQk;
  public int hQs;
  public int hUu;
  public int icN;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hOP == null) || (this.hOQ == null))
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hOO);
    if (this.hOP != null)
    {
      parama.bv(3, this.hOP.hD());
      this.hOP.a(parama);
    }
    if (this.hOQ != null)
    {
      parama.bv(4, this.hOQ.hD());
      this.hOQ.a(parama);
    }
    parama.by(5, this.hQk);
    parama.by(6, this.hUu);
    parama.by(7, this.hQs);
    parama.by(8, this.icN);
    parama.k(9, this.hOY);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hOO);
    if (this.hOP != null)
      j += b.a.a.a.bs(3, this.hOP.hD());
    if (this.hOQ != null)
      j += b.a.a.a.bs(4, this.hOQ.hD());
    return j + b.a.a.a.br(5, this.hQk) + b.a.a.a.br(6, this.hUu) + b.a.a.a.br(7, this.hQs) + b.a.a.a.br(8, this.icN) + b.a.a.a.i(9, this.hOY);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.mg
 * JD-Core Version:    0.6.2
 */