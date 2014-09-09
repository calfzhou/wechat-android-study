package com.tencent.mm.protocal.a;

public final class qf extends com.tencent.mm.ao.a
{
  public String ifL;
  public int ifM;

  public static boolean a(b.a.a.a.a parama, qf paramqf, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramqf.ifL = parama.ben();
      return true;
    case 2:
    }
    paramqf.ifM = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.ifL != null)
      parama.I(1, this.ifL);
    parama.by(2, this.ifM);
  }

  public final int hD()
  {
    String str = this.ifL;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.ifL);
    return i + b.a.a.a.br(2, this.ifM);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.qf
 * JD-Core Version:    0.6.2
 */