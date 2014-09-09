package com.tencent.mm.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.mm.m.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.platformtools.ap;

final class dp
  implements MenuItem.OnMenuItemClickListener
{
  dp(SettingsModifyEmailAddrUI paramSettingsModifyEmailAddrUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    SettingsModifyEmailAddrUI.a(this.jNu, SettingsModifyEmailAddrUI.b(this.jNu).getText().toString().trim());
    if (!ap.iX(SettingsModifyEmailAddrUI.c(this.jNu)))
    {
      com.tencent.mm.ui.base.e.b(this.jNu.aPI(), n.cnH, n.buo);
      return true;
    }
    Integer localInteger = (Integer)bg.qW().oQ().get(7);
    if ((localInteger != null) && ((0x2 & localInteger.intValue()) != 0));
    for (boolean bool = true; ; bool = false)
    {
      Boolean localBoolean = Boolean.valueOf(bool);
      if ((SettingsModifyEmailAddrUI.c(this.jNu).equals(SettingsModifyEmailAddrUI.d(this.jNu))) && (localBoolean.booleanValue()))
        break;
      a locala = new a(a.dmJ, SettingsModifyEmailAddrUI.c(this.jNu));
      bg.qX().d(locala);
      SettingsModifyEmailAddrUI localSettingsModifyEmailAddrUI1 = this.jNu;
      SettingsModifyEmailAddrUI localSettingsModifyEmailAddrUI2 = this.jNu;
      this.jNu.getString(n.buo);
      SettingsModifyEmailAddrUI.a(localSettingsModifyEmailAddrUI1, com.tencent.mm.ui.base.e.a(localSettingsModifyEmailAddrUI2, this.jNu.getString(n.cfl), true, new dq(this, locala)));
      this.jNu.XF();
      return true;
    }
    this.jNu.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.dp
 * JD-Core Version:    0.6.2
 */