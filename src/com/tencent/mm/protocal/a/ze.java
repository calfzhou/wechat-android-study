package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class ze extends com.tencent.mm.ao.a
{
  public int hTi;
  public String hTk;
  public s icm;
  public LinkedList isu = new LinkedList();
  public hh isv;
  public LinkedList isw = new LinkedList();
  public int isx;

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.hTi);
    parama.d(2, 8, this.isu);
    if (this.isv != null)
    {
      parama.bv(3, this.isv.hD());
      this.isv.a(parama);
    }
    if (this.icm != null)
    {
      parama.bv(4, this.icm.hD());
      this.icm.a(parama);
    }
    parama.d(5, 8, this.isw);
    parama.by(6, this.isx);
    if (this.hTk != null)
      parama.I(7, this.hTk);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hTi) + b.a.a.a.c(2, 8, this.isu);
    if (this.isv != null)
      i += b.a.a.a.bs(3, this.isv.hD());
    if (this.icm != null)
      i += b.a.a.a.bs(4, this.icm.hD());
    int j = i + b.a.a.a.c(5, 8, this.isw) + b.a.a.a.br(6, this.isx);
    if (this.hTk != null)
      j += b.a.a.b.b.a.J(7, this.hTk);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ze
 * JD-Core Version:    0.6.2
 */