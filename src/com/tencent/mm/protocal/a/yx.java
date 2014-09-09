package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class yx extends vn
{
  public int hPr;
  public ws hQi;
  public int hQj;
  public int irY;
  public float irZ;
  public int isa;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hQi == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hQi != null)
    {
      parama.bv(2, this.hQi.hD());
      this.hQi.a(parama);
    }
    parama.by(3, this.irY);
    parama.by(4, this.hQj);
    parama.c(5, this.irZ);
    parama.by(6, this.isa);
    parama.by(7, this.hPr);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hQi != null)
      i += b.a.a.a.bs(2, this.hQi.hD());
    int j = i + b.a.a.a.br(3, this.irY) + b.a.a.a.br(4, this.hQj);
    return j + (4 + b.a.a.b.b.a.rV(5)) + b.a.a.a.br(6, this.isa) + b.a.a.a.br(7, this.hPr);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.yx
 * JD-Core Version:    0.6.2
 */