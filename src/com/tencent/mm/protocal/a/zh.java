package com.tencent.mm.protocal.a;

public final class zh extends com.tencent.mm.ao.a
{
  public int ewb;
  public String hOh;

  public static boolean a(b.a.a.a.a parama, zh paramzh, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramzh.hOh = parama.ben();
      return true;
    case 2:
    }
    paramzh.ewb = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hOh != null)
      parama.I(1, this.hOh);
    parama.by(2, this.ewb);
  }

  public final int hD()
  {
    String str = this.hOh;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hOh);
    return i + b.a.a.a.br(2, this.ewb);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.zh
 * JD-Core Version:    0.6.2
 */