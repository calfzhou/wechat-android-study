package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class ne extends vn
{
  public int idq;
  public ws idr;

  public final void a(b.a.a.c.a parama)
  {
    if (this.idr == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.idq);
    if (this.idr != null)
    {
      parama.bv(3, this.idr.hD());
      this.idr.a(parama);
    }
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.idq);
    if (this.idr != null)
      j += b.a.a.a.bs(3, this.idr.hD());
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ne
 * JD-Core Version:    0.6.2
 */