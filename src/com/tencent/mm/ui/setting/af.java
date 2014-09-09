package com.tencent.mm.ui.setting;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class af
  implements MenuItem.OnMenuItemClickListener
{
  af(SettingDeleteAccountInputPassUI paramSettingDeleteAccountInputPassUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jLW.XF();
    this.jLW.startActivity(new Intent(this.jLW, SettingDeleteAccountUI.class));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.af
 * JD-Core Version:    0.6.2
 */