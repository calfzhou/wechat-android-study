package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class kp extends vn
{
  public String epL;
  public String epM;
  public int epN;
  public String epQ;

  public final void a(b.a.a.c.a parama)
  {
    if (this.epM == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.epM != null)
      parama.I(2, this.epM);
    parama.by(3, this.epN);
    if (this.epL != null)
      parama.I(4, this.epL);
    if (this.epQ != null)
      parama.I(5, this.epQ);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.epM != null)
      i += b.a.a.b.b.a.J(2, this.epM);
    int j = i + b.a.a.a.br(3, this.epN);
    if (this.epL != null)
      j += b.a.a.b.b.a.J(4, this.epL);
    if (this.epQ != null)
      j += b.a.a.b.b.a.J(5, this.epQ);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.kp
 * JD-Core Version:    0.6.2
 */