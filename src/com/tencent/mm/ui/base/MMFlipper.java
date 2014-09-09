package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.tencent.mm.aq.a;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public class MMFlipper extends ViewGroup
{
  private int dZ;
  private Scroller eK;
  private Interpolator eZg;
  private float fc;
  private float fd;
  private VelocityTracker ff;
  private int hzL = 0;
  protected int iXA;
  protected int iXB;
  private boolean iXD = true;
  protected int iYQ;
  private int iYR = 0;
  private boolean iYS = false;
  private ax iYT;
  private aw iYU;
  int iYV = -123454321;
  int iYW = -123454321;

  public MMFlipper(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    init(paramContext);
  }

  public MMFlipper(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }

  private void init(Context paramContext)
  {
    this.eZg = new ay();
    this.eK = new Scroller(paramContext, this.eZg);
    this.iXB = -1;
    int i = this.iYR;
    this.iXA = i;
    this.iYQ = i;
    this.dZ = ViewConfiguration.get(getContext()).getScaledTouchSlop();
  }

  private void pk(int paramInt)
  {
    int i = Math.max(0, Math.min(paramInt, -1 + getChildCount()));
    if (getScrollX() != i * getWidth())
    {
      int j = i * getWidth() - getScrollX();
      this.eK.startScroll(getScrollX(), 0, j, 0, a.q(getContext(), (int)(1.3F * Math.abs(j))));
      if (this.iXA != i)
      {
        this.iYS = true;
        this.iYQ += i - this.iXA;
      }
      this.iXB = this.iXA;
      this.iXA = i;
      invalidate();
    }
  }

  public final void a(aw paramaw)
  {
    this.iYU = paramaw;
  }

  public final void a(ax paramax)
  {
    this.iYT = paramax;
  }

  public final void aI(boolean paramBoolean)
  {
    this.iXD = paramBoolean;
  }

  public final int aRG()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.iXA);
    z.d("!32@/B4Tb64lLpKU689CppO1CHt/InoddcC3", "cur screen is %d", arrayOfObject);
    return this.iXA;
  }

  public void computeScroll()
  {
    this.eK.getCurrX();
    if (this.eK.computeScrollOffset())
    {
      scrollTo(this.eK.getCurrX(), this.eK.getCurrY());
      postInvalidate();
    }
    do
    {
      do
        return;
      while (!this.iYS);
      this.iYS = false;
    }
    while (this.iYT == null);
    ax localax = this.iYT;
    localax.jE(this.iYQ);
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
          z.v("!32@/B4Tb64lLpKU689CppO1CHt/InoddcC3", "xDif = " + m + ", yDif = " + n);
          if ((m > this.dZ) && (n < this.dZ));
          int i2;
          for (int i1 = i; ; i2 = 0)
          {
            if (i1 == 0)
              break label199;
            this.hzL = i;
            break;
          }
          label199: this.hzL = 0;
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
    long l = ch.CN();
    int i = getChildCount();
    int j = 0;
    for (int k = 0; k < i; k++)
    {
      View localView = getChildAt(k);
      if (localView.getVisibility() != 8)
      {
        int m = localView.getMeasuredWidth();
        z.v("!32@/B4Tb64lLpKU689CppO1CHt/InoddcC3", "flipper onLayout childWidth:" + m);
        localView.layout(j, 0, j + m, localView.getMeasuredHeight());
        j += m;
      }
    }
    z.v("!32@/B4Tb64lLpKU689CppO1CHt/InoddcC3", "use " + ch.ad(l) + " ms, flipper onLayout changed:" + paramBoolean + " Left,Top,Right,Bottom:" + paramInt1 + "," + paramInt2 + "," + paramInt3 + "," + paramInt4);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    long l = ch.CN();
    super.onMeasure(paramInt1, paramInt2);
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt2);
    if (this.iYU != null)
      this.iYU.al(i, j);
    this.iYV = i;
    this.iYW = j;
    int k = getChildCount();
    for (int m = 0; m < k; m++)
      getChildAt(m).measure(paramInt1, paramInt2);
    scrollTo(i * this.iXA, 0);
    z.v("!32@/B4Tb64lLpKU689CppO1CHt/InoddcC3", "flipper onMeasure:" + i + "," + View.MeasureSpec.getSize(paramInt2) + " childCount:" + k + ", use " + ch.ad(l));
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
    paramMotionEvent.getY();
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
    if ((j > 600) && (this.iXA > 0))
      pk(-1 + this.iXA);
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
      if ((j < -600) && (this.iXA < -1 + getChildCount()))
      {
        pk(1 + this.iXA);
      }
      else
      {
        int k = getWidth();
        pk((getScrollX() + k / 2) / k);
      }
    }
  }

  public final void pv(int paramInt)
  {
    int i = Math.max(0, Math.min(paramInt, -1 + getChildCount()));
    this.iYS = false;
    if (!this.eK.isFinished())
      this.eK.abortAnimation();
    this.iXB = this.iXA;
    this.iXA = i;
    scrollTo(i * getWidth(), 0);
  }

  public final void pw(int paramInt)
  {
    this.iYQ = paramInt;
  }

  public final void px(int paramInt)
  {
    int i = Math.max(0, Math.min(paramInt, -1 + getChildCount()));
    this.iYS = false;
    if (!this.eK.isFinished())
      this.eK.abortAnimation();
    if (this.iYT != null)
    {
      ax localax = this.iYT;
      localax.jE(i);
    }
    this.iXB = this.iXA;
    this.iXA = i;
    this.iYQ = i;
    scrollTo(i * getWidth(), 0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMFlipper
 * JD-Core Version:    0.6.2
 */