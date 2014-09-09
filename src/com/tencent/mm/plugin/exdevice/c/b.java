package com.tencent.mm.plugin.exdevice.c;

public final class b extends j
{
  public com.tencent.mm.ao.b eJx;

  public final void a(b.a.a.c.a parama)
  {
    if ((this.eJQ == null) || (this.eJx == null))
      throw new b.a.a.b("Not all required fields were included");
    if (this.eJQ != null)
    {
      parama.bv(1, this.eJQ.hD());
      this.eJQ.a(parama);
    }
    if (this.eJx != null)
      parama.c(2, this.eJx);
  }

  public final int hD()
  {
    e locale = this.eJQ;
    int i = 0;
    if (locale != null)
      i = 0 + b.a.a.a.bs(1, this.eJQ.hD());
    if (this.eJx != null)
      i += b.a.a.a.a(2, this.eJx);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.c.b
 * JD-Core Version:    0.6.2
 */