package com.tencent.mm.ui.base;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

final class fv
  implements Animation.AnimationListener
{
  fv(TalkRoomPopupNav paramTalkRoomPopupNav)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    if (TalkRoomPopupNav.f(this.jfE) != null)
      TalkRoomPopupNav.g(this.jfE).startAnimation(TalkRoomPopupNav.f(this.jfE));
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.fv
 * JD-Core Version:    0.6.2
 */