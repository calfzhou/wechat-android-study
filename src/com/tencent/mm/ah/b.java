package com.tencent.mm.ah;

import com.tencent.mm.a.c;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.o.m;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;

final class b
  implements az
{
  b(a parama)
  {
  }

  public final boolean kJ()
  {
    long l = c.ab(a.a(this.dDk));
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvlGPgu9QXEXWvDVhqpX/PNI=", k.nL() + " onTimerExpired: file:" + a.a(this.dDk) + " nowlen:" + l + " oldoff:" + a.b(this.dDk));
    if (this.dDk.a(a.c(this.dDk), a.d(this.dDk)) == -1)
      a.d(this.dDk).a(3, -1, "doScene failed", this.dDk);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.b
 * JD-Core Version:    0.6.2
 */