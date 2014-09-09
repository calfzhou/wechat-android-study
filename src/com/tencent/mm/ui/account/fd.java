package com.tencent.mm.ui.account;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class fd
  implements MenuItem.OnMenuItemClickListener
{
  fd(RegByMobileRegAIOUI paramRegByMobileRegAIOUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.iQP.XF();
    RegByMobileRegAIOUI.k(this.iQP);
    this.iQP.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.fd
 * JD-Core Version:    0.6.2
 */