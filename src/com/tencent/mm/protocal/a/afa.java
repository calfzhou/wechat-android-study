package com.tencent.mm.protocal.a;

public final class afa extends vn
{
  public int hWC;
  public long hWD;
  public int isa;
  public String isy;
  public afs ixD;
  public afs ixE;
  public long ixH;
  public int ixL;
  public int ixM;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.isy != null)
      parama.I(2, this.isy);
    parama.by(3, this.hWC);
    parama.by(4, this.ixL);
    if (this.ixD != null)
    {
      parama.bv(5, this.ixD.hD());
      this.ixD.a(parama);
    }
    if (this.ixE != null)
    {
      parama.bv(6, this.ixE.hD());
      this.ixE.a(parama);
    }
    parama.k(7, this.hWD);
    parama.by(8, this.isa);
    parama.k(9, this.ixH);
    parama.by(10, this.ixM);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.isy != null)
      i += b.a.a.b.b.a.J(2, this.isy);
    int j = i + b.a.a.a.br(3, this.hWC) + b.a.a.a.br(4, this.ixL);
    if (this.ixD != null)
      j += b.a.a.a.bs(5, this.ixD.hD());
    if (this.ixE != null)
      j += b.a.a.a.bs(6, this.ixE.hD());
    return j + b.a.a.a.i(7, this.hWD) + b.a.a.a.br(8, this.isa) + b.a.a.a.i(9, this.ixH) + b.a.a.a.br(10, this.ixM);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.afa
 * JD-Core Version:    0.6.2
 */