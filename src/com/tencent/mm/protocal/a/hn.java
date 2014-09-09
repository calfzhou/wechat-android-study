package com.tencent.mm.protocal.a;

public final class hn extends com.tencent.mm.ao.a
{
  public int dZy;
  public String gnq;
  public String hXj;
  public String hXk;
  public String hwV;

  public static boolean a(b.a.a.a.a parama, hn paramhn, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramhn.gnq = parama.ben();
      return true;
    case 2:
      paramhn.hXj = parama.ben();
      return true;
    case 3:
      paramhn.hwV = parama.ben();
      return true;
    case 4:
      paramhn.hXk = parama.ben();
      return true;
    case 5:
    }
    paramhn.dZy = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.gnq != null)
      parama.I(1, this.gnq);
    if (this.hXj != null)
      parama.I(2, this.hXj);
    if (this.hwV != null)
      parama.I(3, this.hwV);
    if (this.hXk != null)
      parama.I(4, this.hXk);
    parama.by(5, this.dZy);
  }

  public final int hD()
  {
    String str = this.gnq;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.gnq);
    if (this.hXj != null)
      i += b.a.a.b.b.a.J(2, this.hXj);
    if (this.hwV != null)
      i += b.a.a.b.b.a.J(3, this.hwV);
    if (this.hXk != null)
      i += b.a.a.b.b.a.J(4, this.hXk);
    return i + b.a.a.a.br(5, this.dZy);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.hn
 * JD-Core Version:    0.6.2
 */