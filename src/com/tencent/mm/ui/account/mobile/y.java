package com.tencent.mm.ui.account.mobile;

import android.content.Intent;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.sdk.platformtools.z;

final class y
  implements Runnable
{
  y(n paramn)
  {
  }

  public final void run()
  {
    z.d("!44@/B4Tb64lLpKsMp00pgLFBmZKkAE77UfTgxohSwLgerQ=", "onSceneEnd, in runnable");
    Intent localIntent = a.dWo.k(n.b(this.iUi));
    localIntent.addFlags(67108864);
    n.b(this.iUi).startActivity(localIntent);
    n.b(this.iUi).finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.y
 * JD-Core Version:    0.6.2
 */