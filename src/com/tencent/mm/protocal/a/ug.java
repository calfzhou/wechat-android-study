package com.tencent.mm.protocal.a;

public final class ug extends vn
{
  public int ipe;
  public String ipf;
  public int ipg;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.ipe);
    if (this.ipf != null)
      parama.I(3, this.ipf);
    parama.by(4, this.ipg);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.ipe);
    if (this.ipf != null)
      j += b.a.a.b.b.a.J(3, this.ipf);
    return j + b.a.a.a.br(4, this.ipg);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ug
 * JD-Core Version:    0.6.2
 */