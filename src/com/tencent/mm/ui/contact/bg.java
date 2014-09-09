package com.tencent.mm.ui.contact;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class bg
  implements MenuItem.OnMenuItemClickListener
{
  bg(ContactRemarkImagePreviewUI paramContactRemarkImagePreviewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    ContactRemarkImagePreviewUI.a(this.jyK, false);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.bg
 * JD-Core Version:    0.6.2
 */