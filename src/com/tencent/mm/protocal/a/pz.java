package com.tencent.mm.protocal.a;

public class pz extends com.tencent.mm.ao.a
{
  public int hUm;
  public int hUn;
  public int huF;
  public String ifH;
  public int ifI;

  public static boolean a(b.a.a.a.a parama, pz parampz, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      parampz.ifI = parama.bel();
      return true;
    case 2:
      parampz.ifH = parama.ben();
      return true;
    case 3:
      parampz.hUm = parama.bel();
      return true;
    case 4:
      parampz.hUn = parama.bel();
      return true;
    case 5:
    }
    parampz.huF = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.ifI);
    if (this.ifH != null)
      parama.I(2, this.ifH);
    parama.by(3, this.hUm);
    parama.by(4, this.hUn);
    parama.by(5, this.huF);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.ifI);
    if (this.ifH != null)
      i += b.a.a.b.b.a.J(2, this.ifH);
    return i + b.a.a.a.br(3, this.hUm) + b.a.a.a.br(4, this.hUn) + b.a.a.a.br(5, this.huF);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.pz
 * JD-Core Version:    0.6.2
 */