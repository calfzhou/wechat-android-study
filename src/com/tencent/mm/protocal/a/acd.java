package com.tencent.mm.protocal.a;

public final class acd extends com.tencent.mm.ao.a
{
  public String KH;
  public String KI;
  public double KL;
  public double KM;

  public static boolean a(b.a.a.a.a parama, acd paramacd, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramacd.KL = parama.bep();
      return true;
    case 2:
      paramacd.KM = parama.bep();
      return true;
    case 3:
      paramacd.KH = parama.ben();
      return true;
    case 4:
    }
    paramacd.KI = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.a(1, this.KL);
    parama.a(2, this.KM);
    if (this.KH != null)
      parama.I(3, this.KH);
    if (this.KI != null)
      parama.I(4, this.KI);
  }

  public final int hD()
  {
    int i = 0 + (8 + b.a.a.b.b.a.rV(1));
    int j = i + (8 + b.a.a.b.b.a.rV(2));
    if (this.KH != null)
      j += b.a.a.b.b.a.J(3, this.KH);
    if (this.KI != null)
      j += b.a.a.b.b.a.J(4, this.KI);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.acd
 * JD-Core Version:    0.6.2
 */