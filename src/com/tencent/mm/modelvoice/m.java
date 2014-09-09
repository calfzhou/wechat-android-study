package com.tencent.mm.modelvoice;

import com.tencent.mm.sdk.platformtools.z;
import java.io.FileOutputStream;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

final class m extends Thread
{
  private m(j paramj)
  {
  }

  public final void run()
  {
    while (!j.a(this.dGK))
    {
      boolean bool;
      synchronized (this.dGK)
      {
        bool = j.b(this.dGK);
        z.i("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "ThreadAmr in :" + bool + " cnt :" + j.c(this.dGK).size());
        if (bool)
          if (j.c(this.dGK).isEmpty())
            break;
      }
      k localk;
      try
      {
        localk = (k)j.c(this.dGK).poll(200L, TimeUnit.MILLISECONDS);
        if (localk != null)
          break label171;
        z.e("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "poll byte null file:" + j.d(this.dGK));
        continue;
        localObject = finally;
        throw localObject;
      }
      catch (InterruptedException localInterruptedException)
      {
        z.i("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "ThreadAmr poll null");
      }
      continue;
      label171: j.a(this.dGK, j.c(this.dGK).size());
      if ((j.e(this.dGK) > 10) || (bool))
      {
        z.w("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "speed up amrcodec queue:" + j.e(this.dGK) + " stop:" + bool);
        j.b(this.dGK, 0);
      }
      while (true)
      {
        if ((j.Bm().count >= 10) && (j.Bm().ddB > 240L))
          j.b(this.dGK, 0);
        j.a(this.dGK, localk, j.f(this.dGK));
        break;
        if (j.e(this.dGK) < 9)
          j.b(this.dGK, 1);
      }
    }
    try
    {
      j.g(this.dGK).close();
      if (!j.a(this.dGK))
      {
        j.h(this.dGK);
        MediaRecorder.Bl();
        z.d("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "finish Thread :" + j.d(this.dGK));
      }
      return;
    }
    catch (Exception localException)
    {
      while (true)
        z.e("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "close amr file:" + j.d(this.dGK) + "msg:" + localException.getMessage());
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.m
 * JD-Core Version:    0.6.2
 */