package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class ok extends vn
{
  public String epM;
  public String ieq;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.epM == null) || (this.ieq == null))
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.epM != null)
      parama.I(2, this.epM);
    if (this.ieq != null)
      parama.I(3, this.ieq);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.epM != null)
      i += b.a.a.b.b.a.J(2, this.epM);
    if (this.ieq != null)
      i += b.a.a.b.b.a.J(3, this.ieq);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ok
 * JD-Core Version:    0.6.2
 */