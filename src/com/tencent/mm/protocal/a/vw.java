package com.tencent.mm.protocal.a;

public final class vw extends vn
{
  public ws hRJ;
  public int iqy;
  public ws iqz;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.iqy);
    if (this.hRJ != null)
    {
      parama.bv(3, this.hRJ.hD());
      this.hRJ.a(parama);
    }
    if (this.iqz != null)
    {
      parama.bv(4, this.iqz.hD());
      this.iqz.a(parama);
    }
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    int j = i + b.a.a.a.br(2, this.iqy);
    if (this.hRJ != null)
      j += b.a.a.a.bs(3, this.hRJ.hD());
    if (this.iqz != null)
      j += b.a.a.a.bs(4, this.iqz.hD());
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.vw
 * JD-Core Version:    0.6.2
 */