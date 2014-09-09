package com.tencent.mm.protocal.a;

public final class ag extends com.tencent.mm.ao.a
{
  public String fxH;
  public String hOt;
  public String hPE;
  public String hPF;
  public String hPG;
  public String hPH;
  public int hPy;
  public String hsT;

  public static boolean a(b.a.a.a.a parama, ag paramag, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramag.hsT = parama.ben();
      return true;
    case 2:
      paramag.hPE = parama.ben();
      return true;
    case 3:
      paramag.fxH = parama.ben();
      return true;
    case 4:
      paramag.hOt = parama.ben();
      return true;
    case 5:
      paramag.hPy = parama.bel();
      return true;
    case 6:
      paramag.hPF = parama.ben();
      return true;
    case 7:
      paramag.hPG = parama.ben();
      return true;
    case 8:
    }
    paramag.hPH = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hsT != null)
      parama.I(1, this.hsT);
    if (this.hPE != null)
      parama.I(2, this.hPE);
    if (this.fxH != null)
      parama.I(3, this.fxH);
    if (this.hOt != null)
      parama.I(4, this.hOt);
    parama.by(5, this.hPy);
    if (this.hPF != null)
      parama.I(6, this.hPF);
    if (this.hPG != null)
      parama.I(7, this.hPG);
    if (this.hPH != null)
      parama.I(8, this.hPH);
  }

  public final int hD()
  {
    String str = this.hsT;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hsT);
    if (this.hPE != null)
      i += b.a.a.b.b.a.J(2, this.hPE);
    if (this.fxH != null)
      i += b.a.a.b.b.a.J(3, this.fxH);
    if (this.hOt != null)
      i += b.a.a.b.b.a.J(4, this.hOt);
    int j = i + b.a.a.a.br(5, this.hPy);
    if (this.hPF != null)
      j += b.a.a.b.b.a.J(6, this.hPF);
    if (this.hPG != null)
      j += b.a.a.b.b.a.J(7, this.hPG);
    if (this.hPH != null)
      j += b.a.a.b.b.a.J(8, this.hPH);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ag
 * JD-Core Version:    0.6.2
 */