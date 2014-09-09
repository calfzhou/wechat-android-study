package com.tencent.mm.protocal.a;

public final class fo extends com.tencent.mm.ao.a
{
  public String cCD;
  public int hVq;

  public static boolean a(b.a.a.a.a parama, fo paramfo, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramfo.cCD = parama.ben();
      return true;
    case 2:
    }
    paramfo.hVq = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.cCD != null)
      parama.I(1, this.cCD);
    parama.by(2, this.hVq);
  }

  public final int hD()
  {
    String str = this.cCD;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.cCD);
    return i + b.a.a.a.br(2, this.hVq);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.fo
 * JD-Core Version:    0.6.2
 */