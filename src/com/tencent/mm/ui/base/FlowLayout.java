package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tencent.mm.p;
import java.util.LinkedList;

public class FlowLayout extends ViewGroup
{
  private int iXw = 0;
  private int iXx = 0;
  private LinkedList iXy = new LinkedList();

  static
  {
    if (!FlowLayout.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }

  public FlowLayout(Context paramContext)
  {
    super(paramContext);
  }

  public FlowLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }

  public FlowLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
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

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof ViewGroup.LayoutParams;
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.LayoutParams(-2, -2);
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewGroup.LayoutParams(getContext(), paramAttributeSet);
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new ViewGroup.LayoutParams(paramLayoutParams.width, paramLayoutParams.height);
  }

  public final int getLineCount()
  {
    return this.iXy.size();
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getChildCount();
    int j = paramInt3 - paramInt1;
    int k = getPaddingLeft();
    int m = getPaddingTop();
    int n = 0;
    int i1 = 0;
    int i2 = k;
    View localView;
    int i3;
    int i4;
    int i5;
    if (i1 < i)
    {
      localView = getChildAt(i1);
      if (localView.getVisibility() != 8)
      {
        i3 = localView.getMeasuredWidth();
        i4 = localView.getMeasuredHeight();
        if (i2 + i3 + getPaddingRight() <= j)
          break label188;
        i5 = getPaddingLeft();
        m += ((Integer)this.iXy.get(n)).intValue() + this.iXx;
        n++;
      }
    }
    while (true)
    {
      int i6 = (((Integer)this.iXy.get(n)).intValue() - i4) / 2;
      localView.layout(i5, m + i6, i5 + i3, i4 + (i6 + m));
      i2 = i5 + (i3 + this.iXw);
      i1++;
      break;
      return;
      label188: i5 = i2;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    assert (View.MeasureSpec.getMode(paramInt1) != 0);
    int i = View.MeasureSpec.getSize(paramInt1) - getPaddingLeft() - getPaddingRight();
    int j = View.MeasureSpec.getSize(paramInt2) - getPaddingTop() - getPaddingBottom();
    int k = getChildCount();
    this.iXy.clear();
    if (View.MeasureSpec.getMode(paramInt2) == -2147483648);
    int i1;
    int i2;
    for (int m = View.MeasureSpec.makeMeasureSpec(j, -2147483648); ; m = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      int n = 0;
      i1 = 0;
      i2 = 0;
      int i3 = 0;
      while (n < k)
      {
        View localView = getChildAt(n);
        if (localView.getVisibility() != 8)
        {
          localView.measure(View.MeasureSpec.makeMeasureSpec(i, -2147483648), m);
          int i5 = localView.getMeasuredWidth();
          if (i3 + i5 > i)
          {
            i2 += i1 + this.iXx;
            this.iXy.add(Integer.valueOf(i1));
            i1 = 0;
            i3 = 0;
          }
          i1 = Math.max(i1, localView.getMeasuredHeight());
          i3 += i5 + this.iXw;
        }
        n++;
      }
    }
    this.iXy.add(Integer.valueOf(i1));
    int i4;
    if (View.MeasureSpec.getMode(paramInt2) == 0)
      i4 = i2 + i1 + getPaddingTop() + getPaddingBottom();
    while (true)
    {
      setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), i4);
      return;
      if ((View.MeasureSpec.getMode(paramInt2) == -2147483648) && (i2 + i1 < j))
        i4 = i2 + i1 + getPaddingTop() + getPaddingBottom();
      else
        i4 = j;
    }
  }

  public final int pj(int paramInt)
  {
    int i = Math.max(0, Math.min(this.iXy.size(), paramInt));
    int j = getPaddingTop();
    for (int k = 0; k < i - 1; k++)
      j += ((Integer)this.iXy.get(k)).intValue() + this.iXx;
    return j + ((Integer)this.iXy.get(i - 1)).intValue() + getPaddingBottom();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.FlowLayout
 * JD-Core Version:    0.6.2
 */