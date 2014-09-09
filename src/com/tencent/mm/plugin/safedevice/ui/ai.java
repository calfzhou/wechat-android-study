package com.tencent.mm.plugin.safedevice.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ak;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.ch;

final class ai
  implements MenuItem.OnMenuItemClickListener
{
  ai(SecurityAccountVerifyUI paramSecurityAccountVerifyUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    String str = SecurityAccountVerifyUI.g(this.fUC).getText().toString().trim();
    if (ch.jb(str))
    {
      com.tencent.mm.ui.base.e.b(this.fUC, n.bwW, n.buo);
      return true;
    }
    this.fUC.XF();
    SecurityAccountVerifyUI.a(this.fUC, com.tencent.mm.plugin.safedevice.a.e.aN(this.fUC));
    SecurityAccountVerifyUI.b(this.fUC, com.tencent.mm.plugin.safedevice.a.e.afj());
    if (!SecurityAccountVerifyUI.h(this.fUC));
    for (Object localObject = new com.tencent.mm.modelfriend.ai(SecurityAccountVerifyUI.d(this.fUC), str, "", SecurityAccountVerifyUI.e(this.fUC), SecurityAccountVerifyUI.i(this.fUC), SecurityAccountVerifyUI.j(this.fUC)); ; localObject = new ak(SecurityAccountVerifyUI.d(this.fUC), 11, str, "", SecurityAccountVerifyUI.i(this.fUC), SecurityAccountVerifyUI.j(this.fUC)))
    {
      bg.qX().d((x)localObject);
      SecurityAccountVerifyUI localSecurityAccountVerifyUI1 = this.fUC;
      SecurityAccountVerifyUI localSecurityAccountVerifyUI2 = this.fUC;
      this.fUC.getString(n.buo);
      SecurityAccountVerifyUI.a(localSecurityAccountVerifyUI1, com.tencent.mm.ui.base.e.a(localSecurityAccountVerifyUI2, this.fUC.getString(n.bwO), true, new aj(this, (x)localObject)));
      return true;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.ai
 * JD-Core Version:    0.6.2
 */