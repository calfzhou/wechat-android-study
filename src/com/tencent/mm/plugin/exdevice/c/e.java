package com.tencent.mm.plugin.exdevice.c;

public final class e extends com.tencent.mm.ao.a
{
  public String eJA;
  public int eJz;

  public static boolean a(b.a.a.a.a parama, e parame, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      parame.eJz = parama.bel();
      return true;
    case 2:
    }
    parame.eJA = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.eJz);
    if (this.eJA != null)
      parama.I(2, this.eJA);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.eJz);
    if (this.eJA != null)
      i += b.a.a.b.b.a.J(2, this.eJA);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.c.e
 * JD-Core Version:    0.6.2
 */