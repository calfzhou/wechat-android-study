package com.tencent.mm.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.tools.TestTimeForChatting;

final class aw
  implements Animation.AnimationListener
{
  aw(av paramav)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    LauncherUI.r(this.iKl.iKj).postDelayed(new ax(this), 100L);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "klem onAnimationStart");
    LauncherUI.r(this.iKl.iKj).bba();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.aw
 * JD-Core Version:    0.6.2
 */