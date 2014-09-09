package com.tencent.mm.protocal.a;

public final class aec extends com.tencent.mm.ao.a
{
  public String gnq;
  public int hEN;
  public int hEP;

  public static boolean a(b.a.a.a.a parama, aec paramaec, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramaec.gnq = parama.ben();
      return true;
    case 2:
      paramaec.hEN = parama.bel();
      return true;
    case 3:
    }
    paramaec.hEP = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.gnq != null)
      parama.I(1, this.gnq);
    parama.by(2, this.hEN);
    parama.by(3, this.hEP);
  }

  public final int hD()
  {
    String str = this.gnq;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.gnq);
    return i + b.a.a.a.br(2, this.hEN) + b.a.a.a.br(3, this.hEP);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aec
 * JD-Core Version:    0.6.2
 */