package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.view.aj;
import android.support.v4.view.ba;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup
{
  static final y ha = new z();
  private float dX;
  private float dY;
  private boolean eY;
  private boolean fp = true;
  private int gM = -858993460;
  private int gN;
  private Drawable gO;
  private final int gP;
  private boolean gQ;
  private View gR;
  private float gS;
  private float gT;
  private int gU;
  private int gV;
  private w gW;
  private final ac gX;
  private boolean gY;
  private final ArrayList gZ = new ArrayList();
  private final Rect gu = new Rect();

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 17)
    {
      ha = new ab();
      return;
    }
    if (i >= 16)
    {
      ha = new aa();
      return;
    }
  }

  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    float f = paramContext.getResources().getDisplayMetrics().density;
    this.gP = ((int)(0.5F + 32.0F * f));
    ViewConfiguration.get(paramContext);
    setWillNotDraw(false);
    ba.a(this, new t(this));
    ba.h(this);
    this.gX = ac.a(this, 0.5F, new v(this, (byte)0));
    this.gX.r(1);
    this.gX.e(f * 400.0F);
  }

  private void B(View paramView)
  {
    ha.b(this, paramView);
  }

  private void a(View paramView, float paramFloat, int paramInt)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    if ((paramFloat > 0.0F) && (paramInt != 0))
    {
      i = (int)(paramFloat * ((0xFF000000 & paramInt) >>> 24)) << 24 | 0xFFFFFF & paramInt;
      if (localLayoutParams.hf == null)
        localLayoutParams.hf = new Paint();
      localLayoutParams.hf.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_OVER));
      if (ba.i(paramView) != 2)
        ba.a(paramView, 2, localLayoutParams.hf);
      B(paramView);
    }
    while (ba.i(paramView) == 0)
    {
      int i;
      return;
    }
    if (localLayoutParams.hf != null)
      localLayoutParams.hf.setColorFilter(null);
    u localu = new u(this, paramView);
    this.gZ.add(localu);
    ba.a(this, localu);
  }

  private boolean aB()
  {
    boolean bool1;
    if (!this.fp)
    {
      boolean bool2 = c(0.0F);
      bool1 = false;
      if (!bool2);
    }
    else
    {
      this.gY = false;
      bool1 = true;
    }
    return bool1;
  }

  private boolean c(float paramFloat)
  {
    if (!this.gQ)
      return false;
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)this.gR.getLayoutParams();
    int i = (int)(getPaddingLeft() + localLayoutParams.leftMargin + paramFloat * this.gU);
    if (this.gX.a(this.gR, i, this.gR.getTop()))
    {
      aA();
      ba.f(this);
      return true;
    }
    return false;
  }

  private void d(float paramFloat)
  {
    int i = 0;
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)this.gR.getLayoutParams();
    if ((localLayoutParams.he) && (localLayoutParams.leftMargin <= 0));
    for (int j = 1; ; j = 0)
    {
      int k = getChildCount();
      while (i < k)
      {
        View localView = getChildAt(i);
        if (localView != this.gR)
        {
          int m = (int)((1.0F - this.gT) * this.gV);
          this.gT = paramFloat;
          localView.offsetLeftAndRight(m - (int)((1.0F - paramFloat) * this.gV));
          if (j != 0)
            a(localView, 1.0F - this.gT, this.gN);
        }
        i++;
      }
    }
  }

  final void A(View paramView)
  {
    int i = getPaddingLeft();
    int j = getWidth() - getPaddingRight();
    int k = getPaddingTop();
    int m = getHeight() - getPaddingBottom();
    int i11;
    int i3;
    int i2;
    int i1;
    int n;
    label75: int i5;
    label84: View localView;
    if (paramView != null)
      if (ba.l(paramView))
      {
        i11 = 1;
        if (i11 == 0)
          break label241;
        i3 = paramView.getLeft();
        i2 = paramView.getRight();
        i1 = paramView.getTop();
        n = paramView.getBottom();
        int i4 = getChildCount();
        i5 = 0;
        if (i5 >= i4)
          return;
        localView = getChildAt(i5);
        if (localView == paramView)
          return;
        int i6 = Math.max(i, localView.getLeft());
        int i7 = Math.max(k, localView.getTop());
        int i8 = Math.min(j, localView.getRight());
        int i9 = Math.min(m, localView.getBottom());
        if ((i6 < i3) || (i7 < i1) || (i8 > i2) || (i9 > n))
          break label256;
      }
    label256: for (int i10 = 4; ; i10 = 0)
    {
      localView.setVisibility(i10);
      i5++;
      break label84;
      if (Build.VERSION.SDK_INT < 18)
      {
        Drawable localDrawable = paramView.getBackground();
        if (localDrawable != null)
        {
          if (localDrawable.getOpacity() == -1)
          {
            i11 = 1;
            break;
          }
          i11 = 0;
          break;
        }
      }
      i11 = 0;
      break;
      label241: n = 0;
      i1 = 0;
      i2 = 0;
      i3 = 0;
      break label75;
    }
  }

  final boolean C(View paramView)
  {
    if (paramView == null)
      return false;
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    return (this.gQ) && (localLayoutParams.he) && (this.gS > 0.0F);
  }

  final void aA()
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      if (localView.getVisibility() == 4)
        localView.setVisibility(0);
    }
  }

  final void ay()
  {
    if (this.gW != null);
    sendAccessibilityEvent(32);
  }

  final void az()
  {
    if (this.gW != null);
    sendAccessibilityEvent(32);
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof SlidingPaneLayout.LayoutParams)) && (super.checkLayoutParams(paramLayoutParams));
  }

  public void computeScroll()
  {
    if (this.gX.aF())
    {
      if (!this.gQ)
        this.gX.abort();
    }
    else
      return;
    ba.f(this);
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if (getChildCount() > 1);
    for (View localView = getChildAt(1); (localView == null) || (this.gO == null); localView = null)
      return;
    int i = this.gO.getIntrinsicWidth();
    int j = localView.getLeft();
    int k = localView.getTop();
    int m = localView.getBottom();
    int n = j - i;
    this.gO.setBounds(n, k, j, m);
    this.gO.draw(paramCanvas);
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    int i = paramCanvas.save(2);
    if ((this.gQ) && (!localLayoutParams.hd) && (this.gR != null))
    {
      paramCanvas.getClipBounds(this.gu);
      this.gu.right = Math.min(this.gu.right, this.gR.getLeft());
      paramCanvas.clipRect(this.gu);
    }
    boolean bool;
    if (Build.VERSION.SDK_INT < 11)
    {
      if ((!localLayoutParams.he) || (this.gS <= 0.0F))
        break label194;
      if (!paramView.isDrawingCacheEnabled())
        paramView.setDrawingCacheEnabled(true);
      Bitmap localBitmap = paramView.getDrawingCache();
      if (localBitmap != null)
      {
        paramCanvas.drawBitmap(localBitmap, paramView.getLeft(), paramView.getTop(), localLayoutParams.hf);
        bool = false;
        paramCanvas.restoreToCount(i);
        return bool;
      }
      new StringBuilder("drawChild: child view ").append(paramView).append(" returned null drawing cache");
    }
    while (true)
    {
      bool = super.drawChild(paramCanvas, paramView, paramLong);
      break;
      label194: if (paramView.isDrawingCacheEnabled())
        paramView.setDrawingCacheEnabled(false);
    }
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new SlidingPaneLayout.LayoutParams();
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new SlidingPaneLayout.LayoutParams(getContext(), paramAttributeSet);
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
      return new SlidingPaneLayout.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    return new SlidingPaneLayout.LayoutParams(paramLayoutParams);
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.fp = true;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.fp = true;
    int i = this.gZ.size();
    for (int j = 0; j < i; j++)
      ((u)this.gZ.get(j)).run();
    this.gZ.clear();
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = aj.a(paramMotionEvent);
    if ((!this.gQ) && (i == 0) && (getChildCount() > 1))
    {
      View localView = getChildAt(1);
      if (localView != null)
        if (ac.b(localView, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
          break label101;
    }
    boolean bool1;
    label101: for (boolean bool2 = true; ; bool2 = false)
    {
      this.gY = bool2;
      if ((this.gQ) && ((!this.eY) || (i == 0)))
        break;
      this.gX.cancel();
      bool1 = super.onInterceptTouchEvent(paramMotionEvent);
      return bool1;
    }
    if ((i == 3) || (i == 1))
    {
      this.gX.cancel();
      return false;
    }
    switch (i)
    {
    case 1:
    default:
    case 0:
    case 2:
    }
    label152: float f3;
    float f4;
    do
    {
      for (int j = 0; ; j = 1)
      {
        if (!this.gX.f(paramMotionEvent))
        {
          bool1 = false;
          if (j == 0)
            break;
        }
        return true;
        this.eY = false;
        float f5 = paramMotionEvent.getX();
        float f6 = paramMotionEvent.getY();
        this.dX = f5;
        this.dY = f6;
        if ((!ac.b(this.gR, (int)f5, (int)f6)) || (!C(this.gR)))
          break label152;
      }
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      f3 = Math.abs(f1 - this.dX);
      f4 = Math.abs(f2 - this.dY);
    }
    while ((f3 <= this.gX.getTouchSlop()) || (f4 <= f3));
    this.gX.cancel();
    this.eY = true;
    return false;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt3 - paramInt1;
    int j = getPaddingLeft();
    int k = getPaddingRight();
    int m = getPaddingTop();
    int n = getChildCount();
    float f;
    int i1;
    int i2;
    label67: int i6;
    boolean bool;
    label189: int i4;
    if (this.fp)
    {
      if ((this.gQ) && (this.gY))
      {
        f = 1.0F;
        this.gS = f;
      }
    }
    else
    {
      i1 = 0;
      i2 = j;
      if (i1 >= n)
        break label317;
      View localView = getChildAt(i1);
      if (localView.getVisibility() == 8)
        break label429;
      SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)localView.getLayoutParams();
      int i5 = localView.getMeasuredWidth();
      i6 = 0;
      if (!localLayoutParams.hd)
        break label277;
      int i9 = localLayoutParams.leftMargin + localLayoutParams.rightMargin;
      int i10 = Math.min(j, i - k - this.gP) - i2 - i9;
      this.gU = i10;
      if (i10 + (i2 + localLayoutParams.leftMargin) + i5 / 2 <= i - k)
        break label271;
      bool = true;
      localLayoutParams.he = bool;
      i4 = i2 + ((int)(i10 * this.gS) + localLayoutParams.leftMargin);
      int i8 = i4 - i6;
      localView.layout(i8, m, i8 + i5, m + localView.getMeasuredHeight());
      j += localView.getWidth();
    }
    while (true)
    {
      i1++;
      i2 = i4;
      break label67;
      f = 0.0F;
      break;
      label271: bool = false;
      break label189;
      label277: if ((this.gQ) && (this.gV != 0));
      for (int i7 = (int)((1.0F - this.gS) * this.gV); ; i7 = 0)
      {
        i6 = i7;
        i4 = j;
        break;
        label317: if (this.fp)
        {
          if (!this.gQ)
            break label392;
          if (this.gV != 0)
            d(this.gS);
          if (((SlidingPaneLayout.LayoutParams)this.gR.getLayoutParams()).he)
            a(this.gR, this.gS, this.gM);
        }
        while (true)
        {
          A(this.gR);
          this.fp = false;
          return;
          label392: for (int i3 = 0; i3 < n; i3++)
            a(getChildAt(i3), 0.0F, this.gM);
        }
      }
      label429: i4 = i2;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    int k = View.MeasureSpec.getMode(paramInt2);
    int m = View.MeasureSpec.getSize(paramInt2);
    int n;
    int i1;
    int i2;
    if (i != 1073741824)
      if (isInEditMode())
      {
        if ((i == -2147483648) || (i != 0))
          break label1081;
        n = k;
        i1 = 300;
        i2 = m;
      }
    while (true)
    {
      int i4;
      int i3;
      label94: boolean bool1;
      int i5;
      int i6;
      int i7;
      int i8;
      float f1;
      label132: View localView2;
      SlidingPaneLayout.LayoutParams localLayoutParams2;
      int i24;
      float f3;
      int i25;
      boolean bool4;
      switch (n)
      {
      default:
        i4 = 0;
        i3 = -1;
        bool1 = false;
        i5 = i1 - getPaddingLeft() - getPaddingRight();
        i6 = getChildCount();
        this.gR = null;
        i7 = 0;
        i8 = i4;
        f1 = 0.0F;
        if (i7 < i6)
        {
          localView2 = getChildAt(i7);
          localLayoutParams2 = (SlidingPaneLayout.LayoutParams)localView2.getLayoutParams();
          if (localView2.getVisibility() == 8)
          {
            localLayoutParams2.he = false;
            i24 = i5;
            f3 = f1;
            i25 = i8;
            bool4 = bool1;
          }
        }
        break;
      case 1073741824:
      case -2147483648:
      }
      while (true)
      {
        i7++;
        bool1 = bool4;
        i8 = i25;
        f1 = f3;
        i5 = i24;
        break label132;
        throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        if (k != 0)
          break label1081;
        if (isInEditMode())
        {
          if (k != 0)
            break label1081;
          n = -2147483648;
          i1 = j;
          i2 = 300;
          break;
        }
        throw new IllegalStateException("Height must not be UNSPECIFIED");
        i4 = i2 - getPaddingTop() - getPaddingBottom();
        i3 = i4;
        break label94;
        i3 = i2 - getPaddingTop() - getPaddingBottom();
        i4 = 0;
        break label94;
        if (localLayoutParams2.weight > 0.0F)
        {
          f1 += localLayoutParams2.weight;
          if (localLayoutParams2.width == 0);
        }
        else
        {
          int i18 = localLayoutParams2.leftMargin + localLayoutParams2.rightMargin;
          int i19;
          label372: int i20;
          label392: int i23;
          if (localLayoutParams2.width == -2)
          {
            i19 = View.MeasureSpec.makeMeasureSpec(i1 - i18, -2147483648);
            if (localLayoutParams2.height != -2)
              break label546;
            i20 = View.MeasureSpec.makeMeasureSpec(i3, -2147483648);
            localView2.measure(i19, i20);
            int i21 = localView2.getMeasuredWidth();
            int i22 = localView2.getMeasuredHeight();
            if ((n == -2147483648) && (i22 > i8))
              i8 = Math.min(i22, i3);
            i23 = i5 - i21;
            if (i23 >= 0)
              break label584;
          }
          label546: label584: for (boolean bool2 = true; ; bool2 = false)
          {
            localLayoutParams2.hd = bool2;
            boolean bool3 = bool2 | bool1;
            if (localLayoutParams2.hd)
              this.gR = localView2;
            i24 = i23;
            i25 = i8;
            float f2 = f1;
            bool4 = bool3;
            f3 = f2;
            break;
            if (localLayoutParams2.width == -1)
            {
              i19 = View.MeasureSpec.makeMeasureSpec(i1 - i18, 1073741824);
              break label372;
            }
            i19 = View.MeasureSpec.makeMeasureSpec(localLayoutParams2.width, 1073741824);
            break label372;
            if (localLayoutParams2.height == -1)
            {
              i20 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
              break label392;
            }
            i20 = View.MeasureSpec.makeMeasureSpec(localLayoutParams2.height, 1073741824);
            break label392;
          }
          if ((bool1) || (f1 > 0.0F))
          {
            int i9 = i1 - this.gP;
            int i10 = 0;
            if (i10 < i6)
            {
              View localView1 = getChildAt(i10);
              SlidingPaneLayout.LayoutParams localLayoutParams1;
              int i11;
              label680: int i12;
              label688: int i17;
              if (localView1.getVisibility() != 8)
              {
                localLayoutParams1 = (SlidingPaneLayout.LayoutParams)localView1.getLayoutParams();
                if (localView1.getVisibility() != 8)
                {
                  if ((localLayoutParams1.width != 0) || (localLayoutParams1.weight <= 0.0F))
                    break label773;
                  i11 = 1;
                  if (i11 == 0)
                    break label779;
                  i12 = 0;
                  if ((!bool1) || (localView1 == this.gR))
                    break label843;
                  if ((localLayoutParams1.width < 0) && ((i12 > i9) || (localLayoutParams1.weight > 0.0F)))
                  {
                    if (i11 == 0)
                      break label827;
                    if (localLayoutParams1.height != -2)
                      break label789;
                    i17 = View.MeasureSpec.makeMeasureSpec(i3, -2147483648);
                    label752: localView1.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), i17);
                  }
                }
              }
              while (true)
              {
                i10++;
                break;
                label773: i11 = 0;
                break label680;
                label779: i12 = localView1.getMeasuredWidth();
                break label688;
                label789: if (localLayoutParams1.height == -1)
                {
                  i17 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                  break label752;
                }
                i17 = View.MeasureSpec.makeMeasureSpec(localLayoutParams1.height, 1073741824);
                break label752;
                label827: i17 = View.MeasureSpec.makeMeasureSpec(localView1.getMeasuredHeight(), 1073741824);
                break label752;
                label843: if (localLayoutParams1.weight > 0.0F)
                {
                  int i13;
                  if (localLayoutParams1.width == 0)
                    if (localLayoutParams1.height == -2)
                      i13 = View.MeasureSpec.makeMeasureSpec(i3, -2147483648);
                  while (true)
                  {
                    if (!bool1)
                      break label985;
                    int i15 = i1 - (localLayoutParams1.leftMargin + localLayoutParams1.rightMargin);
                    int i16 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                    if (i12 == i15)
                      break;
                    localView1.measure(i16, i13);
                    break;
                    if (localLayoutParams1.height == -1)
                    {
                      i13 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                    }
                    else
                    {
                      i13 = View.MeasureSpec.makeMeasureSpec(localLayoutParams1.height, 1073741824);
                      continue;
                      i13 = View.MeasureSpec.makeMeasureSpec(localView1.getMeasuredHeight(), 1073741824);
                    }
                  }
                  label985: int i14 = Math.max(0, i5);
                  localView1.measure(View.MeasureSpec.makeMeasureSpec(i12 + (int)(localLayoutParams1.weight * i14 / f1), 1073741824), i13);
                }
              }
            }
          }
          setMeasuredDimension(i1, i8);
          this.gQ = bool1;
          if ((this.gX.aC() != 0) && (!bool1))
            this.gX.abort();
          return;
        }
        i24 = i5;
        f3 = f1;
        i25 = i8;
        bool4 = bool1;
      }
      label1081: n = k;
      i1 = j;
      i2 = m;
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    SlidingPaneLayout.SavedState localSavedState = (SlidingPaneLayout.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (localSavedState.hg)
      if ((this.fp) || (c(1.0F)))
        this.gY = true;
    while (true)
    {
      this.gY = localSavedState.hg;
      return;
      aB();
    }
  }

  protected Parcelable onSaveInstanceState()
  {
    SlidingPaneLayout.SavedState localSavedState = new SlidingPaneLayout.SavedState(super.onSaveInstanceState());
    boolean bool;
    if (this.gQ)
      if ((!this.gQ) || (this.gS == 1.0F))
        bool = true;
    while (true)
    {
      localSavedState.hg = bool;
      return localSavedState;
      bool = false;
      continue;
      bool = this.gY;
    }
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
      this.fp = true;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.gQ)
      return super.onTouchEvent(paramMotionEvent);
    this.gX.g(paramMotionEvent);
    switch (0xFF & paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      return true;
      float f5 = paramMotionEvent.getX();
      float f6 = paramMotionEvent.getY();
      this.dX = f5;
      this.dY = f6;
      continue;
      if (C(this.gR))
      {
        float f1 = paramMotionEvent.getX();
        float f2 = paramMotionEvent.getY();
        float f3 = f1 - this.dX;
        float f4 = f2 - this.dY;
        int i = this.gX.getTouchSlop();
        if ((f3 * f3 + f4 * f4 < i * i) && (ac.b(this.gR, (int)f1, (int)f2)))
          aB();
      }
    }
  }

  public void requestChildFocus(View paramView1, View paramView2)
  {
    super.requestChildFocus(paramView1, paramView2);
    if ((!isInTouchMode()) && (!this.gQ))
      if (paramView1 != this.gR)
        break label36;
    label36: for (boolean bool = true; ; bool = false)
    {
      this.gY = bool;
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.SlidingPaneLayout
 * JD-Core Version:    0.6.2
 */