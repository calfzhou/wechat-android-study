package com.tencent.mm.ui.account;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.am;

final class kn
  implements Animation.AnimationListener
{
  kn(WelcomeSelectView paramWelcomeSelectView, View paramView, float paramFloat1, float paramFloat2)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    int i = this.dYk.getLeft();
    int j = this.dYk.getTop() - (int)(this.iSW - this.iSX);
    int k = this.dYk.getWidth();
    int m = this.dYk.getHeight();
    this.dYk.clearAnimation();
    this.dYk.layout(i, j, k + i, m + j);
    this.iSV.a(WelcomeSelectView.a(this.iSV), 800L);
    this.iSV.a(WelcomeSelectView.b(this.iSV), 300L);
    this.iSV.a(WelcomeSelectView.c(this.iSV), 300L);
    WelcomeSelectView localWelcomeSelectView = this.iSV;
    View localView = WelcomeSelectView.d(this.iSV);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
    localAlphaAnimation.setInterpolator(new LinearInterpolator());
    localAlphaAnimation.setDuration(800L);
    localAlphaAnimation.setAnimationListener(new kz(localWelcomeSelectView));
    localView.startAnimation(localAlphaAnimation);
    WelcomeSelectView.a(this.iSV).setVisibility(0);
    WelcomeSelectView.b(this.iSV).setVisibility(0);
    WelcomeSelectView.c(this.iSV).setVisibility(0);
    WelcomeSelectView.d(this.iSV).setVisibility(8);
    am.h(new ko(this));
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.kn
 * JD-Core Version:    0.6.2
 */