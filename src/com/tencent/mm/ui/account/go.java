package com.tencent.mm.ui.account;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;

final class go
  implements MenuItem.OnMenuItemClickListener
{
  go(RegByMobileRegUI paramRegByMobileRegUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    RegByMobileRegUI.b(this.iQU, RegByMobileRegUI.c(this.iQU).getText().toString().trim());
    RegByMobileRegUI.c(this.iQU, RegByMobileRegUI.a(this.iQU).getText().toString());
    String str = RegByMobileRegUI.f(this.iQU) + RegByMobileRegUI.g(this.iQU);
    this.iQU.XF();
    RegByMobileRegUI.d(this.iQU, str);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.go
 * JD-Core Version:    0.6.2
 */