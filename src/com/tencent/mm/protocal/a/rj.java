package com.tencent.mm.protocal.a;

public final class rj extends com.tencent.mm.ao.a
{
  public String cJO;
  public String igQ;
  public String igR;
  public String igS;
  public String igT;
  public String igU;
  public int igV;
  public int igW;
  public String igZ;
  public int iha;
  public int ihc;
  public String ihd;
  public int ihf;
  public int ihg;
  public int ihh;
  public String ihi;
  public String ihj;
  public String ihk;

  public static boolean a(b.a.a.a.a parama, rj paramrj, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramrj.cJO = parama.ben();
      return true;
    case 20:
      paramrj.igQ = parama.ben();
      return true;
    case 21:
      paramrj.igR = parama.ben();
      return true;
    case 22:
      paramrj.igS = parama.ben();
      return true;
    case 23:
      paramrj.igT = parama.ben();
      return true;
    case 31:
      paramrj.igU = parama.ben();
      return true;
    case 32:
      paramrj.igV = parama.bel();
      return true;
    case 33:
      paramrj.igW = parama.bel();
      return true;
    case 34:
      paramrj.igZ = parama.ben();
      return true;
    case 35:
      paramrj.iha = parama.bel();
      return true;
    case 36:
      paramrj.ihc = parama.bel();
      return true;
    case 37:
      paramrj.ihd = parama.ben();
      return true;
    case 200:
      paramrj.ihf = parama.bel();
      return true;
    case 201:
      paramrj.ihg = parama.bel();
      return true;
    case 202:
      paramrj.ihh = parama.bel();
      return true;
    case 203:
      paramrj.ihi = parama.ben();
      return true;
    case 204:
      paramrj.ihj = parama.ben();
      return true;
    case 205:
    }
    paramrj.ihk = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.cJO != null)
      parama.I(1, this.cJO);
    if (this.igQ != null)
      parama.I(20, this.igQ);
    if (this.igR != null)
      parama.I(21, this.igR);
    if (this.igS != null)
      parama.I(22, this.igS);
    if (this.igT != null)
      parama.I(23, this.igT);
    if (this.igU != null)
      parama.I(31, this.igU);
    parama.by(32, this.igV);
    parama.by(33, this.igW);
    if (this.igZ != null)
      parama.I(34, this.igZ);
    parama.by(35, this.iha);
    parama.by(36, this.ihc);
    if (this.ihd != null)
      parama.I(37, this.ihd);
    parama.by(200, this.ihf);
    parama.by(201, this.ihg);
    parama.by(202, this.ihh);
    if (this.ihi != null)
      parama.I(203, this.ihi);
    if (this.ihj != null)
      parama.I(204, this.ihj);
    if (this.ihk != null)
      parama.I(205, this.ihk);
  }

  public final int hD()
  {
    String str = this.cJO;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.cJO);
    if (this.igQ != null)
      i += b.a.a.b.b.a.J(20, this.igQ);
    if (this.igR != null)
      i += b.a.a.b.b.a.J(21, this.igR);
    if (this.igS != null)
      i += b.a.a.b.b.a.J(22, this.igS);
    if (this.igT != null)
      i += b.a.a.b.b.a.J(23, this.igT);
    if (this.igU != null)
      i += b.a.a.b.b.a.J(31, this.igU);
    int j = i + b.a.a.a.br(32, this.igV) + b.a.a.a.br(33, this.igW);
    if (this.igZ != null)
      j += b.a.a.b.b.a.J(34, this.igZ);
    int k = j + b.a.a.a.br(35, this.iha) + b.a.a.a.br(36, this.ihc);
    if (this.ihd != null)
      k += b.a.a.b.b.a.J(37, this.ihd);
    int m = k + b.a.a.a.br(200, this.ihf) + b.a.a.a.br(201, this.ihg) + b.a.a.a.br(202, this.ihh);
    if (this.ihi != null)
      m += b.a.a.b.b.a.J(203, this.ihi);
    if (this.ihj != null)
      m += b.a.a.b.b.a.J(204, this.ihj);
    if (this.ihk != null)
      m += b.a.a.b.b.a.J(205, this.ihk);
    return m;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.rj
 * JD-Core Version:    0.6.2
 */