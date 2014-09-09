package com.tencent.mm.ui.tools;

import android.widget.GridView;

final class cc
  implements Runnable
{
  cc(ImageGalleryGridUI paramImageGalleryGridUI)
  {
  }

  public final void run()
  {
    if ((ImageGalleryGridUI.a(this.jRz) != null) && (ImageGalleryGridUI.a(this.jRz).getVisibility() != 4))
      ImageGalleryGridUI.a(this.jRz).setVisibility(4);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.cc
 * JD-Core Version:    0.6.2
 */