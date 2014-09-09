package com.tencent.mm.ui.player;

import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.n;

final class e
  implements MenuItem.OnMenuItemClickListener
{
  e(MusicDetailUI paramMusicDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    ActionBarActivity localActionBarActivity = this.jKu.aPI();
    String[] arrayOfString = new String[1];
    arrayOfString[0] = this.jKu.getString(n.bUO);
    com.tencent.mm.ui.base.e.a(localActionBarActivity, "", arrayOfString, "", false, new f(this));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.player.e
 * JD-Core Version:    0.6.2
 */