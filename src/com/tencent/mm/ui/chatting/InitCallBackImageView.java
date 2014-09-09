package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;

public class InitCallBackImageView extends ImageView
{
  private boolean hasDrawed;
  private pf juW;

  public InitCallBackImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public InitCallBackImageView(Context paramContext, pf parampf)
  {
    super(paramContext);
    this.juW = parampf;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (!this.hasDrawed)
    {
      this.hasDrawed = true;
      if (this.juW != null)
        this.juW.hQ();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.InitCallBackImageView
 * JD-Core Version:    0.6.2
 */