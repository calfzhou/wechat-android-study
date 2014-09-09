package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class so extends vn
{
  public int hOF;
  public LinkedList hQD = new LinkedList();
  public int imw;
  public LinkedList imx = new LinkedList();
  public int imy;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hOF);
    parama.by(3, this.imw);
    parama.d(4, 8, this.imx);
    parama.by(5, this.imy);
    parama.d(6, 8, this.hQD);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    return i + b.a.a.a.br(2, this.hOF) + b.a.a.a.br(3, this.imw) + b.a.a.a.c(4, 8, this.imx) + b.a.a.a.br(5, this.imy) + b.a.a.a.c(6, 8, this.hQD);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.so
 * JD-Core Version:    0.6.2
 */