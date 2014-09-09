package com.tencent.mm.protocal.a;

public final class wa extends vn
{
  public int cCn;
  public String cJO;
  public String iqL;
  public int timestamp;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.timestamp);
    if (this.iqL != null)
      parama.I(3, this.iqL);
    if (this.cJO != null)
      parama.I(4, this.cJO);
    parama.by(5, this.cCn);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.timestamp);
    if (this.iqL != null)
      j += b.a.a.b.b.a.J(3, this.iqL);
    if (this.cJO != null)
      j += b.a.a.b.b.a.J(4, this.cJO);
    return j + b.a.a.a.br(5, this.cCn);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.wa
 * JD-Core Version:    0.6.2
 */