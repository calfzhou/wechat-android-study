package com.tencent.mm.protocal.a;

public final class afp extends com.tencent.mm.ao.a
{
  public int ewb;
  public int iyk;
  public int iyl;
  public int iym;

  public static boolean a(b.a.a.a.a parama, afp paramafp, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramafp.ewb = parama.bel();
      return true;
    case 2:
      paramafp.iyk = parama.bel();
      return true;
    case 3:
      paramafp.iyl = parama.bel();
      return true;
    case 4:
    }
    paramafp.iym = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.ewb);
    parama.by(2, this.iyk);
    parama.by(3, this.iyl);
    parama.by(4, this.iym);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.ewb) + b.a.a.a.br(2, this.iyk) + b.a.a.a.br(3, this.iyl) + b.a.a.a.br(4, this.iym);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.afp
 * JD-Core Version:    0.6.2
 */