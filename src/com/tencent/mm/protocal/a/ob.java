package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class ob extends vn
{
  public int hOi;
  public String hsT;
  public LinkedList hvf = new LinkedList();
  public int ibH;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hsT != null)
      parama.I(2, this.hsT);
    parama.by(3, this.ibH);
    parama.d(4, 8, this.hvf);
    parama.by(5, this.hOi);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hsT != null)
      i += b.a.a.b.b.a.J(2, this.hsT);
    return i + b.a.a.a.br(3, this.ibH) + b.a.a.a.c(4, 8, this.hvf) + b.a.a.a.br(5, this.hOi);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ob
 * JD-Core Version:    0.6.2
 */