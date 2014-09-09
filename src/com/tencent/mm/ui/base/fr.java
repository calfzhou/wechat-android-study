package com.tencent.mm.ui.base;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.tencent.mm.b;

final class fr
  implements Animation.AnimationListener
{
  fr(TalkRoomPopupNav paramTalkRoomPopupNav)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    TalkRoomPopupNav.c(this.jfE).startAnimation(AnimationUtils.loadAnimation(this.jfE.getContext(), b.Mv));
    TalkRoomPopupNav.c(this.jfE).setVisibility(0);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.fr
 * JD-Core Version:    0.6.2
 */