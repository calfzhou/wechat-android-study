package com.tencent.mm.protocal.a;

public final class ue extends vn
{
  public String hOd;
  public String hTR;
  public String hTS;
  public String hTT;
  public String hTU;
  public String iai;
  public String ify;
  public String ipd;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hOd != null)
      parama.I(2, this.hOd);
    if (this.ipd != null)
      parama.I(3, this.ipd);
    if (this.iai != null)
      parama.I(4, this.iai);
    if (this.hTR != null)
      parama.I(5, this.hTR);
    if (this.ify != null)
      parama.I(6, this.ify);
    if (this.hTS != null)
      parama.I(7, this.hTS);
    if (this.hTT != null)
      parama.I(8, this.hTT);
    if (this.hTU != null)
      parama.I(9, this.hTU);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hOd != null)
      i += b.a.a.b.b.a.J(2, this.hOd);
    if (this.ipd != null)
      i += b.a.a.b.b.a.J(3, this.ipd);
    if (this.iai != null)
      i += b.a.a.b.b.a.J(4, this.iai);
    if (this.hTR != null)
      i += b.a.a.b.b.a.J(5, this.hTR);
    if (this.ify != null)
      i += b.a.a.b.b.a.J(6, this.ify);
    if (this.hTS != null)
      i += b.a.a.b.b.a.J(7, this.hTS);
    if (this.hTT != null)
      i += b.a.a.b.b.a.J(8, this.hTT);
    if (this.hTU != null)
      i += b.a.a.b.b.a.J(9, this.hTU);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ue
 * JD-Core Version:    0.6.2
 */