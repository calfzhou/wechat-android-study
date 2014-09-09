package com.tencent.mm.ui.tools;

import android.graphics.Matrix;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class ee
  implements Runnable
{
  ee(ed paramed)
  {
  }

  public final void run()
  {
    MMGestureGallery.a(this.jTG.jTE).getImageMatrix().getValues(ed.a(this.jTG));
    float f1 = MMGestureGallery.a(this.jTG.jTE).getScale() * MMGestureGallery.a(this.jTG.jTE).aTi();
    float f2 = f1 + ed.a(this.jTG)[2];
    float f3 = MMGestureGallery.b(this.jTG.jTE);
    if (f1 < MMGestureGallery.b(this.jTG.jTE))
      f3 = MMGestureGallery.b(this.jTG.jTE) / 2.0F + f1 / 2.0F;
    float f4 = f3 - f2;
    if (f4 <= 0.0F)
      this.jTG.jdq = true;
    while (true)
    {
      MMGestureGallery.a(this.jTG.jTE).t(f4, 0.0F);
      return;
      if (Math.abs(f4 / 4.0F) <= 5.0F)
        this.jTG.jdq = true;
      else
        f4 /= 4.0F;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ee
 * JD-Core Version:    0.6.2
 */