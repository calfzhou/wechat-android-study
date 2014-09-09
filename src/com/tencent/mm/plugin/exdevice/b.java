package com.tencent.mm.plugin.exdevice;

import com.tencent.mm.c.a.bd;
import com.tencent.mm.c.a.fn;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.ui.chatting.hd;

final class b
  implements Runnable
{
  b(a parama, int paramInt)
  {
  }

  public final void run()
  {
    if (1 == this.eHZ)
    {
      bd localbd = new bd();
      localbd.cIh.op = 0;
      localbd.cIh.cDi = a.a(this.eIa).aUL();
      localbd.cIh.context = a.a(this.eIa).agh();
      com.tencent.mm.sdk.c.a.aGB().g(localbd);
    }
    fn localfn = new fn();
    localfn.cKK.cDf = this.eHZ;
    localfn.cKK.cKM = 1;
    localfn.cKK.cKL = a.a(this.eIa).aUL();
    com.tencent.mm.sdk.c.a.aGB().g(localfn);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b
 * JD-Core Version:    0.6.2
 */