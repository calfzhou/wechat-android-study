package com.tencent.mm.ui.tools.gridviewheaders;

import android.database.DataSetObserver;

final class s extends DataSetObserver
{
  s(r paramr)
  {
  }

  public final void onChanged()
  {
    this.jWl.notifyDataSetChanged();
  }

  public final void onInvalidated()
  {
    this.jWl.notifyDataSetInvalidated();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gridviewheaders.s
 * JD-Core Version:    0.6.2
 */