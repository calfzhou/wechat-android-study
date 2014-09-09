package com.tencent.mm.ui.chatting;

import com.tencent.mm.ui.LauncherUI;

final class lj
  implements Runnable
{
  lj(hd paramhd)
  {
  }

  public final void run()
  {
    if (this.jtA.iJh)
      hd.ac(this.jtA);
    LauncherUI localLauncherUI;
    do
    {
      return;
      localLauncherUI = LauncherUI.aPm();
    }
    while (localLauncherUI == null);
    localLauncherUI.aPs();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.lj
 * JD-Core Version:    0.6.2
 */