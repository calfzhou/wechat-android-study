package com.tencent.mm.protocal.a;

public final class qg extends com.tencent.mm.ao.a
{
  public String hPf;
  public String hwQ;

  public static boolean a(b.a.a.a.a parama, qg paramqg, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramqg.hPf = parama.ben();
      return true;
    case 2:
    }
    paramqg.hwQ = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hPf != null)
      parama.I(1, this.hPf);
    if (this.hwQ != null)
      parama.I(2, this.hwQ);
  }

  public final int hD()
  {
    String str = this.hPf;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hPf);
    if (this.hwQ != null)
      i += b.a.a.b.b.a.J(2, this.hwQ);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.qg
 * JD-Core Version:    0.6.2
 */