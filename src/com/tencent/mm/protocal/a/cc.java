package com.tencent.mm.protocal.a;

public final class cc extends com.tencent.mm.ao.a
{
  public String hRM;

  public static boolean a(b.a.a.a.a parama, cc paramcc, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
    }
    paramcc.hRM = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRM != null)
      parama.I(1, this.hRM);
  }

  public final int hD()
  {
    String str = this.hRM;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hRM);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.cc
 * JD-Core Version:    0.6.2
 */