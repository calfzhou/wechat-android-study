package com.tencent.mm.ui.tools.gridviewheaders;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public final class f extends FrameLayout
{
  private int jVI;
  private int jVJ;

  public f(c paramc, Context paramContext)
  {
    super(paramContext);
  }

  public final int bbl()
  {
    return this.jVI;
  }

  protected final FrameLayout.LayoutParams generateDefaultLayoutParams()
  {
    return new FrameLayout.LayoutParams(-1, -1);
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    View localView = (View)getTag();
    if (localView.getLayoutParams() == null)
      localView.setLayoutParams(generateDefaultLayoutParams());
    if ((localView.getVisibility() != 8) && (localView.getMeasuredHeight() == 0))
      localView.measure(View.MeasureSpec.makeMeasureSpec(this.jVJ, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), localView.getMeasuredHeight());
  }

  public final void rq(int paramInt)
  {
    this.jVI = paramInt;
  }

  public final void rr(int paramInt)
  {
    this.jVJ = paramInt;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gridviewheaders.f
 * JD-Core Version:    0.6.2
 */