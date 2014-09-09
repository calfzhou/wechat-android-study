package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class ey extends vn
{
  public int hOA;
  public LinkedList hOB = new LinkedList();
  public String hVg;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hOA);
    parama.d(3, 8, this.hOB);
    if (this.hVg != null)
      parama.I(4, this.hVg);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hOA) + b.a.a.a.c(3, 8, this.hOB);
    if (this.hVg != null)
      j += b.a.a.b.b.a.J(4, this.hVg);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ey
 * JD-Core Version:    0.6.2
 */