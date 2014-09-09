package com.tencent.mm.protocal.a;

public final class uc extends com.tencent.mm.ao.a
{
  public String hwQ;
  public String ipb;

  public static boolean a(b.a.a.a.a parama, uc paramuc, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramuc.ipb = parama.ben();
      return true;
    case 2:
    }
    paramuc.hwQ = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.ipb != null)
      parama.I(1, this.ipb);
    if (this.hwQ != null)
      parama.I(2, this.hwQ);
  }

  public final int hD()
  {
    String str = this.ipb;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.ipb);
    if (this.hwQ != null)
      i += b.a.a.b.b.a.J(2, this.hwQ);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.uc
 * JD-Core Version:    0.6.2
 */