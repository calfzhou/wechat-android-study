package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class adv extends vn
{
  public ws hQi;
  public String hTY;
  public aet hTZ;
  public adu hUb;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hTZ == null) || (this.hUb == null) || (this.hQi == null))
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hTY != null)
      parama.I(2, this.hTY);
    if (this.hTZ != null)
    {
      parama.bv(3, this.hTZ.hD());
      this.hTZ.a(parama);
    }
    if (this.hUb != null)
    {
      parama.bv(4, this.hUb.hD());
      this.hUb.a(parama);
    }
    if (this.hQi != null)
    {
      parama.bv(5, this.hQi.hD());
      this.hQi.a(parama);
    }
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hTY != null)
      i += b.a.a.b.b.a.J(2, this.hTY);
    if (this.hTZ != null)
      i += b.a.a.a.bs(3, this.hTZ.hD());
    if (this.hUb != null)
      i += b.a.a.a.bs(4, this.hUb.hD());
    if (this.hQi != null)
      i += b.a.a.a.bs(5, this.hQi.hD());
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.adv
 * JD-Core Version:    0.6.2
 */