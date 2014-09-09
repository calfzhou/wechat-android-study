package com.tencent.mm.ui.account;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class gz
  implements MenuItem.OnMenuItemClickListener
{
  gz(RegByMobileWaitingSMSUI paramRegByMobileWaitingSMSUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    RegByMobileWaitingSMSUI.a(this.iRx);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.gz
 * JD-Core Version:    0.6.2
 */