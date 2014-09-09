package com.tencent.mm.ui.base;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

final class el extends GestureDetector.SimpleOnGestureListener
{
  el(MMTextView paramMMTextView)
  {
  }

  public final boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    if (MMTextView.a(this.jcU) == null)
      return false;
    return MMTextView.a(this.jcU).ar(this.jcU);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.el
 * JD-Core Version:    0.6.2
 */