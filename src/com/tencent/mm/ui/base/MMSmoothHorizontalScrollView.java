package com.tencent.mm.ui.base;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.HorizontalScrollView;

public class MMSmoothHorizontalScrollView extends HorizontalScrollView
{
  private Interpolator eZg = new DecelerateInterpolator();
  private Rect fNa = new Rect();
  private TranslateAnimation fNb;
  private float fc;
  private View jca;

  public MMSmoothHorizontalScrollView(Context paramContext)
  {
    this(paramContext, null);
  }

  public MMSmoothHorizontalScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setFadingEdgeLength(0);
  }

  protected void onFinishInflate()
  {
    if (getChildCount() > 0)
      this.jca = getChildAt(0);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 1;
    if (this.jca == null)
      return super.onTouchEvent(paramMotionEvent);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    label383: 
    while (true)
    {
      return super.onTouchEvent(paramMotionEvent);
      this.fc = paramMotionEvent.getX();
      continue;
      float f = paramMotionEvent.getX();
      if (this.fc == 0.0F)
        this.fc = f;
      int j = (int)(this.fc - f) / 2;
      scrollBy(j, 0);
      this.fc = f;
      int k = this.jca.getMeasuredWidth() - getWidth();
      int m = getScrollX();
      int n;
      if (m != 0)
      {
        n = 0;
        if (m != k);
      }
      else
      {
        n = i;
      }
      if (n != 0)
      {
        if (this.fNa.isEmpty())
          this.fNa.set(this.jca.getLeft(), this.jca.getTop(), this.jca.getRight(), this.jca.getBottom());
        this.jca.layout(this.jca.getLeft() - j, this.jca.getTop(), this.jca.getRight() - j, this.jca.getBottom());
        continue;
        this.fc = 0.0F;
        if (!this.fNa.isEmpty());
        while (true)
        {
          if (i == 0)
            break label383;
          this.fNb = new TranslateAnimation(this.jca.getLeft(), this.fNa.left, 0.0F, 0.0F);
          this.fNb.setInterpolator(this.eZg);
          this.fNb.setDuration(Math.abs(this.jca.getLeft() - this.fNa.left));
          this.jca.startAnimation(this.fNb);
          this.jca.layout(this.fNa.left, this.fNa.top, this.fNa.right, this.fNa.bottom);
          this.fNa.setEmpty();
          break;
          i = 0;
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMSmoothHorizontalScrollView
 * JD-Core Version:    0.6.2
 */