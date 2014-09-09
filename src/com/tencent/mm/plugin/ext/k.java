package com.tencent.mm.plugin.ext;

import com.tencent.mm.c.a.bz;
import com.tencent.mm.c.a.ca;
import com.tencent.mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.z;

public final class k extends g
{
  public k()
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if (!(parame instanceof bz))
    {
      z.f("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "mismatched event");
      return false;
    }
    bz localbz = (bz)parame;
    ExtControlProviderOpenApi localExtControlProviderOpenApi = new ExtControlProviderOpenApi(localbz.cIO.cIo, localbz.cIO.cIs, localbz.cIO.context);
    localbz.cIP.cursor = localExtControlProviderOpenApi.query(localbz.cIO.uri, null, null, localbz.cIO.selectionArgs, null);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.k
 * JD-Core Version:    0.6.2
 */