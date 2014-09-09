package com.tencent.mm.protocal.a;

public final class ut extends com.tencent.mm.ao.a
{
  public double KL;
  public double KM;
  public double ipD;

  public static boolean a(b.a.a.a.a parama, ut paramut, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramut.KL = parama.bep();
      return true;
    case 2:
      paramut.KM = parama.bep();
      return true;
    case 3:
    }
    paramut.ipD = parama.bep();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.a(1, this.KL);
    parama.a(2, this.KM);
    parama.a(3, this.ipD);
  }

  public final int hD()
  {
    int i = 0 + (8 + b.a.a.b.b.a.rV(1));
    int j = i + (8 + b.a.a.b.b.a.rV(2));
    return j + (8 + b.a.a.b.b.a.rV(3));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ut
 * JD-Core Version:    0.6.2
 */