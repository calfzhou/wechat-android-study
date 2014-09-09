package com.tencent.mm.protocal.a;

public final class gc extends com.tencent.mm.ao.a
{
  public int ewb;
  public int hAN;
  public int hAO;
  public int huF;

  public static boolean a(b.a.a.a.a parama, gc paramgc, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramgc.ewb = parama.bel();
      return true;
    case 2:
      paramgc.huF = parama.bel();
      return true;
    case 3:
      paramgc.hAN = parama.bel();
      return true;
    case 4:
    }
    paramgc.hAO = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.ewb);
    parama.by(2, this.huF);
    parama.by(3, this.hAN);
    parama.by(4, this.hAO);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.ewb) + b.a.a.a.br(2, this.huF) + b.a.a.a.br(3, this.hAN) + b.a.a.a.br(4, this.hAO);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.gc
 * JD-Core Version:    0.6.2
 */