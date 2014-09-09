package com.tencent.mm.protocal.a;

import b.a.a.b;

public final class pn extends com.tencent.mm.ao.a
{
  public String ifr;
  public String ifs;
  public String ift;

  public final void a(b.a.a.c.a parama)
  {
    if (this.ifr == null)
      throw new b("Not all required fields were included");
    if (this.ifr != null)
      parama.I(1, this.ifr);
    if (this.ifs != null)
      parama.I(2, this.ifs);
    if (this.ift != null)
      parama.I(3, this.ift);
  }

  public final int hD()
  {
    String str = this.ifr;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.ifr);
    if (this.ifs != null)
      i += b.a.a.b.b.a.J(2, this.ifs);
    if (this.ift != null)
      i += b.a.a.b.b.a.J(3, this.ift);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.pn
 * JD-Core Version:    0.6.2
 */