package com.tencent.mm.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class aa
  implements MenuItem.OnMenuItemClickListener
{
  aa(ExposeUI paramExposeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    if (ExposeUI.b(this.iIX))
      ExposeUI.c(this.iIX);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.aa
 * JD-Core Version:    0.6.2
 */