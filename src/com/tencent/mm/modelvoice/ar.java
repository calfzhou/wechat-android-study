package com.tencent.mm.modelvoice;

import com.tencent.mm.compatible.g.l;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;

final class ar
  implements Runnable
{
  ar(ap paramap)
  {
  }

  public final void run()
  {
    long l = System.currentTimeMillis() - ap.j(this.dHP);
    z.d("!32@/B4Tb64lLpJjyqE6YDnAp2GSi9zkoYuv", "Try Run service runningFlag:" + ap.e(this.dHP) + " timeWait:" + l + " sending:" + ap.g(this.dHP) + " recving:" + ap.f(this.dHP));
    if (ap.e(this.dHP))
    {
      if (l < 60000L)
        return;
      z.e("!32@/B4Tb64lLpJjyqE6YDnAp2GSi9zkoYuv", "ERR: Try Run service runningFlag:" + ap.e(this.dHP) + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + ap.g(this.dHP) + " recving:" + ap.f(this.dHP));
    }
    ap.k(this.dHP);
    ap.b(this.dHP);
    ap.a(this.dHP, 3);
    ap.a(this.dHP);
    this.dHP.dyb.reset();
    ap.l(this.dHP).cP(10L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.ar
 * JD-Core Version:    0.6.2
 */