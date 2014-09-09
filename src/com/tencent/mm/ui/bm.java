package com.tencent.mm.ui;

import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.platformtools.z;

final class bm
  implements Runnable
{
  bm(LauncherUI paramLauncherUI)
  {
  }

  public final void run()
  {
    if (!LauncherUI.f(this.iKj))
    {
      z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "start time check launcherUIOnCreate from begin time ==" + (System.currentTimeMillis() - LauncherUI.iJC));
      n.fTF.bA(LauncherUI.iJC);
    }
    LauncherUI.g(this.iKj);
    if (!LauncherUI.h(this.iKj))
      LauncherUI.i(this.iKj);
    this.iKj.q(this.iKj);
  }

  public final String toString()
  {
    return super.toString() + "|onInit";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bm
 * JD-Core Version:    0.6.2
 */