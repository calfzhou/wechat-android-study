package com.tencent.mm.ui.base;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListAdapter;
import com.tencent.mm.sdk.platformtools.cm;

final class cb
  implements AbsListView.OnScrollListener
{
  private cb(MMListPopupWindow paramMMListPopupWindow)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((MMListPopupWindow.a(this.jay) != null) && (MMListPopupWindow.e(this.jay) != null) && (MMListPopupWindow.f(this.jay) != null) && (MMListPopupWindow.a(this.jay) != null))
    {
      if ((MMListPopupWindow.a(this.jay).getLastVisiblePosition() == -1 + MMListPopupWindow.f(this.jay).getCount()) && (MMListPopupWindow.a(this.jay).getChildAt(-1 + MMListPopupWindow.a(this.jay).getChildCount()) != null) && (MMListPopupWindow.a(this.jay).getChildAt(-1 + MMListPopupWindow.a(this.jay).getChildCount()).getBottom() <= MMListPopupWindow.a(this.jay).getHeight()))
        MMListPopupWindow.e(this.jay).setVisibility(8);
    }
    else
      return;
    MMListPopupWindow.e(this.jay).setVisibility(0);
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((paramInt == 1) && (!this.jay.isInputMethodNotNeeded()) && (MMListPopupWindow.b(this.jay).getContentView() != null))
    {
      MMListPopupWindow.d(this.jay).removeCallbacks(MMListPopupWindow.c(this.jay));
      MMListPopupWindow.c(this.jay).run();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.cb
 * JD-Core Version:    0.6.2
 */