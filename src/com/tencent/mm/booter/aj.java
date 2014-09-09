package com.tencent.mm.booter;

import com.tencent.mm.ah.c;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.storage.e;

public final class aj
{
  private static long dbk = 86400000L;

  public static void run()
  {
    if (1000L * ap.ab(Long.valueOf(ap.a((Long)bg.qW().oQ().get(81944))).longValue()) > dbk);
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
        c.zI().update();
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.aj
 * JD-Core Version:    0.6.2
 */