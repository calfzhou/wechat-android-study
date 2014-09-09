package com.tencent.mm.protocal.a;

public final class sq extends com.tencent.mm.ao.a
{
  public int ewb;
  public String ifH;
  public String imA;
  public String imz;

  public static boolean a(b.a.a.a.a parama, sq paramsq, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramsq.imz = parama.ben();
      return true;
    case 2:
      paramsq.imA = parama.ben();
      return true;
    case 3:
      paramsq.ifH = parama.ben();
      return true;
    case 4:
    }
    paramsq.ewb = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.imz != null)
      parama.I(1, this.imz);
    if (this.imA != null)
      parama.I(2, this.imA);
    if (this.ifH != null)
      parama.I(3, this.ifH);
    parama.by(4, this.ewb);
  }

  public final int hD()
  {
    String str = this.imz;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.imz);
    if (this.imA != null)
      i += b.a.a.b.b.a.J(2, this.imA);
    if (this.ifH != null)
      i += b.a.a.b.b.a.J(3, this.ifH);
    return i + b.a.a.a.br(4, this.ewb);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.sq
 * JD-Core Version:    0.6.2
 */