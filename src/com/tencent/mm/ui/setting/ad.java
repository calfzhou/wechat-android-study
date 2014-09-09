package com.tencent.mm.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class ad
  implements MenuItem.OnMenuItemClickListener
{
  ad(SettingDeleteAccountAgreementUI paramSettingDeleteAccountAgreementUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jLT.XF();
    this.jLT.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.ad
 * JD-Core Version:    0.6.2
 */