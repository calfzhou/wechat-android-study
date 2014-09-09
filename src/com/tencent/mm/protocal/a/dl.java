package com.tencent.mm.protocal.a;

public final class dl extends com.tencent.mm.ao.a
{
  public String hTB;
  public String hTC;
  public String hTD;
  public int hTE;
  public int hTF;
  public String hTG;
  public int hTH;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hTB != null)
      parama.I(1, this.hTB);
    if (this.hTC != null)
      parama.I(2, this.hTC);
    if (this.hTD != null)
      parama.I(3, this.hTD);
    parama.by(4, this.hTE);
    parama.by(5, this.hTF);
    if (this.hTG != null)
      parama.I(6, this.hTG);
    parama.by(7, this.hTH);
  }

  public final int hD()
  {
    String str = this.hTB;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hTB);
    if (this.hTC != null)
      i += b.a.a.b.b.a.J(2, this.hTC);
    if (this.hTD != null)
      i += b.a.a.b.b.a.J(3, this.hTD);
    int j = i + b.a.a.a.br(4, this.hTE) + b.a.a.a.br(5, this.hTF);
    if (this.hTG != null)
      j += b.a.a.b.b.a.J(6, this.hTG);
    return j + b.a.a.a.br(7, this.hTH);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.dl
 * JD-Core Version:    0.6.2
 */