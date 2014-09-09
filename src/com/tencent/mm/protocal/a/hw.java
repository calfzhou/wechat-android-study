package com.tencent.mm.protocal.a;

public final class hw extends com.tencent.mm.ao.a
{
  public int dZy;
  public int hOF;
  public int hOG;
  public int hOH;
  public int hOI;
  public String hOM;

  public static boolean a(b.a.a.a.a parama, hw paramhw, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramhw.hOF = parama.bel();
      return true;
    case 2:
      paramhw.dZy = parama.bel();
      return true;
    case 3:
      paramhw.hOM = parama.ben();
      return true;
    case 4:
      paramhw.hOG = parama.bel();
      return true;
    case 5:
      paramhw.hOH = parama.bel();
      return true;
    case 6:
    }
    paramhw.hOI = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.hOF);
    parama.by(2, this.dZy);
    if (this.hOM != null)
      parama.I(3, this.hOM);
    parama.by(4, this.hOG);
    parama.by(5, this.hOH);
    parama.by(6, this.hOI);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hOF) + b.a.a.a.br(2, this.dZy);
    if (this.hOM != null)
      i += b.a.a.b.b.a.J(3, this.hOM);
    return i + b.a.a.a.br(4, this.hOG) + b.a.a.a.br(5, this.hOH) + b.a.a.a.br(6, this.hOI);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.hw
 * JD-Core Version:    0.6.2
 */