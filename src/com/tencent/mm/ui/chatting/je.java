package com.tencent.mm.ui.chatting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.c.a.mx;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.storage.i;

final class je
  implements MenuItem.OnMenuItemClickListener
{
  je(hd paramhd)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    mx localmx = new mx();
    localmx.cPr.cEg = 5;
    localmx.cPr.cEh = this.jtA.jnf.getUsername();
    localmx.cPr.context = this.jtA.agh();
    if (paramMenuItem.getItemId() == 1)
      localmx.cPr.cPu = 4;
    while (true)
    {
      a.aGB().g(localmx);
      return true;
      if (paramMenuItem.getItemId() == 2)
        localmx.cPr.cPu = 2;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.je
 * JD-Core Version:    0.6.2
 */