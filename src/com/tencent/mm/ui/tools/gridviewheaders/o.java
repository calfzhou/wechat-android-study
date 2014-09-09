package com.tencent.mm.ui.tools.gridviewheaders;

import android.view.View;

final class o extends q
  implements Runnable
{
  int hAl;

  private o(GridHeadersGridView paramGridHeadersGridView)
  {
    super(paramGridHeadersGridView, (byte)0);
  }

  public final void run()
  {
    if (this.jWg.oy);
    View localView;
    do
    {
      do
        return;
      while ((this.jWg.jWd == null) || (this.jWg.jWd.getCount() <= 0) || (this.hAl == -1) || (this.hAl >= this.jWg.jWd.getCount()) || (!aAv()));
      localView = this.jWg.rs(this.hAl);
    }
    while (localView == null);
    GridHeadersGridView localGridHeadersGridView = this.jWg;
    GridHeadersGridView.a(this.jWg, this.hAl);
    localGridHeadersGridView.aH(localView);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gridviewheaders.o
 * JD-Core Version:    0.6.2
 */