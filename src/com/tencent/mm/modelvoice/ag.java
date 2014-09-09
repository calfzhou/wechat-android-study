package com.tencent.mm.modelvoice;

import com.tencent.mm.compatible.c.a;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.sdk.platformtools.am;

final class ag
  implements Runnable
{
  ag(af paramaf)
  {
  }

  public final void run()
  {
    try
    {
      if (v.dNC.dLl == 1)
        Thread.sleep(300L);
      if (ac.c(this.dHw.dHu) != null)
        am.h(new ah(this));
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.ag
 * JD-Core Version:    0.6.2
 */