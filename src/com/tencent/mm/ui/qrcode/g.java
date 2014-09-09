package com.tencent.mm.ui.qrcode;

import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.am;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.ui.account.ef;

final class g
  implements MenuItem.OnMenuItemClickListener
{
  g(ShareToQQUI paramShareToQQUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    ShareToQQUI.a(this.jLd);
    String str1;
    boolean bool1;
    boolean bool2;
    if ((ShareToQQUI.b(this.jLd) == 2) || (ShareToQQUI.b(this.jLd) == 1))
    {
      str1 = ShareToQQUI.c(this.jLd).getText().toString();
      if (ShareToQQUI.b(this.jLd) == 1)
      {
        bool1 = true;
        int i = ShareToQQUI.b(this.jLd);
        bool2 = false;
        if (i == 2)
          bool2 = true;
      }
    }
    for (am localam = new am(str1, bool1, bool2); ; localam = new am(ShareToQQUI.c(this.jLd).getText().toString()))
    {
      bg.qX().d(localam);
      ShareToQQUI localShareToQQUI = this.jLd;
      ActionBarActivity localActionBarActivity = this.jLd.aPI();
      this.jLd.getString(n.buo);
      ShareToQQUI.a(localShareToQQUI, com.tencent.mm.ui.base.e.a(localActionBarActivity, this.jLd.getString(n.bRf), true, new i(this, localam)));
      return true;
      bool1 = false;
      break;
      if (ShareToQQUI.b(this.jLd) != 4)
        break label300;
      long l = ap.a((Long)bg.qW().oQ().get(65831));
      String str2 = ap.ja((String)bg.qW().oQ().get(65830));
      if ((ap.ac(l) > 86400000L) && (str2.length() > 0))
      {
        com.tencent.mm.ui.c.a.e locale = new com.tencent.mm.ui.c.a.e("290293790992170");
        locale.CW(str2);
        new ef(locale, new h(this)).aQF();
      }
    }
    label300: com.tencent.mm.ui.base.e.b(this.jLd.aPI(), n.ciF, n.buo);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.qrcode.g
 * JD-Core Version:    0.6.2
 */