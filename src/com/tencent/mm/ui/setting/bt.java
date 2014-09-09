package com.tencent.mm.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class bt
  implements MenuItem.OnMenuItemClickListener
{
  bt(SettingsActiveTimeUI paramSettingsActiveTimeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jMU.XF();
    this.jMU.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.bt
 * JD-Core Version:    0.6.2
 */