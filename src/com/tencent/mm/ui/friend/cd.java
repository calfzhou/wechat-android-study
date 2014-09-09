package com.tencent.mm.ui.friend;

import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.l;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.e;

final class cd
  implements MenuItem.OnMenuItemClickListener
{
  cd(RecommendFriendUI paramRecommendFriendUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    int i = RecommendFriendUI.b(this.jJi).aYF().length;
    ActionBarActivity localActionBarActivity = this.jJi.aPI();
    Resources localResources = this.jJi.aPI().getResources();
    int j = l.bqM;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(i);
    e.a(localActionBarActivity, localResources.getQuantityString(j, i, arrayOfObject), this.jJi.getString(n.buo), new ce(this), new cf(this));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.cd
 * JD-Core Version:    0.6.2
 */