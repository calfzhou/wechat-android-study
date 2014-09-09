package com.tencent.mm.al;

import com.tencent.mm.compatible.g.k;
import com.tencent.mm.o.m;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;

final class c
  implements az
{
  c(b paramb)
  {
  }

  public final boolean kJ()
  {
    long l = com.tencent.mm.a.c.ab(b.a(this.dJb));
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvqfYc64hc25hhxPaLMWlC3U=", k.nL() + " onTimerExpired: file:" + b.a(this.dJb) + " nowlen:" + l + " oldoff:" + b.b(this.dJb) + " isFin:" + b.c(this.dJb));
    if ((l - b.b(this.dJb) < 3300L) && (!b.c(this.dJb)))
      return true;
    if (this.dJb.a(b.d(this.dJb), b.e(this.dJb)) == -1)
    {
      b.a(this.dJb, 40000 + k.nJ());
      b.e(this.dJb).a(3, -1, "doScene failed", this.dJb);
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.c
 * JD-Core Version:    0.6.2
 */