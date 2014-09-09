package com.tencent.mm.plugin.exdevice.c;

import b.a.a.b;

public final class n extends com.tencent.mm.ao.a
{
  public c eJO;
  public int eJS;
  public int eJT;

  public final void a(b.a.a.c.a parama)
  {
    if (this.eJO == null)
      throw new b("Not all required fields were included");
    if (this.eJO != null)
    {
      parama.bv(1, this.eJO.hD());
      this.eJO.a(parama);
    }
    parama.by(2, this.eJS);
    parama.by(3, this.eJT);
  }

  public final int hD()
  {
    c localc = this.eJO;
    int i = 0;
    if (localc != null)
      i = 0 + b.a.a.a.bs(1, this.eJO.hD());
    return i + b.a.a.a.br(2, this.eJS) + b.a.a.a.br(3, this.eJT);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.c.n
 * JD-Core Version:    0.6.2
 */