package com.tencent.mm.protocal.a;

public final class u extends com.tencent.mm.ao.a
{
  public String cCD;
  public String hPg;

  public static boolean a(b.a.a.a.a parama, u paramu, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramu.cCD = parama.ben();
      return true;
    case 2:
    }
    paramu.hPg = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.cCD != null)
      parama.I(1, this.cCD);
    if (this.hPg != null)
      parama.I(2, this.hPg);
  }

  public final u aZ(byte[] paramArrayOfByte)
  {
    b.a.a.a.a locala = new b.a.a.a.a(paramArrayOfByte, hre);
    for (int i = locala.bet(); i > 0; i = locala.bet())
      if (!a(locala, this, i))
        locala.beu();
    return this;
  }

  public final int hD()
  {
    String str = this.cCD;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.cCD);
    if (this.hPg != null)
      i += b.a.a.b.b.a.J(2, this.hPg);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.u
 * JD-Core Version:    0.6.2
 */