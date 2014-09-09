package com.tencent.mm.ui.account;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class jm
  implements MenuItem.OnMenuItemClickListener
{
  jm(RegSetInfoUI paramRegSetInfoUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    RegSetInfoUI.x(this.iSh);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.jm
 * JD-Core Version:    0.6.2
 */