package com.tencent.mm.protocal.a;

public final class uw extends vn
{
  public String hSc;
  public String hTI;
  public String ipH;
  public String ipI;
  public int ipJ;
  public int ipg;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.hSc != null)
      parama.I(2, this.hSc);
    if (this.ipH != null)
      parama.I(3, this.ipH);
    if (this.ipI != null)
      parama.I(4, this.ipI);
    parama.by(5, this.ipg);
    if (this.hTI != null)
      parama.I(7, this.hTI);
    parama.by(8, this.ipJ);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.hSc != null)
      i += b.a.a.b.b.a.J(2, this.hSc);
    if (this.ipH != null)
      i += b.a.a.b.b.a.J(3, this.ipH);
    if (this.ipI != null)
      i += b.a.a.b.b.a.J(4, this.ipI);
    int j = i + b.a.a.a.br(5, this.ipg);
    if (this.hTI != null)
      j += b.a.a.b.b.a.J(7, this.hTI);
    return j + b.a.a.a.br(8, this.ipJ);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.uw
 * JD-Core Version:    0.6.2
 */