package com.tencent.mm.ui.base;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class fg
  implements View.OnTouchListener
{
  fg(MMVisiblePasswordEditText paramMMVisiblePasswordEditText)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = 1;
    MMVisiblePasswordEditText localMMVisiblePasswordEditText1 = this.jdC;
    if (localMMVisiblePasswordEditText1.getCompoundDrawables()[2] == null);
    while ((paramMotionEvent.getAction() != i) || (paramMotionEvent.getX() <= localMMVisiblePasswordEditText1.getWidth() - localMMVisiblePasswordEditText1.getPaddingRight() - this.jdC.jdz.getIntrinsicWidth()))
      return false;
    MMVisiblePasswordEditText localMMVisiblePasswordEditText2 = this.jdC;
    if (!MMVisiblePasswordEditText.a(this.jdC));
    while (true)
    {
      MMVisiblePasswordEditText.a(localMMVisiblePasswordEditText2, i);
      MMVisiblePasswordEditText.b(this.jdC);
      return false;
      int j = 0;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.fg
 * JD-Core Version:    0.6.2
 */