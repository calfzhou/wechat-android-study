package android.support.v7.internal.widget;

import android.support.v7.app.c;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

final class an extends BaseAdapter
{
  private an(ScrollingTabContainerView paramScrollingTabContainerView)
  {
  }

  public final int getCount()
  {
    return ScrollingTabContainerView.c(this.qb).getChildCount();
  }

  public final Object getItem(int paramInt)
  {
    return ((ScrollingTabContainerView.TabView)ScrollingTabContainerView.c(this.qb).getChildAt(paramInt)).cZ();
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
      return ScrollingTabContainerView.a(this.qb, (c)getItem(paramInt));
    ((ScrollingTabContainerView.TabView)paramView).c((c)getItem(paramInt));
    return paramView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.an
 * JD-Core Version:    0.6.2
 */