package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.tencent.mm.sdk.platformtools.z;

public class ChatFooterBottom extends FrameLayout
{
  private boolean cOP = false;

  public ChatFooterBottom(Context paramContext)
  {
    super(paramContext);
  }

  public ChatFooterBottom(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public ChatFooterBottom(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void aCD()
  {
    this.cOP = true;
  }

  public final boolean aCE()
  {
    return this.cOP;
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = Integer.valueOf(paramInt1);
    arrayOfObject[2] = Integer.valueOf(paramInt2);
    arrayOfObject[3] = Integer.valueOf(paramInt3);
    arrayOfObject[4] = Integer.valueOf(paramInt4);
    z.d("!44@/B4Tb64lLpJ/7uFBkt7iPHURADeQLT/9626gRaXeO4g=", "jacks onLayout change: %B, l:%d, t:%d, r:%d, b:%d", arrayOfObject);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(View.MeasureSpec.getSize(paramInt1));
    arrayOfObject[1] = Integer.valueOf(View.MeasureSpec.getSize(paramInt2));
    arrayOfObject[2] = Boolean.valueOf(this.cOP);
    z.d("!44@/B4Tb64lLpJ/7uFBkt7iPHURADeQLT/9626gRaXeO4g=", "jacks onMeasure  width:%d, height:%d, isHide: %B", arrayOfObject);
    if (this.cOP)
    {
      setVisibility(8);
      paramInt1 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
      paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
    }
    super.onMeasure(paramInt1, paramInt2);
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void setVisibility(int paramInt)
  {
    boolean bool = true;
    if (paramInt == 0)
      this.cOP = false;
    Object[] arrayOfObject = new Object[bool];
    if (paramInt == 0);
    while (true)
    {
      arrayOfObject[0] = Boolean.valueOf(bool);
      z.d("!44@/B4Tb64lLpJ/7uFBkt7iPHURADeQLT/9626gRaXeO4g=", "set Visibility: isvisibility: %B", arrayOfObject);
      super.setVisibility(paramInt);
      return;
      bool = false;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.ChatFooterBottom
 * JD-Core Version:    0.6.2
 */