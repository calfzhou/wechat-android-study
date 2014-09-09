package com.tencent.mm.protocal.a;

public final class hh extends com.tencent.mm.ao.a
{
  public String KH;
  public int hVq;
  public int hWU;
  public String hWo;

  public static boolean a(b.a.a.a.a parama, hh paramhh, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramhh.KH = parama.ben();
      return true;
    case 2:
      paramhh.hVq = parama.bel();
      return true;
    case 3:
      paramhh.hWo = parama.ben();
      return true;
    case 4:
    }
    paramhh.hWU = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.KH != null)
      parama.I(1, this.KH);
    parama.by(2, this.hVq);
    if (this.hWo != null)
      parama.I(3, this.hWo);
    parama.by(4, this.hWU);
  }

  public final int hD()
  {
    String str = this.KH;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.KH);
    int j = i + b.a.a.a.br(2, this.hVq);
    if (this.hWo != null)
      j += b.a.a.b.b.a.J(3, this.hWo);
    return j + b.a.a.a.br(4, this.hWU);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.hh
 * JD-Core Version:    0.6.2
 */