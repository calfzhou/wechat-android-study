package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class j extends vn
{
  public int hOA;
  public LinkedList hOB = new LinkedList();
  public vt hOC;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hOC == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hOA);
    parama.d(3, 8, this.hOB);
    if (this.hOC != null)
    {
      parama.bv(4, this.hOC.hD());
      this.hOC.a(parama);
    }
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hOA) + b.a.a.a.c(3, 8, this.hOB);
    if (this.hOC != null)
      j += b.a.a.a.bs(4, this.hOC.hD());
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.j
 * JD-Core Version:    0.6.2
 */