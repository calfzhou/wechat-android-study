package com.tencent.mm.ui.tools;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class fa
  implements MenuItem.OnMenuItemClickListener
{
  fa(MultiStageCitySelectUI paramMultiStageCitySelectUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    MultiStageCitySelectUI.e(this.jUj);
    this.jUj.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.fa
 * JD-Core Version:    0.6.2
 */