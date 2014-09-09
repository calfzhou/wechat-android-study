package com.tencent.mm.ui.account;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

final class kv
  implements Animation.AnimationListener
{
  kv(ku paramku)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    WelcomeSelectView_5_2.a(this.iTk.iTj).setVisibility(4);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.kv
 * JD-Core Version:    0.6.2
 */