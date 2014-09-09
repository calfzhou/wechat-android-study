package com.tencent.mm.ak;

import com.tencent.mm.compatible.g.l;
import com.tencent.mm.sdk.platformtools.ay;

final class ab
  implements Runnable
{
  ab(z paramz)
  {
  }

  public final void run()
  {
    long l = System.currentTimeMillis() - z.l(this.dGx);
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpLVp/k2HKC5ReM1DewbkulZ", "Try Run service runningFlag:" + z.g(this.dGx) + " timeWait:" + l + " sending:" + z.i(this.dGx) + " recving:" + z.h(this.dGx));
    if (z.g(this.dGx))
    {
      if (l < 60000L)
        return;
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpLVp/k2HKC5ReM1DewbkulZ", "ERR: Try Run service runningFlag:" + z.g(this.dGx) + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + z.i(this.dGx) + " recving:" + z.h(this.dGx));
    }
    z.a(this.dGx, 3);
    z.m(this.dGx);
    z.c(this.dGx);
    z.a(this.dGx);
    z.d(this.dGx);
    z.b(this.dGx);
    this.dGx.dyb.reset();
    z.n(this.dGx).cP(10L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ak.ab
 * JD-Core Version:    0.6.2
 */