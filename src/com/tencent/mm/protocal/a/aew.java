package com.tencent.mm.protocal.a;

public final class aew extends vn
{
  public int hWC;
  public long hWD;
  public int isa;
  public String isy;
  public int ixC;
  public afs ixD;
  public afs ixE;
  public String ixF;
  public int ixG;
  public long ixH;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hWC);
    parama.k(3, this.hWD);
    if (this.isy != null)
      parama.I(4, this.isy);
    parama.by(5, this.ixC);
    if (this.ixD != null)
    {
      parama.bv(6, this.ixD.hD());
      this.ixD.a(parama);
    }
    if (this.ixE != null)
    {
      parama.bv(7, this.ixE.hD());
      this.ixE.a(parama);
    }
    parama.by(8, this.isa);
    if (this.ixF != null)
      parama.I(9, this.ixF);
    parama.by(10, this.ixG);
    parama.k(11, this.ixH);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hWC) + b.a.a.a.i(3, this.hWD);
    if (this.isy != null)
      j += b.a.a.b.b.a.J(4, this.isy);
    int k = j + b.a.a.a.br(5, this.ixC);
    if (this.ixD != null)
      k += b.a.a.a.bs(6, this.ixD.hD());
    if (this.ixE != null)
      k += b.a.a.a.bs(7, this.ixE.hD());
    int m = k + b.a.a.a.br(8, this.isa);
    if (this.ixF != null)
      m += b.a.a.b.b.a.J(9, this.ixF);
    return m + b.a.a.a.br(10, this.ixG) + b.a.a.a.i(11, this.ixH);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aew
 * JD-Core Version:    0.6.2
 */