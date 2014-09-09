package com.tencent.mm.protocal.a;

public final class kw extends vn
{
  public int hPM;
  public String ibr;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.ibr != null)
      parama.I(2, this.ibr);
    parama.by(3, this.hPM);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.ibr != null)
      i += b.a.a.b.b.a.J(2, this.ibr);
    return i + b.a.a.a.br(3, this.hPM);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.kw
 * JD-Core Version:    0.6.2
 */