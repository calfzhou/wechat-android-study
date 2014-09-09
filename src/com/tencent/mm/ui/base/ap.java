package com.tencent.mm.ui.base;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class ap
  implements View.OnTouchListener
{
  ap(MMClearEditText paramMMClearEditText)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    MMClearEditText localMMClearEditText = this.iYE;
    if (localMMClearEditText.getCompoundDrawables()[2] == null);
    while ((paramMotionEvent.getAction() != 1) || (paramMotionEvent.getX() <= localMMClearEditText.getWidth() - localMMClearEditText.getPaddingRight() - this.iYE.iYi.getIntrinsicWidth()))
      return false;
    localMMClearEditText.setText("");
    MMClearEditText.a(this.iYE);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ap
 * JD-Core Version:    0.6.2
 */