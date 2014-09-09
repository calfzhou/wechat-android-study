package com.tencent.mm.ui.tools.gridviewheaders;

import android.database.DataSetObserver;
import java.util.List;

final class d extends DataSetObserver
{
  d(c paramc)
  {
  }

  public final void onChanged()
  {
    this.jVH.bbk();
    this.jVH.notifyDataSetChanged();
  }

  public final void onInvalidated()
  {
    c.a(this.jVH).clear();
    this.jVH.notifyDataSetInvalidated();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gridviewheaders.d
 * JD-Core Version:    0.6.2
 */