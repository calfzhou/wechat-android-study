package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public final class b extends y
{
  private SparseArray jgr = new SparseArray();

  public b(Context paramContext, SharedPreferences paramSharedPreferences)
  {
    super(paramContext, paramSharedPreferences);
  }

  public final View a(int paramInt, ListView paramListView)
  {
    if ((paramInt > paramListView.getLastVisiblePosition()) || (paramInt < paramListView.getFirstVisiblePosition()))
      return null;
    return (View)this.jgr.get(paramInt);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView = super.getView(paramInt, paramView, paramViewGroup);
    this.jgr.put(paramInt, localView);
    return localView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.b
 * JD-Core Version:    0.6.2
 */