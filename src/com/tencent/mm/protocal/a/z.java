package com.tencent.mm.protocal.a;

public final class z extends com.tencent.mm.ao.a
{
  public String hPo;
  public String hPp;

  public static boolean a(b.a.a.a.a parama, z paramz, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramz.hPo = parama.ben();
      return true;
    case 2:
    }
    paramz.hPp = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hPo != null)
      parama.I(1, this.hPo);
    if (this.hPp != null)
      parama.I(2, this.hPp);
  }

  public final int hD()
  {
    String str = this.hPo;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hPo);
    if (this.hPp != null)
      i += b.a.a.b.b.a.J(2, this.hPp);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.z
 * JD-Core Version:    0.6.2
 */