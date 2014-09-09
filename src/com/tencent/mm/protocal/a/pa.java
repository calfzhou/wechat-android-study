package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class pa extends vn
{
  public oy hQL;
  public int ieO;
  public ws ieP;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hQL == null) || (this.ieP == null))
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hQL != null)
    {
      parama.bv(2, this.hQL.hD());
      this.hQL.a(parama);
    }
    parama.by(3, this.ieO);
    if (this.ieP != null)
    {
      parama.bv(4, this.ieP.hD());
      this.ieP.a(parama);
    }
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hQL != null)
      i += b.a.a.a.bs(2, this.hQL.hD());
    int j = i + b.a.a.a.br(3, this.ieO);
    if (this.ieP != null)
      j += b.a.a.a.bs(4, this.ieP.hD());
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.pa
 * JD-Core Version:    0.6.2
 */