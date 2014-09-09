package com.tencent.mm.plugin.extqlauncher;

import com.tencent.mm.c.a.bn;
import com.tencent.mm.c.a.bo;
import com.tencent.mm.plugin.extqlauncher.provider.ExtControlProviderQLauncher;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.z;

public final class f extends g
{
  public f()
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if (!(parame instanceof bn))
    {
      z.f("!44@/B4Tb64lLpIAhUt0Bg2QTqyk2VFFNI8farTpuVFOhY8=", "mismatched event");
      return false;
    }
    bn localbn = (bn)parame;
    ExtControlProviderQLauncher localExtControlProviderQLauncher = new ExtControlProviderQLauncher(localbn.cIq.cIo, localbn.cIq.cIs, localbn.cIq.context);
    localbn.cIr.cursor = localExtControlProviderQLauncher.query(localbn.cIq.uri, null, null, localbn.cIq.selectionArgs, null);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.extqlauncher.f
 * JD-Core Version:    0.6.2
 */