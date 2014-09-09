package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class ni extends vn
{
  public int Height;
  public String URL;
  public int Width;
  public String idu;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.URL == null) || (this.idu == null))
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.URL != null)
      parama.I(2, this.URL);
    if (this.idu != null)
      parama.I(3, this.idu);
    parama.by(4, this.Width);
    parama.by(5, this.Height);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.URL != null)
      i += b.a.a.b.b.a.J(2, this.URL);
    if (this.idu != null)
      i += b.a.a.b.b.a.J(3, this.idu);
    return i + b.a.a.a.br(4, this.Width) + b.a.a.a.br(5, this.Height);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ni
 * JD-Core Version:    0.6.2
 */