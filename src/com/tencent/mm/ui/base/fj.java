package com.tencent.mm.ui.base;

import com.tencent.mm.sdk.platformtools.cm;

final class fj
  implements Runnable
{
  fj(MultiTouchImageView paramMultiTouchImageView, float paramFloat1, long paramLong, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
  }

  public final void run()
  {
    long l = System.currentTimeMillis();
    float f1 = Math.min(this.jei, (float)(l - this.dxN));
    float f2 = this.jej + f1 * this.jek;
    this.jen.d(f2, this.jel, this.jem);
    if (f1 < this.jei)
      this.jen.mHandler.post(this);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.fj
 * JD-Core Version:    0.6.2
 */