package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class MMFrameLayout extends FrameLayout
{
  private boolean iZd = false;

  public MMFrameLayout(Context paramContext)
  {
    super(paramContext);
  }

  public MMFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getChildCount();
    for (int j = 0; (!this.iZd) && (j < i); j++)
    {
      View localView = getChildAt(j);
      if (localView != null)
      {
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
        if (localLayoutParams.gravity == -1)
        {
          localLayoutParams.gravity = 51;
          localView.setLayoutParams(localLayoutParams);
        }
      }
    }
    this.iZd = true;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMFrameLayout
 * JD-Core Version:    0.6.2
 */