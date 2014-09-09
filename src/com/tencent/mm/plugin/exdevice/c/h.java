package com.tencent.mm.plugin.exdevice.c;

public final class h extends com.tencent.mm.ao.a
{
  public com.tencent.mm.ao.b dZx;
  public c eJO;
  public int ewb;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.eJO == null) || (this.dZx == null))
      throw new b.a.a.b("Not all required fields were included");
    if (this.eJO != null)
    {
      parama.bv(1, this.eJO.hD());
      this.eJO.a(parama);
    }
    if (this.dZx != null)
      parama.c(2, this.dZx);
    parama.by(3, this.ewb);
  }

  public final int hD()
  {
    c localc = this.eJO;
    int i = 0;
    if (localc != null)
      i = 0 + b.a.a.a.bs(1, this.eJO.hD());
    if (this.dZx != null)
      i += b.a.a.a.a(2, this.dZx);
    return i + b.a.a.a.br(3, this.ewb);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.c.h
 * JD-Core Version:    0.6.2
 */