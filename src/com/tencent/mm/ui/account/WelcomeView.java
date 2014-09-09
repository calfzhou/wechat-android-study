package com.tencent.mm.ui.account;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;

public abstract class WelcomeView extends LinearLayout
{
  public WelcomeView(Context paramContext)
  {
    super(paramContext);
  }

  public WelcomeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static void a(View paramView, Animation.AnimationListener paramAnimationListener)
  {
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    localAlphaAnimation.setInterpolator(new LinearInterpolator());
    localAlphaAnimation.setDuration(300L);
    localAlphaAnimation.setAnimationListener(paramAnimationListener);
    paramView.startAnimation(localAlphaAnimation);
  }

  public final void a(View paramView, long paramLong)
  {
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    localAlphaAnimation.setInterpolator(new LinearInterpolator());
    localAlphaAnimation.setDuration(paramLong);
    localAlphaAnimation.setAnimationListener(new ky(this));
    paramView.startAnimation(localAlphaAnimation);
  }

  public abstract void aQX();

  public abstract void onPause();

  public abstract void onResume();
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.WelcomeView
 * JD-Core Version:    0.6.2
 */