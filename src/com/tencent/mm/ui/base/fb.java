package com.tencent.mm.ui.base;

import android.graphics.Matrix;

final class fb
  implements Runnable
{
  fb(fa paramfa)
  {
  }

  public final void run()
  {
    MMViewPager.a(this.jds.jdp).getImageMatrix().getValues(fa.a(this.jds));
    float f1 = fa.a(this.jds)[2];
    float f2 = MMViewPager.a(this.jds.jdp).getScale() * MMViewPager.a(this.jds.jdp).aTi();
    if (f2 < MMViewPager.b(this.jds.jdp));
    for (float f3 = MMViewPager.b(this.jds.jdp) / 2.0F - f2 / 2.0F; ; f3 = 0.0F)
    {
      float f4 = f3 - f1;
      if (f4 >= 0.0F)
        this.jds.jdq = true;
      while (true)
      {
        MMViewPager.a(this.jds.jdp).t(f4, 0.0F);
        return;
        if (Math.abs(f4) <= 5.0F)
          this.jds.jdq = true;
        else
          f4 /= 4.0F;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.fb
 * JD-Core Version:    0.6.2
 */