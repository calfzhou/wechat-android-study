package com.tencent.mm.protocal.a;

public final class adn extends com.tencent.mm.ao.a
{
  public String gnq;
  public String hXr;
  public String hwV;

  public static boolean a(b.a.a.a.a parama, adn paramadn, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramadn.gnq = parama.ben();
      return true;
    case 2:
      paramadn.hwV = parama.ben();
      return true;
    case 3:
    }
    paramadn.hXr = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.gnq != null)
      parama.I(1, this.gnq);
    if (this.hwV != null)
      parama.I(2, this.hwV);
    if (this.hXr != null)
      parama.I(3, this.hXr);
  }

  public final int hD()
  {
    String str = this.gnq;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.gnq);
    if (this.hwV != null)
      i += b.a.a.b.b.a.J(2, this.hwV);
    if (this.hXr != null)
      i += b.a.a.b.b.a.J(3, this.hXr);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.adn
 * JD-Core Version:    0.6.2
 */