package com.tencent.mm.ui.base;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.Scroller;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.tools.dt;
import com.tencent.mm.ui.tools.du;

public class MMPullDownView extends FrameLayout
  implements GestureDetector.OnGestureListener
{
  private static int jbq = 400;
  private static final int jbt = Color.parseColor("#00000000");
  private int bgColor = Color.parseColor("#ffffffff");
  private Context context;
  private Scroller eK;
  private GestureDetector iVG;
  private int iXA;
  private int iYR = 1;
  private cx jaT;
  private cv jaU;
  private int jaV;
  private int jaW;
  private boolean jaX = false;
  private boolean jaY = false;
  private boolean jaZ = false;
  private boolean jba = false;
  private boolean jbb = true;
  private boolean jbc = false;
  private boolean jbd = true;
  private boolean jbe = true;
  private ct jbf;
  private cu jbg;
  private View jbh;
  private View jbi;
  private int jbj;
  private int jbk = 4;
  private int jbl = 4;
  private boolean jbm = false;
  private cw jbn;
  private boolean jbo = true;
  private dt jbp;
  private cm jbr = new cs(this);
  boolean jbs = false;
  private boolean jbu = false;
  private int jbv = -2147483648;
  private int jbw = this.bgColor;

  public MMPullDownView(Context paramContext)
  {
    this(paramContext, null);
  }

  public MMPullDownView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MMPullDownView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.eK = new Scroller(paramContext, new AccelerateInterpolator());
    this.iXA = this.iYR;
    this.iVG = new GestureDetector(paramContext, this);
    this.jbp = new dt(paramContext);
    this.context = paramContext;
  }

  private void aSq()
  {
    if (this.jbn != null)
      this.jbn.apC();
    if (getScrollY() - this.jaV < 0)
    {
      if (this.jbd)
      {
        this.eK.startScroll(0, getScrollY(), 0, -getScrollY() + this.jaV, 200);
        postInvalidate();
      }
    }
    else if (getScrollY() > this.jaW)
    {
      if (!this.jbe)
        break label204;
      this.eK.startScroll(0, getScrollY(), 0, this.jaW - getScrollY(), 200);
    }
    while (true)
    {
      postInvalidate();
      this.jaZ = false;
      return;
      if (this.jbh.getVisibility() == 4)
        this.eK.startScroll(0, getScrollY(), 0, -getScrollY() + this.jaV, 200);
      if (this.jbh.getVisibility() == 0)
        this.eK.startScroll(0, getScrollY(), 0, -getScrollY(), 200);
      this.jbj = 0;
      this.jba = true;
      this.jbb = false;
      break;
      label204: if (this.jbi.getVisibility() == 4)
        this.eK.startScroll(0, getScrollY(), 0, this.jaW - getScrollY(), 200);
      if (this.jbi.getVisibility() == 0)
        this.eK.startScroll(0, getScrollY(), 0, this.jaW - getScrollY() + this.jaW, 200);
      this.jbj = 1;
      this.jba = true;
      this.jbb = false;
    }
  }

  public final void BQ(String paramString)
  {
    this.bgColor = Color.parseColor(paramString);
    this.jbw = this.bgColor;
  }

  public final void a(ct paramct)
  {
    this.jbf = paramct;
  }

  public final void a(cu paramcu)
  {
    this.jbg = paramcu;
  }

  public final void a(cv paramcv)
  {
    this.jaU = paramcv;
  }

  public final void a(cw paramcw)
  {
    this.jbn = paramcw;
  }

  public final void a(cx paramcx)
  {
    this.jaT = paramcx;
  }

  public final void a(du paramdu)
  {
    this.jbp.a(paramdu);
  }

  public final void aSn()
  {
    this.jbo = false;
  }

  public final int aSo()
  {
    return this.jaV;
  }

  public final void aSp()
  {
    if (this.jbd)
      this.eK.startScroll(0, getScrollY(), 0, -getScrollY() + this.jaV, 200);
    while (true)
    {
      postInvalidate();
      return;
      if (this.jbh.getVisibility() == 4)
        this.eK.startScroll(0, getScrollY(), 0, -getScrollY() + this.jaV, 200);
      if (this.jbh.getVisibility() == 0)
        this.eK.startScroll(0, getScrollY(), 0, -getScrollY(), 200);
      this.jbj = 0;
      this.jba = true;
      this.jbb = false;
    }
  }

  public final void aSr()
  {
    this.jbu = true;
  }

  public void computeScroll()
  {
    if (this.eK.computeScrollOffset())
    {
      scrollTo(this.eK.getCurrX(), this.eK.getCurrY());
      postInvalidate();
    }
    while (true)
    {
      this.eK.isFinished();
      return;
      if (this.jba)
      {
        this.jba = false;
        this.jbr.sendEmptyMessageDelayed(0, jbq);
      }
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    this.jbp.onTouchEvent(paramMotionEvent);
    if (!this.jbb)
      return true;
    if (this.jbg == null)
    {
      this.jaX = false;
      if (this.jbf != null)
        break label119;
      this.jaY = false;
      label41: if (this.jbl == 0)
      {
        if (!this.jbd)
          break label135;
        this.jbh.setVisibility(4);
      }
      label63: if (this.jbk == 0)
      {
        if (!this.jbe)
          break label146;
        this.jbi.setVisibility(4);
      }
    }
    while (true)
    {
      if (paramMotionEvent.getAction() != 1)
        break label157;
      aSq();
      return super.dispatchTouchEvent(paramMotionEvent);
      this.jaX = this.jbg.NM();
      break;
      label119: this.jaY = this.jbf.NN();
      break label41;
      label135: this.jbh.setVisibility(0);
      break label63;
      label146: this.jbi.setVisibility(0);
    }
    label157: if (paramMotionEvent.getAction() == 3)
    {
      aSq();
      return true;
    }
    if (this.iVG.onTouchEvent(paramMotionEvent))
    {
      paramMotionEvent.setAction(3);
      this.jbs = true;
      return super.dispatchTouchEvent(paramMotionEvent);
    }
    try
    {
      boolean bool = super.dispatchTouchEvent(paramMotionEvent);
      return bool;
    }
    catch (Exception localException)
    {
    }
    return true;
  }

  public final void eR(boolean paramBoolean)
  {
    this.jbd = paramBoolean;
  }

  public final void eS(boolean paramBoolean)
  {
    this.jbe = paramBoolean;
  }

  public final void eT(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 0; ; i = 4)
    {
      this.jbk = i;
      if (this.jbi != null)
        this.jbi.setVisibility(this.jbk);
      return;
    }
  }

  public final void eU(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 0; ; i = 4)
    {
      this.jbl = i;
      if (this.jbh != null)
        this.jbh.setVisibility(this.jbl);
      return;
    }
  }

  public boolean onDown(MotionEvent paramMotionEvent)
  {
    if (!this.eK.isFinished())
      this.eK.abortAnimation();
    return false;
  }

  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Float.valueOf(paramFloat1);
    arrayOfObject[1] = Float.valueOf(paramFloat2);
    z.v("!32@/B4Tb64lLpI7QFnGqEKENPRhNROls06u", "on fling, velocityX %f velocityY %f", arrayOfObject);
    return false;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = Integer.valueOf(paramInt1);
    arrayOfObject[2] = Integer.valueOf(paramInt2);
    arrayOfObject[3] = Integer.valueOf(paramInt3);
    arrayOfObject[4] = Integer.valueOf(paramInt4);
    z.d("!32@/B4Tb64lLpI7QFnGqEKENPRhNROls06u", "jacks onLayout change: %B, l:%d, t:%d, r:%d, b:%d", arrayOfObject);
    if (!this.jbm)
    {
      View localView2 = inflate(this.context, k.bhf, null);
      View localView3 = inflate(this.context, k.bhf, null);
      addView(localView2, 0, new FrameLayout.LayoutParams(-1, -2));
      addView(localView3, new FrameLayout.LayoutParams(-1, -2));
      this.jbm = true;
    }
    int i = getChildCount();
    int j = 0;
    int k = 0;
    while (j < i)
    {
      View localView1 = getChildAt(j);
      int m = localView1.getMeasuredHeight();
      if (localView1.getVisibility() != 8)
      {
        localView1.layout(0, k, localView1.getMeasuredWidth(), k + m);
        k += m;
      }
      j++;
    }
    this.jbh = getChildAt(0);
    this.jbi = getChildAt(-1 + getChildCount());
    this.jbh.setVisibility(this.jbl);
    this.jbi.setVisibility(this.jbk);
    this.jaV = this.jbh.getHeight();
    this.jaW = this.jbi.getHeight();
    this.jbv = this.jaV;
    if ((!this.jbc) && (this.jaV != 0))
    {
      this.jbc = true;
      scrollTo(0, this.jaV);
    }
  }

  public void onLongPress(MotionEvent paramMotionEvent)
  {
  }

  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    int i = -1;
    if (this.jbn != null)
      this.jbn.X(paramFloat2);
    if (paramFloat2 > 0.0F)
      this.jaZ = true;
    int k;
    while (true)
      if ((this.jaY) && ((this.jaZ) || (getScrollY() - this.jaV > 0)))
        if ((!this.jbo) && ((this.jbi.getVisibility() != 0) || ((this.jaZ) && (getScrollY() >= 2 * this.jaV))))
        {
          return true;
          this.jaZ = false;
        }
        else
        {
          k = (int)(0.5D * paramFloat2);
          if (k != 0)
            break label411;
          if (paramFloat2 <= 0.0F)
            break;
        }
    label404: label411: for (i = 1; ; i = k)
    {
      z.v("check", "moveUp:" + i + " distanceY:" + paramFloat2 + " scrollY:" + getScrollY());
      if ((i + getScrollY() < this.jaV) && (!this.jaZ));
      for (i = this.jaV - getScrollY(); ; i = 2 * this.jaV - getScrollY())
        do
        {
          scrollBy(0, i);
          return true;
        }
        while ((this.jbo) || (i + getScrollY() < 2 * this.jaV));
      int j;
      if ((this.jaX) && ((!this.jaZ) || (getScrollY() - this.jaV < 0)))
      {
        if ((!this.jbo) && ((this.jbh.getVisibility() != 0) || ((!this.jaZ) && (getScrollY() <= 0))))
          break;
        j = (int)(0.5D * paramFloat2);
        if (j != 0)
          break label404;
        if (paramFloat2 <= 0.0F);
      }
      for (i = 1; ; i = j)
      {
        if (i + getScrollY() > this.jaV);
        for (i = this.jaV - getScrollY(); ; i = -getScrollY())
          do
          {
            scrollBy(0, i);
            return true;
          }
          while ((this.jbo) || (i + getScrollY() >= 0));
        return false;
      }
    }
  }

  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (!this.jbu);
    do
    {
      return;
      if (this.jbv == -2147483648)
      {
        this.jbv = this.jaV;
        z.d("!32@/B4Tb64lLpI7QFnGqEKENPRhNROls06u", "onScrollChanged static y:" + this.jbv);
      }
      if ((paramInt2 <= this.jbv) && (this.jbw != jbt))
      {
        setBackgroundResource(h.WT);
        this.jbw = jbt;
        z.d("!32@/B4Tb64lLpI7QFnGqEKENPRhNROls06u", "onScrollChanged full");
        return;
      }
    }
    while ((paramInt2 <= this.jbv) || (this.jbw == this.bgColor));
    z.d("!32@/B4Tb64lLpI7QFnGqEKENPRhNROls06u", "onScrollChanged white");
    setBackgroundColor(this.bgColor);
    this.jbw = this.bgColor;
  }

  public void onShowPress(MotionEvent paramMotionEvent)
  {
  }

  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    default:
      return true;
    case 1:
    }
    if (getScrollY() - this.jaV < 0)
      this.jaX = true;
    if (getScrollY() > this.jaW)
      this.jaY = true;
    aSq();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMPullDownView
 * JD-Core Version:    0.6.2
 */