package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import com.tencent.mm.aq.a;
import com.tencent.mm.sdk.platformtools.z;

public class MMADFlipper extends ViewGroup
{
  private int dZ;
  private Scroller eK;
  private float fc;
  private float fd;
  private VelocityTracker ff;
  private int hzL = 0;
  private int iXA;
  private int iXB;
  private boolean iXC = false;
  private boolean iXD = true;
  private d iXE;
  private Interpolator iXz;
  private Context mContext;

  public MMADFlipper(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MMADFlipper(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    this.iXz = new LinearInterpolator();
    this.eK = new Scroller(this.mContext, this.iXz);
    this.dZ = ViewConfiguration.get(this.mContext).getScaledDoubleTapSlop();
  }

  private boolean aRw()
  {
    return getChildCount() > 1;
  }

  private void pk(int paramInt)
  {
    int i = Math.max(0, Math.min(paramInt, -1 + getChildCount()));
    if (getScrollX() != i * getWidth())
    {
      int j = i * getWidth() - getScrollX();
      this.eK.startScroll(getScrollX(), 0, j, 0, a.q(getContext(), 2 * Math.abs(j)));
      invalidate();
    }
    if (this.iXE != null);
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(this.iXA);
    arrayOfObject[1] = Integer.valueOf(this.iXB);
    arrayOfObject[2] = Integer.valueOf(paramInt);
    z.d("!32@/B4Tb64lLpKU689CppO1CHt/InoddcC3", "mCurScreen:%d, mLastScreen:%d, whichScreen:%d", arrayOfObject);
    this.iXB = paramInt;
  }

  @TargetApi(14)
  private void pl(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 14)
      setScrollX(paramInt);
    while (this.eK == null)
      return;
    this.eK.setFinalX(paramInt);
  }

  public void computeScroll()
  {
    if (this.eK.computeScrollOffset())
    {
      scrollTo(this.eK.getCurrX(), this.eK.getCurrY());
      postInvalidate();
    }
    do
    {
      do
        return;
      while (!this.iXC);
      this.iXC = false;
      if (this.iXA <= 0)
      {
        if (getChildCount() > 1);
        for (int i = -2 + getChildCount(); ; i = getChildCount())
        {
          this.iXA = i;
          pl(this.iXA * getWidth());
          return;
        }
      }
    }
    while (this.iXA < -1 + getChildCount());
    this.iXA = 1;
    pl(this.iXA * getWidth());
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 1;
    if (!this.iXD)
      i = super.onInterceptTouchEvent(paramMotionEvent);
    while (true)
    {
      return i;
      if (getChildCount() == i)
        return super.onInterceptTouchEvent(paramMotionEvent);
      int j = paramMotionEvent.getAction();
      if ((j != 2) || (this.hzL == 0))
      {
        float f1 = paramMotionEvent.getX();
        float f2 = paramMotionEvent.getY();
        switch (j)
        {
        default:
        case 2:
        case 0:
        case 1:
        case 3:
        }
        while (this.hzL == 0)
        {
          return false;
          int m = (int)Math.abs(this.fc - f1);
          int n = (int)Math.abs(this.fd - f2);
          if ((m > this.dZ) && (n < this.dZ));
          int i2;
          for (int i1 = i; ; i2 = 0)
          {
            if (i1 == 0)
              break label167;
            this.hzL = i;
            break;
          }
          label167: this.hzL = 0;
          continue;
          this.fc = f1;
          this.fd = f2;
          if (this.eK.isFinished());
          for (int k = 0; ; k = i)
          {
            this.hzL = k;
            break;
          }
          this.hzL = 0;
        }
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getChildCount();
    int j = 0;
    int k = 0;
    while (j < i)
    {
      View localView = getChildAt(j);
      if (localView.getVisibility() != 8)
      {
        int m = localView.getMeasuredWidth();
        localView.layout(k, 0, k + m, localView.getMeasuredHeight());
        k += m;
      }
      j++;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    View.MeasureSpec.getSize(paramInt1);
    View.MeasureSpec.getSize(paramInt2);
    int i = getChildCount();
    for (int j = 0; j < i; j++)
      getChildAt(j).measure(paramInt1, paramInt2);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (getChildCount() == 1)
      return super.onTouchEvent(paramMotionEvent);
    if (this.ff == null)
      this.ff = VelocityTracker.obtain();
    this.ff.addMovement(paramMotionEvent);
    int i = paramMotionEvent.getAction();
    float f = paramMotionEvent.getX();
    switch (i)
    {
    default:
      return true;
    case 0:
      if (!this.eK.isFinished())
        this.eK.abortAnimation();
      this.fc = f;
      return true;
    case 2:
      int m = (int)(this.fc - f);
      this.fc = f;
      scrollBy(m, 0);
      return true;
    case 1:
    case 3:
    }
    VelocityTracker localVelocityTracker = this.ff;
    localVelocityTracker.computeCurrentVelocity(1000);
    int j = (int)localVelocityTracker.getXVelocity();
    if (j > 600)
    {
      if (aRw())
      {
        this.iXA = (-1 + this.iXA);
        pk(this.iXA);
      }
      this.iXC = true;
    }
    while (true)
    {
      if (this.ff != null)
      {
        this.ff.recycle();
        this.ff = null;
      }
      this.hzL = 0;
      this.fc = 0.0F;
      this.fd = 0.0F;
      return true;
      if (j < -600)
      {
        if (aRw())
        {
          this.iXA = (1 + this.iXA);
          pk(this.iXA);
        }
        this.iXC = true;
      }
      else
      {
        int k = getWidth();
        pk((getScrollX() + k / 2) / k);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMADFlipper
 * JD-Core Version:    0.6.2
 */