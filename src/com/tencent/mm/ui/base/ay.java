package com.tencent.mm.ui.base;

import android.view.animation.Interpolator;

final class ay
  implements Interpolator
{
  private float fNd = 1.3F;

  public final float getInterpolation(float paramFloat)
  {
    float f = paramFloat - 1.0F;
    return 1.0F + f * (f * f);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ay
 * JD-Core Version:    0.6.2
 */