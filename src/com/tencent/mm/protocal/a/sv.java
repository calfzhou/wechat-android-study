package com.tencent.mm.protocal.a;

public final class sv extends com.tencent.mm.ao.a
{
  public int imE;
  public String imq;

  public final void a(b.a.a.c.a parama)
  {
    if (this.imq != null)
      parama.I(1, this.imq);
    parama.by(2, this.imE);
  }

  public final int hD()
  {
    String str = this.imq;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.imq);
    return i + b.a.a.a.br(2, this.imE);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.sv
 * JD-Core Version:    0.6.2
 */