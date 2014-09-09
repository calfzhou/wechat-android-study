package com.tencent.mm.protocal.a;

public final class tk extends com.tencent.mm.ao.a
{
  public String gnq;
  public String hQG;
  public int hQv;
  public String hUE;
  public String hwV;
  public int iaa;
  public int ifp;
  public String iol;

  public static boolean a(b.a.a.a.a parama, tk paramtk, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramtk.hQv = parama.bel();
      return true;
    case 2:
      paramtk.hwV = parama.ben();
      return true;
    case 3:
      paramtk.hQG = parama.ben();
      return true;
    case 4:
      paramtk.hUE = parama.ben();
      return true;
    case 5:
      paramtk.gnq = parama.ben();
      return true;
    case 6:
      paramtk.ifp = parama.bel();
      return true;
    case 7:
      paramtk.iaa = parama.bel();
      return true;
    case 8:
    }
    paramtk.iol = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.hQv);
    if (this.hwV != null)
      parama.I(2, this.hwV);
    if (this.hQG != null)
      parama.I(3, this.hQG);
    if (this.hUE != null)
      parama.I(4, this.hUE);
    if (this.gnq != null)
      parama.I(5, this.gnq);
    parama.by(6, this.ifp);
    parama.by(7, this.iaa);
    if (this.iol != null)
      parama.I(8, this.iol);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hQv);
    if (this.hwV != null)
      i += b.a.a.b.b.a.J(2, this.hwV);
    if (this.hQG != null)
      i += b.a.a.b.b.a.J(3, this.hQG);
    if (this.hUE != null)
      i += b.a.a.b.b.a.J(4, this.hUE);
    if (this.gnq != null)
      i += b.a.a.b.b.a.J(5, this.gnq);
    int j = i + b.a.a.a.br(6, this.ifp) + b.a.a.a.br(7, this.iaa);
    if (this.iol != null)
      j += b.a.a.b.b.a.J(8, this.iol);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.tk
 * JD-Core Version:    0.6.2
 */