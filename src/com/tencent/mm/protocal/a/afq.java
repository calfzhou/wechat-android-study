package com.tencent.mm.protocal.a;

public final class afq extends vn
{
  public int hWC;
  public long hWD;
  public int iyf;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hWC);
    parama.k(3, this.hWD);
    parama.by(4, this.iyf);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    return i + b.a.a.a.br(2, this.hWC) + b.a.a.a.i(3, this.hWD) + b.a.a.a.br(4, this.iyf);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.afq
 * JD-Core Version:    0.6.2
 */