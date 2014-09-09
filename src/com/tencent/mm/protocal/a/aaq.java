package com.tencent.mm.protocal.a;

public final class aaq extends com.tencent.mm.ao.a
{
  public String gnq;
  public String hwV;

  public static boolean a(b.a.a.a.a parama, aaq paramaaq, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramaaq.gnq = parama.ben();
      return true;
    case 2:
    }
    paramaaq.hwV = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.gnq != null)
      parama.I(1, this.gnq);
    if (this.hwV != null)
      parama.I(2, this.hwV);
  }

  public final int hD()
  {
    String str = this.gnq;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.gnq);
    if (this.hwV != null)
      i += b.a.a.b.b.a.J(2, this.hwV);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aaq
 * JD-Core Version:    0.6.2
 */