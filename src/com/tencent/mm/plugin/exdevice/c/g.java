package com.tencent.mm.plugin.exdevice.c;

import b.a.a.b;

public final class g extends j
{
  public String dZp;
  public int eJD;
  public int eJE;
  public int eJF;
  public int eJG;
  public int eJH;
  public String eJI;
  public int eJJ;
  public String eJK;
  public int eJL;
  public int eJM;
  public String eJN;

  public final void a(b.a.a.c.a parama)
  {
    if (this.eJQ == null)
      throw new b("Not all required fields were included");
    if (this.eJQ != null)
    {
      parama.bv(1, this.eJQ.hD());
      this.eJQ.a(parama);
    }
    parama.by(2, this.eJD);
    parama.by(3, this.eJE);
    parama.by(4, this.eJF);
    parama.by(5, this.eJG);
    parama.by(6, this.eJH);
    if (this.eJI != null)
      parama.I(11, this.eJI);
    parama.by(12, this.eJJ);
    if (this.dZp != null)
      parama.I(13, this.dZp);
    if (this.eJK != null)
      parama.I(14, this.eJK);
    parama.by(15, this.eJL);
    parama.by(16, this.eJM);
    if (this.eJN != null)
      parama.I(17, this.eJN);
  }

  public final int hD()
  {
    e locale = this.eJQ;
    int i = 0;
    if (locale != null)
      i = 0 + b.a.a.a.bs(1, this.eJQ.hD());
    int j = i + b.a.a.a.br(2, this.eJD) + b.a.a.a.br(3, this.eJE) + b.a.a.a.br(4, this.eJF) + b.a.a.a.br(5, this.eJG) + b.a.a.a.br(6, this.eJH);
    if (this.eJI != null)
      j += b.a.a.b.b.a.J(11, this.eJI);
    int k = j + b.a.a.a.br(12, this.eJJ);
    if (this.dZp != null)
      k += b.a.a.b.b.a.J(13, this.dZp);
    if (this.eJK != null)
      k += b.a.a.b.b.a.J(14, this.eJK);
    int m = k + b.a.a.a.br(15, this.eJL) + b.a.a.a.br(16, this.eJM);
    if (this.eJN != null)
      m += b.a.a.b.b.a.J(17, this.eJN);
    return m;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.c.g
 * JD-Core Version:    0.6.2
 */