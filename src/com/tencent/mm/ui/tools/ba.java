package com.tencent.mm.ui.tools;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class ba
  implements MenuItem.OnMenuItemClickListener
{
  ba(CropImageNewUI paramCropImageNewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    eo localeo = new eo(this.jPx);
    localeo.a(new bb(this));
    localeo.b(new bc(this));
    localeo.ck();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ba
 * JD-Core Version:    0.6.2
 */