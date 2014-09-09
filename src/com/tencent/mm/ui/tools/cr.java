package com.tencent.mm.ui.tools;

import android.graphics.Bitmap;
import com.tencent.mm.sdk.platformtools.z;

final class cr
  implements Runnable
{
  cr(cm paramcm, int paramInt)
  {
  }

  public final void run()
  {
    if (cm.b(this.jRN) == null)
      z.e("!44@/B4Tb64lLpJSmuQVFTi9B6QdAPUqkDaT/sMIXOVKzm0=", "loader is null!");
    Bitmap localBitmap;
    do
    {
      return;
      localBitmap = cm.b(this.jRN).rb(this.dYO);
    }
    while (localBitmap == null);
    cm.c(this.jRN).post(new cs(this, localBitmap));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.cr
 * JD-Core Version:    0.6.2
 */