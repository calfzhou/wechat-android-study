package com.tencent.mm.ui.friend;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.ui.pluginapp.AddMoreFriendsUI;

final class ac
  implements MenuItem.OnMenuItemClickListener
{
  ac(FMessageConversationUI paramFMessageConversationUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    Intent localIntent = new Intent(this.jIq, AddMoreFriendsUI.class);
    this.jIq.startActivity(localIntent);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.ac
 * JD-Core Version:    0.6.2
 */