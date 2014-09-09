package com.tencent.mm.protocal.a;

public final class mw extends vn
{
  public int hWt;
  public String idg;
  public String idh;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.idg != null)
      parama.I(2, this.idg);
    parama.by(3, this.hWt);
    if (this.idh != null)
      parama.I(4, this.idh);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.idg != null)
      i += b.a.a.b.b.a.J(2, this.idg);
    int j = i + b.a.a.a.br(3, this.hWt);
    if (this.idh != null)
      j += b.a.a.b.b.a.J(4, this.idh);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.mw
 * JD-Core Version:    0.6.2
 */