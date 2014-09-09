package com.tencent.mm.compatible.loader;

import android.os.Process;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.cb;
import com.tencent.mm.sdk.platformtools.ch;

final class o extends cb
{
  o(n paramn)
  {
    super(2000L, null);
  }

  private static String nE()
  {
    String str;
    while (true)
    {
      str = ch.w(ak.getContext(), Process.myPid());
      if (str != null)
        break;
      try
      {
        Thread.sleep(100L);
      }
      catch (InterruptedException localInterruptedException)
      {
      }
    }
    return str;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.loader.o
 * JD-Core Version:    0.6.2
 */