package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class gj
  implements MenuItem.OnMenuItemClickListener
{
  gj(ShareImageUI paramShareImageUI, gk paramgk)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    Intent localIntent = new Intent();
    localIntent.putStringArrayListExtra("Select_Contact", this.jUL.baS());
    this.jUM.setResult(0, localIntent);
    this.jUM.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gj
 * JD-Core Version:    0.6.2
 */