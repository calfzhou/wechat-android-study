package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class aep extends vn
{
  public int hQH;
  public String idA;
  public int ixp;
  public LinkedList ixq = new LinkedList();
  public int ixr;
  public LinkedList ixs = new LinkedList();

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hQH);
    parama.by(3, this.ixp);
    parama.d(4, 8, this.ixq);
    if (this.idA != null)
      parama.I(5, this.idA);
    parama.by(6, this.ixr);
    parama.b(7, this.ixs);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hQH) + b.a.a.a.br(3, this.ixp) + b.a.a.a.c(4, 8, this.ixq);
    if (this.idA != null)
      j += b.a.a.b.b.a.J(5, this.idA);
    return j + b.a.a.a.br(6, this.ixr) + b.a.a.a.a(7, this.ixs);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aep
 * JD-Core Version:    0.6.2
 */