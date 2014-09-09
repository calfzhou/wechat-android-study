package com.tencent.mm.ui.account;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class jy
  implements MenuItem.OnMenuItemClickListener
{
  jy(SimpleLoginUI paramSimpleLoginUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    SimpleLoginUI.b(this.iSL);
    SimpleLoginUI.c(this.iSL);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.jy
 * JD-Core Version:    0.6.2
 */