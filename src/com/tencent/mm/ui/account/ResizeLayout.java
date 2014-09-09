package com.tencent.mm.ui.account;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class ResizeLayout extends LinearLayout
{
  private jo iSw = null;

  public ResizeLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void a(jo paramjo)
  {
    this.iSw = paramjo;
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.iSw != null)
      this.iSw.bc(paramInt2, paramInt4);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.ResizeLayout
 * JD-Core Version:    0.6.2
 */