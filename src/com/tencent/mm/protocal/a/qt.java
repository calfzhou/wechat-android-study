package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class qt extends com.tencent.mm.ao.a
{
  public String duA;
  public String ifr;
  public String igm;
  public String ign;
  public String igo;
  public String igp;
  public String igq;
  public String igr;
  public String name;

  public static boolean a(b.a.a.a.a parama, qt paramqt, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramqt.ifr = parama.ben();
      return true;
    case 2:
      paramqt.name = parama.ben();
      return true;
    case 3:
      paramqt.igm = parama.ben();
      return true;
    case 4:
      paramqt.ign = parama.ben();
      return true;
    case 5:
      paramqt.igo = parama.ben();
      return true;
    case 6:
      paramqt.igp = parama.ben();
      return true;
    case 7:
      paramqt.igq = parama.ben();
      return true;
    case 8:
      paramqt.igr = parama.ben();
      return true;
    case 9:
    }
    paramqt.duA = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.ifr == null)
      throw new b("Not all required fields were included");
    if (this.ifr != null)
      parama.I(1, this.ifr);
    if (this.name != null)
      parama.I(2, this.name);
    if (this.igm != null)
      parama.I(3, this.igm);
    if (this.ign != null)
      parama.I(4, this.ign);
    if (this.igo != null)
      parama.I(5, this.igo);
    if (this.igp != null)
      parama.I(6, this.igp);
    if (this.igq != null)
      parama.I(7, this.igq);
    if (this.igr != null)
      parama.I(8, this.igr);
    if (this.duA != null)
      parama.I(9, this.duA);
  }

  public final int hD()
  {
    String str = this.ifr;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.ifr);
    if (this.name != null)
      i += b.a.a.b.b.a.J(2, this.name);
    if (this.igm != null)
      i += b.a.a.b.b.a.J(3, this.igm);
    if (this.ign != null)
      i += b.a.a.b.b.a.J(4, this.ign);
    if (this.igo != null)
      i += b.a.a.b.b.a.J(5, this.igo);
    if (this.igp != null)
      i += b.a.a.b.b.a.J(6, this.igp);
    if (this.igq != null)
      i += b.a.a.b.b.a.J(7, this.igq);
    if (this.igr != null)
      i += b.a.a.b.b.a.J(8, this.igr);
    if (this.duA != null)
      i += b.a.a.b.b.a.J(9, this.duA);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.qt
 * JD-Core Version:    0.6.2
 */