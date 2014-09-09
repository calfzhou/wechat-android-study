package com.tencent.mm.plugin.c.a.b;

final class e
  implements Runnable
{
  private long eil = 0L;
  private long eim = 0L;

  public e(a parama, long paramLong1, long paramLong2)
  {
    this.eil = paramLong1;
    this.eim = paramLong2;
  }

  public final void run()
  {
    long l = this.eiS.ah(this.eil);
    if (this.eiS.eiP != null)
      this.eiS.eiP.a(l, this.eil, this.eim);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.c.a.b.e
 * JD-Core Version:    0.6.2
 */