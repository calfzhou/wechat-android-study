package com.tencent.mm.protocal.a;

public final class tr extends vn
{
  public String hPl;
  public String hjv;
  public int ioF;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.ioF);
    if (this.hPl != null)
      parama.I(3, this.hPl);
    if (this.hjv != null)
      parama.I(4, this.hjv);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.ioF);
    if (this.hPl != null)
      j += b.a.a.b.b.a.J(3, this.hPl);
    if (this.hjv != null)
      j += b.a.a.b.b.a.J(4, this.hjv);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.tr
 * JD-Core Version:    0.6.2
 */