package com.tencent.mm.ui.widget;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;

final class h extends Animation
{
  float FE = 0.0F;
  int direction = 0;
  long kbt = 0L;

  public h(MMSwitchBtn paramMMSwitchBtn)
  {
    setInterpolator(new AccelerateDecelerateInterpolator());
    setAnimationListener(new i(this, paramMMSwitchBtn));
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    if (this.direction == 0);
    for (MMSwitchBtn.d(this.kbu).left = (this.FE - paramFloat * (float)this.kbt); ; MMSwitchBtn.d(this.kbu).left = (this.FE + paramFloat * (float)this.kbt))
    {
      MMSwitchBtn.e(this.kbu);
      this.kbu.invalidate();
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.h
 * JD-Core Version:    0.6.2
 */