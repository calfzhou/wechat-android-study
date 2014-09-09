package com.tencent.mm.protocal.a;

public final class rk extends com.tencent.mm.ao.a
{
  public String cCD;
  public int hOG;
  public String ihl;

  public static boolean a(b.a.a.a.a parama, rk paramrk, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramrk.ihl = parama.ben();
      return true;
    case 2:
      paramrk.cCD = parama.ben();
      return true;
    case 3:
    }
    paramrk.hOG = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.ihl != null)
      parama.I(1, this.ihl);
    if (this.cCD != null)
      parama.I(2, this.cCD);
    parama.by(3, this.hOG);
  }

  public final int hD()
  {
    String str = this.ihl;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.ihl);
    if (this.cCD != null)
      i += b.a.a.b.b.a.J(2, this.cCD);
    return i + b.a.a.a.br(3, this.hOG);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.rk
 * JD-Core Version:    0.6.2
 */