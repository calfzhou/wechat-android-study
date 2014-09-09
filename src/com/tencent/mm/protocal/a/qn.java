package com.tencent.mm.protocal.a;

public final class qn extends com.tencent.mm.ao.a
{
  public String gnq;
  public String hTy;
  public String hTz;
  public String hwV;
  public String iaD;

  public static boolean a(b.a.a.a.a parama, qn paramqn, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramqn.gnq = parama.ben();
      return true;
    case 2:
      paramqn.hwV = parama.ben();
      return true;
    case 3:
      paramqn.hTy = parama.ben();
      return true;
    case 4:
      paramqn.hTz = parama.ben();
      return true;
    case 5:
    }
    paramqn.iaD = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.gnq != null)
      parama.I(1, this.gnq);
    if (this.hwV != null)
      parama.I(2, this.hwV);
    if (this.hTy != null)
      parama.I(3, this.hTy);
    if (this.hTz != null)
      parama.I(4, this.hTz);
    if (this.iaD != null)
      parama.I(5, this.iaD);
  }

  public final int hD()
  {
    String str = this.gnq;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.gnq);
    if (this.hwV != null)
      i += b.a.a.b.b.a.J(2, this.hwV);
    if (this.hTy != null)
      i += b.a.a.b.b.a.J(3, this.hTy);
    if (this.hTz != null)
      i += b.a.a.b.b.a.J(4, this.hTz);
    if (this.iaD != null)
      i += b.a.a.b.b.a.J(5, this.iaD);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.qn
 * JD-Core Version:    0.6.2
 */