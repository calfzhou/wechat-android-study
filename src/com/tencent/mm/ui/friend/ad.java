package com.tencent.mm.ui.friend;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class ad
  implements MenuItem.OnMenuItemClickListener
{
  ad(FMessageConversationUI paramFMessageConversationUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jIq.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.ad
 * JD-Core Version:    0.6.2
 */