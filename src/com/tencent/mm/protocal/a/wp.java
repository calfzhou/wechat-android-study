package com.tencent.mm.protocal.a;

public final class wp extends vn
{
  public int hOV;
  public String hPq;
  public String hPs;
  public String hPt;
  public int irc;
  public int ird;
  public int ire;
  public long irf;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hPt != null)
      parama.I(2, this.hPt);
    parama.by(3, this.irc);
    parama.by(4, this.hOV);
    parama.by(5, this.ird);
    if (this.hPq != null)
      parama.I(6, this.hPq);
    if (this.hPs != null)
      parama.I(7, this.hPs);
    parama.by(8, this.ire);
    parama.k(9, this.irf);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hPt != null)
      i += b.a.a.b.b.a.J(2, this.hPt);
    int j = i + b.a.a.a.br(3, this.irc) + b.a.a.a.br(4, this.hOV) + b.a.a.a.br(5, this.ird);
    if (this.hPq != null)
      j += b.a.a.b.b.a.J(6, this.hPq);
    if (this.hPs != null)
      j += b.a.a.b.b.a.J(7, this.hPs);
    return j + b.a.a.a.br(8, this.ire) + b.a.a.a.i(9, this.irf);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.wp
 * JD-Core Version:    0.6.2
 */