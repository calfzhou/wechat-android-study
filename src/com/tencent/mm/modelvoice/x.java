package com.tencent.mm.modelvoice;

import com.tencent.mm.compatible.g.k;
import com.tencent.mm.o.m;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;

final class x
  implements az
{
  x(w paramw)
  {
  }

  public final boolean kJ()
  {
    String str = w.a(this.dHh);
    br localbr = bm.BD().iG(str);
    if ((localbr == null) || (!localbr.BK()))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "Get info Failed file:" + w.a(this.dHh));
      w.a(this.dHh, 10000 + k.nJ());
      w.b(this.dHh).a(3, -1, "doScene failed", this.dHh);
    }
    do
    {
      return false;
      if ((3 != localbr.getStatus()) && (8 != localbr.getStatus()))
      {
        long l = System.currentTimeMillis();
        if (l / 1000L - localbr.AS() > 30L)
        {
          z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "Error ModifyTime in Read file:" + w.a(this.dHh));
          w.a(this.dHh, 10000 + k.nJ());
          w.b(this.dHh).a(3, -1, "doScene failed", this.dHh);
          return false;
        }
        if (l - w.c(this.dHh) < 2000L)
        {
          z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "TimerExpired :" + w.a(this.dHh) + " but last send time:" + (l - w.c(this.dHh)));
          return true;
        }
        y localy = bs.iw(w.a(this.dHh)).J(localbr.AO(), 6000);
        z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rGskLx5zBMvY=", "pusher doscene:" + w.a(this.dHh) + " readByte:" + localy.ddA + " stat:" + localbr.getStatus());
        if (localy.ddA < 2000)
          return true;
      }
    }
    while (this.dHh.a(w.d(this.dHh), w.b(this.dHh)) != -1);
    w.a(this.dHh, 10000 + k.nJ());
    w.b(this.dHh).a(3, -1, "doScene failed", this.dHh);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.x
 * JD-Core Version:    0.6.2
 */