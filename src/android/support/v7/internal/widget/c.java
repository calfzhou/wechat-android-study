package android.support.v7.internal.widget;

import android.util.SparseArray;
import android.view.View;

final class c
{
  private final SparseArray mu = new SparseArray();

  c(AbsSpinnerICS paramAbsSpinnerICS)
  {
  }

  final View D(int paramInt)
  {
    View localView = (View)this.mu.get(paramInt);
    if (localView != null)
      this.mu.delete(paramInt);
    return localView;
  }

  public final void b(int paramInt, View paramView)
  {
    this.mu.put(paramInt, paramView);
  }

  final void clear()
  {
    SparseArray localSparseArray = this.mu;
    int i = localSparseArray.size();
    for (int j = 0; j < i; j++)
    {
      View localView = (View)localSparseArray.valueAt(j);
      if (localView != null)
        AbsSpinnerICS.a(this.mv, localView);
    }
    localSparseArray.clear();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.c
 * JD-Core Version:    0.6.2
 */