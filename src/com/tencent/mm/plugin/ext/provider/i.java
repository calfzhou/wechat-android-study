package com.tencent.mm.plugin.ext.provider;

import com.tencent.mm.c.a.gc;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.z;
import java.util.concurrent.CountDownLatch;

final class i
  implements c
{
  i(ExtControlProviderNearBy paramExtControlProviderNearBy)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2)
  {
    if (ExtControlProviderNearBy.g(this.eMG));
    gc localgc;
    do
    {
      return false;
      ExtControlProviderNearBy.h(this.eMG);
      if (!paramBoolean)
      {
        z.e("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "get location failed");
        ExtControlProviderNearBy.f(this.eMG);
        ExtControlProviderNearBy.c(this.eMG).countDown();
        return false;
      }
      localgc = new gc();
      localgc.cLk.cKw = ExtControlProviderNearBy.i(this.eMG);
      localgc.cLk.cLm = paramFloat1;
      localgc.cLk.cGl = paramFloat2;
      localgc.cLk.cLn = ((int)paramDouble2);
      localgc.cLk.cLo = paramInt;
      localgc.cLk.cLp = "";
      localgc.cLk.cLq = "";
    }
    while (!a.aGB().g(localgc));
    z.i("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "do get nearby friend");
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.i
 * JD-Core Version:    0.6.2
 */