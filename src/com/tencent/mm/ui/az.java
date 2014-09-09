package com.tencent.mm.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;

final class az
  implements Animation.AnimationListener
{
  az(LauncherUI paramLauncherUI)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    bg.qQ().aHq();
    if (LauncherUI.u(this.iKj))
    {
      z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "start  setAppTagUnreadNow");
      this.iKj.aPd();
    }
    z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "klem pop out onAnimationEnd");
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    bg.qQ().aHn();
    z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "klem pop out onAnimationStart");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.az
 * JD-Core Version:    0.6.2
 */