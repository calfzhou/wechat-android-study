package com.tencent.mm.protocal.a;

public final class aef extends com.tencent.mm.ao.a
{
  public String gnq;
  public String hVh;

  public final void a(b.a.a.c.a parama)
  {
    if (this.gnq != null)
      parama.I(1, this.gnq);
    if (this.hVh != null)
      parama.I(2, this.hVh);
  }

  public final int hD()
  {
    String str = this.gnq;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.gnq);
    if (this.hVh != null)
      i += b.a.a.b.b.a.J(2, this.hVh);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aef
 * JD-Core Version:    0.6.2
 */