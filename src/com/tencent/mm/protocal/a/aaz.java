package com.tencent.mm.protocal.a;

public final class aaz extends com.tencent.mm.ao.a
{
  public int iuW;
  public int iuX;
  public int iuY;

  public static boolean a(b.a.a.a.a parama, aaz paramaaz, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramaaz.iuW = parama.bel();
      return true;
    case 2:
      paramaaz.iuX = parama.bel();
      return true;
    case 3:
    }
    paramaaz.iuY = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.iuW);
    parama.by(2, this.iuX);
    parama.by(3, this.iuY);
  }

  public final int hD()
  {
    return 0 + b.a.a.a.br(1, this.iuW) + b.a.a.a.br(2, this.iuX) + b.a.a.a.br(3, this.iuY);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aaz
 * JD-Core Version:    0.6.2
 */