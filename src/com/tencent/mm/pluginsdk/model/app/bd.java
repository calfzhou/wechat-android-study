package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.compatible.g.l;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;

final class bd
  implements Runnable
{
  bd(bb parambb)
  {
  }

  public final void run()
  {
    long l = System.currentTimeMillis() - bb.j(this.hvx);
    z.d("!32@/B4Tb64lLpLoJPSIVxJcckmKhlwfO3bY", "Try Run service runningFlag:" + bb.e(this.hvx) + " timeWait:" + l + " sending:" + bb.g(this.hvx) + " recving:" + bb.f(this.hvx));
    if (bb.e(this.hvx))
    {
      if (l < 60000L)
        return;
      z.e("!32@/B4Tb64lLpLoJPSIVxJcckmKhlwfO3bY", "ERR: Try Run service runningFlag:" + bb.e(this.hvx) + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + bb.g(this.hvx) + " recving:" + bb.f(this.hvx));
    }
    bb.k(this.hvx);
    bb.b(this.hvx);
    bb.a(this.hvx, 4);
    bb.a(this.hvx);
    this.hvx.dyb.reset();
    bb.l(this.hvx).cP(10L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.bd
 * JD-Core Version:    0.6.2
 */