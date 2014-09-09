package com.tencent.mm.protocal.a;

public final class gk extends com.tencent.mm.ao.a
{
  public String hOh;
  public int hUV;
  public String hVW;

  public static boolean a(b.a.a.a.a parama, gk paramgk, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramgk.hOh = parama.ben();
      return true;
    case 2:
      paramgk.hVW = parama.ben();
      return true;
    case 3:
    }
    paramgk.hUV = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hOh != null)
      parama.I(1, this.hOh);
    if (this.hVW != null)
      parama.I(2, this.hVW);
    parama.by(3, this.hUV);
  }

  public final int hD()
  {
    String str = this.hOh;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hOh);
    if (this.hVW != null)
      i += b.a.a.b.b.a.J(2, this.hVW);
    return i + b.a.a.a.br(3, this.hUV);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.gk
 * JD-Core Version:    0.6.2
 */