package com.tencent.mm.plugin.base.stub;

import com.tencent.mm.model.bg;
import com.tencent.mm.model.ce;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.cb;
import com.tencent.mm.sdk.platformtools.z;

final class n extends cb
{
  n(WXCommProvider paramWXCommProvider, Boolean paramBoolean)
  {
    super(2000L, paramBoolean, true);
  }

  private Boolean HM()
  {
    try
    {
      bg.qX().d(new ce(new o(this)));
      return Boolean.valueOf(false);
    }
    catch (Exception localException)
    {
      while (true)
      {
        z.e("!32@/B4Tb64lLpLgtXhygZpWnw7CB4WuM5ph", "exception in NetSceneLocalProxy.");
        Z(Boolean.valueOf(false));
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.n
 * JD-Core Version:    0.6.2
 */