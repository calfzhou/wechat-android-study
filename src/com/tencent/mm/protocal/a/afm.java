package com.tencent.mm.protocal.a;

import b.a.a.b;
import java.util.LinkedList;

public final class afm extends vn
{
  public int hWC;
  public long hWD;
  public int isa;
  public String isy;
  public afs ixD;
  public afs ixE;
  public long ixH;
  public int ixV;
  public int ixW;
  public int iyb;
  public LinkedList iyc = new LinkedList();
  public int iyd;
  public int iye;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.ixD == null) || (this.ixE == null))
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.isy != null)
      parama.I(2, this.isy);
    parama.by(3, this.iyb);
    parama.d(4, 8, this.iyc);
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
    parama.by(9, this.iyd);
    parama.by(10, this.hWC);
    parama.k(11, this.hWD);
    parama.by(12, this.ixV);
    parama.k(13, this.ixH);
    parama.by(14, this.iye);
    parama.by(15, this.ixW);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.isy != null)
      i += b.a.a.b.b.a.J(2, this.isy);
    int j = i + b.a.a.a.br(3, this.iyb) + b.a.a.a.c(4, 8, this.iyc);
    if (this.ixD != null)
      j += b.a.a.a.bs(6, this.ixD.hD());
    if (this.ixE != null)
      j += b.a.a.a.bs(7, this.ixE.hD());
    return j + b.a.a.a.br(8, this.isa) + b.a.a.a.br(9, this.iyd) + b.a.a.a.br(10, this.hWC) + b.a.a.a.i(11, this.hWD) + b.a.a.a.br(12, this.ixV) + b.a.a.a.i(13, this.ixH) + b.a.a.a.br(14, this.iye) + b.a.a.a.br(15, this.ixW);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.afm
 * JD-Core Version:    0.6.2
 */