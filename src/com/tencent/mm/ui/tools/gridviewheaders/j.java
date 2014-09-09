package com.tencent.mm.ui.tools.gridviewheaders;

import android.view.View;

final class j
  implements Runnable
{
  j(GridHeadersGridView paramGridHeadersGridView, View paramView, o paramo)
  {
  }

  public final void run()
  {
    this.jWg.hzM = -1;
    this.jWh.setPressed(false);
    this.jWg.setPressed(false);
    if (!this.jWg.oy)
      this.jWi.run();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gridviewheaders.j
 * JD-Core Version:    0.6.2
 */