package com.tencent.mm.ui.base;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

final class ey extends GestureDetector.SimpleOnGestureListener
{
  private ey(MMViewPager paramMMViewPager)
  {
  }

  public final boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    if (MMViewPager.a(this.jdp) == null)
      return false;
    if (MMViewPager.a(this.jdp).getScale() <= MMViewPager.a(this.jdp).aTh())
      MMViewPager.a(this.jdp).s(c.e(paramMotionEvent, 0), c.f(paramMotionEvent, 0));
    while (true)
    {
      return true;
      MMViewPager.a(this.jdp).q(c.e(paramMotionEvent, 0), c.f(paramMotionEvent, 0));
    }
  }

  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public final void onLongPress(MotionEvent paramMotionEvent)
  {
    if (MMViewPager.j(this.jdp) != null)
      MMViewPager.j(this.jdp).aAe();
  }

  public final boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    if (MMViewPager.i(this.jdp) != null)
      MMViewPager.i(this.jdp).TN();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ey
 * JD-Core Version:    0.6.2
 */