package com.tencent.mm.ui.tools;

import android.widget.GridView;

final class cf
  implements Runnable
{
  cf(ImageGalleryGridUI paramImageGalleryGridUI)
  {
  }

  public final void run()
  {
    ImageGalleryGridUI.a(this.jRz).invalidateViews();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.cf
 * JD-Core Version:    0.6.2
 */