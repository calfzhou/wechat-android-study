package com.tencent.mm.ui.base;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.mm.sdk.platformtools.cm;

final class cc
  implements View.OnTouchListener
{
  private cc(MMListPopupWindow paramMMListPopupWindow)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    int j = (int)paramMotionEvent.getX();
    int k = (int)paramMotionEvent.getY();
    if ((i == 0) && (MMListPopupWindow.b(this.jay) != null) && (MMListPopupWindow.b(this.jay).isShowing()) && (j >= 0) && (j < MMListPopupWindow.b(this.jay).getWidth()) && (k >= 0) && (k < MMListPopupWindow.b(this.jay).getHeight()))
      MMListPopupWindow.d(this.jay).postDelayed(MMListPopupWindow.c(this.jay), 250L);
    while (true)
    {
      return false;
      if (i == 1)
        MMListPopupWindow.d(this.jay).removeCallbacks(MMListPopupWindow.c(this.jay));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.cc
 * JD-Core Version:    0.6.2
 */