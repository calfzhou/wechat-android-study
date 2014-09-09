package com.tencent.mm.ui.bindqq;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class ah
  implements MenuItem.OnMenuItemClickListener
{
  ah(VerifyQQUI paramVerifyQQUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jlq.XF();
    VerifyQQUI.a(this.jlq);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindqq.ah
 * JD-Core Version:    0.6.2
 */