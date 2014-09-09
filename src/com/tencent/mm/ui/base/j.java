package com.tencent.mm.ui.base;

import android.view.MenuItem;

final class j
  implements cm
{
  j(z paramz)
  {
  }

  public final void d(MenuItem paramMenuItem, int paramInt)
  {
    if (this.iXG != null)
      this.iXG.onClick(paramInt, paramMenuItem.getItemId());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.j
 * JD-Core Version:    0.6.2
 */