package com.tencent.mm.protocal.a;

public final class ach extends com.tencent.mm.ao.a
{
  public String ivS;
  public String ivT;

  public final void a(b.a.a.c.a parama)
  {
    if (this.ivS != null)
      parama.I(1, this.ivS);
    if (this.ivT != null)
      parama.I(2, this.ivT);
  }

  public final int hD()
  {
    String str = this.ivS;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.ivS);
    if (this.ivT != null)
      i += b.a.a.b.b.a.J(2, this.ivT);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.ach
 * JD-Core Version:    0.6.2
 */