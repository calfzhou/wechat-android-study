package android.support.v7.internal.widget;

import android.widget.PopupWindow;

final class ai
  implements Runnable
{
  private ai(ListPopupWindow paramListPopupWindow)
  {
  }

  public final void run()
  {
    if ((ListPopupWindow.a(this.pr) != null) && (ListPopupWindow.a(this.pr).getCount() > ListPopupWindow.a(this.pr).getChildCount()) && (ListPopupWindow.a(this.pr).getChildCount() <= this.pr.pd))
    {
      ListPopupWindow.b(this.pr).setInputMethodMode(2);
      this.pr.show();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ai
 * JD-Core Version:    0.6.2
 */