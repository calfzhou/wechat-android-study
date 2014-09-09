package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.tencent.mm.f;
import com.tencent.mm.p;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;

public class MMSingelLinePanel extends MMTagPanel
{
  private int iXw = 0;
  private int iXx = 0;
  private LinkedList iXy = new LinkedList();
  private boolean jbM = true;
  private TextView jbN;
  private int jbO = 0;
  private int jbP = 0;

  static
  {
    if (!MMSingelLinePanel.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }

  public MMSingelLinePanel(Context paramContext)
  {
    this(paramContext, null);
  }

  public MMSingelLinePanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MMSingelLinePanel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p.cwL);
    try
    {
      this.iXw = localTypedArray.getDimensionPixelSize(p.cwM, 0);
      this.iXx = localTypedArray.getDimensionPixelSize(p.cwN, 0);
      return;
    }
    finally
    {
      localTypedArray.recycle();
    }
  }

  public final void aSs()
  {
    super.aSs();
    this.jbN = new TextView(getContext());
    this.jbN.setText("...");
    this.jbN.setTextColor(getResources().getColor(f.Ph));
    this.jbN.setLayoutParams(generateDefaultLayoutParams());
    addView(this.jbN);
  }

  public final void aSt()
  {
    this.jbM = true;
    this.jbN = new TextView(getContext());
    this.jbN.setText("...");
    this.jbN.setLayoutParams(generateDefaultLayoutParams());
    addView(this.jbN);
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return true;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i10;
    int i11;
    int i12;
    int i13;
    int i14;
    int i15;
    int i21;
    int i17;
    int i20;
    label160: int i18;
    int i19;
    if (this.jbM)
    {
      int i7 = getChildCount();
      int i8 = paramInt3 - paramInt1 - this.jbO;
      int i9 = getPaddingLeft();
      i10 = getPaddingTop();
      i11 = 0;
      i12 = 0;
      i13 = 0;
      i14 = 0;
      i15 = i9;
      if (i14 < i7)
      {
        View localView2 = getChildAt(i14);
        if ((localView2.getVisibility() == 8) || (localView2 == this.jbN))
          break label529;
        int i23 = localView2.getMeasuredWidth();
        int i24 = localView2.getMeasuredHeight();
        if (i15 + i23 + getPaddingRight() <= i8)
          break label510;
        int i27 = getPaddingLeft();
        int i28 = i10 + (((Integer)this.iXy.get(i13)).intValue() + this.iXx);
        i21 = i13 + 1;
        i17 = i28;
        i20 = i27;
        if (i21 > 0)
          break label491;
        localView2.layout(i20, i17 + 0, i20 + i23, i24 + (i17 + 0));
        i18 = i20 + (i23 + this.iXw);
        i19 = i17;
        i20 = i18;
      }
    }
    while (true)
    {
      i14++;
      int i22 = i21;
      i15 = i20;
      i10 = i19;
      i11 = i18;
      i12 = i17;
      i13 = i22;
      break;
      if (this.jbN != null)
      {
        if (i13 > 0)
          this.jbN.layout(i11, i12, i11 + this.jbO, i12 + this.jbP);
      }
      else
        return;
      this.jbN.layout(0, 0, 0, 0);
      return;
      int i = getChildCount();
      int j = paramInt3 - paramInt1;
      int k = getPaddingLeft();
      int m = getPaddingTop();
      int n = 0;
      int i1 = 0;
      int i2 = k;
      label322: View localView1;
      int i3;
      int i4;
      int i5;
      if (i1 < i)
      {
        localView1 = getChildAt(i1);
        if ((localView1.getVisibility() != 8) && (localView1 != this.jbN))
        {
          i3 = localView1.getMeasuredWidth();
          i4 = localView1.getMeasuredHeight();
          if (i2 + i3 + getPaddingRight() <= j)
            break label484;
          i5 = getPaddingLeft();
          m += ((Integer)this.iXy.get(n)).intValue() + this.iXx;
          n++;
        }
      }
      while (true)
      {
        int i6 = (((Integer)this.iXy.get(n)).intValue() - i4) / 2;
        localView1.layout(i5, m + i6, i5 + i3, i4 + (i6 + m));
        i2 = i5 + (i3 + this.iXw);
        i1++;
        break label322;
        break;
        label484: i5 = i2;
      }
      label491: int i26 = i12;
      i18 = i11;
      i19 = i17;
      i17 = i26;
      continue;
      label510: int i25 = i13;
      i17 = i10;
      i20 = i15;
      i21 = i25;
      break label160;
      label529: int i16 = i13;
      i17 = i12;
      i18 = i11;
      i19 = i10;
      i20 = i15;
      i21 = i16;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    assert (View.MeasureSpec.getMode(paramInt1) != 0);
    int i = View.MeasureSpec.getSize(paramInt1) - getPaddingLeft() - getPaddingRight();
    int j = View.MeasureSpec.getSize(paramInt2) - getPaddingTop() - getPaddingBottom();
    int k = getChildCount();
    this.iXy.clear();
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    label189: int i12;
    int i6;
    int i7;
    int i8;
    if (View.MeasureSpec.getMode(paramInt2) == -2147483648)
    {
      m = View.MeasureSpec.makeMeasureSpec(j, -2147483648);
      if ((this.jbM) && (this.jbN != null))
      {
        this.jbN.measure(View.MeasureSpec.makeMeasureSpec(i, -2147483648), m);
        this.jbO = this.jbN.getMeasuredWidth();
        this.jbP = this.jbN.getMeasuredHeight();
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(this.jbO);
        z.d("!44@/B4Tb64lLpIWTT1+V73NGcOwBivXqfVq8PGFAIyQgGU=", "mEllipsisWidth %d", arrayOfObject);
      }
      if (this.jbM)
        i -= this.jbO;
      n = 0;
      i1 = 0;
      i2 = 0;
      i3 = 0;
      i4 = 0;
      if (i4 >= k)
        break label353;
      View localView = getChildAt(i4);
      if (localView.getVisibility() == 8)
        break label446;
      localView.measure(View.MeasureSpec.makeMeasureSpec(i, -2147483648), m);
      int i11 = localView.getMeasuredWidth();
      i12 = localView.getMeasuredHeight();
      if (i3 + i11 > i)
      {
        i3 = 0;
        i2 += i1 + this.iXx;
        this.iXy.add(Integer.valueOf(i1));
        i1 = 0;
      }
      int i13 = Math.max(i1, localView.getMeasuredHeight());
      i6 = i3 + (i11 + this.iXw);
      i7 = i2;
      i8 = i13;
    }
    label353: int i5;
    for (int i9 = i12; ; i9 = i5)
    {
      i4++;
      int i10 = i9;
      i1 = i8;
      i2 = i7;
      i3 = i6;
      n = i10;
      break label189;
      m = View.MeasureSpec.makeMeasureSpec(0, 0);
      break;
      this.iXy.add(Integer.valueOf(i1));
      if (this.jbM)
      {
        getPaddingTop();
        getPaddingBottom();
      }
      while (true)
      {
        setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), n);
        return;
        if (View.MeasureSpec.getMode(paramInt2) == 0)
        {
          getPaddingTop();
          getPaddingBottom();
        }
        else if ((View.MeasureSpec.getMode(paramInt2) == -2147483648) && (i2 + i1 < j))
        {
          getPaddingTop();
          getPaddingBottom();
        }
      }
      label446: i5 = n;
      i6 = i3;
      i7 = i2;
      i8 = i1;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMSingelLinePanel
 * JD-Core Version:    0.6.2
 */