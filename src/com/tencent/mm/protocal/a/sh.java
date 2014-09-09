package com.tencent.mm.protocal.a;

public final class sh extends com.tencent.mm.ao.a
{
  public String gnq;
  public String hVg;
  public int hWK;
  public int ilX;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hVg != null)
      parama.I(1, this.hVg);
    if (this.gnq != null)
      parama.I(2, this.gnq);
    parama.by(3, this.ilX);
    parama.by(4, this.hWK);
  }

  public final int hD()
  {
    String str = this.hVg;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hVg);
    if (this.gnq != null)
      i += b.a.a.b.b.a.J(2, this.gnq);
    return i + b.a.a.a.br(3, this.ilX) + b.a.a.a.br(4, this.hWK);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.sh
 * JD-Core Version:    0.6.2
 */