package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

public class ForceInvalidateImageView extends ImageView
{
  public ForceInvalidateImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public ForceInvalidateImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  @TargetApi(8)
  protected void onVisibilityChanged(View paramView, int paramInt)
  {
    if (paramInt == 0)
      invalidate();
    super.onVisibilityChanged(paramView, paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ForceInvalidateImageView
 * JD-Core Version:    0.6.2
 */