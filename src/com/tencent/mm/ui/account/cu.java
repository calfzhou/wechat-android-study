package com.tencent.mm.ui.account;

import android.content.Intent;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.sdk.platformtools.z;

final class cu
  implements Runnable
{
  cu(LoginIndepPass paramLoginIndepPass)
  {
  }

  public final void run()
  {
    z.d("!32@/B4Tb64lLpL2ifO2GeMy1sPAUKApbAFH", "onSceneEnd, in runnable");
    Intent localIntent = a.dWo.k(this.iPD);
    localIntent.addFlags(67108864);
    this.iPD.startActivity(localIntent);
    this.iPD.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.cu
 * JD-Core Version:    0.6.2
 */