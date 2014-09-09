package com.tencent.mm.protocal.a;

public final class hv extends com.tencent.mm.ao.a
{
  private double cGO;
  private double cGP;
  private int cGQ;
  private String cLS;
  public boolean hZn = false;
  public boolean hZo = false;
  public boolean hZp = false;
  public boolean hZq = false;
  public boolean hZr = false;
  private String label;

  public static boolean a(b.a.a.a.a parama, hv paramhv, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramhv.cGP = parama.bep();
      paramhv.hZn = true;
      return true;
    case 2:
      paramhv.cGO = parama.bep();
      paramhv.hZo = true;
      return true;
    case 3:
      paramhv.cGQ = parama.bel();
      paramhv.hZp = true;
      return true;
    case 4:
      paramhv.label = parama.ben();
      paramhv.hZq = true;
      return true;
    case 5:
    }
    paramhv.cLS = parama.ben();
    paramhv.hZr = true;
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hZn == true)
      parama.a(1, this.cGP);
    if (this.hZo == true)
      parama.a(2, this.cGO);
    if (this.hZp == true)
      parama.by(3, this.cGQ);
    if (this.label != null)
      parama.I(4, this.label);
    if (this.cLS != null)
      parama.I(5, this.cLS);
  }

  public final int aEX()
  {
    return this.cGQ;
  }

  public final double aLC()
  {
    return this.cGP;
  }

  public final double aLD()
  {
    return this.cGO;
  }

  public final String aLE()
  {
    return this.cLS;
  }

  public final hv e(double paramDouble)
  {
    this.cGP = paramDouble;
    this.hZn = true;
    return this;
  }

  public final hv f(double paramDouble)
  {
    this.cGO = paramDouble;
    this.hZo = true;
    return this;
  }

  public final String getLabel()
  {
    return this.label;
  }

  public final int hD()
  {
    boolean bool = this.hZn;
    int i = 0;
    if (bool == true)
      i = 0 + (8 + b.a.a.b.b.a.rV(1));
    if (this.hZo == true)
      i += 8 + b.a.a.b.b.a.rV(2);
    if (this.hZp == true)
      i += b.a.a.a.br(3, this.cGQ);
    if (this.label != null)
      i += b.a.a.b.b.a.J(4, this.label);
    if (this.cLS != null)
      i += b.a.a.b.b.a.J(5, this.cLS);
    return i;
  }

  public final hv nD(int paramInt)
  {
    this.cGQ = paramInt;
    this.hZp = true;
    return this;
  }

  public final hv xh(String paramString)
  {
    this.label = paramString;
    this.hZq = true;
    return this;
  }

  public final hv xj(String paramString)
  {
    this.cLS = paramString;
    this.hZr = true;
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.hv
 * JD-Core Version:    0.6.2
 */