package com.tencent.mm.plugin.safedevice.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class ah
  implements MenuItem.OnMenuItemClickListener
{
  ah(SecurityAccountVerifyUI paramSecurityAccountVerifyUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    SecurityAccountVerifyUI.f(this.fUC);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.ah
 * JD-Core Version:    0.6.2
 */