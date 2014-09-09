package com.tencent.mm.protocal.a;

public final class zc extends com.tencent.mm.ao.a
{
  public String hSF;
  public String ist;

  public static boolean a(b.a.a.a.a parama, zc paramzc, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramzc.hSF = parama.ben();
      return true;
    case 2:
    }
    paramzc.ist = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hSF != null)
      parama.I(1, this.hSF);
    if (this.ist != null)
      parama.I(2, this.ist);
  }

  public final int hD()
  {
    String str = this.hSF;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hSF);
    if (this.ist != null)
      i += b.a.a.b.b.a.J(2, this.ist);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.zc
 * JD-Core Version:    0.6.2
 */