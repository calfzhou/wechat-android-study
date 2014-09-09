package com.tencent.mm.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class bk
  implements MenuItem.OnMenuItemClickListener
{
  bk(SettingsAccountInfoUI paramSettingsAccountInfoUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jMH.XF();
    this.jMH.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.bk
 * JD-Core Version:    0.6.2
 */