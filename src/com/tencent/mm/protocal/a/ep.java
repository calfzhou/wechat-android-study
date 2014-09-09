package com.tencent.mm.protocal.a;

public final class ep extends com.tencent.mm.ao.a
{
  public int dZy;
  public int hOO;
  public long hOY;
  public String hUU;
  public int hUV;

  public static boolean a(b.a.a.a.a parama, ep paramep, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramep.hOO = parama.bel();
      return true;
    case 2:
      paramep.hUU = parama.ben();
      return true;
    case 3:
      paramep.dZy = parama.bel();
      return true;
    case 4:
      paramep.hUV = parama.bel();
      return true;
    case 5:
    }
    paramep.hOY = parama.ber();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.hOO);
    if (this.hUU != null)
      parama.I(2, this.hUU);
    parama.by(3, this.dZy);
    parama.by(4, this.hUV);
    parama.k(5, this.hOY);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hOO);
    if (this.hUU != null)
      i += b.a.a.b.b.a.J(2, this.hUU);
    return i + b.a.a.a.br(3, this.dZy) + b.a.a.a.br(4, this.hUV) + b.a.a.a.i(5, this.hOY);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ep
 * JD-Core Version:    0.6.2
 */