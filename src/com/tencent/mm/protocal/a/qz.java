package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class qz extends vn
{
  public String hVL;
  public LinkedList igA = new LinkedList();
  public int igx;
  public LinkedList igy = new LinkedList();
  public int igz;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hVL != null)
      parama.I(2, this.hVL);
    parama.by(3, this.igx);
    parama.d(4, 8, this.igy);
    parama.by(5, this.igz);
    parama.d(6, 8, this.igA);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hVL != null)
      i += b.a.a.b.b.a.J(2, this.hVL);
    return i + b.a.a.a.br(3, this.igx) + b.a.a.a.c(4, 8, this.igy) + b.a.a.a.br(5, this.igz) + b.a.a.a.c(6, 8, this.igA);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.qz
 * JD-Core Version:    0.6.2
 */