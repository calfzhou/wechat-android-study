package com.tencent.mm.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class cp
  implements MenuItem.OnMenuItemClickListener
{
  cp(SettingsLanguageUI paramSettingsLanguageUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jNo.XF();
    this.jNo.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.cp
 * JD-Core Version:    0.6.2
 */