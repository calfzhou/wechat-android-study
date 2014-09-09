package com.tencent.mm.protocal.a;

public final class aa extends com.tencent.mm.ao.a
{
  public int ewb;
  public String fxG;
  public int hOV;
  public String hOW;
  public String hOd;
  public String hPq;
  public int hPr;
  public String hPs;
  public String hPt;
  public ws hPu;
  public int hPv;
  public int hPw;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hPq != null)
      parama.I(1, this.hPq);
    if (this.hOd != null)
      parama.I(2, this.hOd);
    parama.by(3, this.hPr);
    if (this.hPs != null)
      parama.I(4, this.hPs);
    parama.by(5, this.ewb);
    if (this.fxG != null)
      parama.I(6, this.fxG);
    parama.by(7, this.hOV);
    if (this.hPt != null)
      parama.I(8, this.hPt);
    if (this.hPu != null)
    {
      parama.bv(9, this.hPu.hD());
      this.hPu.a(parama);
    }
    parama.by(10, this.hPv);
    parama.by(11, this.hPw);
    if (this.hOW != null)
      parama.I(12, this.hOW);
  }

  public final int hD()
  {
    String str = this.hPq;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hPq);
    if (this.hOd != null)
      i += b.a.a.b.b.a.J(2, this.hOd);
    int j = i + b.a.a.a.br(3, this.hPr);
    if (this.hPs != null)
      j += b.a.a.b.b.a.J(4, this.hPs);
    int k = j + b.a.a.a.br(5, this.ewb);
    if (this.fxG != null)
      k += b.a.a.b.b.a.J(6, this.fxG);
    int m = k + b.a.a.a.br(7, this.hOV);
    if (this.hPt != null)
      m += b.a.a.b.b.a.J(8, this.hPt);
    if (this.hPu != null)
      m += b.a.a.a.bs(9, this.hPu.hD());
    int n = m + b.a.a.a.br(10, this.hPv) + b.a.a.a.br(11, this.hPw);
    if (this.hOW != null)
      n += b.a.a.b.b.a.J(12, this.hOW);
    return n;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aa
 * JD-Core Version:    0.6.2
 */