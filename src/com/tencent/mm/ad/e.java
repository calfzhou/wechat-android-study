package com.tencent.mm.ad;

public final class e extends com.tencent.mm.ao.a
{
  public String dAn;
  public String dAo;

  public static boolean a(b.a.a.a.a parama, e parame, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      parame.dAn = parama.ben();
      return true;
    case 2:
    }
    parame.dAo = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.dAn != null)
      parama.I(1, this.dAn);
    if (this.dAo != null)
      parama.I(2, this.dAo);
  }

  public final int hD()
  {
    String str = this.dAn;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.dAn);
    if (this.dAo != null)
      i += b.a.a.b.b.a.J(2, this.dAo);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ad.e
 * JD-Core Version:    0.6.2
 */