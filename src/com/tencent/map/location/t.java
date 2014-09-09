package com.tencent.map.location;

final class t
  implements Runnable
{
  t(s params)
  {
  }

  public final void run()
  {
    if (System.currentTimeMillis() - s.a(this.Me) < 8000L)
      return;
    if ((s.b(this.Me).gZ()) && (s.b(this.Me).hd()))
    {
      s.b(this.Me).f(0L);
      return;
    }
    s.c(this.Me);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.map.location.t
 * JD-Core Version:    0.6.2
 */