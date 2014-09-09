package com.tencent.mm.protocal.a;

public final class aaw extends com.tencent.mm.ao.a
{
  public String KH;
  public String iuN;

  public final void a(b.a.a.c.a parama)
  {
    if (this.KH != null)
      parama.I(1, this.KH);
    if (this.iuN != null)
      parama.I(2, this.iuN);
  }

  public final int hD()
  {
    String str = this.KH;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.KH);
    if (this.iuN != null)
      i += b.a.a.b.b.a.J(2, this.iuN);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aaw
 * JD-Core Version:    0.6.2
 */