package com.tencent.mm.protocal.a;

public final class ac extends com.tencent.mm.ao.a
{
  public int hPy;
  public String hPz;
  public String hsT;

  public static boolean a(b.a.a.a.a parama, ac paramac, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramac.hsT = parama.ben();
      return true;
    case 2:
      paramac.hPy = parama.bel();
      return true;
    case 3:
    }
    paramac.hPz = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hsT != null)
      parama.I(1, this.hsT);
    parama.by(2, this.hPy);
    if (this.hPz != null)
      parama.I(3, this.hPz);
  }

  public final int hD()
  {
    String str = this.hsT;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hsT);
    int j = i + b.a.a.a.br(2, this.hPy);
    if (this.hPz != null)
      j += b.a.a.b.b.a.J(3, this.hPz);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ac
 * JD-Core Version:    0.6.2
 */