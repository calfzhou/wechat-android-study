package com.tencent.mm.protocal.a;

public final class gj extends com.tencent.mm.ao.a
{
  public int Height;
  public int Width;
  public String hVU;
  public String hVV;

  public static boolean a(b.a.a.a.a parama, gj paramgj, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramgj.hVU = parama.ben();
      return true;
    case 2:
      paramgj.Width = parama.bel();
      return true;
    case 3:
      paramgj.Height = parama.bel();
      return true;
    case 4:
    }
    paramgj.hVV = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hVU != null)
      parama.I(1, this.hVU);
    parama.by(2, this.Width);
    parama.by(3, this.Height);
    if (this.hVV != null)
      parama.I(4, this.hVV);
  }

  public final int hD()
  {
    String str = this.hVU;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hVU);
    int j = i + b.a.a.a.br(2, this.Width) + b.a.a.a.br(3, this.Height);
    if (this.hVV != null)
      j += b.a.a.b.b.a.J(4, this.hVV);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.gj
 * JD-Core Version:    0.6.2
 */