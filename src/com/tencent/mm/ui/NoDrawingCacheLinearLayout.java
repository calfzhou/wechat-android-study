package com.tencent.mm.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class NoDrawingCacheLinearLayout extends LinearLayout
{
  public NoDrawingCacheLinearLayout(Context paramContext)
  {
    super(paramContext);
    setDrawingCacheEnabled(false);
  }

  public NoDrawingCacheLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  @SuppressLint({"NewApi"})
  public NoDrawingCacheLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public void buildDrawingCache()
  {
  }

  public void buildDrawingCache(boolean paramBoolean)
  {
  }

  public Bitmap getDrawingCache()
  {
    return null;
  }

  public Bitmap getDrawingCache(boolean paramBoolean)
  {
    return null;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.NoDrawingCacheLinearLayout
 * JD-Core Version:    0.6.2
 */