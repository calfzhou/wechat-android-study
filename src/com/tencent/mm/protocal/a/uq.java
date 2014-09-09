package com.tencent.mm.protocal.a;

public final class uq extends com.tencent.mm.ao.a
{
  public int hWU;
  public String ifG;

  public static boolean a(b.a.a.a.a parama, uq paramuq, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramuq.ifG = parama.ben();
      return true;
    case 2:
    }
    paramuq.hWU = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.ifG != null)
      parama.I(1, this.ifG);
    parama.by(2, this.hWU);
  }

  public final int hD()
  {
    String str = this.ifG;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.ifG);
    return i + b.a.a.a.br(2, this.hWU);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.uq
 * JD-Core Version:    0.6.2
 */