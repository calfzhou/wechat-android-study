package com.tencent.mm.protocal.a;

public final class zn extends vn
{
  public int ewb;
  public int hQk;
  public int hUu;
  public String isR;
  public int isS;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hUu);
    parama.by(3, this.hQk);
    if (this.isR != null)
      parama.I(4, this.isR);
    parama.by(5, this.ewb);
    parama.by(6, this.isS);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hUu) + b.a.a.a.br(3, this.hQk);
    if (this.isR != null)
      j += b.a.a.b.b.a.J(4, this.isR);
    return j + b.a.a.a.br(5, this.ewb) + b.a.a.a.br(6, this.isS);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.zn
 * JD-Core Version:    0.6.2
 */