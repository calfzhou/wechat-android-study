package com.tencent.mm.protocal.a;

public final class pd extends com.tencent.mm.ao.a
{
  public String ifa;
  public String ifb;
  public int ifc;

  public static boolean a(b.a.a.a.a parama, pd parampd, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      parampd.ifa = parama.ben();
      return true;
    case 2:
      parampd.ifb = parama.ben();
      return true;
    case 3:
    }
    parampd.ifc = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.ifa != null)
      parama.I(1, this.ifa);
    if (this.ifb != null)
      parama.I(2, this.ifb);
    parama.by(3, this.ifc);
  }

  public final int hD()
  {
    String str = this.ifa;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.ifa);
    if (this.ifb != null)
      i += b.a.a.b.b.a.J(2, this.ifb);
    return i + b.a.a.a.br(3, this.ifc);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.pd
 * JD-Core Version:    0.6.2
 */