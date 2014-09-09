package com.tencent.mm.protocal.a;

public final class ay extends vn
{
  public String hPI;
  public int hPJ;
  public String hPt;
  public al hQr;
  public int hQs;
  public ws hQt;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hPI != null)
      parama.I(2, this.hPI);
    if (this.hPt != null)
      parama.I(3, this.hPt);
    if (this.hQr != null)
    {
      parama.bv(4, this.hQr.hD());
      this.hQr.a(parama);
    }
    parama.by(5, this.hPJ);
    parama.by(6, this.hQs);
    if (this.hQt != null)
    {
      parama.bv(7, this.hQt.hD());
      this.hQt.a(parama);
    }
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hPI != null)
      i += b.a.a.b.b.a.J(2, this.hPI);
    if (this.hPt != null)
      i += b.a.a.b.b.a.J(3, this.hPt);
    if (this.hQr != null)
      i += b.a.a.a.bs(4, this.hQr.hD());
    int j = i + b.a.a.a.br(5, this.hPJ) + b.a.a.a.br(6, this.hQs);
    if (this.hQt != null)
      j += b.a.a.a.bs(7, this.hQt.hD());
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ay
 * JD-Core Version:    0.6.2
 */