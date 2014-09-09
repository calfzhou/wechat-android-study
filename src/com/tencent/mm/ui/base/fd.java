package com.tencent.mm.ui.base;

import android.graphics.Matrix;

final class fd
  implements Runnable
{
  fd(fc paramfc)
  {
  }

  public final void run()
  {
    MMViewPager.a(this.jdt.jdp).getImageMatrix().getValues(fc.a(this.jdt));
    float f1 = MMViewPager.a(this.jdt.jdp).getScale() * MMViewPager.a(this.jdt.jdp).aTi();
    float f2 = f1 + fc.a(this.jdt)[2];
    float f3 = MMViewPager.b(this.jdt.jdp);
    if (f1 < MMViewPager.b(this.jdt.jdp))
      f3 = MMViewPager.b(this.jdt.jdp) / 2.0F + f1 / 2.0F;
    float f4 = f3 - f2;
    if (f4 <= 0.0F)
      this.jdt.jdq = true;
    while (true)
    {
      MMViewPager.a(this.jdt.jdp).t(f4, 0.0F);
      return;
      if (Math.abs(f4 / 4.0F) <= 5.0F)
        this.jdt.jdq = true;
      else
        f4 /= 4.0F;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.fd
 * JD-Core Version:    0.6.2
 */