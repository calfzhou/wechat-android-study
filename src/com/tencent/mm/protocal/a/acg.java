package com.tencent.mm.protocal.a;

public final class acg extends com.tencent.mm.ao.a
{
  public int hQw;
  public int ivO;
  public String ivR;

  public static boolean a(b.a.a.a.a parama, acg paramacg, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramacg.ivO = parama.bel();
      return true;
    case 2:
      paramacg.ivR = parama.ben();
      return true;
    case 3:
    }
    paramacg.hQw = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.ivO);
    if (this.ivR != null)
      parama.I(2, this.ivR);
    parama.by(3, this.hQw);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.ivO);
    if (this.ivR != null)
      i += b.a.a.b.b.a.J(2, this.ivR);
    return i + b.a.a.a.br(3, this.hQw);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.acg
 * JD-Core Version:    0.6.2
 */