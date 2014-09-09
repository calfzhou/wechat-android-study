package com.tencent.mm.protocal.b.a;

import java.util.LinkedList;

public final class a extends com.tencent.mm.ao.a
{
  public LinkedList dRV = new LinkedList();
  public String desc;
  public String hNW;
  public String title;

  public final void a(b.a.a.c.a parama)
  {
    if (this.title != null)
      parama.I(1, this.title);
    if (this.desc != null)
      parama.I(2, this.desc);
    parama.d(3, 8, this.dRV);
    if (this.hNW != null)
      parama.I(4, this.hNW);
  }

  public final int hD()
  {
    String str = this.title;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.title);
    if (this.desc != null)
      i += b.a.a.b.b.a.J(2, this.desc);
    int j = i + b.a.a.a.c(3, 8, this.dRV);
    if (this.hNW != null)
      j += b.a.a.b.b.a.J(4, this.hNW);
    return j;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.b.a.a
 * JD-Core Version:    0.6.2
 */