package com.tencent.mm.protocal.a;

public final class cp extends com.tencent.mm.ao.a
{
  public int ewb;
  public String hOh;

  public static boolean a(b.a.a.a.a parama, cp paramcp, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramcp.ewb = parama.bel();
      return true;
    case 2:
    }
    paramcp.hOh = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.ewb);
    if (this.hOh != null)
      parama.I(2, this.hOh);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.ewb);
    if (this.hOh != null)
      i += b.a.a.b.b.a.J(2, this.hOh);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.cp
 * JD-Core Version:    0.6.2
 */