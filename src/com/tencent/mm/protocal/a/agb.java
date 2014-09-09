package com.tencent.mm.protocal.a;

public final class agb extends com.tencent.mm.ao.a
{
  public String hSa;
  public String hTI;
  public int iyA;
  public int iyw;
  public String iyx;
  public String iyy;
  public String iyz;

  public static boolean a(b.a.a.a.a parama, agb paramagb, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramagb.iyw = parama.bel();
      return true;
    case 2:
      paramagb.hSa = parama.ben();
      return true;
    case 3:
      paramagb.iyx = parama.ben();
      return true;
    case 4:
      paramagb.iyy = parama.ben();
      return true;
    case 5:
      paramagb.hTI = parama.ben();
      return true;
    case 6:
      paramagb.iyz = parama.ben();
      return true;
    case 7:
    }
    paramagb.iyA = parama.bel();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.iyw);
    if (this.hSa != null)
      parama.I(2, this.hSa);
    if (this.iyx != null)
      parama.I(3, this.iyx);
    if (this.iyy != null)
      parama.I(4, this.iyy);
    if (this.hTI != null)
      parama.I(5, this.hTI);
    if (this.iyz != null)
      parama.I(6, this.iyz);
    parama.by(7, this.iyA);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.iyw);
    if (this.hSa != null)
      i += b.a.a.b.b.a.J(2, this.hSa);
    if (this.iyx != null)
      i += b.a.a.b.b.a.J(3, this.iyx);
    if (this.iyy != null)
      i += b.a.a.b.b.a.J(4, this.iyy);
    if (this.hTI != null)
      i += b.a.a.b.b.a.J(5, this.hTI);
    if (this.iyz != null)
      i += b.a.a.b.b.a.J(6, this.iyz);
    return i + b.a.a.a.br(7, this.iyA);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.agb
 * JD-Core Version:    0.6.2
 */