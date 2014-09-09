package android.support.v7.internal.widget;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

final class ar
  implements ListAdapter, SpinnerAdapter
{
  private SpinnerAdapter mk;
  private ListAdapter qi;

  public ar(SpinnerAdapter paramSpinnerAdapter)
  {
    this.mk = paramSpinnerAdapter;
    if ((paramSpinnerAdapter instanceof SpinnerAdapter))
      this.qi = ((SpinnerAdapter)paramSpinnerAdapter);
  }

  public final boolean areAllItemsEnabled()
  {
    ListAdapter localListAdapter = this.qi;
    if (localListAdapter != null)
      return localListAdapter.areAllItemsEnabled();
    return true;
  }

  public final int getCount()
  {
    if (this.mk == null)
      return 0;
    return this.mk.getCount();
  }

  public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.mk == null)
      return null;
    return this.mk.getDropDownView(paramInt, paramView, paramViewGroup);
  }

  public final Object getItem(int paramInt)
  {
    if (this.mk == null)
      return null;
    return this.mk.getItem(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    if (this.mk == null)
      return -1L;
    return this.mk.getItemId(paramInt);
  }

  public final int getItemViewType(int paramInt)
  {
    return 0;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return getDropDownView(paramInt, paramView, paramViewGroup);
  }

  public final int getViewTypeCount()
  {
    return 1;
  }

  public final boolean hasStableIds()
  {
    return (this.mk != null) && (this.mk.hasStableIds());
  }

  public final boolean isEmpty()
  {
    return getCount() == 0;
  }

  public final boolean isEnabled(int paramInt)
  {
    ListAdapter localListAdapter = this.qi;
    if (localListAdapter != null)
      return localListAdapter.isEnabled(paramInt);
    return true;
  }

  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    if (this.mk != null)
      this.mk.registerDataSetObserver(paramDataSetObserver);
  }

  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    if (this.mk != null)
      this.mk.unregisterDataSetObserver(paramDataSetObserver);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ar
 * JD-Core Version:    0.6.2
 */