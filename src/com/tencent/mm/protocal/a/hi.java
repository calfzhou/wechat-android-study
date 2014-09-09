package com.tencent.mm.protocal.a;

public final class hi extends com.tencent.mm.ao.a
{
  public String KH;
  public long hWV;
  public int hWW;

  public static boolean a(b.a.a.a.a parama, hi paramhi, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramhi.hWV = parama.ber();
      return true;
    case 2:
      paramhi.KH = parama.ben();
      return true;
    case 3:
    }
    paramhi.hWW = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.k(1, this.hWV);
    if (this.KH != null)
      parama.I(2, this.KH);
    parama.by(3, this.hWW);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.i(1, this.hWV);
    if (this.KH != null)
      i += b.a.a.b.b.a.J(2, this.KH);
    return i + b.a.a.a.br(3, this.hWW);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.hi
 * JD-Core Version:    0.6.2
 */