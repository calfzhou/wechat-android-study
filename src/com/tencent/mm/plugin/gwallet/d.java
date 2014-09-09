package com.tencent.mm.plugin.gwallet;

import android.content.Intent;
import com.tencent.mm.plugin.gwallet.a.h;
import com.tencent.mm.plugin.gwallet.a.k;
import com.tencent.mm.sdk.platformtools.z;

final class d
  implements h
{
  d(GWalletUI paramGWalletUI)
  {
  }

  public final void a(k paramk)
  {
    z.d("!32@/B4Tb64lLpJlq3g3dssAocibZs9nb5Th", "Setup finished.");
    if (!paramk.Vp())
    {
      z.e("!32@/B4Tb64lLpJlq3g3dssAocibZs9nb5Th", "Problem setting up in-app billing: " + paramk);
      Intent localIntent = new Intent();
      localIntent.putExtra("RESPONSE_CODE", paramk.Vo());
      GWalletUI.a(this.fdw, -1, localIntent);
      return;
    }
    if ("com.tencent.mm.gwallet.ACTION_PAY_REQUEST".equals(this.fdw.getIntent().getAction()))
    {
      GWalletUI.a(this.fdw);
      return;
    }
    this.fdw.bl(this.fdw.getIntent().getBooleanExtra("is_direct", true));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.d
 * JD-Core Version:    0.6.2
 */