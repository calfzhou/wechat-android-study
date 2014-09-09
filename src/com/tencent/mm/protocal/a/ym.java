package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class ym extends vn
{
  public String hsT;
  public int iaB;
  public LinkedList iaC = new LinkedList();

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hsT != null)
      parama.I(2, this.hsT);
    parama.by(3, this.iaB);
    parama.d(4, 8, this.iaC);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hsT != null)
      i += b.a.a.b.b.a.J(2, this.hsT);
    return i + b.a.a.a.br(3, this.iaB) + b.a.a.a.c(4, 8, this.iaC);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ym
 * JD-Core Version:    0.6.2
 */