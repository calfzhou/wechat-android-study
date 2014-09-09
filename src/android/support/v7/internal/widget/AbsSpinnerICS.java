package android.support.v7.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.SpinnerAdapter;

abstract class AbsSpinnerICS extends u
{
  private DataSetObserver fZ;
  SpinnerAdapter mk;
  int ml;
  int mm;
  boolean mn;
  int mo = 0;
  int mp = 0;
  int mq = 0;
  int mr = 0;
  final Rect ms = new Rect();
  final c mt = new c(this);

  AbsSpinnerICS(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setFocusable(true);
    setWillNotDraw(false);
  }

  final void co()
  {
    this.oy = false;
    this.ot = false;
    removeAllViewsInLayout();
    this.oG = -1;
    this.oH = -9223372036854775808L;
    I(-1);
    J(-1);
    invalidate();
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.LayoutParams(-1, -2);
  }

  public final View getSelectedView()
  {
    if ((this.oE > 0) && (this.oB >= 0))
      return getChildAt(this.oB - this.ol);
    return null;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = getPaddingLeft();
    int k = getPaddingTop();
    int m = getPaddingRight();
    int n = getPaddingBottom();
    Rect localRect1 = this.ms;
    int i1;
    label70: int i2;
    label96: int i3;
    label122: int i7;
    int i6;
    int i5;
    if (j > this.mo)
    {
      localRect1.left = j;
      Rect localRect2 = this.ms;
      if (k <= this.mp)
        break label413;
      i1 = k;
      localRect2.top = i1;
      Rect localRect3 = this.ms;
      if (m <= this.mq)
        break label422;
      i2 = m;
      localRect3.right = i2;
      Rect localRect4 = this.ms;
      if (n <= this.mr)
        break label431;
      i3 = n;
      localRect4.bottom = i3;
      if (this.oy)
        handleDataChanged();
      int i4 = this.oz;
      if ((i4 < 0) || (this.mk == null) || (i4 >= this.mk.getCount()))
        break label440;
      View localView = this.mt.D(i4);
      if (localView == null)
        localView = this.mk.getView(i4, null, this);
      if (localView != null)
        this.mt.b(i4, localView);
      if (localView == null)
        break label440;
      if (localView.getLayoutParams() == null)
      {
        this.mn = true;
        localView.setLayoutParams(generateDefaultLayoutParams());
        this.mn = false;
      }
      measureChild(localView, paramInt1, paramInt2);
      i7 = localView.getMeasuredHeight() + this.ms.top + this.ms.bottom;
      i6 = localView.getMeasuredWidth() + this.ms.left + this.ms.right;
      i5 = 0;
    }
    while (true)
    {
      if (i5 != 0)
      {
        i7 = this.ms.top + this.ms.bottom;
        if (i == 0)
          i6 = this.ms.left + this.ms.right;
      }
      int i8 = Math.max(i7, getSuggestedMinimumHeight());
      int i9 = Math.max(i6, getSuggestedMinimumWidth());
      int i10 = resolveSize(i8, paramInt2);
      setMeasuredDimension(resolveSize(i9, paramInt1), i10);
      this.ml = paramInt2;
      this.mm = paramInt1;
      return;
      j = this.mo;
      break;
      label413: i1 = this.mp;
      break label70;
      label422: i2 = this.mq;
      break label96;
      label431: i3 = this.mr;
      break label122;
      label440: i5 = 1;
      i6 = 0;
      i7 = 0;
    }
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    AbsSpinnerICS.SavedState localSavedState = (AbsSpinnerICS.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (localSavedState.mw >= 0L)
    {
      this.oy = true;
      this.ot = true;
      this.oq = localSavedState.mw;
      this.oo = localSavedState.position;
      this.ou = 0;
      requestLayout();
    }
  }

  public Parcelable onSaveInstanceState()
  {
    AbsSpinnerICS.SavedState localSavedState = new AbsSpinnerICS.SavedState(super.onSaveInstanceState());
    localSavedState.mw = this.oA;
    if (localSavedState.mw >= 0L)
    {
      localSavedState.position = this.oz;
      return localSavedState;
    }
    localSavedState.position = -1;
    return localSavedState;
  }

  public void requestLayout()
  {
    if (!this.mn)
      super.requestLayout();
  }

  public void setAdapter(SpinnerAdapter paramSpinnerAdapter)
  {
    int i = -1;
    if (this.mk != null)
    {
      this.mk.unregisterDataSetObserver(this.fZ);
      co();
    }
    this.mk = paramSpinnerAdapter;
    this.oG = i;
    this.oH = -9223372036854775808L;
    if (this.mk != null)
    {
      this.oF = this.oE;
      this.oE = this.mk.getCount();
      cO();
      this.fZ = new v(this);
      this.mk.registerDataSetObserver(this.fZ);
      if (this.oE > 0)
        i = 0;
      I(i);
      J(i);
      if (this.oE == 0)
        cQ();
    }
    while (true)
    {
      requestLayout();
      return;
      cO();
      co();
      cQ();
    }
  }

  public final void setSelection(int paramInt)
  {
    J(paramInt);
    requestLayout();
    invalidate();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.AbsSpinnerICS
 * JD-Core Version:    0.6.2
 */