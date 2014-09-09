package com.tencent.mm.plugin.exdevice.c;

public final class l extends j
{
  public com.tencent.mm.ao.b dZx;

  public final void a(b.a.a.c.a parama)
  {
    if (this.eJQ == null)
      throw new b.a.a.b("Not all required fields were included");
    if (this.eJQ != null)
    {
      parama.bv(1, this.eJQ.hD());
      this.eJQ.a(parama);
    }
    if (this.dZx != null)
      parama.c(2, this.dZx);
  }

  public final int hD()
  {
    e locale = this.eJQ;
    int i = 0;
    if (locale != null)
      i = 0 + b.a.a.a.bs(1, this.eJQ.hD());
    if (this.dZx != null)
      i += b.a.a.a.a(2, this.dZx);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.c.l
 * JD-Core Version:    0.6.2
 */