package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.tencent.mm.sdk.platformtools.z;

public class ChattingContent extends FrameLayout
{
  private int hEc = -1;
  private int hEd = 0;

  public ChattingContent(Context paramContext)
  {
    super(paramContext);
  }

  public ChattingContent(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public ChattingContent(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = Integer.valueOf(paramInt1);
    arrayOfObject[2] = Integer.valueOf(paramInt2);
    arrayOfObject[3] = Integer.valueOf(paramInt3);
    arrayOfObject[4] = Integer.valueOf(paramInt4);
    z.d("!44@/B4Tb64lLpKwUcOR+EdWclUDt145TIM55aff9hDRb2I=", "jacks onLayout change: %B, l:%d, t:%d, r:%d, b:%d", arrayOfObject);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(View.MeasureSpec.getSize(paramInt1));
    arrayOfObject[1] = Integer.valueOf(View.MeasureSpec.getSize(paramInt2));
    z.d("!44@/B4Tb64lLpKwUcOR+EdWclUDt145TIM55aff9hDRb2I=", "jacks onMeasure  width:%d, height:%d", arrayOfObject);
    super.onMeasure(paramInt1, paramInt2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChattingContent
 * JD-Core Version:    0.6.2
 */