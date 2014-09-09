package com.tencent.mm.protocal.a;

public final class tc extends com.tencent.mm.ao.a
{
  public String inn;
  public String ino;
  public int inp;
  public int inq;
  public int inr;
  public int ins;

  public static boolean a(b.a.a.a.a parama, tc paramtc, int paramInt)
  {
    switch (paramInt)
    {
    case 6:
    default:
      return false;
    case 1:
      paramtc.inn = parama.ben();
      return true;
    case 2:
      paramtc.ino = parama.ben();
      return true;
    case 3:
      paramtc.inp = parama.bel();
      return true;
    case 4:
      paramtc.inq = parama.bel();
      return true;
    case 5:
      paramtc.inr = parama.bel();
      return true;
    case 7:
    }
    paramtc.ins = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.inn != null)
      parama.I(1, this.inn);
    if (this.ino != null)
      parama.I(2, this.ino);
    parama.by(3, this.inp);
    parama.by(4, this.inq);
    parama.by(5, this.inr);
    parama.by(7, this.ins);
  }

  public final int hD()
  {
    String str = this.inn;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.inn);
    if (this.ino != null)
      i += b.a.a.b.b.a.J(2, this.ino);
    return i + b.a.a.a.br(3, this.inp) + b.a.a.a.br(4, this.inq) + b.a.a.a.br(5, this.inr) + b.a.a.a.br(7, this.ins);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.tc
 * JD-Core Version:    0.6.2
 */