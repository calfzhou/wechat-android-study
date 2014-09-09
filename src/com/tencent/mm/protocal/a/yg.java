package com.tencent.mm.protocal.a;

public final class yg extends vn
{
  public String hsT;
  public int irP;
  public String irQ;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hsT != null)
      parama.I(2, this.hsT);
    parama.by(3, this.irP);
    if (this.irQ != null)
      parama.I(4, this.irQ);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hsT != null)
      i += b.a.a.b.b.a.J(2, this.hsT);
    int j = i + b.a.a.a.br(3, this.irP);
    if (this.irQ != null)
      j += b.a.a.b.b.a.J(4, this.irQ);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.yg
 * JD-Core Version:    0.6.2
 */