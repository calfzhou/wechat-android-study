package com.tencent.mm.protocal.a;

public final class gp extends com.tencent.mm.ao.a
{
  public String fxH;
  public String hSc;
  public String hWA;
  public String hWc;
  public String hWd;
  public String hWe;
  public String hWf;
  public int hWg;
  public int hWh;
  public String hWk;
  public int hWl;
  public String hWm;
  public String hWn;
  public String hWo;
  public String hWp;
  public String hWu;
  public int hWx;
  public String hWy;
  public String hWz;

  public static boolean a(b.a.a.a.a parama, gp paramgp, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramgp.hSc = parama.ben();
      return true;
    case 2:
      paramgp.fxH = parama.ben();
      return true;
    case 3:
      paramgp.hWc = parama.ben();
      return true;
    case 4:
      paramgp.hWd = parama.ben();
      return true;
    case 5:
      paramgp.hWe = parama.ben();
      return true;
    case 6:
      paramgp.hWf = parama.ben();
      return true;
    case 7:
      paramgp.hWg = parama.bel();
      return true;
    case 8:
      paramgp.hWh = parama.bel();
      return true;
    case 9:
      paramgp.hWk = parama.ben();
      return true;
    case 10:
      paramgp.hWl = parama.bel();
      return true;
    case 11:
      paramgp.hWm = parama.ben();
      return true;
    case 12:
      paramgp.hWx = parama.bel();
      return true;
    case 13:
      paramgp.hWp = parama.ben();
      return true;
    case 14:
      paramgp.hWn = parama.ben();
      return true;
    case 15:
      paramgp.hWo = parama.ben();
      return true;
    case 16:
      paramgp.hWy = parama.ben();
      return true;
    case 17:
      paramgp.hWu = parama.ben();
      return true;
    case 18:
      paramgp.hWz = parama.ben();
      return true;
    case 19:
    }
    paramgp.hWA = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hSc != null)
      parama.I(1, this.hSc);
    if (this.fxH != null)
      parama.I(2, this.fxH);
    if (this.hWc != null)
      parama.I(3, this.hWc);
    if (this.hWd != null)
      parama.I(4, this.hWd);
    if (this.hWe != null)
      parama.I(5, this.hWe);
    if (this.hWf != null)
      parama.I(6, this.hWf);
    parama.by(7, this.hWg);
    parama.by(8, this.hWh);
    if (this.hWk != null)
      parama.I(9, this.hWk);
    parama.by(10, this.hWl);
    if (this.hWm != null)
      parama.I(11, this.hWm);
    parama.by(12, this.hWx);
    if (this.hWp != null)
      parama.I(13, this.hWp);
    if (this.hWn != null)
      parama.I(14, this.hWn);
    if (this.hWo != null)
      parama.I(15, this.hWo);
    if (this.hWy != null)
      parama.I(16, this.hWy);
    if (this.hWu != null)
      parama.I(17, this.hWu);
    if (this.hWz != null)
      parama.I(18, this.hWz);
    if (this.hWA != null)
      parama.I(19, this.hWA);
  }

  public final int hD()
  {
    String str = this.hSc;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hSc);
    if (this.fxH != null)
      i += b.a.a.b.b.a.J(2, this.fxH);
    if (this.hWc != null)
      i += b.a.a.b.b.a.J(3, this.hWc);
    if (this.hWd != null)
      i += b.a.a.b.b.a.J(4, this.hWd);
    if (this.hWe != null)
      i += b.a.a.b.b.a.J(5, this.hWe);
    if (this.hWf != null)
      i += b.a.a.b.b.a.J(6, this.hWf);
    int j = i + b.a.a.a.br(7, this.hWg) + b.a.a.a.br(8, this.hWh);
    if (this.hWk != null)
      j += b.a.a.b.b.a.J(9, this.hWk);
    int k = j + b.a.a.a.br(10, this.hWl);
    if (this.hWm != null)
      k += b.a.a.b.b.a.J(11, this.hWm);
    int m = k + b.a.a.a.br(12, this.hWx);
    if (this.hWp != null)
      m += b.a.a.b.b.a.J(13, this.hWp);
    if (this.hWn != null)
      m += b.a.a.b.b.a.J(14, this.hWn);
    if (this.hWo != null)
      m += b.a.a.b.b.a.J(15, this.hWo);
    if (this.hWy != null)
      m += b.a.a.b.b.a.J(16, this.hWy);
    if (this.hWu != null)
      m += b.a.a.b.b.a.J(17, this.hWu);
    if (this.hWz != null)
      m += b.a.a.b.b.a.J(18, this.hWz);
    if (this.hWA != null)
      m += b.a.a.b.b.a.J(19, this.hWA);
    return m;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.gp
 * JD-Core Version:    0.6.2
 */