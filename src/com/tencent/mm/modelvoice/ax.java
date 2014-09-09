package com.tencent.mm.modelvoice;

import com.tencent.mm.compatible.g.a;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class ax extends Thread
{
  cm gQj;

  public ax(at paramat)
  {
    this.gQj = new ay(this, paramat);
  }

  public final void run()
  {
    if (at.e(this.dHS) == null)
    {
      z.e("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "Stop Record Failed recorder == null");
      return;
    }
    synchronized (this.dHS)
    {
      if (!at.e(this.dHS).iq(bs.gP(at.a(this.dHS))))
      {
        ab.in(at.a(this.dHS));
        at.f(this.dHS);
        z.d("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "Thread Start Record  Error fileName[" + at.a(this.dHS) + "]");
        at.g(this.dHS);
        at.a(this.dHS, ch.CN());
        z.d("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "Thread Started Record fileName[" + at.a(this.dHS) + "] time:" + ch.ad(at.i(this.dHS)));
        this.gQj.sendEmptyMessageDelayed(0, 1L);
        return;
      }
      at.h(this.dHS).requestFocus();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.ax
 * JD-Core Version:    0.6.2
 */