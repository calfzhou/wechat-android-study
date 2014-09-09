package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class aaf extends vn
{
  public int hQF;
  public LinkedList hQc = new LinkedList();
  public int huF;
  public String imz;
  public long itu;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hQF);
    parama.k(3, this.itu);
    if (this.imz != null)
      parama.I(4, this.imz);
    parama.by(5, this.huF);
    parama.d(6, 8, this.hQc);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hQF) + b.a.a.a.i(3, this.itu);
    if (this.imz != null)
      j += b.a.a.b.b.a.J(4, this.imz);
    return j + b.a.a.a.br(5, this.huF) + b.a.a.a.c(6, 8, this.hQc);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aaf
 * JD-Core Version:    0.6.2
 */