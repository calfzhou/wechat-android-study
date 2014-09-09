package com.tencent.mm.ui.contact;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class fn
  implements MenuItem.OnMenuItemClickListener
{
  fn(SelectLabelContactUI paramSelectLabelContactUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    if (SelectLabelContactUI.a(this.jCo))
      this.jCo.setResult(0);
    this.jCo.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.fn
 * JD-Core Version:    0.6.2
 */