package android.support.v7.internal.widget;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.PopupWindow;
import com.tencent.mm.sdk.platformtools.cm;

final class ag
  implements AbsListView.OnScrollListener
{
  private ag(ListPopupWindow paramListPopupWindow)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((paramInt == 1) && (!this.pr.isInputMethodNotNeeded()) && (ListPopupWindow.b(this.pr).getContentView() != null))
    {
      ListPopupWindow.d(this.pr).removeCallbacks(ListPopupWindow.c(this.pr));
      ListPopupWindow.c(this.pr).run();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ag
 * JD-Core Version:    0.6.2
 */