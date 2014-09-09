package com.tencent.mm.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ar;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.platformtools.ap;

final class dv
  implements MenuItem.OnMenuItemClickListener
{
  dv(SettingsModifyPasswordUI paramSettingsModifyPasswordUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    SettingsModifyPasswordUI.a(this.jNG, SettingsModifyPasswordUI.a(this.jNG).getText().toString().trim());
    SettingsModifyPasswordUI.b(this.jNG, SettingsModifyPasswordUI.b(this.jNG).getText().toString().trim());
    if (!SettingsModifyPasswordUI.d(this.jNG).equals(SettingsModifyPasswordUI.c(this.jNG)))
    {
      com.tencent.mm.ui.base.e.b(this.jNG, n.bYI, n.bYK);
      return true;
    }
    if (SettingsModifyPasswordUI.d(this.jNG).length() > 16)
    {
      com.tencent.mm.ui.base.e.b(this.jNG, n.bYJ, n.bYK);
      return true;
    }
    if (ap.jh(SettingsModifyPasswordUI.d(this.jNG)))
    {
      com.tencent.mm.ui.base.e.b(this.jNG, n.bYv, n.bYK);
      return true;
    }
    if (!ap.iZ(SettingsModifyPasswordUI.d(this.jNG)))
    {
      if ((SettingsModifyPasswordUI.d(this.jNG).length() >= 4) && (SettingsModifyPasswordUI.d(this.jNG).length() < 9))
      {
        com.tencent.mm.ui.base.e.b(this.jNG, n.cnJ, n.bYK);
        return true;
      }
      com.tencent.mm.ui.base.e.b(this.jNG, n.cnL, n.bYK);
      return true;
    }
    this.jNG.XF();
    String str = (String)bg.qW().oQ().get(77830);
    ar localar = new ar(SettingsModifyPasswordUI.d(this.jNG), str);
    bg.qX().d(localar);
    SettingsModifyPasswordUI localSettingsModifyPasswordUI1 = this.jNG;
    SettingsModifyPasswordUI localSettingsModifyPasswordUI2 = this.jNG;
    this.jNG.getString(n.buo);
    SettingsModifyPasswordUI.a(localSettingsModifyPasswordUI1, com.tencent.mm.ui.base.e.a(localSettingsModifyPasswordUI2, this.jNG.getString(n.chy), true, new dw(this, localar)));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.dv
 * JD-Core Version:    0.6.2
 */