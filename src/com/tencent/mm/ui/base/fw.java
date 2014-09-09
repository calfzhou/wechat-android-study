package com.tencent.mm.ui.base;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

final class fw
  implements Animation.AnimationListener
{
  fw(TalkRoomPopupNav paramTalkRoomPopupNav)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    if (TalkRoomPopupNav.h(this.jfE) != null)
      TalkRoomPopupNav.g(this.jfE).startAnimation(TalkRoomPopupNav.h(this.jfE));
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.fw
 * JD-Core Version:    0.6.2
 */