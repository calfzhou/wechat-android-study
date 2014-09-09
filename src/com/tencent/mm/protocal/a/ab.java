package com.tencent.mm.protocal.a;

public final class ab extends com.tencent.mm.ao.a
{
  public String hPx;
  public String hsT;

  public static boolean a(b.a.a.a.a parama, ab paramab, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramab.hsT = parama.ben();
      return true;
    case 2:
    }
    paramab.hPx = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hsT != null)
      parama.I(1, this.hsT);
    if (this.hPx != null)
      parama.I(2, this.hPx);
  }

  public final int hD()
  {
    String str = this.hsT;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hsT);
    if (this.hPx != null)
      i += b.a.a.b.b.a.J(2, this.hPx);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ab
 * JD-Core Version:    0.6.2
 */