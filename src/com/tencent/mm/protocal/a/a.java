package com.tencent.mm.protocal.a;

public final class a extends vn
{
  public String SSID;
  public String URL;
  public String hNX;
  public String hNY;
  public String hsB;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.URL != null)
      parama.I(2, this.URL);
    if (this.SSID != null)
      parama.I(3, this.SSID);
    if (this.hNX != null)
      parama.I(4, this.hNX);
    if (this.hNY != null)
      parama.I(5, this.hNY);
    if (this.hsB != null)
      parama.I(6, this.hsB);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.URL != null)
      i += b.a.a.b.b.a.J(2, this.URL);
    if (this.SSID != null)
      i += b.a.a.b.b.a.J(3, this.SSID);
    if (this.hNX != null)
      i += b.a.a.b.b.a.J(4, this.hNX);
    if (this.hNY != null)
      i += b.a.a.b.b.a.J(5, this.hNY);
    if (this.hsB != null)
      i += b.a.a.b.b.a.J(6, this.hsB);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.a
 * JD-Core Version:    0.6.2
 */