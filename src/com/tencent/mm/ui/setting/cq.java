package com.tencent.mm.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class cq
  implements MenuItem.OnMenuItemClickListener
{
  cq(SettingsLanguageUI paramSettingsLanguageUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jNo.finish();
    SettingsLanguageUI.a(this.jNo, SettingsLanguageUI.a(this.jNo), SettingsLanguageUI.b(this.jNo));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.cq
 * JD-Core Version:    0.6.2
 */