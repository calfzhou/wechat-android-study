package com.tencent.mm.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class cg
  implements MenuItem.OnMenuItemClickListener
{
  cg(SettingsChattingUI paramSettingsChattingUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jNi.XF();
    this.jNi.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.cg
 * JD-Core Version:    0.6.2
 */