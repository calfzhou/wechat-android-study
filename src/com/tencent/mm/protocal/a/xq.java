package com.tencent.mm.protocal.a;

public final class xq extends vn
{
  public String fxG;
  public String irG;
  public int irH;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.irG != null)
      parama.I(2, this.irG);
    if (this.fxG != null)
      parama.I(3, this.fxG);
    parama.by(4, this.irH);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.irG != null)
      i += b.a.a.b.b.a.J(2, this.irG);
    if (this.fxG != null)
      i += b.a.a.b.b.a.J(3, this.fxG);
    return i + b.a.a.a.br(4, this.irH);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.xq
 * JD-Core Version:    0.6.2
 */