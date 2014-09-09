package com.tencent.mm.protocal.a;

public final class dw extends vn
{
  public int hOO;
  public long hOY;
  public int hQk;
  public String hTY;
  public aet hTZ;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hTY != null)
      parama.I(2, this.hTY);
    parama.by(3, this.hQk);
    parama.by(4, this.hOO);
    if (this.hTZ != null)
    {
      parama.bv(5, this.hTZ.hD());
      this.hTZ.a(parama);
    }
    parama.k(6, this.hOY);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hTY != null)
      i += b.a.a.b.b.a.J(2, this.hTY);
    int j = i + b.a.a.a.br(3, this.hQk) + b.a.a.a.br(4, this.hOO);
    if (this.hTZ != null)
      j += b.a.a.a.bs(5, this.hTZ.hD());
    return j + b.a.a.a.i(6, this.hOY);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.dw
 * JD-Core Version:    0.6.2
 */