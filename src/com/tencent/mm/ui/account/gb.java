package com.tencent.mm.ui.account;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class gb
  implements MenuItem.OnMenuItemClickListener
{
  gb(RegByMobileRegUI paramRegByMobileRegUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.iQU.XF();
    RegByMobileRegUI.l(this.iQU);
    this.iQU.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.gb
 * JD-Core Version:    0.6.2
 */