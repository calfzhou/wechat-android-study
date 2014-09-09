package com.tencent.mm.plugin.gwallet;

import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.gwallet.a.h;
import com.tencent.mm.plugin.gwallet.a.k;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;

final class a
  implements h
{
  a(GWalletQueryProvider paramGWalletQueryProvider)
  {
  }

  public final void a(k paramk)
  {
    z.d("!44@/B4Tb64lLpJlq3g3dssAoZZ5jyUwqm48qdJiAhkom5Q=", "Setup finished.");
    if (!paramk.Vp())
    {
      z.e("!44@/B4Tb64lLpJlq3g3dssAoZZ5jyUwqm48qdJiAhkom5Q=", "Problem setting up in-app billing: " + paramk);
      GWalletQueryProvider.a(this.fdu);
      if (GWalletQueryProvider.b(this.fdu) != null)
        GWalletQueryProvider.b(this.fdu).dispose();
      GWalletQueryProvider.c(this.fdu);
      return;
    }
    bg.qQ().a(new b(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.a
 * JD-Core Version:    0.6.2
 */