package com.tencent.mm.protocal.a;

public final class s extends com.tencent.mm.ao.a
{
  public String Ks;
  public String Kt;
  public String dtm;
  public String gnq;
  public String hPa;
  public String hPb;
  public String hPc;

  public static boolean a(b.a.a.a.a parama, s params, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      params.dtm = parama.ben();
      return true;
    case 2:
      params.Ks = parama.ben();
      return true;
    case 3:
      params.Kt = parama.ben();
      return true;
    case 4:
      params.hPa = parama.ben();
      return true;
    case 5:
      params.gnq = parama.ben();
      return true;
    case 6:
      params.hPb = parama.ben();
      return true;
    case 7:
    }
    params.hPc = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.dtm != null)
      parama.I(1, this.dtm);
    if (this.Ks != null)
      parama.I(2, this.Ks);
    if (this.Kt != null)
      parama.I(3, this.Kt);
    if (this.hPa != null)
      parama.I(4, this.hPa);
    if (this.gnq != null)
      parama.I(5, this.gnq);
    if (this.hPb != null)
      parama.I(6, this.hPb);
    if (this.hPc != null)
      parama.I(7, this.hPc);
  }

  public final int hD()
  {
    String str = this.dtm;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.dtm);
    if (this.Ks != null)
      i += b.a.a.b.b.a.J(2, this.Ks);
    if (this.Kt != null)
      i += b.a.a.b.b.a.J(3, this.Kt);
    if (this.hPa != null)
      i += b.a.a.b.b.a.J(4, this.hPa);
    if (this.gnq != null)
      i += b.a.a.b.b.a.J(5, this.gnq);
    if (this.hPb != null)
      i += b.a.a.b.b.a.J(6, this.hPb);
    if (this.hPc != null)
      i += b.a.a.b.b.a.J(7, this.hPc);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.s
 * JD-Core Version:    0.6.2
 */