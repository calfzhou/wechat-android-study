package com.tencent.mm.console;

import com.tencent.mm.sdk.platformtools.z;

final class q
  implements Runnable
{
  public final void run()
  {
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Long.valueOf(Thread.currentThread().getId());
    arrayOfObject1[1] = Thread.currentThread().getName();
    z.d("!24@/B4Tb64lLpLOIdMtS2bKaA==", "dkcrash begin tid:%d [%s]", arrayOfObject1);
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(null.length());
    z.d("!24@/B4Tb64lLpLOIdMtS2bKaA==", "%d ", arrayOfObject2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.q
 * JD-Core Version:    0.6.2
 */