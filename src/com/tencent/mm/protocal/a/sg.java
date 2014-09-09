package com.tencent.mm.protocal.a;

public final class sg extends com.tencent.mm.ao.a
{
  public String gnq;
  public String hTx;
  public String hVg;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hVg != null)
      parama.I(1, this.hVg);
    if (this.gnq != null)
      parama.I(2, this.gnq);
    if (this.hTx != null)
      parama.I(3, this.hTx);
  }

  public final int hD()
  {
    String str = this.hVg;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hVg);
    if (this.gnq != null)
      i += b.a.a.b.b.a.J(2, this.gnq);
    if (this.hTx != null)
      i += b.a.a.b.b.a.J(3, this.hTx);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.sg
 * JD-Core Version:    0.6.2
 */