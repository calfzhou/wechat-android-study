package android.support.v7.internal.widget;

import android.view.View;

final class ab
  implements Runnable
{
  ab(ListPopupWindow paramListPopupWindow)
  {
  }

  public final void run()
  {
    View localView = this.pr.getAnchorView();
    if ((localView != null) && (localView.getWindowToken() != null))
      this.pr.show();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ab
 * JD-Core Version:    0.6.2
 */