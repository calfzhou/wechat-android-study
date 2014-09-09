package com.tencent.mm.protocal.a;

public final class qc extends com.tencent.mm.ao.a
{
  public int hPS;
  public String ifH;

  public static boolean a(b.a.a.a.a parama, qc paramqc, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramqc.hPS = parama.bel();
      return true;
    case 2:
    }
    paramqc.ifH = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.hPS);
    if (this.ifH != null)
      parama.I(2, this.ifH);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hPS);
    if (this.ifH != null)
      i += b.a.a.b.b.a.J(2, this.ifH);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.qc
 * JD-Core Version:    0.6.2
 */