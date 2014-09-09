package com.tencent.mm.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.mm.am.a;
import com.tencent.mm.compatible.c.q;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.an;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.storage.cm;
import com.tencent.mm.ui.base.e;

final class u
  implements MenuItem.OnMenuItemClickListener
{
  u(SendFeedBackUI paramSendFeedBackUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    String str = SendFeedBackUI.a(this.jLO).getText().toString().trim();
    if (str.length() > 0)
    {
      if (str.startsWith("//traceroute"))
      {
        SendFeedBackUI.a(this.jLO).setText("");
        a.l(this.jLO.aPI(), "traceroute", ".ui.NetworkDiagnoseIntroUI");
      }
    }
    else
      return false;
    an localan = new an(SendFeedBackUI.aZd(), str + " key " + cm.aKL() + " local key " + cm.aKK() + "NetType:" + bc.bz(this.jLO.getApplicationContext()) + " hasNeon: " + q.mY() + " isArmv6: " + q.na() + " isArmv7: " + q.mZ());
    bg.qX().a(153, this.jLO);
    bg.qX().d(localan);
    this.jLO.XF();
    SendFeedBackUI localSendFeedBackUI1 = this.jLO;
    SendFeedBackUI localSendFeedBackUI2 = this.jLO;
    this.jLO.getString(n.buo);
    SendFeedBackUI.a(localSendFeedBackUI1, e.a(localSendFeedBackUI2, this.jLO.getString(n.bui), true, new v(this, localan)));
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.u
 * JD-Core Version:    0.6.2
 */