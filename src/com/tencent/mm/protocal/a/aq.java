package com.tencent.mm.protocal.a;

public final class aq extends vn
{
  public int ewb;
  public String hPI;
  public int hPJ;
  public int hQe;
  public int hQo;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hPI != null)
      parama.I(2, this.hPI);
    parama.by(3, this.hPJ);
    parama.by(4, this.hQo);
    parama.by(5, this.hQe);
    parama.by(6, this.ewb);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hPI != null)
      i += b.a.a.b.b.a.J(2, this.hPI);
    return i + b.a.a.a.br(3, this.hPJ) + b.a.a.a.br(4, this.hQo) + b.a.a.a.br(5, this.hQe) + b.a.a.a.br(6, this.ewb);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aq
 * JD-Core Version:    0.6.2
 */