package com.tencent.mm.pluginsdk.ui;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class al
  implements Animation.AnimationListener
{
  al(MultiSelectContactView paramMultiSelectContactView, View paramView)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    this.dYk.post(new am(this));
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.al
 * JD-Core Version:    0.6.2
 */