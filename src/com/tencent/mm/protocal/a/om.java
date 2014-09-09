package com.tencent.mm.protocal.a;

public final class om extends com.tencent.mm.ao.a
{
  public String hVX;
  public String ier;
  public String ies;

  public static boolean a(b.a.a.a.a parama, om paramom, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramom.hVX = parama.ben();
      return true;
    case 2:
      paramom.ier = parama.ben();
      return true;
    case 3:
    }
    paramom.ies = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hVX != null)
      parama.I(1, this.hVX);
    if (this.ier != null)
      parama.I(2, this.ier);
    if (this.ies != null)
      parama.I(3, this.ies);
  }

  public final om bO(byte[] paramArrayOfByte)
  {
    b.a.a.a.a locala = new b.a.a.a.a(paramArrayOfByte, hre);
    for (int i = locala.bet(); i > 0; i = locala.bet())
      if (!a(locala, this, i))
        locala.beu();
    return this;
  }

  public final int hD()
  {
    String str = this.hVX;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hVX);
    if (this.ier != null)
      i += b.a.a.b.b.a.J(2, this.ier);
    if (this.ies != null)
      i += b.a.a.b.b.a.J(3, this.ies);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.om
 * JD-Core Version:    0.6.2
 */