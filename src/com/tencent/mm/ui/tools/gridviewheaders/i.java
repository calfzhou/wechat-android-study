package com.tencent.mm.ui.tools.gridviewheaders;

import android.database.DataSetObserver;

final class i extends DataSetObserver
{
  i(GridHeadersGridView paramGridHeadersGridView)
  {
  }

  public final void onChanged()
  {
    GridHeadersGridView.a(this.jWg);
  }

  public final void onInvalidated()
  {
    GridHeadersGridView.a(this.jWg);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gridviewheaders.i
 * JD-Core Version:    0.6.2
 */