package com.tencent.mm.ui.base;

import com.tencent.mm.sdk.platformtools.cm;

final class fc extends ew
{
  private float[] jdr = new float[9];

  public fc(MMViewPager paramMMViewPager)
  {
    super(paramMMViewPager);
  }

  public final void play()
  {
    MMViewPager.c(this.jdp).post(new fd(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.fc
 * JD-Core Version:    0.6.2
 */