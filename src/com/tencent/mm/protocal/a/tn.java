package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class tn extends com.tencent.mm.ao.a
{
  public int hOi;
  public int hTp;
  public ws hTq;
  public String ieD;
  public ef ioz;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.ioz == null) || (this.hTq == null))
      throw new b("Not all required fields were included");
    if (this.ioz != null)
    {
      parama.bv(1, this.ioz.hD());
      this.ioz.a(parama);
    }
    parama.by(2, this.hTp);
    if (this.hTq != null)
    {
      parama.bv(3, this.hTq.hD());
      this.hTq.a(parama);
    }
    parama.by(4, this.hOi);
    if (this.ieD != null)
      parama.I(5, this.ieD);
  }

  public final int hD()
  {
    ef localef = this.ioz;
    int i = 0;
    if (localef != null)
      i = 0 + b.a.a.a.bs(1, this.ioz.hD());
    int j = i + b.a.a.a.br(2, this.hTp);
    if (this.hTq != null)
      j += b.a.a.a.bs(3, this.hTq.hD());
    int k = j + b.a.a.a.br(4, this.hOi);
    if (this.ieD != null)
      k += b.a.a.b.b.a.J(5, this.ieD);
    return k;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.tn
 * JD-Core Version:    0.6.2
 */