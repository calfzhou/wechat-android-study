package com.tencent.mm.ui.tools.gridviewheaders;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public final class h extends FrameLayout
{
  private int eDG;
  private int iy;
  private View[] jVG;
  private boolean jVL;

  public h(c paramc, Context paramContext)
  {
    super(paramContext);
  }

  @SuppressLint({"NewApi"})
  public final void a(View[] paramArrayOfView)
  {
    this.jVG = paramArrayOfView;
  }

  protected final FrameLayout.LayoutParams generateDefaultLayoutParams()
  {
    return new FrameLayout.LayoutParams(-1, -1);
  }

  public final Object getTag()
  {
    return getChildAt(0).getTag();
  }

  public final Object getTag(int paramInt)
  {
    return getChildAt(0).getTag(paramInt);
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((this.eDG == 1) || (c.b(this.jVH) == null));
    int i;
    int m;
    do
    {
      return;
      if ((this.iy % this.eDG == 0) && (!this.jVL))
      {
        this.jVL = true;
        View[] arrayOfView2 = this.jVG;
        int n = arrayOfView2.length;
        for (int i1 = 0; i1 < n; i1++)
          arrayOfView2[i1].measure(paramInt1, paramInt2);
        this.jVL = false;
      }
      i = getMeasuredHeight();
      View[] arrayOfView1 = this.jVG;
      int j = arrayOfView1.length;
      int k = 0;
      m = i;
      while (k < j)
      {
        View localView = arrayOfView1[k];
        if (localView != null)
          m = Math.max(m, localView.getMeasuredHeight());
        k++;
      }
    }
    while (m == i);
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(m, 1073741824));
  }

  public final void setNumColumns(int paramInt)
  {
    this.eDG = paramInt;
  }

  public final void setTag(int paramInt, Object paramObject)
  {
    getChildAt(0).setTag(paramInt, paramObject);
  }

  public final void setTag(Object paramObject)
  {
    getChildAt(0).setTag(paramObject);
  }

  public final void w(int paramInt)
  {
    this.iy = paramInt;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gridviewheaders.h
 * JD-Core Version:    0.6.2
 */