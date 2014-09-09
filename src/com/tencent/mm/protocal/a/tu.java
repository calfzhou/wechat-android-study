package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class tu extends vn
{
  public int hQF;
  public int ioJ;
  public LinkedList ioK = new LinkedList();

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hQF);
    parama.by(3, this.ioJ);
    parama.d(4, 8, this.ioK);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    return i + b.a.a.a.br(2, this.hQF) + b.a.a.a.br(3, this.ioJ) + b.a.a.a.c(4, 8, this.ioK);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.tu
 * JD-Core Version:    0.6.2
 */