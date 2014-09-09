package com.tencent.mm.protocal.a;

public final class kd extends vn
{
  public String epw;
  public String iaQ;
  public int iaR;
  public String iaS;
  public String iaT;
  public String iaU;
  public String iaV;
  public int time_stamp;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.iaQ != null)
      parama.I(2, this.iaQ);
    parama.by(3, this.iaR);
    if (this.iaS != null)
      parama.I(4, this.iaS);
    if (this.iaT != null)
      parama.I(5, this.iaT);
    parama.by(6, this.time_stamp);
    if (this.iaU != null)
      parama.I(7, this.iaU);
    if (this.epw != null)
      parama.I(8, this.epw);
    if (this.iaV != null)
      parama.I(9, this.iaV);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.iaQ != null)
      i += b.a.a.b.b.a.J(2, this.iaQ);
    int j = i + b.a.a.a.br(3, this.iaR);
    if (this.iaS != null)
      j += b.a.a.b.b.a.J(4, this.iaS);
    if (this.iaT != null)
      j += b.a.a.b.b.a.J(5, this.iaT);
    int k = j + b.a.a.a.br(6, this.time_stamp);
    if (this.iaU != null)
      k += b.a.a.b.b.a.J(7, this.iaU);
    if (this.epw != null)
      k += b.a.a.b.b.a.J(8, this.epw);
    if (this.iaV != null)
      k += b.a.a.b.b.a.J(9, this.iaV);
    return k;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.kd
 * JD-Core Version:    0.6.2
 */