package com.tencent.mm.ui.player;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class b
  implements MenuItem.OnMenuItemClickListener
{
  b(MusicDetailUI paramMusicDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jKu.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.player.b
 * JD-Core Version:    0.6.2
 */