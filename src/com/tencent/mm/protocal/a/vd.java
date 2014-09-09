package com.tencent.mm.protocal.a;

public final class vd extends com.tencent.mm.ao.a
{
  public String hVM;
  public int hWF;
  public String iab;
  public int idn;
  public int iqe;

  public static boolean a(b.a.a.a.a parama, vd paramvd, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramvd.idn = parama.bel();
      return true;
    case 2:
      paramvd.iab = parama.ben();
      return true;
    case 3:
      paramvd.hVM = parama.ben();
      return true;
    case 4:
      paramvd.hWF = parama.bel();
      return true;
    case 5:
    }
    paramvd.iqe = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.idn);
    if (this.iab != null)
      parama.I(2, this.iab);
    if (this.hVM != null)
      parama.I(3, this.hVM);
    parama.by(4, this.hWF);
    parama.by(5, this.iqe);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.idn);
    if (this.iab != null)
      i += b.a.a.b.b.a.J(2, this.iab);
    if (this.hVM != null)
      i += b.a.a.b.b.a.J(3, this.hVM);
    return i + b.a.a.a.br(4, this.hWF) + b.a.a.a.br(5, this.iqe);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.vd
 * JD-Core Version:    0.6.2
 */