package com.tencent.mm.protocal.a;

public final class y extends com.tencent.mm.ao.a
{
  public String dZq;
  public String hOt;
  public String hPl;
  public String hPm;
  public String hPn;

  public static boolean a(b.a.a.a.a parama, y paramy, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramy.hPl = parama.ben();
      return true;
    case 2:
      paramy.dZq = parama.ben();
      return true;
    case 3:
      paramy.hOt = parama.ben();
      return true;
    case 4:
      paramy.hPm = parama.ben();
      return true;
    case 5:
    }
    paramy.hPn = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.hPl != null)
      parama.I(1, this.hPl);
    if (this.dZq != null)
      parama.I(2, this.dZq);
    if (this.hOt != null)
      parama.I(3, this.hOt);
    if (this.hPm != null)
      parama.I(4, this.hPm);
    if (this.hPn != null)
      parama.I(5, this.hPn);
  }

  public final int hD()
  {
    String str = this.hPl;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hPl);
    if (this.dZq != null)
      i += b.a.a.b.b.a.J(2, this.dZq);
    if (this.hOt != null)
      i += b.a.a.b.b.a.J(3, this.hOt);
    if (this.hPm != null)
      i += b.a.a.b.b.a.J(4, this.hPm);
    if (this.hPn != null)
      i += b.a.a.b.b.a.J(5, this.hPn);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.y
 * JD-Core Version:    0.6.2
 */