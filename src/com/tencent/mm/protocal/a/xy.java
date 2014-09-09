package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class xy extends vn
{
  public String fxG;
  public String irL;
  public int irM;
  public LinkedList irN = new LinkedList();
  public String irO;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.irL != null)
      parama.I(2, this.irL);
    parama.by(3, this.irM);
    parama.d(4, 8, this.irN);
    if (this.irO != null)
      parama.I(5, this.irO);
    if (this.fxG != null)
      parama.I(6, this.fxG);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.irL != null)
      i += b.a.a.b.b.a.J(2, this.irL);
    int j = i + b.a.a.a.br(3, this.irM) + b.a.a.a.c(4, 8, this.irN);
    if (this.irO != null)
      j += b.a.a.b.b.a.J(5, this.irO);
    if (this.fxG != null)
      j += b.a.a.b.b.a.J(6, this.fxG);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.xy
 * JD-Core Version:    0.6.2
 */