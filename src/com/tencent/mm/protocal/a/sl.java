package com.tencent.mm.protocal.a;

public final class sl extends com.tencent.mm.ao.a
{
  public String hwQ;
  public String imq;

  public final void a(b.a.a.c.a parama)
  {
    if (this.imq != null)
      parama.I(1, this.imq);
    if (this.hwQ != null)
      parama.I(2, this.hwQ);
  }

  public final int hD()
  {
    String str = this.imq;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.imq);
    if (this.hwQ != null)
      i += b.a.a.b.b.a.J(2, this.hwQ);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.sl
 * JD-Core Version:    0.6.2
 */