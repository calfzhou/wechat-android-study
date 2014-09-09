package com.tencent.mm.ui.tools;

import com.tencent.mm.sdk.platformtools.cm;

final class ed extends dw
{
  private float[] jdr = new float[9];

  public ed(MMGestureGallery paramMMGestureGallery)
  {
    super(paramMMGestureGallery);
  }

  public final void play()
  {
    MMGestureGallery.c(this.jTE).post(new ee(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ed
 * JD-Core Version:    0.6.2
 */