package com.tencent.mm.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class t
  implements MenuItem.OnMenuItemClickListener
{
  t(SendFeedBackUI paramSendFeedBackUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jLO.XF();
    this.jLO.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.t
 * JD-Core Version:    0.6.2
 */