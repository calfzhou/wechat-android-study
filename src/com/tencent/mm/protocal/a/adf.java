package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class adf extends vn
{
  public String gnq;
  public ws hQi;
  public int hQk;
  public int hUu;
  public int ici;
  public String iwe;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hQi == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hQk);
    parama.by(3, this.hUu);
    parama.by(4, this.ici);
    if (this.hQi != null)
    {
      parama.bv(5, this.hQi.hD());
      this.hQi.a(parama);
    }
    if (this.iwe != null)
      parama.I(6, this.iwe);
    if (this.gnq != null)
      parama.I(7, this.gnq);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.hQk) + b.a.a.a.br(3, this.hUu) + b.a.a.a.br(4, this.ici);
    if (this.hQi != null)
      j += b.a.a.a.bs(5, this.hQi.hD());
    if (this.iwe != null)
      j += b.a.a.b.b.a.J(6, this.iwe);
    if (this.gnq != null)
      j += b.a.a.b.b.a.J(7, this.gnq);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.adf
 * JD-Core Version:    0.6.2
 */