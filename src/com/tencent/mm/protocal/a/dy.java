package com.tencent.mm.protocal.a;

public final class dy extends vn
{
  public int hUe;
  public String hUf;
  public String hUg;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hUe);
    if (this.hUf != null)
      parama.I(3, this.hUf);
    if (this.hUg != null)
      parama.I(4, this.hUg);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hUe);
    if (this.hUf != null)
      j += b.a.a.b.b.a.J(3, this.hUf);
    if (this.hUg != null)
      j += b.a.a.b.b.a.J(4, this.hUg);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.dy
 * JD-Core Version:    0.6.2
 */