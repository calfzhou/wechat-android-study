package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class pi extends com.tencent.mm.ao.a
{
  public String gnq;
  public String hQG;
  public int hQv;
  public String hUE;
  public vt ifj;
  public int ifp;

  public final void a(b.a.a.c.a parama)
  {
    if (this.ifj == null)
      throw new b("Not all required fields were included");
    parama.by(1, this.hQv);
    if (this.ifj != null)
    {
      parama.bv(2, this.ifj.hD());
      this.ifj.a(parama);
    }
    if (this.hQG != null)
      parama.I(3, this.hQG);
    if (this.hUE != null)
      parama.I(4, this.hUE);
    if (this.gnq != null)
      parama.I(5, this.gnq);
    parama.by(6, this.ifp);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.hQv);
    if (this.ifj != null)
      i += b.a.a.a.bs(2, this.ifj.hD());
    if (this.hQG != null)
      i += b.a.a.b.b.a.J(3, this.hQG);
    if (this.hUE != null)
      i += b.a.a.b.b.a.J(4, this.hUE);
    if (this.gnq != null)
      i += b.a.a.b.b.a.J(5, this.gnq);
    return i + b.a.a.a.br(6, this.ifp);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.pi
 * JD-Core Version:    0.6.2
 */