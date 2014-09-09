package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class hm extends vo
{
  public int hOA;
  public LinkedList hOB = new LinkedList();
  public String hVL;
  public String hVg;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRz == null)
      throw new b("Not all required fields were included");
    if (this.hRz != null)
    {
      parama.bv(1, this.hRz.hD());
      this.hRz.a(parama);
    }
    if (this.hVL != null)
      parama.I(2, this.hVL);
    parama.by(3, this.hOA);
    parama.d(4, 8, this.hOB);
    if (this.hVg != null)
      parama.I(5, this.hVg);
  }

  public final int hD()
  {
    bb localbb = this.hRz;
    int i = 0;
    if (localbb != null)
      i = 0 + b.a.a.a.bs(1, this.hRz.hD());
    if (this.hVL != null)
      i += b.a.a.b.b.a.J(2, this.hVL);
    int j = i + b.a.a.a.br(3, this.hOA) + b.a.a.a.c(4, 8, this.hOB);
    if (this.hVg != null)
      j += b.a.a.b.b.a.J(5, this.hVg);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.hm
 * JD-Core Version:    0.6.2
 */