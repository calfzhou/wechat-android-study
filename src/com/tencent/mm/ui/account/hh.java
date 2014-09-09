package com.tencent.mm.ui.account;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ae;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.ui.base.e;

final class hh
  implements MenuItem.OnMenuItemClickListener
{
  hh(RegByQQAuthUI paramRegByQQAuthUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    RegByQQAuthUI.a(this.iRC, RegByQQAuthUI.a(this.iRC).getText().toString().trim());
    if (RegByQQAuthUI.b(this.iRC).equals(""))
    {
      e.b(this.iRC, n.cnE, n.bti);
      return true;
    }
    ae localae = new ae("", RegByQQAuthUI.c(this.iRC), RegByQQAuthUI.b(this.iRC), RegByQQAuthUI.d(this.iRC), "", "", RegByQQAuthUI.e(this.iRC), 2);
    bg.qX().d(localae);
    RegByQQAuthUI localRegByQQAuthUI1 = this.iRC;
    RegByQQAuthUI localRegByQQAuthUI2 = this.iRC;
    this.iRC.getString(n.buo);
    RegByQQAuthUI.a(localRegByQQAuthUI1, e.a(localRegByQQAuthUI2, this.iRC.getString(n.bZa), true, new hi(this, localae)));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.hh
 * JD-Core Version:    0.6.2
 */