package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import com.tencent.mm.i;
import com.tencent.mm.sdk.platformtools.ak;

final class ah
  implements Runnable
{
  ah(CropImageNewUI paramCropImageNewUI)
  {
  }

  public final void run()
  {
    if (!CropImageNewUI.a(this.jPx));
    do
    {
      do
      {
        return;
        if ((CropImageNewUI.b(this.jPx)) || (CropImageNewUI.c(this.jPx)) || (!this.jPx.getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false)))
          break;
        CropImageNewUI.d(this.jPx);
      }
      while (this.jPx.getSharedPreferences(ak.aHi(), 0).getBoolean("CropImage_Filter_Show", true));
      CropImageNewUI.e(this.jPx).findViewById(i.apd).setVisibility(4);
      return;
    }
    while (1 != CropImageNewUI.f(this.jPx));
    CropImageNewUI.g(this.jPx);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ah
 * JD-Core Version:    0.6.2
 */