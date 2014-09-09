package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import com.tencent.mm.a.f;
import com.tencent.mm.compatible.g.h;
import com.tencent.mm.i;
import com.tencent.mm.sdk.platformtools.ak;

final class be
  implements Runnable
{
  be(CropImageNewUI paramCropImageNewUI)
  {
  }

  public final void run()
  {
    if (CropImageNewUI.e(this.jPx) == null)
      return;
    if (this.jPx.getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false))
    {
      SharedPreferences.Editor localEditor = this.jPx.getSharedPreferences(ak.aHi(), 0).edit();
      int i = CropImageNewUI.e(this.jPx).findViewById(i.apd).getVisibility();
      boolean bool = false;
      if (i == 0)
        bool = true;
      localEditor.putBoolean("CropImage_Filter_Show", bool);
      localEditor.commit();
    }
    String str = this.jPx.getIntent().getStringExtra("CropImage_OutputPath");
    if (str == null)
      str = h.dOL + f.d(new StringBuilder().append(CropImageNewUI.o(this.jPx)).append(System.currentTimeMillis()).toString().getBytes()) + "_fiter.jpg";
    Intent localIntent = new Intent();
    localIntent.putExtra("CropImage_Compress_Img", true);
    if (CropImageNewUI.e(this.jPx) != null)
      localIntent.putExtra("CropImage_filterId", CropImageNewUI.e(this.jPx).bad());
    if (CropImageNewUI.e(this.jPx).bad() == 0)
    {
      localIntent.putExtra("CropImage_OutputPath", CropImageNewUI.o(this.jPx));
      this.jPx.setResult(-1, localIntent);
    }
    while (true)
    {
      this.jPx.finish();
      return;
      if (CropImageNewUI.b(CropImageNewUI.e(this.jPx).aZX(), str))
      {
        localIntent.putExtra("CropImage_OutputPath", str);
        this.jPx.setResult(-1, localIntent);
      }
      else
      {
        this.jPx.setResult(-1);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.be
 * JD-Core Version:    0.6.2
 */