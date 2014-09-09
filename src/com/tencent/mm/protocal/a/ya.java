package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class ya extends vn
{
  public String hVL;
  public int igx;
  public LinkedList igy = new LinkedList();

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
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hVL != null)
      i += b.a.a.b.b.a.J(2, this.hVL);
    return i + b.a.a.a.br(3, this.igx) + b.a.a.a.c(4, 8, this.igy);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ya
 * JD-Core Version:    0.6.2
 */