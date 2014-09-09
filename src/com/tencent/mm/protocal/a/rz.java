package com.tencent.mm.protocal.a;

public final class rz extends com.tencent.mm.ao.a
{
  public int dZy;
  public String gnq;

  public static boolean a(b.a.a.a.a parama, rz paramrz, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramrz.gnq = parama.ben();
      return true;
    case 2:
    }
    paramrz.dZy = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.gnq != null)
      parama.I(1, this.gnq);
    parama.by(2, this.dZy);
  }

  public final int hD()
  {
    String str = this.gnq;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.gnq);
    return i + b.a.a.a.br(2, this.dZy);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.rz
 * JD-Core Version:    0.6.2
 */