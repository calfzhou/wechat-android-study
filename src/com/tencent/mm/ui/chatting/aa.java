package com.tencent.mm.ui.chatting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class aa
  implements MenuItem.OnMenuItemClickListener
{
  aa(AtSomeoneUI paramAtSomeoneUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jmC.setResult(0);
    this.jmC.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.aa
 * JD-Core Version:    0.6.2
 */