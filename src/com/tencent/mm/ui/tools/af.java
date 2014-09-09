package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class af
  implements MenuItem.OnMenuItemClickListener
{
  af(CountryCodeUI paramCountryCodeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jPj.XF();
    Intent localIntent = new Intent();
    localIntent.putExtra("country_name", CountryCodeUI.d(this.jPj));
    localIntent.putExtra("couttry_code", CountryCodeUI.e(this.jPj));
    this.jPj.setResult(100, localIntent);
    this.jPj.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.af
 * JD-Core Version:    0.6.2
 */