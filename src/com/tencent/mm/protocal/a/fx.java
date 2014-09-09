package com.tencent.mm.protocal.a;

public final class fx extends vn
{
  public int hOO;
  public long hOY;
  public int hQk;
  public int hUu;
  public int hVF;
  public int hVG;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.hOO);
    parama.by(3, this.hQk);
    parama.by(4, this.hUu);
    parama.by(5, this.hVF);
    parama.by(6, this.hVG);
    parama.k(7, this.hOY);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    return i + b.a.a.a.br(2, this.hOO) + b.a.a.a.br(3, this.hQk) + b.a.a.a.br(4, this.hUu) + b.a.a.a.br(5, this.hVF) + b.a.a.a.br(6, this.hVG) + b.a.a.a.i(7, this.hOY);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.fx
 * JD-Core Version:    0.6.2
 */