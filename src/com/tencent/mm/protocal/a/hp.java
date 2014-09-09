package com.tencent.mm.protocal.a;

public final class hp extends com.tencent.mm.ao.a
{
  public int dZy;
  public int hQm;
  public String hTB;
  public String hTC;
  public String hTD;
  public int hTE;
  public String hXo;
  public String hXp;
  public String hXs;
  public int hXt;

  public static boolean a(b.a.a.a.a parama, hp paramhp, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramhp.hTB = parama.ben();
      return true;
    case 2:
      paramhp.hTC = parama.ben();
      return true;
    case 3:
      paramhp.hTD = parama.ben();
      return true;
    case 4:
      paramhp.hTE = parama.bel();
      return true;
    case 5:
      paramhp.hXo = parama.ben();
      return true;
    case 6:
      paramhp.hXp = parama.ben();
      return true;
    case 7:
      paramhp.hQm = parama.bel();
      return true;
    case 8:
      paramhp.hXs = parama.ben();
      return true;
    case 9:
      paramhp.dZy = parama.bel();
      return true;
    case 10:
    }
    paramhp.hXt = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hTB != null)
      parama.I(1, this.hTB);
    if (this.hTC != null)
      parama.I(2, this.hTC);
    if (this.hTD != null)
      parama.I(3, this.hTD);
    parama.by(4, this.hTE);
    if (this.hXo != null)
      parama.I(5, this.hXo);
    if (this.hXp != null)
      parama.I(6, this.hXp);
    parama.by(7, this.hQm);
    if (this.hXs != null)
      parama.I(8, this.hXs);
    parama.by(9, this.dZy);
    parama.by(10, this.hXt);
  }

  public final int hD()
  {
    String str = this.hTB;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hTB);
    if (this.hTC != null)
      i += b.a.a.b.b.a.J(2, this.hTC);
    if (this.hTD != null)
      i += b.a.a.b.b.a.J(3, this.hTD);
    int j = i + b.a.a.a.br(4, this.hTE);
    if (this.hXo != null)
      j += b.a.a.b.b.a.J(5, this.hXo);
    if (this.hXp != null)
      j += b.a.a.b.b.a.J(6, this.hXp);
    int k = j + b.a.a.a.br(7, this.hQm);
    if (this.hXs != null)
      k += b.a.a.b.b.a.J(8, this.hXs);
    return k + b.a.a.a.br(9, this.dZy) + b.a.a.a.br(10, this.hXt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.hp
 * JD-Core Version:    0.6.2
 */