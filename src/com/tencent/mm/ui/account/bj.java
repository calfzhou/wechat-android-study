package com.tencent.mm.ui.account;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;

final class bj
  implements MenuItem.OnMenuItemClickListener
{
  bj(LoginByMobileUI paramLoginByMobileUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    LoginByMobileUI.b(this.iPh, LoginByMobileUI.c(this.iPh).getText().toString().trim());
    LoginByMobileUI.c(this.iPh, LoginByMobileUI.a(this.iPh).getText().toString());
    String str = LoginByMobileUI.g(this.iPh) + LoginByMobileUI.h(this.iPh);
    this.iPh.XF();
    LoginByMobileUI.d(this.iPh, str);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bj
 * JD-Core Version:    0.6.2
 */