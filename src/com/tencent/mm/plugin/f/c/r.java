package com.tencent.mm.plugin.f.c;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ch;

final class r
  implements Runnable
{
  r(q paramq)
  {
  }

  public final void run()
  {
    if (!bg.oE())
      return;
    ch.g(bg.qW().pq(), "temp_", 10800000L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.c.r
 * JD-Core Version:    0.6.2
 */