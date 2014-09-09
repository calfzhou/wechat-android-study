package com.tencent.mm.plugin.ext.provider;

import com.tencent.mm.model.bg;
import com.tencent.mm.model.ce;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.z;

final class a
  implements Runnable
{
  a(ExtContentProviderBase paramExtContentProviderBase, com.tencent.mm.pluginsdk.d.a.a parama)
  {
  }

  public final void run()
  {
    try
    {
      bg.qX().d(new ce(new b(this)));
      return;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpKAQbqlkU5I8mZxJJ4JsPX28ihhHV6igVo=", "exception in NetSceneLocalProxy");
      this.eMc.countDown();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.a
 * JD-Core Version:    0.6.2
 */