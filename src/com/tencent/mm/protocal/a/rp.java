package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class rp extends vn
{
  public int hOR;
  public ws hQt;
  public int icN;
  public int ihC;
  public int ihD;
  public int ihE;
  public String ihp;
  public String ihq;
  public String ihr;
  public int ihs;
  public int iht;
  public int ihu;
  public int ihv;
  public int ihw;
  public ws ihx;
  public int ihy;
  public int ihz;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.hQt == null) || (this.ihx == null))
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.ihp != null)
      parama.I(2, this.ihp);
    if (this.ihq != null)
      parama.I(3, this.ihq);
    if (this.ihr != null)
      parama.I(4, this.ihr);
    parama.by(5, this.hOR);
    parama.by(6, this.ihs);
    if (this.hQt != null)
    {
      parama.bv(7, this.hQt.hD());
      this.hQt.a(parama);
    }
    parama.by(8, this.iht);
    parama.by(9, this.ihu);
    parama.by(10, this.ihv);
    parama.by(11, this.ihw);
    if (this.ihx != null)
    {
      parama.bv(12, this.ihx.hD());
      this.ihx.a(parama);
    }
    parama.by(13, this.ihy);
    parama.by(14, this.ihz);
    parama.by(15, this.ihC);
    parama.by(16, this.ihD);
    parama.by(17, this.icN);
    parama.by(18, this.ihE);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.ihp != null)
      i += b.a.a.b.b.a.J(2, this.ihp);
    if (this.ihq != null)
      i += b.a.a.b.b.a.J(3, this.ihq);
    if (this.ihr != null)
      i += b.a.a.b.b.a.J(4, this.ihr);
    int j = i + b.a.a.a.br(5, this.hOR) + b.a.a.a.br(6, this.ihs);
    if (this.hQt != null)
      j += b.a.a.a.bs(7, this.hQt.hD());
    int k = j + b.a.a.a.br(8, this.iht) + b.a.a.a.br(9, this.ihu) + b.a.a.a.br(10, this.ihv) + b.a.a.a.br(11, this.ihw);
    if (this.ihx != null)
      k += b.a.a.a.bs(12, this.ihx.hD());
    return k + b.a.a.a.br(13, this.ihy) + b.a.a.a.br(14, this.ihz) + b.a.a.a.br(15, this.ihC) + b.a.a.a.br(16, this.ihD) + b.a.a.a.br(17, this.icN) + b.a.a.a.br(18, this.ihE);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.rp
 * JD-Core Version:    0.6.2
 */