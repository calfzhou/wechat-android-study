package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class wm extends vo
{
  public String hTm;
  public int huF;
  public LinkedList iqX = new LinkedList();
  public int iqY;
  public acd iqZ;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRz == null)
      throw new b("Not all required fields were included");
    if (this.hRz != null)
    {
      parama.bv(1, this.hRz.hD());
      this.hRz.a(parama);
    }
    parama.by(2, this.huF);
    parama.d(3, 8, this.iqX);
    if (this.hTm != null)
      parama.I(4, this.hTm);
    parama.by(5, this.iqY);
    if (this.iqZ != null)
    {
      parama.bv(6, this.iqZ.hD());
      this.iqZ.a(parama);
    }
  }

  public final int hD()
  {
    bb localbb = this.hRz;
    int i = 0;
    if (localbb != null)
      i = 0 + b.a.a.a.bs(1, this.hRz.hD());
    int j = i + b.a.a.a.br(2, this.huF) + b.a.a.a.c(3, 8, this.iqX);
    if (this.hTm != null)
      j += b.a.a.b.b.a.J(4, this.hTm);
    int k = j + b.a.a.a.br(5, this.iqY);
    if (this.iqZ != null)
      k += b.a.a.a.bs(6, this.iqZ.hD());
    return k;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.wm
 * JD-Core Version:    0.6.2
 */