package com.tencent.mm.protocal.a;

public final class wi extends com.tencent.mm.ao.a
{
  public String hPa;
  public int iqQ;

  public static boolean a(b.a.a.a.a parama, wi paramwi, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramwi.iqQ = parama.bel();
      return true;
    case 2:
    }
    paramwi.hPa = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.iqQ);
    if (this.hPa != null)
      parama.I(2, this.hPa);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.iqQ);
    if (this.hPa != null)
      i += b.a.a.b.b.a.J(2, this.hPa);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.wi
 * JD-Core Version:    0.6.2
 */