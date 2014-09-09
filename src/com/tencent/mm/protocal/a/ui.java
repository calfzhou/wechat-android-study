package com.tencent.mm.protocal.a;

public final class ui extends vn
{
  public int hQd;
  public int idH;
  public String iph;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.idH);
    parama.by(3, this.hQd);
    if (this.iph != null)
      parama.I(4, this.iph);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.idH) + b.a.a.a.br(3, this.hQd);
    if (this.iph != null)
      j += b.a.a.b.b.a.J(4, this.iph);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ui
 * JD-Core Version:    0.6.2
 */