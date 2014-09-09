package com.tencent.mm.protocal.a;

public final class py extends com.tencent.mm.ao.a
{
  public String ifG;
  public String ifH;

  public static boolean a(b.a.a.a.a parama, py parampy, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      parampy.ifG = parama.ben();
      return true;
    case 2:
    }
    parampy.ifH = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.ifG != null)
      parama.I(1, this.ifG);
    if (this.ifH != null)
      parama.I(2, this.ifH);
  }

  public final int hD()
  {
    String str = this.ifG;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.ifG);
    if (this.ifH != null)
      i += b.a.a.b.b.a.J(2, this.ifH);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.py
 * JD-Core Version:    0.6.2
 */