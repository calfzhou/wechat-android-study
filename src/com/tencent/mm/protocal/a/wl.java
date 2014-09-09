package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class wl extends vn
{
  public int ewb;
  public String hWN;
  public int inz;
  public aeg iqV;
  public acd iqW;

  public final void a(b.a.a.c.a parama)
  {
    if (this.iqV == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hWN != null)
      parama.I(2, this.hWN);
    parama.by(3, this.ewb);
    if (this.iqV != null)
    {
      parama.bv(4, this.iqV.hD());
      this.iqV.a(parama);
    }
    parama.by(5, this.inz);
    if (this.iqW != null)
    {
      parama.bv(6, this.iqW.hD());
      this.iqW.a(parama);
    }
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hWN != null)
      i += b.a.a.b.b.a.J(2, this.hWN);
    int j = i + b.a.a.a.br(3, this.ewb);
    if (this.iqV != null)
      j += b.a.a.a.bs(4, this.iqV.hD());
    int k = j + b.a.a.a.br(5, this.inz);
    if (this.iqW != null)
      k += b.a.a.a.bs(6, this.iqW.hD());
    return k;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.wl
 * JD-Core Version:    0.6.2
 */