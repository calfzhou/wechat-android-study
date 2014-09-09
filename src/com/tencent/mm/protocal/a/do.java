package com.tencent.mm.protocal.a;

import java.util.LinkedList;

public final class do extends vn
{
  public int hOi;
  public String hPs;
  public int hPv;
  public String hTI;
  public int hTJ;
  public LinkedList hTK = new LinkedList();
  public String hTL;
  public String hTM;
  public String hsT;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hPv);
    if (this.hPs != null)
      parama.I(3, this.hPs);
    if (this.hTI != null)
      parama.I(4, this.hTI);
    if (this.hsT != null)
      parama.I(5, this.hsT);
    parama.by(6, this.hTJ);
    parama.d(7, 8, this.hTK);
    if (this.hTL != null)
      parama.I(8, this.hTL);
    if (this.hTM != null)
      parama.I(9, this.hTM);
    parama.by(10, this.hOi);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hPv);
    if (this.hPs != null)
      j += b.a.a.b.b.a.J(3, this.hPs);
    if (this.hTI != null)
      j += b.a.a.b.b.a.J(4, this.hTI);
    if (this.hsT != null)
      j += b.a.a.b.b.a.J(5, this.hsT);
    int k = j + b.a.a.a.br(6, this.hTJ) + b.a.a.a.c(7, 8, this.hTK);
    if (this.hTL != null)
      k += b.a.a.b.b.a.J(8, this.hTL);
    if (this.hTM != null)
      k += b.a.a.b.b.a.J(9, this.hTM);
    return k + b.a.a.a.br(10, this.hOi);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.do
 * JD-Core Version:    0.6.2
 */