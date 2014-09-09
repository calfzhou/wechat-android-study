package com.tencent.mm.protocal.a;

public final class acs extends vn
{
  public String KH;
  public String hVl;
  public String ieD;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hVl != null)
      parama.I(2, this.hVl);
    if (this.KH != null)
      parama.I(3, this.KH);
    if (this.ieD != null)
      parama.I(4, this.ieD);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hVl != null)
      i += b.a.a.b.b.a.J(2, this.hVl);
    if (this.KH != null)
      i += b.a.a.b.b.a.J(3, this.KH);
    if (this.ieD != null)
      i += b.a.a.b.b.a.J(4, this.ieD);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.acs
 * JD-Core Version:    0.6.2
 */