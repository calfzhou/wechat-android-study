package com.tencent.mm.ui.account;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class jr
  implements MenuItem.OnMenuItemClickListener
{
  jr(SetPwdUI paramSetPwdUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.iSz.XF();
    this.iSz.setResult(0);
    this.iSz.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.jr
 * JD-Core Version:    0.6.2
 */