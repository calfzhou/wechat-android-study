package android.support.v7.internal.widget;

import android.database.DataSetObserver;

final class p extends DataSetObserver
{
  p(ActivityChooserView paramActivityChooserView)
  {
  }

  public final void onChanged()
  {
    super.onChanged();
    ActivityChooserView.a(this.of).notifyDataSetChanged();
  }

  public final void onInvalidated()
  {
    super.onInvalidated();
    ActivityChooserView.a(this.of).notifyDataSetInvalidated();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.p
 * JD-Core Version:    0.6.2
 */