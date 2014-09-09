package com.tencent.mm.ui.tools.gridviewheaders;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;

public final class r extends BaseAdapter
  implements b
{
  private DataSetObserver fZ = new s(this);
  private ListAdapter jWk;

  public r(ListAdapter paramListAdapter)
  {
    this.jWk = paramListAdapter;
    paramListAdapter.registerDataSetObserver(this.fZ);
  }

  public final int bbj()
  {
    return 0;
  }

  public final View d(int paramInt, View paramView)
  {
    return null;
  }

  public final int getCount()
  {
    return this.jWk.getCount();
  }

  public final Object getItem(int paramInt)
  {
    return this.jWk.getItem(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return this.jWk.getItemId(paramInt);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return this.jWk.getView(paramInt, paramView, paramViewGroup);
  }

  public final int rm(int paramInt)
  {
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gridviewheaders.r
 * JD-Core Version:    0.6.2
 */