package com.tencent.mm.sdk.platformtools;

import android.graphics.Bitmap;

final class t
{
  public int height;
  public int[] iEb;
  public int width;

  public t(r paramr, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    if (paramBitmap == null)
      return;
    this.width = paramr.width;
    this.height = paramr.height;
    this.iEb = new int[paramInt1 * paramInt2];
    paramBitmap.getPixels(this.iEb, 0, paramInt1, 0, 0, paramInt1, paramInt2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.t
 * JD-Core Version:    0.6.2
 */