package com.tencent.mm.ui.base;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class CustomViewPager extends ViewPager
{
  private boolean gQ = true;

  public CustomViewPager(Context paramContext)
  {
    super(paramContext);
  }

  public CustomViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void ew(boolean paramBoolean)
  {
    this.gQ = paramBoolean;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.gQ)
      return false;
    return super.onInterceptTouchEvent(paramMotionEvent);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.gQ)
      return false;
    return super.onTouchEvent(paramMotionEvent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.CustomViewPager
 * JD-Core Version:    0.6.2
 */