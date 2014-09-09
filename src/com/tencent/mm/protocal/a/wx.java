package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class wx extends vn
{
  public int hOi;
  public us iro;
  public float irp;
  public float irq;

  public final void a(b.a.a.c.a parama)
  {
    if (this.iro == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.iro != null)
    {
      parama.bv(2, this.iro.hD());
      this.iro.a(parama);
    }
    parama.by(3, this.hOi);
    parama.c(4, this.irp);
    parama.c(5, this.irq);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.iro != null)
      i += b.a.a.a.bs(2, this.iro.hD());
    int j = i + b.a.a.a.br(3, this.hOi);
    int k = j + (4 + b.a.a.b.b.a.rV(4));
    return k + (4 + b.a.a.b.b.a.rV(5));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.wx
 * JD-Core Version:    0.6.2
 */