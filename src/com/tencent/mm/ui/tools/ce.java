package com.tencent.mm.ui.tools;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class ce
  implements MenuItem.OnMenuItemClickListener
{
  ce(ImageGalleryGridUI paramImageGalleryGridUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jRz.onBackPressed();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ce
 * JD-Core Version:    0.6.2
 */