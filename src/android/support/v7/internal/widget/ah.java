package android.support.v7.internal.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.PopupWindow;
import com.tencent.mm.sdk.platformtools.cm;

final class ah
  implements View.OnTouchListener
{
  private ah(ListPopupWindow paramListPopupWindow)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    int j = (int)paramMotionEvent.getX();
    int k = (int)paramMotionEvent.getY();
    if ((i == 0) && (ListPopupWindow.b(this.pr) != null) && (ListPopupWindow.b(this.pr).isShowing()) && (j >= 0) && (j < ListPopupWindow.b(this.pr).getWidth()) && (k >= 0) && (k < ListPopupWindow.b(this.pr).getHeight()))
      ListPopupWindow.d(this.pr).postDelayed(ListPopupWindow.c(this.pr), 250L);
    while (true)
    {
      return false;
      if (i == 1)
        ListPopupWindow.d(this.pr).removeCallbacks(ListPopupWindow.c(this.pr));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ah
 * JD-Core Version:    0.6.2
 */