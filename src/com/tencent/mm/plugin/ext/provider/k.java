package com.tencent.mm.plugin.ext.provider;

import com.tencent.mm.c.a.cj;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.storage.i;

final class k
  implements Runnable
{
  k(ExtControlProviderSNS paramExtControlProviderSNS, i parami, com.tencent.mm.pluginsdk.d.a.a parama)
  {
  }

  public final void run()
  {
    cj localcj = new cj();
    localcj.cIU.type = 1;
    localcj.cIU.username = this.eMJ.getUsername();
    localcj.cIU.cIV = ExtControlProviderSNS.a(this.eMK);
    localcj.cIU.cIW = ExtControlProviderSNS.b(this.eMK);
    localcj.cIU.cIX = ExtControlProviderSNS.c(this.eMK);
    localcj.cIU.cIY = new l(this);
    com.tencent.mm.sdk.c.a.aGB().g(localcj);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.k
 * JD-Core Version:    0.6.2
 */