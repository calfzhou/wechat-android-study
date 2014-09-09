package com.tencent.mm.plugin.base.stub;

import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;

final class k
  implements az
{
  k(WXCommProvider paramWXCommProvider)
  {
  }

  public final boolean kJ()
  {
    if ((a.aGB() != null) && (a.aGB().AH("ExtCallBiz")))
      synchronized (WXCommProvider.lock)
      {
        z.i("!32@/B4Tb64lLpLgtXhygZpWnw7CB4WuM5ph", "The lock was released.");
        WXCommProvider.lock.notifyAll();
        return false;
      }
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.k
 * JD-Core Version:    0.6.2
 */