package com.tencent.mm.ui.tools.gridviewheaders;

import android.database.DataSetObserver;

final class v extends DataSetObserver
{
  private v(u paramu)
  {
  }

  public final void onChanged()
  {
    u.a(this.jWo, this.jWo.a(u.a(this.jWo)));
    this.jWo.notifyDataSetChanged();
  }

  public final void onInvalidated()
  {
    u.a(this.jWo, this.jWo.a(u.a(this.jWo)));
    this.jWo.notifyDataSetInvalidated();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gridviewheaders.v
 * JD-Core Version:    0.6.2
 */