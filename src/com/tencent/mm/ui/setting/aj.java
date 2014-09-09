package com.tencent.mm.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class aj
  implements MenuItem.OnMenuItemClickListener
{
  aj(SettingsAboutMicroMsgUI paramSettingsAboutMicroMsgUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jMf.XF();
    this.jMf.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.aj
 * JD-Core Version:    0.6.2
 */