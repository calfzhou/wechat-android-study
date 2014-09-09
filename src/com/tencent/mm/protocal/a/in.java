package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class in extends com.tencent.mm.ao.a
  implements zd
{
  public int hQw;
  public int hSL;
  public ws hTq;
  public ef hTr;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hTr == null) || (this.hTq == null))
      throw new b("Not all required fields were included");
    parama.by(1, this.hQw);
    if (this.hTr != null)
    {
      parama.bv(2, this.hTr.hD());
      this.hTr.a(parama);
    }
    if (this.hTq != null)
    {
      parama.bv(3, this.hTq.hD());
      this.hTq.a(parama);
    }
    parama.by(4, this.hSL);
  }

  public final int getRet()
  {
    return this.hQw;
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hQw);
    if (this.hTr != null)
      i += b.a.a.a.bs(2, this.hTr.hD());
    if (this.hTq != null)
      i += b.a.a.a.bs(3, this.hTq.hD());
    return i + b.a.a.a.br(4, this.hSL);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.in
 * JD-Core Version:    0.6.2
 */