package android.support.v7.internal.widget;

import android.database.DataSetObserver;

final class af extends DataSetObserver
{
  private af(ListPopupWindow paramListPopupWindow)
  {
  }

  public final void onChanged()
  {
    if (this.pr.isShowing())
      this.pr.show();
  }

  public final void onInvalidated()
  {
    this.pr.dismiss();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.af
 * JD-Core Version:    0.6.2
 */