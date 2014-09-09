package com.tencent.mm.protocal.a;

public final class nz extends vn
{
  public int hQk;
  public int hUu;
  public int iah;
  public int ieb;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    parama.by(2, this.ieb);
    parama.by(3, this.hQk);
    parama.by(4, this.hUu);
    parama.by(5, this.iah);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    return i + b.a.a.a.br(2, this.ieb) + b.a.a.a.br(3, this.hQk) + b.a.a.a.br(4, this.hUu) + b.a.a.a.br(5, this.iah);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.nz
 * JD-Core Version:    0.6.2
 */