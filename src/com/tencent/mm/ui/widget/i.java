package com.tencent.mm.ui.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class i
  implements Animation.AnimationListener
{
  i(h paramh, MMSwitchBtn paramMMSwitchBtn)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    int i = 1;
    int k = MMSwitchBtn.a(this.kbw.kbu);
    MMSwitchBtn localMMSwitchBtn;
    if (this.kbw.direction == i)
    {
      int m = i;
      if (k != m)
      {
        localMMSwitchBtn = this.kbw.kbu;
        if (this.kbw.direction != i)
          break label97;
      }
    }
    while (true)
    {
      MMSwitchBtn.a(localMMSwitchBtn, i);
      this.kbw.kbu.post(new j(this));
      MMSwitchBtn.c(this.kbw.kbu);
      return;
      int n = 0;
      break;
      label97: int j = 0;
    }
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.i
 * JD-Core Version:    0.6.2
 */