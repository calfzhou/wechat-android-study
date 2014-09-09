package com.tencent.mm.protocal.a;

public final class ls extends vn
{
  public String gnq;
  public int hQk;
  public int hUu;
  public int icf;
  public int icg;
  public String ich;
  public int ici;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hRy != null)
    {
      parama.bv(1, this.hRy.hD());
      this.hRy.a(parama);
    }
    if (this.gnq != null)
      parama.I(2, this.gnq);
    parama.by(3, this.icf);
    parama.by(4, this.icg);
    if (this.ich != null)
      parama.I(5, this.ich);
    parama.by(6, this.hQk);
    parama.by(7, this.hUu);
    parama.by(8, this.ici);
  }

  public final int hD()
  {
    ba localba = this.hRy;
    int i = 0;
    if (localba != null)
      i = 0 + b.a.a.a.bs(1, this.hRy.hD());
    if (this.gnq != null)
      i += b.a.a.b.b.a.J(2, this.gnq);
    int j = i + b.a.a.a.br(3, this.icf) + b.a.a.a.br(4, this.icg);
    if (this.ich != null)
      j += b.a.a.b.b.a.J(5, this.ich);
    return j + b.a.a.a.br(6, this.hQk) + b.a.a.a.br(7, this.hUu) + b.a.a.a.br(8, this.ici);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ls
 * JD-Core Version:    0.6.2
 */