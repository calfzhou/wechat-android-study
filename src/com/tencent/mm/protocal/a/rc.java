package com.tencent.mm.protocal.a;

public final class rc extends com.tencent.mm.ao.a
{
  public String Kt;
  public String eXy;
  public String gDt;
  public int gDu;
  public float hXd;
  public float hXe;
  public String igE;
  public String igJ;
  public int igK;
  public int igL;

  public static boolean a(b.a.a.a.a parama, rc paramrc, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramrc.hXd = parama.beq();
      return true;
    case 2:
      paramrc.hXe = parama.beq();
      return true;
    case 3:
      paramrc.Kt = parama.ben();
      return true;
    case 4:
      paramrc.eXy = parama.ben();
      return true;
    case 5:
      paramrc.gDt = parama.ben();
      return true;
    case 6:
      paramrc.igE = parama.ben();
      return true;
    case 7:
      paramrc.gDu = parama.bel();
      return true;
    case 8:
      paramrc.igJ = parama.ben();
      return true;
    case 9:
      paramrc.igK = parama.bel();
      return true;
    case 10:
    }
    paramrc.igL = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.c(1, this.hXd);
    parama.c(2, this.hXe);
    if (this.Kt != null)
      parama.I(3, this.Kt);
    if (this.eXy != null)
      parama.I(4, this.eXy);
    if (this.gDt != null)
      parama.I(5, this.gDt);
    if (this.igE != null)
      parama.I(6, this.igE);
    parama.by(7, this.gDu);
    if (this.igJ != null)
      parama.I(8, this.igJ);
    parama.by(9, this.igK);
    parama.by(10, this.igL);
  }

  public final int hD()
  {
    int i = 0 + (4 + b.a.a.b.b.a.rV(1));
    int j = i + (4 + b.a.a.b.b.a.rV(2));
    if (this.Kt != null)
      j += b.a.a.b.b.a.J(3, this.Kt);
    if (this.eXy != null)
      j += b.a.a.b.b.a.J(4, this.eXy);
    if (this.gDt != null)
      j += b.a.a.b.b.a.J(5, this.gDt);
    if (this.igE != null)
      j += b.a.a.b.b.a.J(6, this.igE);
    int k = j + b.a.a.a.br(7, this.gDu);
    if (this.igJ != null)
      k += b.a.a.b.b.a.J(8, this.igJ);
    return k + b.a.a.a.br(9, this.igK) + b.a.a.a.br(10, this.igL);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.rc
 * JD-Core Version:    0.6.2
 */