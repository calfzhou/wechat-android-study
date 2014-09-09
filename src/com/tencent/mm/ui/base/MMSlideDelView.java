package com.tencent.mm.ui.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;

public class MMSlideDelView extends ViewGroup
{
  private final int dZ;
  private final Scroller eK;
  private di ekA;
  private dj ekC;
  private dm ekz;
  private float fc;
  private float fd;
  private VelocityTracker ff;
  private int fiZ;
  private boolean jbQ = false;
  private boolean jbR = false;
  private dh jbS;
  private boolean jbT = true;
  private Runnable jbU;
  private long jbV;
  private boolean jbW = false;
  private dg jbX = null;
  private dk jbY;
  private cm mHandler = new cm();
  long time;

  public MMSlideDelView(Context paramContext)
  {
    super(paramContext, null);
    this.eK = new Scroller(paramContext, new LinearInterpolator());
    this.dZ = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    this.jbV = ViewConfiguration.getLongPressTimeout();
  }

  public MMSlideDelView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.eK = new Scroller(paramContext, new LinearInterpolator());
    this.dZ = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    this.jbV = ViewConfiguration.getLongPressTimeout();
  }

  private void aK(boolean paramBoolean)
  {
    ViewParent localViewParent = getParent();
    if (localViewParent != null)
      localViewParent.requestDisallowInterceptTouchEvent(paramBoolean);
  }

  public static dj aSu()
  {
    return new de();
  }

  private void aSw()
  {
    if (this.ff != null)
    {
      this.ff.clear();
      this.ff = null;
    }
  }

  private void aSx()
  {
    if (this.mHandler != null)
      this.mHandler.removeCallbacks(this.jbS);
  }

  private void aSy()
  {
    setPressed(false);
    if (this.jbR)
    {
      aSA();
      return;
    }
    VelocityTracker localVelocityTracker = this.ff;
    localVelocityTracker.computeCurrentVelocity(1000);
    int i = (int)localVelocityTracker.getXVelocity();
    MMSlideDelView localMMSlideDelView;
    if (i < -600)
    {
      int n = getScrollX();
      int i1 = getChildAt(1).getWidth() - n;
      this.ekC.a(this, true);
      this.jbR = true;
      this.eK.startScroll(n, 0, i1, 0, 100);
      localMMSlideDelView = this;
    }
    while (true)
    {
      localMMSlideDelView.invalidate();
      while (true)
      {
        if (this.ff != null)
        {
          this.ff.recycle();
          this.ff = null;
        }
        this.jbQ = false;
        aK(false);
        return;
        if (i <= 600)
          break;
        aSA();
      }
      int j = getScrollX();
      int k = getChildAt(1).getWidth();
      int m = k - j;
      if (j > k / 2)
      {
        this.ekC.a(this, true);
        this.jbR = true;
        this.eK.startScroll(j, 0, m, 0, 100);
        localMMSlideDelView = this;
      }
      else
      {
        this.jbR = false;
        this.ekC.a(this, false);
        this.eK.startScroll(j, 0, -j, 0, 100);
        localMMSlideDelView = this;
      }
    }
  }

  public final void a(di paramdi)
  {
    this.ekA = paramdi;
  }

  public final void a(dj paramdj)
  {
    this.ekC = paramdj;
  }

  public final void a(dm paramdm)
  {
    this.ekz = paramdm;
  }

  public final void aSA()
  {
    int i = getScrollX();
    this.ekC.a(this, false);
    this.jbR = false;
    this.eK.startScroll(i, 0, -i, 0, 100);
    invalidate();
  }

  public final void aSv()
  {
    this.jbT = false;
  }

  public final void aSz()
  {
    this.ekC.a(this, false);
    this.jbR = false;
    scrollTo(0, 0);
    invalidate();
  }

  public void buildDrawingCache()
  {
  }

  public void buildDrawingCache(boolean paramBoolean)
  {
  }

  public void computeScroll()
  {
    if (this.eK.computeScrollOffset())
    {
      scrollTo(this.eK.getCurrX(), this.eK.getCurrY());
      postInvalidate();
    }
  }

  public Bitmap getDrawingCache()
  {
    return null;
  }

  public Bitmap getDrawingCache(boolean paramBoolean)
  {
    return null;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (getChildCount() < 2);
    while (true)
    {
      return;
      int i = getChildCount();
      int j = 0;
      int k = 0;
      while (j < i)
      {
        View localView = getChildAt(j);
        if (localView.getVisibility() != 8)
        {
          int m = localView.getMeasuredWidth();
          localView.layout(k, 0, k + m, paramInt4 - paramInt2);
          k += m;
        }
        j++;
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (getChildCount() < 2)
      return;
    int i = View.MeasureSpec.getSize(paramInt1);
    try
    {
      getChildAt(0).measure(paramInt1, paramInt2);
      label24: int j = Math.max(0, getChildAt(0).getMeasuredHeight());
      ViewGroup.LayoutParams localLayoutParams = getChildAt(1).getLayoutParams();
      View localView = getChildAt(1);
      if ((localView != null) && (localView.getVisibility() != 8));
      try
      {
        localView.measure(View.MeasureSpec.makeMeasureSpec(localLayoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(j, 1073741824));
        label94: j = Math.max(j, localView.getMeasuredHeight());
        setMeasuredDimension(resolveSize(i, paramInt1), resolveSize(j, paramInt2));
        return;
      }
      catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException2)
      {
        break label94;
      }
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException1)
    {
      break label24;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 1;
    if (!this.jbT)
      i = 0;
    float f1;
    float f2;
    do
    {
      return i;
      int j = paramMotionEvent.getAction();
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      if ((this.ekC.aoL()) && (!this.jbR))
      {
        z.v("!32@/B4Tb64lLpKjyuEDzIt3EXrdyszrp4wg", "onTouchEvent a menu has been shown, skip");
        this.jbW = false;
        this.ekC.aoM();
      }
      if (this.ff == null)
        this.ff = VelocityTracker.obtain();
      this.ff.addMovement(paramMotionEvent);
      if (this.jbW)
        return false;
      switch (j)
      {
      default:
      case 0:
      case 2:
      case 1:
      case 3:
      }
    }
    while (this.mHandler == null);
    this.mHandler.removeCallbacks(this.jbX);
    return i;
    if ((getContext() instanceof MMActivity))
      ((MMActivity)getContext()).XF();
    this.jbQ = false;
    if (!this.eK.isFinished())
      this.eK.abortAnimation();
    this.time = System.currentTimeMillis();
    if (this.ekA != null)
      this.fiZ = this.ekA.K(this);
    if (this.jbS == null)
      this.jbS = new dh(this);
    this.mHandler.postDelayed(this.jbS, ViewConfiguration.getTapTimeout());
    this.fc = f1;
    this.fd = f2;
    if (this.jbX == null)
      this.jbX = new dg(this, (byte)0);
    this.jbX.aAu();
    this.mHandler.postDelayed(this.jbX, this.jbV);
    return i;
    int k = (int)(this.fc - f1);
    int m = (int)(this.fd - f2);
    int n = getScrollX();
    if (!this.jbQ)
    {
      if ((k < 0) || (Math.abs(k) < this.dZ / 3))
        break label526;
      if (m == 0)
        m = i;
      if (Math.abs(k / m) <= 3)
        break label526;
      int i2 = i;
      label393: if ((i2 != 0) || (this.jbR))
      {
        this.jbQ = i;
        aK(i);
      }
    }
    int i1;
    if (this.jbQ)
    {
      View localView = getChildAt(i);
      if ((localView != null) && (!localView.isShown()))
      {
        localView.setVisibility(0);
        if (this.jbY == null);
      }
      aSx();
      setPressed(false);
      aK(i);
      if (n + k >= 0)
        break label532;
      i1 = -n;
    }
    while (true)
    {
      if (this.mHandler != null)
        this.mHandler.removeCallbacks(this.jbX);
      scrollBy(i1, 0);
      this.fc = f1;
      this.fd = f2;
      return i;
      label526: int i3 = 0;
      break label393;
      label532: if (n + k > getChildAt(i).getWidth())
      {
        i1 = getChildAt(i).getWidth() - n;
        continue;
        aSx();
        if ((!this.jbQ) && ((isPressed()) || (System.currentTimeMillis() - this.time < 200L)) && (this.ekz != null) && (!this.jbR))
        {
          setPressed(i);
          if (this.jbU != null)
            removeCallbacks(this.jbU);
          this.jbU = new df(this);
          this.mHandler.postDelayed(this.jbU, ViewConfiguration.getPressedStateDuration());
        }
        while (true)
        {
          if (this.jbQ)
            aSy();
          aSw();
          if (this.mHandler == null)
            break;
          this.mHandler.removeCallbacks(this.jbX);
          return i;
          setPressed(false);
        }
        aSx();
        setPressed(false);
        if (this.jbQ)
          aSy();
        aSw();
        if (this.mHandler == null)
          break;
        this.mHandler.removeCallbacks(this.jbX);
        return i;
      }
      i1 = k;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    z.v("!32@/B4Tb64lLpKjyuEDzIt3EXrdyszrp4wg", "window focus change, reset long press status");
    this.jbW = false;
    super.onWindowFocusChanged(paramBoolean);
  }

  public final void setView(View paramView)
  {
    if (getChildCount() == 2)
      removeViewAt(0);
    addView(paramView, 0, new ViewGroup.LayoutParams(-1, -2));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMSlideDelView
 * JD-Core Version:    0.6.2
 */