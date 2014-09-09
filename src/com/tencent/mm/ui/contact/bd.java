package com.tencent.mm.ui.contact;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.ui.tools.eo;

final class bd
  implements MenuItem.OnMenuItemClickListener
{
  bd(ContactRemarkImagePreviewUI paramContactRemarkImagePreviewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    eo localeo = new eo(this.jyK);
    localeo.a(new be(this));
    localeo.b(new bf(this));
    localeo.ck();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.bd
 * JD-Core Version:    0.6.2
 */