package com.tencent.mm.ui.tools.gridviewheaders;

import android.view.View;

final class k extends q
  implements Runnable
{
  private k(GridHeadersGridView paramGridHeadersGridView)
  {
    super(paramGridHeadersGridView, (byte)0);
  }

  public final void run()
  {
    View localView = this.jWg.rs(this.jWg.jWe);
    if (localView != null)
    {
      GridHeadersGridView.a(this.jWg, this.jWg.jWe);
      if ((!aAv()) || (this.jWg.oy))
        break label98;
    }
    label98: for (boolean bool = this.jWg.aI(localView); ; bool = false)
    {
      if (bool)
      {
        this.jWg.hzM = -2;
        this.jWg.setPressed(false);
        localView.setPressed(false);
        return;
      }
      this.jWg.hzM = 2;
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gridviewheaders.k
 * JD-Core Version:    0.6.2
 */