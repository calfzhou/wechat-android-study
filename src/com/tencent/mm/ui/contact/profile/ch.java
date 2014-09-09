package com.tencent.mm.ui.contact.profile;

import android.view.MenuItem;
import android.widget.ImageView;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.ui.c;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.cj;

final class ch
  implements cj
{
  ch(cg paramcg)
  {
  }

  public final void a(ImageView paramImageView, MenuItem paramMenuItem)
  {
    if (paramMenuItem.getTitle().equals(NormalUserFooterPreference.b(this.jEz.jEy.jEw).getString(n.bBa)))
      c.a(paramImageView, NormalUserFooterPreference.a(this.jEz.jEy.jEw).getUsername());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.ch
 * JD-Core Version:    0.6.2
 */