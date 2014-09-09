package com.tencent.mm.ak;

import com.tencent.mm.compatible.g.k;
import com.tencent.mm.o.m;
import com.tencent.mm.sdk.platformtools.az;

final class j
  implements az
{
  j(g paramg)
  {
  }

  public final boolean kJ()
  {
    if (this.dFO.a(g.f(this.dFO), g.d(this.dFO)) == -1)
    {
      g.a(this.dFO, 0 - (10000 + k.nJ()));
      g.d(this.dFO).a(3, -1, "doScene failed", this.dFO);
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ak.j
 * JD-Core Version:    0.6.2
 */