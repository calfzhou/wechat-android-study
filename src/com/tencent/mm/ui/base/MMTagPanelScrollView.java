package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ScrollView;
import com.tencent.mm.g;
import com.tencent.mm.sdk.platformtools.z;

public class MMTagPanelScrollView extends ScrollView
{
  private Runnable eSg = new ej(this);
  private int eSi = 0;
  private ek jcN = new ek((byte)0);
  private int jcO = 2;

  public MMTagPanelScrollView(Context paramContext)
  {
    super(paramContext);
  }

  public MMTagPanelScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public MMTagPanelScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void aSR()
  {
    this.jcO = 3;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (getChildCount() <= 0);
    MMTagPanel localMMTagPanel;
    boolean bool;
    do
    {
      do
      {
        do
          return;
        while (!(getChildAt(0) instanceof MMTagPanel));
        localMMTagPanel = (MMTagPanel)getChildAt(0);
        bool = localMMTagPanel.aSF();
        if (localMMTagPanel.getLineCount() == this.jcO)
          this.eSi = (localMMTagPanel.getMeasuredHeight() + getResources().getDimensionPixelOffset(g.PP));
      }
      while (localMMTagPanel.getLineCount() < this.jcO);
      int i = View.MeasureSpec.getSize(paramInt1);
      int j = Math.max(localMMTagPanel.pj(this.jcO), this.eSi);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(j);
      z.d("!44@/B4Tb64lLpKQCorpigjVFfNjBMjVypaedPMLHoF4vok=", "height %d", arrayOfObject);
      setMeasuredDimension(i, j);
      removeCallbacks(this.eSg);
      post(this.eSg);
    }
    while (!bool);
    this.jcN.jcQ = localMMTagPanel;
    removeCallbacks(this.jcN);
    post(this.jcN);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMTagPanelScrollView
 * JD-Core Version:    0.6.2
 */