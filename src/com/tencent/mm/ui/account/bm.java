package com.tencent.mm.ui.account;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class bm
  implements MenuItem.OnMenuItemClickListener
{
  bm(LoginByMobileUI paramLoginByMobileUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    LoginByMobileUI.k(this.iPh);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bm
 * JD-Core Version:    0.6.2
 */