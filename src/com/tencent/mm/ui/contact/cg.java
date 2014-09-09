package com.tencent.mm.ui.contact;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class cg
  implements MenuItem.OnMenuItemClickListener
{
  cg(ContactRemarkInfoViewUI paramContactRemarkInfoViewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jzs.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.cg
 * JD-Core Version:    0.6.2
 */