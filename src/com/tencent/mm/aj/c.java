package com.tencent.mm.aj;

import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;

final class c
  implements Runnable
{
  c(b paramb)
  {
  }

  public final void run()
  {
    int i = this.dFp.Aw();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(i);
    z.v("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "onNotifyChange, newCount update to = %d", arrayOfObject);
    if (i > 0)
      bg.qW().oQ().set(143618, Integer.valueOf(i));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.c
 * JD-Core Version:    0.6.2
 */