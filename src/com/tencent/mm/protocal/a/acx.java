package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class acx extends vn
{
  public int ewb;
  public String gnq;
  public String hOd;
  public int hPr;
  public ws hQi;
  public int hQk;
  public int hQs;
  public int hUu;
  public String hVM;
  public String iwd;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hQi == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hOd != null)
      parama.I(2, this.hOd);
    parama.by(3, this.hPr);
    if (this.iwd != null)
      parama.I(4, this.iwd);
    if (this.gnq != null)
      parama.I(5, this.gnq);
    parama.by(6, this.hQk);
    parama.by(7, this.hUu);
    parama.by(8, this.hQs);
    if (this.hQi != null)
    {
      parama.bv(9, this.hQi.hD());
      this.hQi.a(parama);
    }
    parama.by(10, this.ewb);
    if (this.hVM != null)
      parama.I(11, this.hVM);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hOd != null)
      i += b.a.a.b.b.a.J(2, this.hOd);
    int j = i + b.a.a.a.br(3, this.hPr);
    if (this.iwd != null)
      j += b.a.a.b.b.a.J(4, this.iwd);
    if (this.gnq != null)
      j += b.a.a.b.b.a.J(5, this.gnq);
    int k = j + b.a.a.a.br(6, this.hQk) + b.a.a.a.br(7, this.hUu) + b.a.a.a.br(8, this.hQs);
    if (this.hQi != null)
      k += b.a.a.a.bs(9, this.hQi.hD());
    int m = k + b.a.a.a.br(10, this.ewb);
    if (this.hVM != null)
      m += b.a.a.b.b.a.J(11, this.hVM);
    return m;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.acx
 * JD-Core Version:    0.6.2
 */