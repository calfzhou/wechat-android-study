package com.tencent.mm.protocal.a;

public final class aev extends com.tencent.mm.ao.a
{
  public int hQj;
  public int ixA;
  public String ixB;

  public static boolean a(b.a.a.a.a parama, aev paramaev, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramaev.ixA = parama.bel();
      return true;
    case 2:
      paramaev.hQj = parama.bel();
      return true;
    case 3:
    }
    paramaev.ixB = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.ixA);
    parama.by(2, this.hQj);
    if (this.ixB != null)
      parama.I(3, this.ixB);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.ixA) + b.a.a.a.br(2, this.hQj);
    if (this.ixB != null)
      i += b.a.a.b.b.a.J(3, this.ixB);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aev
 * JD-Core Version:    0.6.2
 */