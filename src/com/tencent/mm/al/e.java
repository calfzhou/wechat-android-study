package com.tencent.mm.al;

import com.tencent.mm.a.c;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.o.m;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;

final class e
  implements az
{
  e(d paramd)
  {
  }

  public final boolean kJ()
  {
    long l = c.ab(d.a(this.dJd));
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvhJCUsCY60+wSwM70WFd0Wk=", k.nL() + " onTimerExpired: file:" + d.a(this.dJd) + " nowlen:" + l + " oldoff:" + d.b(this.dJd) + " isFin:" + d.c(this.dJd));
    if ((l - d.b(this.dJd) < 3300L) && (!d.c(this.dJd)))
      return true;
    if (this.dJd.a(d.d(this.dJd), d.e(this.dJd)) == -1)
    {
      d.a(this.dJd, 40000 + k.nJ());
      d.e(this.dJd).a(3, -1, "doScene failed", this.dJd);
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.e
 * JD-Core Version:    0.6.2
 */