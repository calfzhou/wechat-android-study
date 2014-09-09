package com.tencent.mm.ui.setting;

import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.mm.model.x;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.e;

final class bz
  implements MenuItem.OnMenuItemClickListener
{
  bz(SettingsAliasUI paramSettingsAliasUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    SettingsAliasUI.a(this.jNd, SettingsAliasUI.c(this.jNd).getText().toString().trim());
    if (x.pG().equalsIgnoreCase(SettingsAliasUI.d(this.jNd)))
    {
      this.jNd.XF();
      this.jNd.finish();
      return true;
    }
    ActionBarActivity localActionBarActivity = this.jNd.aPI();
    SettingsAliasUI localSettingsAliasUI = this.jNd;
    int i = n.bSY;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = SettingsAliasUI.d(this.jNd);
    e.a(localActionBarActivity, localSettingsAliasUI.getString(i, arrayOfObject), this.jNd.getString(n.buo), new ca(this), null);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.bz
 * JD-Core Version:    0.6.2
 */