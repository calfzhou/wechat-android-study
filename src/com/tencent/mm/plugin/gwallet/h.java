package com.tencent.mm.plugin.gwallet;

import android.content.Intent;
import com.jg.JgMethodChecked;
import com.tencent.mm.plugin.gwallet.a.i;
import com.tencent.mm.plugin.gwallet.a.k;
import com.tencent.mm.sdk.platformtools.z;

final class h
  implements i
{
  h(GWalletUI paramGWalletUI, boolean paramBoolean)
  {
  }

  @JgMethodChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.INTENTCHECK})
  public final void b(k paramk, Intent paramIntent)
  {
    z.d("!32@/B4Tb64lLpJlq3g3dssAocibZs9nb5Th", "Query inventory finished. data : " + paramIntent);
    if (paramIntent == null)
    {
      paramIntent = new Intent("com.tencent.mm.gwallet.ACTION_QUERY_RESPONSE");
      paramIntent.putExtra("RESPONSE_CODE", paramk.Vo());
    }
    while (true)
    {
      if (!this.fdy)
        paramIntent.putExtra("is_direct", false);
      this.fdw.sendBroadcast(paramIntent);
      return;
      paramIntent.setAction("com.tencent.mm.gwallet.ACTION_QUERY_RESPONSE");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.h
 * JD-Core Version:    0.6.2
 */