package com.tencent.mm.ui.account;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.am;

final class ku
  implements Animation.AnimationListener
{
  ku(WelcomeSelectView_5_2 paramWelcomeSelectView_5_2, View paramView, float paramFloat1, float paramFloat2)
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
    WelcomeSelectView_5_2.a(WelcomeSelectView_5_2.c(this.iTj), new kv(this));
    this.iTj.a(WelcomeSelectView_5_2.d(this.iTj), 300L);
    this.iTj.a(WelcomeSelectView_5_2.e(this.iTj), 300L);
    WelcomeSelectView_5_2.d(this.iTj).setVisibility(0);
    WelcomeSelectView_5_2.c(this.iTj).setVisibility(0);
    WelcomeSelectView_5_2.e(this.iTj).setVisibility(0);
    am.h(new kw(this));
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.ku
 * JD-Core Version:    0.6.2
 */