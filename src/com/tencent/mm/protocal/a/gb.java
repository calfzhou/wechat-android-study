package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class gb extends vn
{
  public String eJv;
  public String hQG;
  public int hQH;
  public ws hRd;
  public String hRg;
  public String hRj;
  public String hVI;
  public String hVJ;
  public int hVK;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRd == null)
      throw new b("Not all required fields were included");
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hRd != null)
    {
      parama.bv(2, this.hRd.hD());
      this.hRd.a(parama);
    }
    parama.by(3, this.hQH);
    if (this.hQG != null)
      parama.I(4, this.hQG);
    if (this.eJv != null)
      parama.I(5, this.eJv);
    if (this.hRj != null)
      parama.I(6, this.hRj);
    if (this.hVI != null)
      parama.I(7, this.hVI);
    if (this.hRg != null)
      parama.I(8, this.hRg);
    if (this.hVJ != null)
      parama.I(9, this.hVJ);
    parama.by(10, this.hVK);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hRd != null)
      i += b.a.a.a.bs(2, this.hRd.hD());
    int j = i + b.a.a.a.br(3, this.hQH);
    if (this.hQG != null)
      j += b.a.a.b.b.a.J(4, this.hQG);
    if (this.eJv != null)
      j += b.a.a.b.b.a.J(5, this.eJv);
    if (this.hRj != null)
      j += b.a.a.b.b.a.J(6, this.hRj);
    if (this.hVI != null)
      j += b.a.a.b.b.a.J(7, this.hVI);
    if (this.hRg != null)
      j += b.a.a.b.b.a.J(8, this.hRg);
    if (this.hVJ != null)
      j += b.a.a.b.b.a.J(9, this.hVJ);
    return j + b.a.a.a.br(10, this.hVK);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.gb
 * JD-Core Version:    0.6.2
 */