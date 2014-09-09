package com.tencent.mm.sdk.platformtools;

import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class bs extends Thread
{
  private int iFp = 60;

  private bs(bp parambp)
  {
    super(bp.b(parambp));
    setPriority(bp.c(parambp));
    bp.d(parambp).add(this);
  }

  public final void run()
  {
    while (true)
    {
      if (this.iFp > 0);
      try
      {
        label37: synchronized (bp.e(this.iFo))
        {
          if (bp.f(this.iFo))
            bp.e(this.iFo).wait();
        }
        br localbr;
        try
        {
          localbr = (br)bp.g(this.iFo).poll(2000L, TimeUnit.MILLISECONDS);
          if (localbr == null)
          {
            this.iFp = (-1 + this.iFp);
            continue;
            localObject2 = finally;
            throw localObject2;
          }
        }
        catch (Exception localException2)
        {
          while (true)
            localbr = null;
          this.iFp = 60;
        }
        if (!localbr.rD())
          continue;
        bp.h(this.iFo).sendMessage(bp.h(this.iFo).obtainMessage(0, localbr));
        continue;
        bp.d(this.iFo).remove(this);
        z.d("!56@1vpV4H6/Dg9+MyOLQz8RMq550HsmviC6Zq3QPW/02X323tNqmpb/gQ==", "dktest Finish queueToReqSize:" + bp.g(this.iFo).size() + " ThreadSize:" + bp.d(this.iFo).size());
        return;
      }
      catch (Exception localException1)
      {
        break label37;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bs
 * JD-Core Version:    0.6.2
 */