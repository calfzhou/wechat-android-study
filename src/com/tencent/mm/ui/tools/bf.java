package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.widget.ImageView;
import android.widget.LinearLayout;

final class bf
  implements Runnable
{
  bf(CropImageNewUI paramCropImageNewUI)
  {
  }

  public final void run()
  {
    if (this.jPx.getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false))
    {
      this.jPx.finish();
      return;
    }
    CropImageNewUI.e(this.jPx).setVisibility(8);
    CropImageNewUI.p(this.jPx).setVisibility(0);
    CropImageNewUI.q(this.jPx).setVisibility(((Integer)CropImageNewUI.q(this.jPx).getTag()).intValue());
    CropImageNewUI.j(this.jPx).setVisibility(0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.bf
 * JD-Core Version:    0.6.2
 */