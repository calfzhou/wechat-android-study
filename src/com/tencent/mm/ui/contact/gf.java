package com.tencent.mm.ui.contact;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class gf
  implements MenuItem.OnMenuItemClickListener
{
  gf(SnsTagContactListUI paramSnsTagContactListUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jCC.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.gf
 * JD-Core Version:    0.6.2
 */