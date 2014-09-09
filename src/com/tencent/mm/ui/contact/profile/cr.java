package com.tencent.mm.ui.contact.profile;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.ui.tools.eo;

final class cr
  implements MenuItem.OnMenuItemClickListener
{
  cr(cf paramcf, boolean paramBoolean1, boolean paramBoolean2)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    eo localeo = new eo(NormalUserFooterPreference.b(this.jEy.jEw));
    localeo.b(new cs(this));
    localeo.a(new cu(this));
    localeo.ck();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.cr
 * JD-Core Version:    0.6.2
 */