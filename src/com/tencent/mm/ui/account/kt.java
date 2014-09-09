package com.tencent.mm.ui.account;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

final class kt
  implements Runnable
{
  kt(WelcomeSelectView_5_2 paramWelcomeSelectView_5_2)
  {
  }

  public final void run()
  {
    int[] arrayOfInt1 = new int[2];
    WelcomeSelectView_5_2.a(this.iTj).getLocationOnScreen(arrayOfInt1);
    int[] arrayOfInt2 = new int[2];
    WelcomeSelectView_5_2.b(this.iTj).getLocationOnScreen(arrayOfInt2);
    WelcomeSelectView_5_2 localWelcomeSelectView_5_2 = this.iTj;
    ImageView localImageView = WelcomeSelectView_5_2.a(this.iTj);
    float f = arrayOfInt2[1] - arrayOfInt1[1];
    TranslateAnimation localTranslateAnimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, f);
    localTranslateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
    localTranslateAnimation.setDuration(1000L);
    localTranslateAnimation.setStartOffset(0L);
    localTranslateAnimation.setAnimationListener(new ku(localWelcomeSelectView_5_2, localImageView, 0.0F, f));
    localImageView.startAnimation(localTranslateAnimation);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.kt
 * JD-Core Version:    0.6.2
 */