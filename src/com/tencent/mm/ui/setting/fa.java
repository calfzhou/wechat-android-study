package com.tencent.mm.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class fa
  implements MenuItem.OnMenuItemClickListener
{
  fa(SettingsSelectBgUI paramSettingsSelectBgUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jOg.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.fa
 * JD-Core Version:    0.6.2
 */