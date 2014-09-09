package com.tencent.mm.protocal.a;

public final class rh extends vn
{
  public String dAo;
  public int doC;
  public int offset;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.offset);
    parama.by(3, this.doC);
    if (this.dAo != null)
      parama.I(4, this.dAo);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.offset) + b.a.a.a.br(3, this.doC);
    if (this.dAo != null)
      j += b.a.a.b.b.a.J(4, this.dAo);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.rh
 * JD-Core Version:    0.6.2
 */