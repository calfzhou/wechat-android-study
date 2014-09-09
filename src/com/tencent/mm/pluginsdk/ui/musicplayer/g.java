package com.tencent.mm.pluginsdk.ui.musicplayer;

import android.content.res.Resources;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.c;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.e;

final class g
  implements MenuItem.OnMenuItemClickListener
{
  g(f paramf)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    String[] arrayOfString = f.a(this.hGy).getResources().getStringArray(c.Nq);
    e.b(f.a(this.hGy).aPI(), "", arrayOfString, "", new h(this));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.musicplayer.g
 * JD-Core Version:    0.6.2
 */