package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class kq
  implements Animation.AnimationListener
{
  kq(kp paramkp)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    hd.V(this.jud.jtA).setClickable(true);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    hd.V(this.jud.jtA).setClickable(false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.kq
 * JD-Core Version:    0.6.2
 */