package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class afc extends vn
{
  public String hPs;
  public int hWC;
  public long hWD;
  public String isy;
  public long ixH;
  public afv ixU;
  public int ixV;
  public int ixW;

  public final void a(b.a.a.c.a parama)
  {
    if (this.ixU == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.isy != null)
      parama.I(2, this.isy);
    parama.by(3, this.hWC);
    parama.k(4, this.hWD);
    if (this.hPs != null)
      parama.I(6, this.hPs);
    if (this.ixU != null)
    {
      parama.bv(8, this.ixU.hD());
      this.ixU.a(parama);
    }
    parama.by(9, this.ixV);
    parama.k(10, this.ixH);
    parama.by(11, this.ixW);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.isy != null)
      i += b.a.a.b.b.a.J(2, this.isy);
    int j = i + b.a.a.a.br(3, this.hWC) + b.a.a.a.i(4, this.hWD);
    if (this.hPs != null)
      j += b.a.a.b.b.a.J(6, this.hPs);
    if (this.ixU != null)
      j += b.a.a.a.bs(8, this.ixU.hD());
    return j + b.a.a.a.br(9, this.ixV) + b.a.a.a.i(10, this.ixH) + b.a.a.a.br(11, this.ixW);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.afc
 * JD-Core Version:    0.6.2
 */