package com.tencent.mm.ui.applet;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

public final class a
  implements AbsListView.OnScrollListener
{
  private AbsListView.OnScrollListener hxo;

  public a()
  {
    this(null);
  }

  public a(AbsListView.OnScrollListener paramOnScrollListener)
  {
    this.hxo = paramOnScrollListener;
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.hxo != null)
      this.hxo.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (this.hxo != null)
      this.hxo.onScrollStateChanged(paramAbsListView, paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.a
 * JD-Core Version:    0.6.2
 */