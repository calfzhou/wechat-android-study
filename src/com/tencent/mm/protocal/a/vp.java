package com.tencent.mm.protocal.a;

public final class vp extends com.tencent.mm.ao.a
{
  public String gnq;
  public String hXj;
  public String hXk;
  public String hwV;
  public String iaD;
  public int ipB;

  public static boolean a(b.a.a.a.a parama, vp paramvp, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramvp.gnq = parama.ben();
      return true;
    case 2:
      paramvp.ipB = parama.bel();
      return true;
    case 3:
      paramvp.hwV = parama.ben();
      return true;
    case 4:
      paramvp.hXk = parama.ben();
      return true;
    case 5:
      paramvp.hXj = parama.ben();
      return true;
    case 6:
    }
    paramvp.iaD = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.gnq != null)
      parama.I(1, this.gnq);
    parama.by(2, this.ipB);
    if (this.hwV != null)
      parama.I(3, this.hwV);
    if (this.hXk != null)
      parama.I(4, this.hXk);
    if (this.hXj != null)
      parama.I(5, this.hXj);
    if (this.iaD != null)
      parama.I(6, this.iaD);
  }

  public final int hD()
  {
    String str = this.gnq;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.gnq);
    int j = i + b.a.a.a.br(2, this.ipB);
    if (this.hwV != null)
      j += b.a.a.b.b.a.J(3, this.hwV);
    if (this.hXk != null)
      j += b.a.a.b.b.a.J(4, this.hXk);
    if (this.hXj != null)
      j += b.a.a.b.b.a.J(5, this.hXj);
    if (this.iaD != null)
      j += b.a.a.b.b.a.J(6, this.iaD);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.vp
 * JD-Core Version:    0.6.2
 */