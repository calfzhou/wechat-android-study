package com.tencent.mm.ui.account;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.plugin.accountsync.ui.InviteFacebookFriendsUI;

final class ap
  implements MenuItem.OnMenuItemClickListener
{
  ap(FacebookFriendUI paramFacebookFriendUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.iOo.startActivity(new Intent(this.iOo, InviteFacebookFriendsUI.class));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.ap
 * JD-Core Version:    0.6.2
 */