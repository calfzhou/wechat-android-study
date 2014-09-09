package com.tencent.mm.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class bj
  implements MenuItem.OnMenuItemClickListener
{
  bj(SettingsAboutTimelineUI paramSettingsAboutTimelineUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jMw.XF();
    this.jMw.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.bj
 * JD-Core Version:    0.6.2
 */