package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class lc extends vn
{
  public LinkedList hvf = new LinkedList();
  public int ibH;
  public int ibI;
  public LinkedList ibJ = new LinkedList();

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.ibH);
    parama.d(3, 8, this.hvf);
    parama.by(4, this.ibI);
    parama.d(5, 8, this.ibJ);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    return i + b.a.a.a.br(2, this.ibH) + b.a.a.a.c(3, 8, this.hvf) + b.a.a.a.br(4, this.ibI) + b.a.a.a.c(5, 8, this.ibJ);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.lc
 * JD-Core Version:    0.6.2
 */