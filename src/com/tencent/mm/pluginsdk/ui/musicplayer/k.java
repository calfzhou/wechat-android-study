package com.tencent.mm.pluginsdk.ui.musicplayer;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class k
  implements MenuItem.OnMenuItemClickListener
{
  k(MusicPlayerUI paramMusicPlayerUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.hGL.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.musicplayer.k
 * JD-Core Version:    0.6.2
 */