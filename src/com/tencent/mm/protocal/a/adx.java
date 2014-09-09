package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class adx extends vn
{
  public int hOO;
  public String hOW;
  public long hOY;
  public String hPq;
  public String hPs;
  public String hPt;
  public int hQd;
  public int hQf;
  public int hQh;
  public ws hQi;
  public int hQj;
  public int hVH;
  public int ihE;
  public int iwK;
  public int iwL;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hQi == null)
      throw new b("Not all required fields were included");
    if (this.hPq != null)
      parama.I(1, this.hPq);
    if (this.hPs != null)
      parama.I(2, this.hPs);
    parama.by(3, this.hQd);
    parama.by(4, this.hQh);
    if (this.hPt != null)
      parama.I(5, this.hPt);
    parama.by(6, this.hOO);
    parama.by(7, this.hVH);
    if (this.hQi != null)
    {
      parama.bv(8, this.hQi.hD());
      this.hQi.a(parama);
    }
    parama.by(9, this.hQj);
    if (this.hRy != null)
    {
      parama.bv(10, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(11, this.hQf);
    if (this.hOW != null)
      parama.I(12, this.hOW);
    parama.by(13, this.ihE);
    parama.by(14, this.iwK);
    parama.by(15, this.iwL);
    parama.k(16, this.hOY);
  }

  public final int hD()
  {
    String str = this.hPq;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hPq);
    if (this.hPs != null)
      i += b.a.a.b.b.a.J(2, this.hPs);
    int j = i + b.a.a.a.br(3, this.hQd) + b.a.a.a.br(4, this.hQh);
    if (this.hPt != null)
      j += b.a.a.b.b.a.J(5, this.hPt);
    int k = j + b.a.a.a.br(6, this.hOO) + b.a.a.a.br(7, this.hVH);
    if (this.hQi != null)
      k += b.a.a.a.bs(8, this.hQi.hD());
    int m = k + b.a.a.a.br(9, this.hQj);
    if (this.hRy != null)
      m += b.a.a.a.bs(10, this.hRy.hD());
    int n = m + b.a.a.a.br(11, this.hQf);
    if (this.hOW != null)
      n += b.a.a.b.b.a.J(12, this.hOW);
    return n + b.a.a.a.br(13, this.ihE) + b.a.a.a.br(14, this.iwK) + b.a.a.a.br(15, this.iwL) + b.a.a.a.i(16, this.hOY);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.adx
 * JD-Core Version:    0.6.2
 */