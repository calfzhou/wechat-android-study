package com.tencent.mm.protocal.a;

import com.tencent.mm.ao.b;

public final class acj extends com.tencent.mm.ao.a
{
  public int ivW;
  public int ivX;
  public String ivY;
  public b ivZ;
  public int iwa;
  public int iwb;

  public final void a(b.a.a.c.a parama)
  {
    parama.by(1, this.ivW);
    parama.by(2, this.ivX);
    if (this.ivY != null)
      parama.I(3, this.ivY);
    if (this.ivZ != null)
      parama.c(4, this.ivZ);
    parama.by(5, this.iwa);
    parama.by(6, this.iwb);
  }

  public final int hD()
  {
    int i = 0 + b.a.a.a.br(1, this.ivW) + b.a.a.a.br(2, this.ivX);
    if (this.ivY != null)
      i += b.a.a.b.b.a.J(3, this.ivY);
    if (this.ivZ != null)
      i += b.a.a.a.a(4, this.ivZ);
    return i + b.a.a.a.br(5, this.iwa) + b.a.a.a.br(6, this.iwb);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.acj
 * JD-Core Version:    0.6.2
 */