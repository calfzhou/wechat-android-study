package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class lo extends vn
{
  public int huF;
  public LinkedList iaG = new LinkedList();
  public String icb;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.huF);
    parama.d(3, 8, this.iaG);
    if (this.icb != null)
      parama.I(4, this.icb);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.huF) + b.a.a.a.c(3, 8, this.iaG);
    if (this.icb != null)
      j += b.a.a.b.b.a.J(4, this.icb);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.lo
 * JD-Core Version:    0.6.2
 */