package com.tencent.mm.ui.tools;

import android.widget.GridView;

final class cd
  implements Runnable
{
  cd(ImageGalleryGridUI paramImageGalleryGridUI)
  {
  }

  public final void run()
  {
    if ((ImageGalleryGridUI.a(this.jRz) != null) && (ImageGalleryGridUI.a(this.jRz).getVisibility() != 0))
      ImageGalleryGridUI.a(this.jRz).setVisibility(0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.cd
 * JD-Core Version:    0.6.2
 */