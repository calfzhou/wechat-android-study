package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import com.tencent.mm.ui.base.TalkRoomPopupNav;

final class kp
  implements Runnable
{
  kp(hd paramhd)
  {
  }

  public final void run()
  {
    if ((hd.T(this.jtA) != null) && (hd.T(this.jtA).getVisibility() == 0))
      hd.d(this.jtA, 1);
    while (true)
    {
      TranslateAnimation localTranslateAnimation = new TranslateAnimation(hd.V(this.jtA).getWidth(), 0.0F, 0.0F, 0.0F);
      localTranslateAnimation.setDuration(300L);
      localTranslateAnimation.setInterpolator(AnimationUtils.loadInterpolator(this.jtA.agh(), 17432581));
      hd.V(this.jtA).startAnimation(localTranslateAnimation);
      localTranslateAnimation.setAnimationListener(new kq(this));
      return;
      if ((hd.U(this.jtA) != null) && (hd.U(this.jtA).getVisibility() == 0))
        hd.d(this.jtA, 2);
      else
        hd.d(this.jtA, 0);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.kp
 * JD-Core Version:    0.6.2
 */