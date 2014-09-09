package com.tencent.mm.pluginsdk.d.a;

import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class a
{
  private CountDownLatch huc = null;

  public final void a(long paramLong, Runnable paramRunnable)
  {
    if (this.huc == null)
      this.huc = new CountDownLatch(1);
    am.h(paramRunnable);
    if (this.huc != null);
    try
    {
      this.huc.await(paramLong, TimeUnit.MILLISECONDS);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      z.w("!32@/B4Tb64lLpKFlnpbg/Va1O9HKulZRc5c", localInterruptedException.getMessage());
    }
  }

  public final void countDown()
  {
    if (this.huc != null)
    {
      this.huc.countDown();
      this.huc = null;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.d.a.a
 * JD-Core Version:    0.6.2
 */