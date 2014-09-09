package com.tencent.mm.booter;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.storage.e;

public final class ag
{
  public static boolean lx()
  {
    try
    {
      ap.b((Long)bg.qW().oQ().get(66817));
      label18: return 1000L * ap.ab(0L) > 1800000L;
    }
    catch (Exception localException)
    {
      break label18;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.ag
 * JD-Core Version:    0.6.2
 */