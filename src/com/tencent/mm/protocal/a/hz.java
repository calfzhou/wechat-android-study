package com.tencent.mm.protocal.a;

public final class hz extends com.tencent.mm.ao.a
{
  public String cCD;
  public int hEu;
  public String hwQ;

  public static boolean a(b.a.a.a.a parama, hz paramhz, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramhz.hEu = parama.bel();
      return true;
    case 2:
      paramhz.cCD = parama.ben();
      return true;
    case 3:
    }
    paramhz.hwQ = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.hEu);
    if (this.cCD != null)
      parama.I(2, this.cCD);
    if (this.hwQ != null)
      parama.I(3, this.hwQ);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hEu);
    if (this.cCD != null)
      i += b.a.a.b.b.a.J(2, this.cCD);
    if (this.hwQ != null)
      i += b.a.a.b.b.a.J(3, this.hwQ);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.hz
 * JD-Core Version:    0.6.2
 */