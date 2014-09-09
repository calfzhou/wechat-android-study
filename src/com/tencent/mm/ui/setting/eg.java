package com.tencent.mm.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class eg
  implements MenuItem.OnMenuItemClickListener
{
  eg(SettingsPersonalInfoUI paramSettingsPersonalInfoUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jNM.XF();
    this.jNM.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.eg
 * JD-Core Version:    0.6.2
 */