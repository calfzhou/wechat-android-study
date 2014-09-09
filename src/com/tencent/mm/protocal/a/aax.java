package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class aax extends vn
{
  public String hPq;
  public String hPs;
  public String hPt;
  public int iuO;
  public int iuP;
  public LinkedList iuQ = new LinkedList();
  public aaw iuR;
  public int iuS;
  public LinkedList iuT = new LinkedList();

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.iuO);
    if (this.hPq != null)
      parama.I(3, this.hPq);
    if (this.hPs != null)
      parama.I(4, this.hPs);
    if (this.hPt != null)
      parama.I(5, this.hPt);
    parama.by(6, this.iuP);
    parama.d(7, 8, this.iuQ);
    if (this.iuR != null)
    {
      parama.bv(8, this.iuR.hD());
      this.iuR.a(parama);
    }
    parama.by(9, this.iuS);
    parama.d(10, 8, this.iuT);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.iuO);
    if (this.hPq != null)
      j += b.a.a.b.b.a.J(3, this.hPq);
    if (this.hPs != null)
      j += b.a.a.b.b.a.J(4, this.hPs);
    if (this.hPt != null)
      j += b.a.a.b.b.a.J(5, this.hPt);
    int k = j + b.a.a.a.br(6, this.iuP) + b.a.a.a.c(7, 8, this.iuQ);
    if (this.iuR != null)
      k += b.a.a.a.bs(8, this.iuR.hD());
    return k + b.a.a.a.br(9, this.iuS) + b.a.a.a.c(10, 8, this.iuT);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aax
 * JD-Core Version:    0.6.2
 */