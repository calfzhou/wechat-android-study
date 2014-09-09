package com.tencent.mm.ui.tools;

import com.tencent.mm.sdk.platformtools.cm;

final class eb extends dw
{
  private float[] jdr = new float[9];

  public eb(MMGestureGallery paramMMGestureGallery)
  {
    super(paramMMGestureGallery);
  }

  public final void play()
  {
    MMGestureGallery.c(this.jTE).post(new ec(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.eb
 * JD-Core Version:    0.6.2
 */