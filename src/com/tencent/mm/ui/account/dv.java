package com.tencent.mm.ui.account;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class dv
  implements MenuItem.OnMenuItemClickListener
{
  dv(LoginUI paramLoginUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    LoginUI.b(this.iPW);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.dv
 * JD-Core Version:    0.6.2
 */