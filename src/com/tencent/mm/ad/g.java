package com.tencent.mm.ad;

public final class g extends com.tencent.mm.ao.a
{
  public int dAk;
  public int dAr;
  public int dAs;

  public static boolean a(b.a.a.a.a parama, g paramg, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramg.dAk = parama.bel();
      return true;
    case 2:
      paramg.dAr = parama.bel();
      return true;
    case 3:
    }
    paramg.dAs = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.dAk);
    parama.by(2, this.dAr);
    parama.by(3, this.dAs);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.dAk) + b.a.a.a.br(2, this.dAr) + b.a.a.a.br(3, this.dAs);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ad.g
 * JD-Core Version:    0.6.2
 */