package com.tencent.mm.ui.tools;

import android.graphics.Matrix;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class ec
  implements Runnable
{
  ec(eb parameb)
  {
  }

  public final void run()
  {
    MMGestureGallery.a(this.jTF.jTE).getImageMatrix().getValues(eb.a(this.jTF));
    float f1 = eb.a(this.jTF)[2];
    float f2 = MMGestureGallery.a(this.jTF.jTE).getScale() * MMGestureGallery.a(this.jTF.jTE).aTi();
    if (f2 < MMGestureGallery.b(this.jTF.jTE));
    for (float f3 = MMGestureGallery.b(this.jTF.jTE) / 2.0F - f2 / 2.0F; ; f3 = 0.0F)
    {
      float f4 = f3 - f1;
      if (f4 >= 0.0F)
        this.jTF.jdq = true;
      while (true)
      {
        MMGestureGallery.a(this.jTF.jTE).t(f4, 0.0F);
        return;
        if (Math.abs(f4) <= 5.0F)
          this.jTF.jdq = true;
        else
          f4 /= 4.0F;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ec
 * JD-Core Version:    0.6.2
 */