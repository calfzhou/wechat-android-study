package com.tencent.mm.plugin.voicereminder.a;

import com.tencent.mm.compatible.g.l;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;

final class x
  implements Runnable
{
  x(v paramv)
  {
  }

  public final void run()
  {
    long l = System.currentTimeMillis() - v.j(this.gSV);
    z.d("!44@/B4Tb64lLpLcQwGQMRj/JTqm3tSvFCTzMyP/DRnOfzs=", "Try Run service runningFlag:" + v.e(this.gSV) + " timeWait:" + l + " sending:" + v.g(this.gSV) + " recving:" + v.f(this.gSV));
    if (v.e(this.gSV))
    {
      if (l < 60000L)
        return;
      z.e("!44@/B4Tb64lLpLcQwGQMRj/JTqm3tSvFCTzMyP/DRnOfzs=", "ERR: Try Run service runningFlag:" + v.e(this.gSV) + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + v.g(this.gSV) + " recving:" + v.f(this.gSV));
    }
    v.k(this.gSV);
    v.b(this.gSV);
    v.a(this.gSV, 3);
    v.a(this.gSV);
    this.gSV.dyb.reset();
    v.l(this.gSV).cP(10L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voicereminder.a.x
 * JD-Core Version:    0.6.2
 */