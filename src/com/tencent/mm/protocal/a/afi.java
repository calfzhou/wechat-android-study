package com.tencent.mm.protocal.a;

public final class afi extends vn
{
  public int ewb;
  public int hWC;
  public long hWD;
  public long ixH;
  public String ixY;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hWC);
    parama.k(3, this.hWD);
    if (this.ixY != null)
      parama.I(4, this.ixY);
    parama.by(5, this.ewb);
    parama.k(6, this.ixH);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hWC) + b.a.a.a.i(3, this.hWD);
    if (this.ixY != null)
      j += b.a.a.b.b.a.J(4, this.ixY);
    return j + b.a.a.a.br(5, this.ewb) + b.a.a.a.i(6, this.ixH);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.afi
 * JD-Core Version:    0.6.2
 */