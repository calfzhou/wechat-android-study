package com.tencent.mm.modelvoice;

import com.tencent.mm.sdk.platformtools.z;
import java.io.FileOutputStream;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

final class r extends Thread
{
  private r(o paramo)
  {
  }

  public final void run()
  {
    while (!o.a(this.dGR))
    {
      boolean bool;
      synchronized (this.dGR)
      {
        bool = o.b(this.dGR);
        z.i("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "SilkWriter ThreadSilk in :" + bool + " cnt :" + o.c(this.dGR).size());
        if (bool)
          if (o.c(this.dGR).isEmpty())
            break;
      }
      p localp;
      try
      {
        localp = (p)o.c(this.dGR).poll(200L, TimeUnit.MILLISECONDS);
        if (localp != null)
          break label171;
        z.i("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "SilkWriter poll byte null file:" + o.d(this.dGR));
        continue;
        localObject3 = finally;
        throw localObject3;
      }
      catch (InterruptedException localInterruptedException)
      {
        z.i("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "SilkWriter ThreadAmr poll null");
      }
      continue;
      label171: o.a(this.dGR, o.c(this.dGR).size());
      if ((o.e(this.dGR) > 10) || (bool))
      {
        z.w("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "SilkWriter speed up silkcodec queue:" + o.e(this.dGR) + " stop:" + bool);
        o.b(this.dGR, 0);
      }
      while (true)
      {
        if ((o.Bn().count >= 10) && (o.Bn().ddB > 240L))
          o.b(this.dGR, 0);
        o.a(this.dGR, localp, o.f(this.dGR));
        break;
        if (o.e(this.dGR) < 9)
          o.b(this.dGR, 1);
      }
    }
    try
    {
      o.g(this.dGR).close();
      if (o.a(this.dGR));
    }
    catch (Exception localException)
    {
      synchronized (o.h(this.dGR))
      {
        MediaRecorder.SilkEncUnInit();
        z.i("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "SilkWriter finish Thread file:" + o.d(this.dGR));
        return;
        localException = localException;
        z.e("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "SilkWriter close silk file:" + o.d(this.dGR) + "msg:" + localException.getMessage());
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.r
 * JD-Core Version:    0.6.2
 */