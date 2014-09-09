package com.tencent.mm.ui.contact.profile;

import android.view.MenuItem;
import com.tencent.mm.c.a.mx;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.cm;

final class cn
  implements cm
{
  cn(cf paramcf)
  {
  }

  public final void d(MenuItem paramMenuItem, int paramInt)
  {
    mx localmx = new mx();
    localmx.cPr.cEg = 5;
    localmx.cPr.cEh = NormalUserFooterPreference.a(this.jEy.jEw).getUsername();
    localmx.cPr.context = NormalUserFooterPreference.b(this.jEy.jEw);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      a.aGB().g(localmx);
      return;
      localmx.cPr.cPu = 4;
      continue;
      localmx.cPr.cPu = 2;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.cn
 * JD-Core Version:    0.6.2
 */