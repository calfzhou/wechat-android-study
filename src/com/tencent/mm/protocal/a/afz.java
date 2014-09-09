package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class afz extends vn
{
  public int hTp;
  public ws hTq;
  public int hWC;
  public long hWD;
  public String isy;
  public long ixH;
  public aff iyu;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hTq == null) || (this.iyu == null))
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.isy != null)
      parama.I(2, this.isy);
    parama.by(3, this.hWC);
    if (this.hTq != null)
    {
      parama.bv(4, this.hTq.hD());
      this.hTq.a(parama);
    }
    if (this.iyu != null)
    {
      parama.bv(5, this.iyu.hD());
      this.iyu.a(parama);
    }
    parama.k(6, this.hWD);
    parama.by(7, this.hTp);
    parama.k(8, this.ixH);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.isy != null)
      i += b.a.a.b.b.a.J(2, this.isy);
    int j = i + b.a.a.a.br(3, this.hWC);
    if (this.hTq != null)
      j += b.a.a.a.bs(4, this.hTq.hD());
    if (this.iyu != null)
      j += b.a.a.a.bs(5, this.iyu.hD());
    return j + b.a.a.a.i(6, this.hWD) + b.a.a.a.br(7, this.hTp) + b.a.a.a.i(8, this.ixH);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.afz
 * JD-Core Version:    0.6.2
 */