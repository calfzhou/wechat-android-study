package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class er extends vn
{
  public int hOA;
  public LinkedList hOB = new LinkedList();
  public int hOi;
  public vt hUW;
  public ws hUX;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hUW == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hUW != null)
    {
      parama.bv(2, this.hUW.hD());
      this.hUW.a(parama);
    }
    parama.by(3, this.hOA);
    parama.d(4, 8, this.hOB);
    parama.by(5, this.hOi);
    if (this.hUX != null)
    {
      parama.bv(6, this.hUX.hD());
      this.hUX.a(parama);
    }
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hUW != null)
      i += b.a.a.a.bs(2, this.hUW.hD());
    int j = i + b.a.a.a.br(3, this.hOA) + b.a.a.a.c(4, 8, this.hOB) + b.a.a.a.br(5, this.hOi);
    if (this.hUX != null)
      j += b.a.a.a.bs(6, this.hUX.hD());
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.er
 * JD-Core Version:    0.6.2
 */