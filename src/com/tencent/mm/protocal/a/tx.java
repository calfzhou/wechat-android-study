package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class tx extends vn
{
  public int hOR;
  public String ioS;
  public en ioT;
  public en ioU;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.ioT == null) || (this.ioU == null))
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.ioS != null)
      parama.I(2, this.ioS);
    if (this.ioT != null)
    {
      parama.bv(3, this.ioT.hD());
      this.ioT.a(parama);
    }
    if (this.ioU != null)
    {
      parama.bv(4, this.ioU.hD());
      this.ioU.a(parama);
    }
    parama.by(5, this.hOR);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.ioS != null)
      i += b.a.a.b.b.a.J(2, this.ioS);
    if (this.ioT != null)
      i += b.a.a.a.bs(3, this.ioT.hD());
    if (this.ioU != null)
      i += b.a.a.a.bs(4, this.ioU.hD());
    return i + b.a.a.a.br(5, this.hOR);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.tx
 * JD-Core Version:    0.6.2
 */