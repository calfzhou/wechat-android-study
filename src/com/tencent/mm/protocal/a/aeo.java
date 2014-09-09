package com.tencent.mm.protocal.a;

public final class aeo extends com.tencent.mm.ao.a
{
  public String iaD;
  public String ifH;
  public String ixn;
  public int ixo;

  public final void a(b.a.a.c.a parama)
  {
    if (this.ifH != null)
      parama.I(1, this.ifH);
    if (this.ixn != null)
      parama.I(2, this.ixn);
    if (this.iaD != null)
      parama.I(3, this.iaD);
    parama.by(4, this.ixo);
  }

  public final int hD()
  {
    String str = this.ifH;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.ifH);
    if (this.ixn != null)
      i += b.a.a.b.b.a.J(2, this.ixn);
    if (this.iaD != null)
      i += b.a.a.b.b.a.J(3, this.iaD);
    return i + b.a.a.a.br(4, this.ixo);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aeo
 * JD-Core Version:    0.6.2
 */