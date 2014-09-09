package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class gb
  implements MenuItem.OnMenuItemClickListener
{
  gb(SnsAddressUI paramSnsAddressUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jCy.finish();
    if (!this.jCy.getIntent().getBooleanExtra("stay_in_wechat", true))
      this.jCy.moveTaskToBack(true);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.gb
 * JD-Core Version:    0.6.2
 */