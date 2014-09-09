package com.tencent.mm.protocal.a;

public final class ww extends com.tencent.mm.ao.a
{
  public int huF;
  public String idg;
  public String ipR;
  public String ipS;

  public final void a(b.a.a.c.a parama)
  {
    if (this.idg != null)
      parama.I(1, this.idg);
    if (this.ipS != null)
      parama.I(2, this.ipS);
    parama.by(3, this.huF);
    if (this.ipR != null)
      parama.I(4, this.ipR);
  }

  public final int hD()
  {
    String str = this.idg;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.idg);
    if (this.ipS != null)
      i += b.a.a.b.b.a.J(2, this.ipS);
    int j = i + b.a.a.a.br(3, this.huF);
    if (this.ipR != null)
      j += b.a.a.b.b.a.J(4, this.ipR);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ww
 * JD-Core Version:    0.6.2
 */