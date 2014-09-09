package com.tencent.mm.modelvoice;

import com.tencent.mm.compatible.g.a;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class an extends Thread
{
  cm gQj;

  public an(aj paramaj)
  {
    this.gQj = new ao(this, paramaj);
  }

  public final void run()
  {
    if (aj.d(this.dHM) == null)
    {
      z.e("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "Stop Record Failed recorder == null");
      return;
    }
    synchronized (this.dHM)
    {
      if (!aj.d(this.dHM).iq(bs.m(aj.a(this.dHM), true)))
      {
        ab.in(aj.a(this.dHM));
        aj.e(this.dHM);
        z.e("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "Thread Start Record  Error fileName[" + aj.a(this.dHM) + "]");
        aj.f(this.dHM);
        aj.a(this.dHM, ch.CN());
        z.d("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "Thread Started Record fileName[" + aj.a(this.dHM) + "] time:" + ch.ad(aj.h(this.dHM)));
        this.gQj.sendEmptyMessageDelayed(0, 1L);
        return;
      }
      aj.g(this.dHM).requestFocus();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.an
 * JD-Core Version:    0.6.2
 */