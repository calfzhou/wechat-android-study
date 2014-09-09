package com.tencent.mm.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.ca;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.widget.MMEditText;
import junit.framework.Assert;

final class dt
  implements MenuItem.OnMenuItemClickListener
{
  dt(SettingsModifyNameUI paramSettingsModifyNameUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    String str1 = SettingsModifyNameUI.a(this.jNA).getText().toString().trim();
    boolean bool;
    if (str1.length() > 0)
    {
      z.i("!44@9DU/RFsdGl9EDFTBLJS80zMeBDaNw3LjP5dRC/jpTsA=", "Set New NickName : " + str1);
      String str2 = x.pG();
      if ((str2 != null) && (str2.length() > 0))
      {
        bool = true;
        Assert.assertTrue(bool);
        bg.qW().oQ().set(4, str1);
        ca localca = new ca(2, "", str1, 0, "", "", "", 0, 0, 0, "", "", "", 0, "", 0, "", 0);
        bg.qW().oS().a(localca);
        this.jNA.finish();
      }
    }
    while (true)
    {
      return true;
      bool = false;
      break;
      Toast.makeText(this.jNA, n.cfW, 1).show();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.dt
 * JD-Core Version:    0.6.2
 */