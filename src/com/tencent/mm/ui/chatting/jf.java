package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.am.a;

final class jf
  implements MenuItem.OnMenuItemClickListener
{
  jf(hd paramhd)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    new Intent().putExtra("composeType", 1);
    a.l(this.jtA.agh(), "qqmail", ".ui.ComposeUI");
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.jf
 * JD-Core Version:    0.6.2
 */