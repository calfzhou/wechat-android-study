package com.tencent.mm.plugin.gwallet;

import android.content.Intent;
import com.jg.JgMethodChecked;
import com.tencent.mm.plugin.gwallet.a.i;
import com.tencent.mm.plugin.gwallet.a.k;
import com.tencent.mm.sdk.platformtools.z;

final class e
  implements i
{
  e(GWalletUI paramGWalletUI)
  {
  }

  @JgMethodChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.INTENTCHECK})
  public final void b(k paramk, Intent paramIntent)
  {
    z.d("!32@/B4Tb64lLpJlq3g3dssAocibZs9nb5Th", "Purchase finished: " + paramk + ", purchase: " + paramIntent);
    if (paramIntent == null)
    {
      paramIntent = new Intent("com.tencent.mm.gwallet.ACTION_PAY_RESPONSE");
      paramIntent.putExtra("RESPONSE_CODE", paramk.Vo());
      this.fdw.sendBroadcast(paramIntent);
      if ((paramk.Vp()) || (paramk.Vq()))
        break label105;
    }
    label105: for (int i = 1; ; i = 0)
    {
      if (i != 0)
        GWalletUI.a(this.fdw, 0, null);
      return;
      paramIntent.setAction("com.tencent.mm.gwallet.ACTION_PAY_RESPONSE");
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.e
 * JD-Core Version:    0.6.2
 */