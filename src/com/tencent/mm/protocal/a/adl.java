package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class adl extends vn
{
  public ws hQi;
  public int hQk;
  public int hQs;
  public int hUu;
  public vt iwp;
  public vt iwq;
  public int iwr;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.iwp == null) || (this.iwq == null) || (this.hQi == null))
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.iwp != null)
    {
      parama.bv(2, this.iwp.hD());
      this.iwp.a(parama);
    }
    if (this.iwq != null)
    {
      parama.bv(3, this.iwq.hD());
      this.iwq.a(parama);
    }
    parama.by(4, this.hQk);
    parama.by(5, this.hUu);
    parama.by(6, this.hQs);
    if (this.hQi != null)
    {
      parama.bv(7, this.hQi.hD());
      this.hQi.a(parama);
    }
    parama.by(8, this.iwr);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.iwp != null)
      i += b.a.a.a.bs(2, this.iwp.hD());
    if (this.iwq != null)
      i += b.a.a.a.bs(3, this.iwq.hD());
    int j = i + b.a.a.a.br(4, this.hQk) + b.a.a.a.br(5, this.hUu) + b.a.a.a.br(6, this.hQs);
    if (this.hQi != null)
      j += b.a.a.a.bs(7, this.hQi.hD());
    return j + b.a.a.a.br(8, this.iwr);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.adl
 * JD-Core Version:    0.6.2
 */