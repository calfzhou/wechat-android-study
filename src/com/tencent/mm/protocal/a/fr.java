package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class fr extends vn
{
  public int ewb;
  public int hQd;
  public ud hVw;
  public int hVx;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hVw == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hVw != null)
    {
      parama.bv(2, this.hVw.hD());
      this.hVw.a(parama);
    }
    parama.by(3, this.hQd);
    parama.by(4, this.hVx);
    parama.by(5, this.ewb);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hVw != null)
      i += b.a.a.a.bs(2, this.hVw.hD());
    return i + b.a.a.a.br(3, this.hQd) + b.a.a.a.br(4, this.hVx) + b.a.a.a.br(5, this.ewb);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.fr
 * JD-Core Version:    0.6.2
 */