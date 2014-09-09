package com.tencent.mm.protocal.a;

public final class oz extends com.tencent.mm.ao.a
{
  public String ieF;
  public String ieG;
  public String ieH;
  public String ieI;
  public int ieJ;
  public int ieK;
  public int ieL;
  public int ieM;
  public String ieN;

  public static boolean a(b.a.a.a.a parama, oz paramoz, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramoz.ieF = parama.ben();
      return true;
    case 2:
      paramoz.ieG = parama.ben();
      return true;
    case 3:
      paramoz.ieH = parama.ben();
      return true;
    case 4:
      paramoz.ieI = parama.ben();
      return true;
    case 5:
      paramoz.ieJ = parama.bel();
      return true;
    case 6:
      paramoz.ieK = parama.bel();
      return true;
    case 7:
      paramoz.ieL = parama.bel();
      return true;
    case 8:
      paramoz.ieM = parama.bel();
      return true;
    case 9:
    }
    paramoz.ieN = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.ieF != null)
      parama.I(1, this.ieF);
    if (this.ieG != null)
      parama.I(2, this.ieG);
    if (this.ieH != null)
      parama.I(3, this.ieH);
    if (this.ieI != null)
      parama.I(4, this.ieI);
    parama.by(5, this.ieJ);
    parama.by(6, this.ieK);
    parama.by(7, this.ieL);
    parama.by(8, this.ieM);
    if (this.ieN != null)
      parama.I(9, this.ieN);
  }

  public final int hD()
  {
    String str = this.ieF;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.ieF);
    if (this.ieG != null)
      i += b.a.a.b.b.a.J(2, this.ieG);
    if (this.ieH != null)
      i += b.a.a.b.b.a.J(3, this.ieH);
    if (this.ieI != null)
      i += b.a.a.b.b.a.J(4, this.ieI);
    int j = i + b.a.a.a.br(5, this.ieJ) + b.a.a.a.br(6, this.ieK) + b.a.a.a.br(7, this.ieL) + b.a.a.a.br(8, this.ieM);
    if (this.ieN != null)
      j += b.a.a.b.b.a.J(9, this.ieN);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.oz
 * JD-Core Version:    0.6.2
 */