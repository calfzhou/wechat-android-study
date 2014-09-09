package com.tencent.mm.protocal.a;

public final class ly extends vn
{
  public String hVL;
  public String icp;
  public String icq;
  public String icr;
  public String ics;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.icp != null)
      parama.I(2, this.icp);
    if (this.icq != null)
      parama.I(3, this.icq);
    if (this.icr != null)
      parama.I(4, this.icr);
    if (this.ics != null)
      parama.I(5, this.ics);
    if (this.hVL != null)
      parama.I(6, this.hVL);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.icp != null)
      i += b.a.a.b.b.a.J(2, this.icp);
    if (this.icq != null)
      i += b.a.a.b.b.a.J(3, this.icq);
    if (this.icr != null)
      i += b.a.a.b.b.a.J(4, this.icr);
    if (this.ics != null)
      i += b.a.a.b.b.a.J(5, this.ics);
    if (this.hVL != null)
      i += b.a.a.b.b.a.J(6, this.hVL);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ly
 * JD-Core Version:    0.6.2
 */