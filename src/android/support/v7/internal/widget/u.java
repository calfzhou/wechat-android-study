package android.support.v7.internal.widget;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Adapter;

abstract class u extends ViewGroup
{
  boolean as = false;
  boolean mn = false;
  long oA = -9223372036854775808L;

  @ViewDebug.ExportedProperty(category="list")
  int oB = -1;
  long oC = -9223372036854775808L;
  private View oD;

  @ViewDebug.ExportedProperty(category="list")
  int oE;
  int oF;
  int oG = -1;
  long oH = -9223372036854775808L;
  private boolean oI;
  private boolean oJ;
  private z oK;

  @ViewDebug.ExportedProperty(category="scrolling")
  int ol = 0;
  int om;
  int oo;
  long oq = -9223372036854775808L;
  long or;
  boolean ot = false;
  int ou;
  private int ov;
  y ow;
  w ox;
  boolean oy;

  @ViewDebug.ExportedProperty(category="list")
  int oz = -1;

  u(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void cP()
  {
    if (this.ow == null)
      return;
    int i = this.oz;
    if (i >= 0)
    {
      getSelectedView();
      y localy = this.ow;
      getAdapter().getItemId(i);
      localy.cy();
      return;
    }
  }

  private long getItemIdAtPosition(int paramInt)
  {
    Adapter localAdapter = getAdapter();
    if ((localAdapter == null) || (paramInt < 0))
      return -9223372036854775808L;
    return localAdapter.getItemId(paramInt);
  }

  final void I(int paramInt)
  {
    this.oB = paramInt;
    this.oC = getItemIdAtPosition(paramInt);
  }

  final void J(int paramInt)
  {
    this.oz = paramInt;
    this.oA = getItemIdAtPosition(paramInt);
    if ((this.ot) && (this.ou == 0) && (paramInt >= 0))
    {
      this.oo = paramInt;
      this.oq = this.oA;
    }
  }

  public void a(w paramw)
  {
    this.ox = paramw;
  }

  public void addView(View paramView)
  {
    throw new UnsupportedOperationException("addView(View) is not supported in AdapterView");
  }

  public void addView(View paramView, int paramInt)
  {
    throw new UnsupportedOperationException("addView(View, int) is not supported in AdapterView");
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in AdapterView");
  }

  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in AdapterView");
  }

  final void cO()
  {
    boolean bool1 = true;
    Adapter localAdapter = getAdapter();
    int i;
    int j;
    label29: boolean bool2;
    label44: boolean bool3;
    if ((localAdapter == null) || (localAdapter.getCount() == 0))
    {
      i = bool1;
      if (i != 0)
        break label150;
      j = bool1;
      if ((j == 0) || (!this.oJ))
        break label156;
      bool2 = bool1;
      super.setFocusableInTouchMode(bool2);
      if ((j == 0) || (!this.oI))
        break label162;
      bool3 = bool1;
      label65: super.setFocusable(bool3);
      if (this.oD != null)
      {
        if ((localAdapter != null) && (!localAdapter.isEmpty()))
          break label168;
        label91: if (!bool1)
          break label181;
        if (this.oD == null)
          break label173;
        this.oD.setVisibility(0);
        setVisibility(8);
      }
    }
    while (true)
    {
      if (this.oy)
        onLayout(false, getLeft(), getTop(), getRight(), getBottom());
      return;
      i = 0;
      break;
      label150: j = 0;
      break label29;
      label156: bool2 = false;
      break label44;
      label162: bool3 = false;
      break label65;
      label168: bool1 = false;
      break label91;
      label173: setVisibility(0);
    }
    label181: if (this.oD != null)
      this.oD.setVisibility(8);
    setVisibility(0);
  }

  final void cQ()
  {
    if ((this.oB != this.oG) || (this.oC != this.oH))
      if (this.ow != null)
      {
        if ((!this.as) && (!this.mn))
          break label117;
        if (this.oK == null)
          this.oK = new z(this, (byte)0);
        post(this.oK);
      }
    while (true)
    {
      if ((this.oB != -1) && (isShown()) && (!isInTouchMode()))
        sendAccessibilityEvent(4);
      this.oG = this.oB;
      this.oH = this.oC;
      return;
      label117: cP();
    }
  }

  final void cR()
  {
    if (getChildCount() > 0)
    {
      this.ot = true;
      this.or = this.ov;
      if (this.oB >= 0)
      {
        View localView2 = getChildAt(this.oB - this.ol);
        this.oq = this.oA;
        this.oo = this.oz;
        if (localView2 != null)
          this.om = localView2.getTop();
        this.ou = 0;
      }
    }
    else
    {
      return;
    }
    View localView1 = getChildAt(0);
    Adapter localAdapter = getAdapter();
    if ((this.ol >= 0) && (this.ol < localAdapter.getCount()));
    for (this.oq = localAdapter.getItemId(this.ol); ; this.oq = -1L)
    {
      this.oo = this.ol;
      if (localView1 != null)
        this.om = localView1.getTop();
      this.ou = 1;
      return;
    }
  }

  protected boolean canAnimate()
  {
    return (super.canAnimate()) && (this.oE > 0);
  }

  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    View localView = getSelectedView();
    return (localView != null) && (localView.getVisibility() == 0) && (localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent));
  }

  protected void dispatchRestoreInstanceState(SparseArray paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }

  protected void dispatchSaveInstanceState(SparseArray paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }

  public abstract Adapter getAdapter();

  public abstract View getSelectedView();

  public final boolean h(View paramView, int paramInt)
  {
    if (this.ox != null)
    {
      playSoundEffect(0);
      if (paramView != null)
        paramView.sendAccessibilityEvent(1);
      this.ox.i(paramView, paramInt);
      return true;
    }
    return false;
  }

  final void handleDataChanged()
  {
    int i = this.oE;
    int m;
    int i3;
    int i4;
    int i5;
    int n;
    if (i > 0)
      if (this.ot)
      {
        this.ot = false;
        m = this.oE;
        if (m != 0)
        {
          long l1 = this.oq;
          int i1 = this.oo;
          if (l1 != -9223372036854775808L)
          {
            int i2 = Math.max(0, i1);
            i3 = Math.min(m - 1, i2);
            long l2 = 100L + SystemClock.uptimeMillis();
            i4 = 0;
            Adapter localAdapter = getAdapter();
            if (localAdapter != null)
            {
              i5 = i3;
              n = i3;
              if (SystemClock.uptimeMillis() <= l2)
                if (localAdapter.getItemId(n) == l1)
                {
                  label127: if ((n < 0) || (n != n))
                    break label332;
                  J(n);
                  j = 1;
                  label147: if (j == 0)
                  {
                    int k = this.oz;
                    if (k >= i)
                      k = i - 1;
                    if (k < 0)
                      k = 0;
                    if ((k >= 0) || (k >= 0))
                    {
                      J(k);
                      cQ();
                    }
                  }
                }
            }
          }
        }
      }
    for (int j = 1; ; j = 0)
    {
      if (j == 0)
      {
        this.oB = -1;
        this.oC = -9223372036854775808L;
        this.oz = -1;
        this.oA = -9223372036854775808L;
        this.ot = false;
        cQ();
      }
      return;
      int i6;
      label240: int i7;
      if (i3 == m - 1)
      {
        i6 = 1;
        if (i5 != 0)
          break label292;
        i7 = 1;
      }
      while (true)
        if ((i6 == 0) || (i7 == 0))
        {
          if ((i7 != 0) || ((i4 != 0) && (i6 == 0)))
          {
            i3++;
            n = i3;
            i4 = 0;
            break;
            i6 = 0;
            break label240;
            label292: i7 = 0;
            continue;
          }
          if ((i6 == 0) && ((i4 != 0) || (i7 != 0)))
            break;
          i5--;
          i4 = 1;
          n = i5;
          break;
        }
      n = -1;
      break label127;
      label332: j = 0;
      break label147;
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks(this.oK);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.ov = getHeight();
  }

  public void removeAllViews()
  {
    throw new UnsupportedOperationException("removeAllViews() is not supported in AdapterView");
  }

  public void removeView(View paramView)
  {
    throw new UnsupportedOperationException("removeView(View) is not supported in AdapterView");
  }

  public void removeViewAt(int paramInt)
  {
    throw new UnsupportedOperationException("removeViewAt(int) is not supported in AdapterView");
  }

  public void setFocusable(boolean paramBoolean)
  {
    boolean bool1 = true;
    Adapter localAdapter = getAdapter();
    boolean bool2;
    if ((localAdapter == null) || (localAdapter.getCount() == 0))
    {
      bool2 = bool1;
      this.oI = paramBoolean;
      if (!paramBoolean)
        this.oJ = false;
      if ((!paramBoolean) || (bool2))
        break label58;
    }
    while (true)
    {
      super.setFocusable(bool1);
      return;
      bool2 = false;
      break;
      label58: bool1 = false;
    }
  }

  public void setFocusableInTouchMode(boolean paramBoolean)
  {
    boolean bool1 = true;
    Adapter localAdapter = getAdapter();
    boolean bool2;
    if ((localAdapter == null) || (localAdapter.getCount() == 0))
    {
      bool2 = bool1;
      this.oJ = paramBoolean;
      if (paramBoolean)
        this.oI = bool1;
      if ((!paramBoolean) || (bool2))
        break label58;
    }
    while (true)
    {
      super.setFocusableInTouchMode(bool1);
      return;
      bool2 = false;
      break;
      label58: bool1 = false;
    }
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    throw new RuntimeException("Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.u
 * JD-Core Version:    0.6.2
 */