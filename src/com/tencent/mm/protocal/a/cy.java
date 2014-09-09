package com.tencent.mm.protocal.a;

public final class cy extends vn
{
  public String hPq;
  public String hPs;
  public String hTf;
  public int hTg;
  public int hTh;

  public final void a(b.a.a.c.a parama)
  {
    if (this.hTf != null)
      parama.I(1, this.hTf);
    if (this.hPq != null)
      parama.I(2, this.hPq);
    if (this.hPs != null)
      parama.I(3, this.hPs);
    parama.by(4, this.hTg);
    parama.by(5, this.hTh);
  }

  public final int hD()
  {
    String str = this.hTf;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.hTf);
    if (this.hPq != null)
      i += b.a.a.b.b.a.J(2, this.hPq);
    if (this.hPs != null)
      i += b.a.a.b.b.a.J(3, this.hPs);
    return i + b.a.a.a.br(4, this.hTg) + b.a.a.a.br(5, this.hTh);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.cy
 * JD-Core Version:    0.6.2
 */