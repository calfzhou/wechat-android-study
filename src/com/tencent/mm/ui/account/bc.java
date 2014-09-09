package com.tencent.mm.ui.account;

import android.database.DataSetObserver;

final class bc extends DataSetObserver
{
  bc(HorizontalListView paramHorizontalListView)
  {
  }

  public final void onChanged()
  {
    synchronized (this.iOM)
    {
      HorizontalListView.a(this.iOM);
      this.iOM.invalidate();
      this.iOM.requestLayout();
      return;
    }
  }

  public final void onInvalidated()
  {
    HorizontalListView.b(this.iOM);
    this.iOM.invalidate();
    this.iOM.requestLayout();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bc
 * JD-Core Version:    0.6.2
 */