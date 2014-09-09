package com.tencent.mm.ui.base;

import android.content.Context;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;

final class co extends FrameLayout
{
  public co(cn paramcn, Context paramContext)
  {
    super(paramContext);
  }

  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    int i = 1;
    if (paramKeyEvent.getKeyCode() == 4)
    {
      if (getKeyDispatcherState() == null)
        i = super.dispatchKeyEvent(paramKeyEvent);
      KeyEvent.DispatcherState localDispatcherState2;
      do
      {
        return i;
        if ((paramKeyEvent.getAction() != 0) || (paramKeyEvent.getRepeatCount() != 0))
          break;
        localDispatcherState2 = getKeyDispatcherState();
      }
      while (localDispatcherState2 == null);
      localDispatcherState2.startTracking(paramKeyEvent, this);
      return i;
      if (paramKeyEvent.getAction() == i)
      {
        KeyEvent.DispatcherState localDispatcherState1 = getKeyDispatcherState();
        if ((localDispatcherState1 != null) && (localDispatcherState1.isTracking(paramKeyEvent)) && (!paramKeyEvent.isCanceled()))
        {
          this.jaK.dismiss();
          return i;
        }
      }
      return super.dispatchKeyEvent(paramKeyEvent);
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }

  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((cn.b(this.jaK) != null) && (cn.b(this.jaK).onTouch(this, paramMotionEvent)))
      return true;
    return super.dispatchTouchEvent(paramMotionEvent);
  }

  protected final int[] onCreateDrawableState(int paramInt)
  {
    return super.onCreateDrawableState(paramInt);
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = (int)paramMotionEvent.getX();
    int j = (int)paramMotionEvent.getY();
    if ((paramMotionEvent.getAction() == 0) && ((i < 0) || (i >= getWidth()) || (j < 0) || (j >= getHeight())))
    {
      this.jaK.dismiss();
      return true;
    }
    if (paramMotionEvent.getAction() == 4)
    {
      this.jaK.dismiss();
      return true;
    }
    return super.onTouchEvent(paramMotionEvent);
  }

  public final void sendAccessibilityEvent(int paramInt)
  {
    if (getChildCount() == 1)
      getChildAt(0).sendAccessibilityEvent(paramInt);
    while (true)
    {
      super.sendAccessibilityEvent(paramInt);
      return;
      super.sendAccessibilityEvent(paramInt);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.co
 * JD-Core Version:    0.6.2
 */