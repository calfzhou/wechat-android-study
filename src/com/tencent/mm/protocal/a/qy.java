package com.tencent.mm.protocal.a;

public final class qy extends com.tencent.mm.ao.a
{
  public int dZy;
  public String gnq;
  public String hTy;
  public String hTz;
  public String hwV;
  public String iaD;
  public String ifH;

  public static boolean a(b.a.a.a.a parama, qy paramqy, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramqy.ifH = parama.ben();
      return true;
    case 2:
      paramqy.gnq = parama.ben();
      return true;
    case 3:
      paramqy.dZy = parama.bel();
      return true;
    case 4:
      paramqy.hTy = parama.ben();
      return true;
    case 5:
      paramqy.hTz = parama.ben();
      return true;
    case 6:
      paramqy.hwV = parama.ben();
      return true;
    case 7:
    }
    paramqy.iaD = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.ifH != null)
      parama.I(1, this.ifH);
    if (this.gnq != null)
      parama.I(2, this.gnq);
    parama.by(3, this.dZy);
    if (this.hTy != null)
      parama.I(4, this.hTy);
    if (this.hTz != null)
      parama.I(5, this.hTz);
    if (this.hwV != null)
      parama.I(6, this.hwV);
    if (this.iaD != null)
      parama.I(7, this.iaD);
  }

  public final int hD()
  {
    String str = this.ifH;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.ifH);
    if (this.gnq != null)
      i += b.a.a.b.b.a.J(2, this.gnq);
    int j = i + b.a.a.a.br(3, this.dZy);
    if (this.hTy != null)
      j += b.a.a.b.b.a.J(4, this.hTy);
    if (this.hTz != null)
      j += b.a.a.b.b.a.J(5, this.hTz);
    if (this.hwV != null)
      j += b.a.a.b.b.a.J(6, this.hwV);
    if (this.iaD != null)
      j += b.a.a.b.b.a.J(7, this.iaD);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.qy
 * JD-Core Version:    0.6.2
 */