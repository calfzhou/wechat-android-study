package com.tencent.mm.protocal.a;

public final class ew extends com.tencent.mm.ao.a
{
  public int dtr;
  public String dts;
  public String dtt;
  public String dtu;

  public static boolean a(b.a.a.a.a parama, ew paramew, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramew.dtr = parama.bel();
      return true;
    case 2:
      paramew.dts = parama.ben();
      return true;
    case 3:
      paramew.dtt = parama.ben();
      return true;
    case 4:
    }
    paramew.dtu = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.dtr);
    if (this.dts != null)
      parama.I(2, this.dts);
    if (this.dtt != null)
      parama.I(3, this.dtt);
    if (this.dtu != null)
      parama.I(4, this.dtu);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.dtr);
    if (this.dts != null)
      i += b.a.a.b.b.a.J(2, this.dts);
    if (this.dtt != null)
      i += b.a.a.b.b.a.J(3, this.dtt);
    if (this.dtu != null)
      i += b.a.a.b.b.a.J(4, this.dtu);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ew
 * JD-Core Version:    0.6.2
 */