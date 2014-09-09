package com.tencent.mm.plugin.gwallet;

import android.content.Intent;
import com.tencent.mm.plugin.gwallet.a.j;
import com.tencent.mm.plugin.gwallet.a.k;
import com.tencent.mm.sdk.platformtools.z;

final class c
  implements j
{
  c(GWalletQueryProvider paramGWalletQueryProvider)
  {
  }

  public final void a(k paramk, Intent paramIntent)
  {
    z.d("!44@/B4Tb64lLpJlq3g3dssAoZZ5jyUwqm48qdJiAhkom5Q=", "query detail done! Result " + paramk);
    GWalletQueryProvider.e(this.fdu);
    GWalletQueryProvider.a(this.fdu, paramIntent.getStringArrayListExtra("RESPONSE_QUERY_DETAIL_INFO"));
    GWalletQueryProvider.a(this.fdu, paramIntent.getIntExtra("RESPONSE_CODE", 0));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.c
 * JD-Core Version:    0.6.2
 */