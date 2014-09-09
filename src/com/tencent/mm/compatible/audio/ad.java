package com.tencent.mm.compatible.audio;

import com.tencent.mm.sdk.platformtools.z;
import java.io.FileOutputStream;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

final class ad extends Thread
{
  private ad(aa paramaa)
  {
  }

  public final void run()
  {
    while (!aa.a(this.dKS))
    {
      boolean bool;
      synchronized (this.dKS)
      {
        bool = aa.b(this.dKS);
        z.d("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", "ThreadAmr in :" + bool + " cnt :" + aa.c(this.dKS).size());
        if (bool)
          if (aa.c(this.dKS).isEmpty())
            break;
      }
      ab localab;
      try
      {
        localab = (ab)aa.c(this.dKS).poll(200L, TimeUnit.MILLISECONDS);
        if (localab != null)
          break label167;
        z.d("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", "poll byte null file:" + aa.d(this.dKS));
        continue;
        localObject = finally;
        throw localObject;
      }
      catch (InterruptedException localInterruptedException)
      {
        z.d("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", "ThreadAmr poll null");
      }
      continue;
      label167: aa.a(this.dKS, aa.c(this.dKS).size());
      if ((aa.e(this.dKS) > 10) || (bool))
      {
        z.w("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", "speed up amrcodec queue:" + aa.e(this.dKS) + " stop:" + bool);
        aa.b(this.dKS, 0);
      }
      while (true)
      {
        if ((aa.mK().count >= 10) && (aa.mK().ddB > 240L))
          aa.b(this.dKS, 0);
        aa.a(this.dKS, localab, aa.f(this.dKS));
        break;
        if (aa.e(this.dKS) < 9)
          aa.b(this.dKS, 1);
      }
    }
    try
    {
      aa.g(this.dKS).close();
      if (!aa.a(this.dKS))
      {
        SimpleMediaRecorder.mJ();
        z.d("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", "finish Thread :" + aa.d(this.dKS));
      }
      return;
    }
    catch (Exception localException)
    {
      while (true)
        z.e("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", "close amr file:" + aa.d(this.dKS) + "msg:" + localException.getMessage());
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.audio.ad
 * JD-Core Version:    0.6.2
 */