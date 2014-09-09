package com.tencent.mm.plugin.ext.provider;

import com.tencent.mm.c.a.gc;
import com.tencent.mm.c.a.ge;
import com.tencent.mm.pluginsdk.c.b;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.platformtools.z;
import java.util.List;
import java.util.concurrent.CountDownLatch;

final class h extends b
{
  h(ExtControlProviderNearBy paramExtControlProviderNearBy)
  {
    super(0);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, e parame)
  {
    if ((!(parame instanceof gc)) || (ExtControlProviderNearBy.c(this.eMG) == null))
      return;
    gc localgc = (gc)parame;
    z.i("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "get lbsfriend errcode: " + paramInt2 + ", errType: " + paramInt1);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      ExtControlProviderNearBy.a(this.eMG, localgc.cLl.cLs);
      if ((ExtControlProviderNearBy.d(this.eMG) == null) || (ExtControlProviderNearBy.d(this.eMG).size() == 0))
      {
        z.e("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "get lbsfriend list size:0");
        ExtControlProviderNearBy.c(this.eMG).countDown();
      }
    }
    while (true)
    {
      ExtControlProviderNearBy.f(this.eMG);
      return;
      if (ExtControlProviderNearBy.d(this.eMG).size() > 10)
      {
        z.i("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "get lbsfriend size > 10," + ExtControlProviderNearBy.d(this.eMG).size());
        ExtControlProviderNearBy.d(this.eMG).subList(10, ExtControlProviderNearBy.d(this.eMG).size()).clear();
      }
      ExtControlProviderNearBy.a(this.eMG, new CountDownLatch(ExtControlProviderNearBy.d(this.eMG).size()));
      ExtControlProviderNearBy.c(this.eMG).countDown();
      ExtControlProviderNearBy.e(this.eMG);
      continue;
      z.e("!56@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4N7P1mJVm15mpUS/mmtFQbA==", "get lbsfriend failed: errCode = " + paramInt2 + ", errType=" + paramInt1);
      ExtControlProviderNearBy.c(this.eMG).countDown();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.h
 * JD-Core Version:    0.6.2
 */