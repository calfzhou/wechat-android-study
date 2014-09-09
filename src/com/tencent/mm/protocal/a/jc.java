package com.tencent.mm.protocal.a;

public final class jc extends com.tencent.mm.ao.a
{
  public int iaa;
  public String iab;

  public static boolean a(b.a.a.a.a parama, jc paramjc, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramjc.iaa = parama.bel();
      return true;
    case 2:
    }
    paramjc.iab = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.iaa);
    if (this.iab != null)
      parama.I(2, this.iab);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.iaa);
    if (this.iab != null)
      i += b.a.a.b.b.a.J(2, this.iab);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.jc
 * JD-Core Version:    0.6.2
 */