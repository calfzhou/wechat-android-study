package com.tencent.mm.plugin.accountsync.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class l
  implements MenuItem.OnMenuItemClickListener
{
  l(InviteFacebookFriendsUI paramInviteFacebookFriendsUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.dWW.XF();
    this.dWW.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.accountsync.ui.l
 * JD-Core Version:    0.6.2
 */