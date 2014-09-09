package com.tencent.mm.plugin.voicereminder.a;

import com.tencent.mm.modelvoice.bj;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class t extends Thread
{
  cm gQj;

  public t(p paramp)
  {
    this.gQj = new u(this, paramp);
  }

  public final void run()
  {
    if (p.e(this.gSS) == null)
    {
      z.e("!44@/B4Tb64lLpLcQwGQMRj/JcgrnZCee5Q2WnorMdoOdjs=", "Stop Record Failed recorder == null");
      return;
    }
    synchronized (this.gSS)
    {
      if (!p.e(this.gSS).iq(o.A(p.a(this.gSS), true)))
      {
        p.ti(p.a(this.gSS));
        p.f(this.gSS);
        z.d("!44@/B4Tb64lLpLcQwGQMRj/JcgrnZCee5Q2WnorMdoOdjs=", "Thread Start Record  Error fileName[" + p.a(this.gSS) + "]");
        p.g(this.gSS);
      }
      p.a(this.gSS, ap.CN());
      z.d("!44@/B4Tb64lLpLcQwGQMRj/JcgrnZCee5Q2WnorMdoOdjs=", "Thread Started Record fileName[" + p.a(this.gSS) + "] time:" + ap.ad(p.h(this.gSS)));
      this.gQj.sendEmptyMessageDelayed(0, 1L);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voicereminder.a.t
 * JD-Core Version:    0.6.2
 */