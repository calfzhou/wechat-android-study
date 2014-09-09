package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class OnLayoutChangedLinearLayout extends LinearLayout
{
  private fn jfp;

  public OnLayoutChangedLinearLayout(Context paramContext)
  {
    super(paramContext);
  }

  public OnLayoutChangedLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void a(fn paramfn)
  {
    this.jfp = paramfn;
  }

  public final void aTs()
  {
    this.jfp = null;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.jfp != null)
      this.jfp.aPy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.OnLayoutChangedLinearLayout
 * JD-Core Version:    0.6.2
 */