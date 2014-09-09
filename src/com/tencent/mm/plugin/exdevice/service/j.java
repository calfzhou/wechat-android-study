package com.tencent.mm.plugin.exdevice.service;

import com.tencent.mm.plugin.c.a.c.a;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;
import java.util.concurrent.CountDownLatch;

final class j
  implements Runnable
{
  j(i parami)
  {
  }

  public final void run()
  {
    i.a(this.eKj, new a(ak.getContext(), this.eKj, ao.PP().PQ()));
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLle80sXR2O3t2U/R9gkfKlA==", "now notify");
    i.a(this.eKj).countDown();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.j
 * JD-Core Version:    0.6.2
 */