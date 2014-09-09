package com.tencent.mm.ui.account;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ae;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.ui.base.e;

final class gp
  implements MenuItem.OnMenuItemClickListener
{
  gp(RegByMobileSetNickUI paramRegByMobileSetNickUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    String str1 = RegByMobileSetNickUI.a(this.iQZ).getText().toString().trim();
    if ((str1 == null) || (str1.length() <= 0))
    {
      e.b(this.iQZ, n.cnE, n.bYK);
      return true;
    }
    this.iQZ.XF();
    String str2 = this.iQZ.getIntent().getExtras().getString("regbymobile_pwd");
    String str3 = this.iQZ.getIntent().getExtras().getString("regbymobile_ticket");
    ae localae = new ae("", str2, str1, 0, "", RegByMobileSetNickUI.b(this.iQZ), str3, 4);
    bg.qX().d(localae);
    RegByMobileSetNickUI localRegByMobileSetNickUI1 = this.iQZ;
    RegByMobileSetNickUI localRegByMobileSetNickUI2 = this.iQZ;
    this.iQZ.getString(n.buo);
    RegByMobileSetNickUI.a(localRegByMobileSetNickUI1, e.a(localRegByMobileSetNickUI2, this.iQZ.getString(n.bZa), true, new gq(this, localae)));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.gp
 * JD-Core Version:    0.6.2
 */