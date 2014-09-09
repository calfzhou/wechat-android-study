package com.tencent.mm.ui.base;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class ev
  implements View.OnTouchListener
{
  ev(MMViewPager paramMMViewPager)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (MMViewPager.e(this.jdp) != null);
    for (boolean bool1 = MMViewPager.e(this.jdp).onTouch(paramView, paramMotionEvent); ; bool1 = false)
    {
      MultiTouchImageView localMultiTouchImageView = MMViewPager.f(this.jdp);
      if (localMultiTouchImageView == null)
      {
        MMViewPager.a(this.jdp, null);
        MMViewPager.g(this.jdp).onTouchEvent(paramMotionEvent);
        return bool1;
      }
      MMViewPager.a(this.jdp, localMultiTouchImageView);
      boolean bool2 = MMViewPager.a(this.jdp, MMViewPager.a(this.jdp), paramMotionEvent);
      if (MMViewPager.h(this.jdp) != null)
        MMViewPager.h(this.jdp).recycle();
      MMViewPager.a(this.jdp, MotionEvent.obtainNoHistory(paramMotionEvent));
      MMViewPager.g(this.jdp).onTouchEvent(paramMotionEvent);
      return (bool2) || (bool1);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ev
 * JD-Core Version:    0.6.2
 */