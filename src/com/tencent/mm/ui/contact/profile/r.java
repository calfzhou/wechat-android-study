package com.tencent.mm.ui.contact.profile;

import android.view.MenuItem;
import android.widget.ImageView;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.ui.c;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.cj;

final class r
  implements cj
{
  r(i parami)
  {
  }

  public final void a(ImageView paramImageView, MenuItem paramMenuItem)
  {
    if (paramMenuItem.getTitle().equals(i.c(this.jDl).getString(n.bBa)))
      c.a(paramImageView, i.d(this.jDl).getUsername());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.r
 * JD-Core Version:    0.6.2
 */