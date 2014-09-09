package com.tencent.mm.ui.contact.profile;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.ui.tools.eo;

final class cg
  implements MenuItem.OnMenuItemClickListener
{
  cg(cf paramcf)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    eo localeo = new eo(NormalUserFooterPreference.b(this.jEy.jEw));
    localeo.a(new ch(this));
    localeo.b(new ci(this));
    localeo.a(new cl(this));
    localeo.ck();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.cg
 * JD-Core Version:    0.6.2
 */