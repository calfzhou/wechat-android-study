package com.tencent.mm.ui.base;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.LinearLayout;

final class ft
  implements Animation.AnimationListener
{
  ft(TalkRoomPopupNav paramTalkRoomPopupNav)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    TalkRoomPopupNav.e(this.jfE).setVisibility(8);
    TalkRoomPopupNav.d(this.jfE).setClickable(true);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    TalkRoomPopupNav.c(this.jfE).setVisibility(4);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ft
 * JD-Core Version:    0.6.2
 */