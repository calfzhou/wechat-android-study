package com.tencent.mm.protocal.a;

public class ua extends com.tencent.mm.ao.a
{
  public String KH;
  public String KI;
  public double KL;
  public double KM;
  public String KU;
  public String KV;
  public String KY;
  public String Ks;
  public String Kt;
  public String igc;
  public String ioX;
  public String ioY;

  public static boolean a(b.a.a.a.a parama, ua paramua, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramua.KH = parama.ben();
      return true;
    case 2:
      paramua.KI = parama.ben();
      return true;
    case 3:
      paramua.KM = parama.bep();
      return true;
    case 4:
      paramua.KL = parama.bep();
      return true;
    case 5:
      paramua.ioX = parama.ben();
      return true;
    case 6:
      paramua.igc = parama.ben();
      return true;
    case 7:
      paramua.KU = parama.ben();
      return true;
    case 8:
      paramua.Ks = parama.ben();
      return true;
    case 9:
      paramua.Kt = parama.ben();
      return true;
    case 10:
      paramua.KV = parama.ben();
      return true;
    case 11:
      paramua.KY = parama.ben();
      return true;
    case 12:
    }
    paramua.ioY = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.KH != null)
      parama.I(1, this.KH);
    if (this.KI != null)
      parama.I(2, this.KI);
    parama.a(3, this.KM);
    parama.a(4, this.KL);
    if (this.ioX != null)
      parama.I(5, this.ioX);
    if (this.igc != null)
      parama.I(6, this.igc);
    if (this.KU != null)
      parama.I(7, this.KU);
    if (this.Ks != null)
      parama.I(8, this.Ks);
    if (this.Kt != null)
      parama.I(9, this.Kt);
    if (this.KV != null)
      parama.I(10, this.KV);
    if (this.KY != null)
      parama.I(11, this.KY);
    if (this.ioY != null)
      parama.I(12, this.ioY);
  }

  public final int hD()
  {
    String str = this.KH;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.KH);
    if (this.KI != null)
      i += b.a.a.b.b.a.J(2, this.KI);
    int j = i + (8 + b.a.a.b.b.a.rV(3));
    int k = j + (8 + b.a.a.b.b.a.rV(4));
    if (this.ioX != null)
      k += b.a.a.b.b.a.J(5, this.ioX);
    if (this.igc != null)
      k += b.a.a.b.b.a.J(6, this.igc);
    if (this.KU != null)
      k += b.a.a.b.b.a.J(7, this.KU);
    if (this.Ks != null)
      k += b.a.a.b.b.a.J(8, this.Ks);
    if (this.Kt != null)
      k += b.a.a.b.b.a.J(9, this.Kt);
    if (this.KV != null)
      k += b.a.a.b.b.a.J(10, this.KV);
    if (this.KY != null)
      k += b.a.a.b.b.a.J(11, this.KY);
    if (this.ioY != null)
      k += b.a.a.b.b.a.J(12, this.ioY);
    return k;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ua
 * JD-Core Version:    0.6.2
 */