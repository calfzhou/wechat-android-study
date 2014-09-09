package com.tencent.mm.ui.account;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class jt
  implements MenuItem.OnMenuItemClickListener
{
  jt(ShowNonWeixinFriendUI paramShowNonWeixinFriendUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.iSI.XF();
    this.iSI.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.jt
 * JD-Core Version:    0.6.2
 */