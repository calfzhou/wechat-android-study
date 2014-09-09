package com.tencent.mm.protocal.a;

public final class g extends com.tencent.mm.ao.a
{
  public String KH;
  public int ewb;
  public String fxF;
  public String fxG;
  public String fxH;

  public static boolean a(b.a.a.a.a parama, g paramg, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramg.KH = parama.ben();
      return true;
    case 2:
      paramg.fxF = parama.ben();
      return true;
    case 3:
      paramg.ewb = parama.bel();
      return true;
    case 4:
      paramg.fxG = parama.ben();
      return true;
    case 5:
    }
    paramg.fxH = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.KH != null)
      parama.I(1, this.KH);
    if (this.fxF != null)
      parama.I(2, this.fxF);
    parama.by(3, this.ewb);
    if (this.fxG != null)
      parama.I(4, this.fxG);
    if (this.fxH != null)
      parama.I(5, this.fxH);
  }

  public final int hD()
  {
    String str = this.KH;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.KH);
    if (this.fxF != null)
      i += b.a.a.b.b.a.J(2, this.fxF);
    int j = i + b.a.a.a.br(3, this.ewb);
    if (this.fxG != null)
      j += b.a.a.b.b.a.J(4, this.fxG);
    if (this.fxH != null)
      j += b.a.a.b.b.a.J(5, this.fxH);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.g
 * JD-Core Version:    0.6.2
 */