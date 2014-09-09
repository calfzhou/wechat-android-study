package com.tencent.mm.y;

import com.tencent.mm.compatible.g.l;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;

final class y
  implements Runnable
{
  y(v paramv)
  {
  }

  public final void run()
  {
    long l = System.currentTimeMillis() - v.f(this.dyd);
    if (v.g(this.dyd))
    {
      if (l < 60000L)
        return;
      z.e("!32@/B4Tb64lLpItZQqBsJlKfJDbcgjEYBqK", "ERR: Try Run service runningFlag:" + v.g(this.dyd) + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + v.g(this.dyd));
    }
    v.h(this.dyd);
    v.i(this.dyd);
    this.dyd.dyb.reset();
    v.j(this.dyd).cP(10L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.y
 * JD-Core Version:    0.6.2
 */