package com.tencent.mm.protocal.a;

public final class oo extends com.tencent.mm.ao.a
{
  public String iev;
  public int iew;
  public int iex;

  public static boolean a(b.a.a.a.a parama, oo paramoo, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramoo.iev = parama.ben();
      return true;
    case 2:
      paramoo.iew = parama.bel();
      return true;
    case 3:
    }
    paramoo.iex = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.iev != null)
      parama.I(1, this.iev);
    parama.by(2, this.iew);
    parama.by(3, this.iex);
  }

  public final int hD()
  {
    String str = this.iev;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.iev);
    return i + b.a.a.a.br(2, this.iew) + b.a.a.a.br(3, this.iex);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.oo
 * JD-Core Version:    0.6.2
 */