package com.tencent.mm.ui.base;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

final class ce
  implements AbsListView.OnScrollListener
{
  ce(MMLoadMoreListView paramMMLoadMoreListView)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((paramAbsListView.getLastVisiblePosition() == -1 + paramAbsListView.getCount()) && (MMLoadMoreListView.a(this.jaC) != null))
      MMLoadMoreListView.a(this.jaC).XK();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ce
 * JD-Core Version:    0.6.2
 */