package com.tencent.mm.ui.tools;

import android.annotation.TargetApi;
import android.view.View;

final class cj
  implements Runnable
{
  cj(ImageGalleryGridUI paramImageGalleryGridUI)
  {
  }

  @TargetApi(12)
  public final void run()
  {
    if (this.jRz.jRy != null)
    {
      this.jRz.jRy.setVisibility(8);
      this.jRz.jRy = null;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.cj
 * JD-Core Version:    0.6.2
 */