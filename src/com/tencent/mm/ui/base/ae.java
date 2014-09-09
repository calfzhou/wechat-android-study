package com.tencent.mm.ui.base;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class ae
  implements View.OnTouchListener
{
  ae(MMAutoCompleteTextView paramMMAutoCompleteTextView)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    MMAutoCompleteTextView localMMAutoCompleteTextView = this.iYj;
    if (localMMAutoCompleteTextView.getCompoundDrawables()[2] == null);
    while ((paramMotionEvent.getAction() != 1) || (paramMotionEvent.getX() <= localMMAutoCompleteTextView.getWidth() - localMMAutoCompleteTextView.getPaddingRight() - this.iYj.iYi.getIntrinsicWidth()))
      return false;
    localMMAutoCompleteTextView.setText("");
    MMAutoCompleteTextView.a(this.iYj);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ae
 * JD-Core Version:    0.6.2
 */