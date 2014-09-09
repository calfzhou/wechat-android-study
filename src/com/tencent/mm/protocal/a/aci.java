package com.tencent.mm.protocal.a;

import com.tencent.mm.ao.b;

public final class aci extends com.tencent.mm.ao.a
{
  public b ivU;
  public String ivV;

  public final void a(b.a.a.c.a parama)
  {
    if (this.ivU != null)
      parama.c(1, this.ivU);
    if (this.ivV != null)
      parama.I(2, this.ivV);
  }

  public final int hD()
  {
    b localb = this.ivU;
    int i = 0;
    if (localb != null)
      i = 0 + b.a.a.a.a(1, this.ivU);
    if (this.ivV != null)
      i += b.a.a.b.b.a.J(2, this.ivV);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.aci
 * JD-Core Version:    0.6.2
 */