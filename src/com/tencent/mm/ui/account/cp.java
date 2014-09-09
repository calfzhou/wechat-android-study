package com.tencent.mm.ui.account;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class cp
  implements MenuItem.OnMenuItemClickListener
{
  cp(LoginIndepPass paramLoginIndepPass)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    LoginIndepPass.a(this.iPD);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.cp
 * JD-Core Version:    0.6.2
 */