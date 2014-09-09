package com.tencent.mm.plugin.gwallet;

import android.content.Intent;
import com.tencent.mm.plugin.gwallet.a.i;
import com.tencent.mm.plugin.gwallet.a.k;
import com.tencent.mm.sdk.platformtools.z;

final class g
  implements i
{
  g(f paramf)
  {
  }

  public final void b(k paramk, Intent paramIntent)
  {
    z.d("!32@/B4Tb64lLpJlq3g3dssAocibZs9nb5Th", "Purchase finished: " + paramk + ", purchase: " + paramIntent);
    Intent localIntent = new Intent("com.tencent.mm.gwallet.ACTION_CONSUME_RESPONSE");
    localIntent.putExtra("RESPONSE_CODE", 0);
    GWalletUI.a(this.fdx.fdw, -1, localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.g
 * JD-Core Version:    0.6.2
 */