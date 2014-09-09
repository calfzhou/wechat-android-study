package com.tencent.mm.ui.contact.profile;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.mm.n;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.cm;
import com.tencent.mm.ui.base.e;

final class cs
  implements cm
{
  cs(cr paramcr)
  {
  }

  public final void d(MenuItem paramMenuItem, int paramInt)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return;
    case 1:
      cf.a(this.jED.jEy, NormalUserFooterPreference.a(this.jED.jEy.jEw).getUsername());
      return;
    case 8:
      cf.a(this.jED.jEy);
      return;
    case 5:
    }
    e.a(this.jED.jEy.jEw.getContext(), this.jED.jEy.jEw.getContext().getString(n.bCj), this.jED.jEy.jEw.getContext().getString(n.bCi), new ct(this), null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.cs
 * JD-Core Version:    0.6.2
 */