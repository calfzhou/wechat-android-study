package com.tencent.mm.protocal.a;

public final class aad extends vn
{
  public int hQF;
  public String itv;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hQF);
    if (this.itv != null)
      parama.I(3, this.itv);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hQF);
    if (this.itv != null)
      j += b.a.a.b.b.a.J(3, this.itv);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aad
 * JD-Core Version:    0.6.2
 */