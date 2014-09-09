package com.tencent.mm.ui.account;

import android.content.Intent;
import com.tencent.mm.modelsimple.i;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.sdk.platformtools.z;

final class dp
  implements Runnable
{
  dp(LoginUI paramLoginUI, x paramx)
  {
  }

  public final void run()
  {
    z.d("!32@/B4Tb64lLpJTKkcMldEZqYg5eKm6NcjH", "onSceneEnd, in runnable");
    Intent localIntent = a.dWo.k(this.iPW);
    localIntent.addFlags(67108864);
    localIntent.putExtra("kstyle_show_bind_mobile_afterauth", ((i)this.dpb).zc());
    localIntent.putExtra("kstyle_bind_wording", ((i)this.dpb).zd());
    localIntent.putExtra("kstyle_bind_recommend_show", ((i)this.dpb).ze());
    this.iPW.startActivity(localIntent);
    this.iPW.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.dp
 * JD-Core Version:    0.6.2
 */