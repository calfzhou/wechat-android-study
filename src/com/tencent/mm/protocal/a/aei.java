package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class aei extends vn
{
  public int hOA;
  public LinkedList hOB = new LinkedList();
  public String hSc;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hSc != null)
      parama.I(2, this.hSc);
    parama.by(3, this.hOA);
    parama.d(4, 8, this.hOB);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hSc != null)
      i += b.a.a.b.b.a.J(2, this.hSc);
    return i + b.a.a.a.br(3, this.hOA) + b.a.a.a.c(4, 8, this.hOB);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aei
 * JD-Core Version:    0.6.2
 */