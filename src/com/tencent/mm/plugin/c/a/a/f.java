package com.tencent.mm.plugin.c.a.a;

final class f
  implements Runnable
{
  private long eil = 0L;
  private long eim = 0L;

  public f(b paramb, long paramLong1, long paramLong2)
  {
    this.eil = paramLong1;
    this.eim = paramLong2;
  }

  public final void run()
  {
    long l = b.b(this.eik, this.eil);
    if (this.eik.eic != null)
      this.eik.eic.a(l, this.eil, this.eim);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.c.a.a.f
 * JD-Core Version:    0.6.2
 */