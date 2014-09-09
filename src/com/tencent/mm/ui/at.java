package com.tencent.mm.ui;

import android.content.Intent;
import com.tencent.mm.sdk.platformtools.z;

final class at
  implements Runnable
{
  at(LauncherUI paramLauncherUI)
  {
  }

  public final void run()
  {
    z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "onMainTabCreate, send refresh broadcast");
    this.iKj.sendBroadcast(new Intent("com.tencent.mm.plugin.openapi.Intent.ACTION_REFRESH_WXAPP"));
  }

  public final String toString()
  {
    return super.toString() + "|sendBroadcast";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.at
 * JD-Core Version:    0.6.2
 */