package com.tencent.mm.protocal.a;

public final class oy extends com.tencent.mm.ao.a
{
  public String ieD;
  public String ieE;

  public static boolean a(b.a.a.a.a parama, oy paramoy, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramoy.ieD = parama.ben();
      return true;
    case 2:
    }
    paramoy.ieE = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.ieD != null)
      parama.I(1, this.ieD);
    if (this.ieE != null)
      parama.I(2, this.ieE);
  }

  public final int hD()
  {
    String str = this.ieD;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.ieD);
    if (this.ieE != null)
      i += b.a.a.b.b.a.J(2, this.ieE);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.oy
 * JD-Core Version:    0.6.2
 */