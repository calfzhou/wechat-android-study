package com.tencent.mm.plugin.ext.provider;

import com.tencent.mm.modelgeo.h;

final class g
  implements Runnable
{
  g(ExtControlProviderNearBy paramExtControlProviderNearBy)
  {
  }

  public final void run()
  {
    if (ExtControlProviderNearBy.a(this.eMG) == null)
      ExtControlProviderNearBy.a(this.eMG, h.xl());
    ExtControlProviderNearBy.a(this.eMG).b(ExtControlProviderNearBy.b(this.eMG));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.g
 * JD-Core Version:    0.6.2
 */