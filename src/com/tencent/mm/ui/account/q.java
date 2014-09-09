package com.tencent.mm.ui.account;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.base.MMAutoSwitchEditTextView;

final class q
  implements MenuItem.OnMenuItemClickListener
{
  q(EmailVerifyUI paramEmailVerifyUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    EmailVerifyUI.b(this.iOb, EmailVerifyUI.e(this.iOb).getText());
    if ((!ch.jb(EmailVerifyUI.f(this.iOb))) && (EmailVerifyUI.f(this.iOb).length() == 12))
      EmailVerifyUI.a(this.iOb, EmailVerifyUI.f(this.iOb));
    while (true)
    {
      return true;
      this.iOb.eB(false);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.q
 * JD-Core Version:    0.6.2
 */