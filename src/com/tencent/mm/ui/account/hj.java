package com.tencent.mm.ui.account;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class hj
  implements MenuItem.OnMenuItemClickListener
{
  hj(RegByQQAuthUI paramRegByQQAuthUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.iRC.XF();
    this.iRC.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.hj
 * JD-Core Version:    0.6.2
 */