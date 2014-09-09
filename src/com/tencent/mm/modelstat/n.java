package com.tencent.mm.modelstat;

import com.tencent.mm.compatible.g.m;
import com.tencent.mm.protocal.a.aat;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Queue;

final class n
  implements Runnable
{
  n(l paraml, int paramInt, String paramString, Object paramObject)
  {
  }

  public final void run()
  {
    int i = 1;
    q localq1 = l.a(this.dFc);
    long l1 = ch.CL();
    localq1.dFf[i] = l1;
    aat localaat = l.Am();
    if (99999 == this.dEz);
    while (true)
    {
      if (!m.nI())
        l.b(this.dFc);
      int j;
      do
      {
        while (true)
        {
          return;
          if (99998 == this.dEz)
          {
            Thread localThread = new Thread(new o(this), "ipxx_upload_wd");
            localThread.setPriority(i);
            localThread.start();
            i = 0;
            break;
          }
          try
          {
            while (true)
            {
              int m = l.a(this.dFc, this.dEz, localaat, this.dFd);
              k = m;
              if (k != i)
                break label357;
              l.a(this.dFc).eC(10);
              if (l.a(this.dFc).dFf[10] % 50L == 0L)
                try
                {
                  byte[] arrayOfByte = localaat.toByteArray();
                  this.dFc.dER.offer(arrayOfByte);
                }
                catch (Exception localException2)
                {
                }
            }
          }
          catch (Exception localException1)
          {
            while (true)
            {
              int k = 0;
              continue;
              i = 0;
            }
          }
        }
        j = (int)l.a(this.dFc).dFf[10];
        if (i != 0)
          l.c(this.dFc);
      }
      while (j < 200);
      z.d("!44@/B4Tb64lLpKaLNAssnLXZlcG2zPUeUT81WH3tbN3U0g=", "close old file cnt:" + j + " now:" + ch.CL() + " next:" + l.d(this.dFc));
      l.c(this.dFc);
      l.b(this.dFc);
      l.a(this.dFc, new q());
      q localq2 = l.a(this.dFc);
      long l2 = ch.CL();
      localq2.dFf[0] = l2;
      l.e(this.dFc);
      l.a(this.dFc, 43200L + ch.CL());
      return;
      label357: i = 0;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.n
 * JD-Core Version:    0.6.2
 */