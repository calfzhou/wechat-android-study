package com.tencent.mm.ui.base;

import com.tencent.mm.sdk.platformtools.cm;

final class fa extends ew
{
  private float[] jdr = new float[9];

  public fa(MMViewPager paramMMViewPager)
  {
    super(paramMMViewPager);
  }

  public final void play()
  {
    MMViewPager.c(this.jdp).post(new fb(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.fa
 * JD-Core Version:    0.6.2
 */