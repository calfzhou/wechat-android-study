package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class InitCallBackLayout extends FrameLayout
{
  private boolean hasDrawed;
  private pf juW;

  public InitCallBackLayout(Context paramContext)
  {
    super(paramContext);
  }

  public InitCallBackLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public InitCallBackLayout(Context paramContext, pf parampf)
  {
    super(paramContext);
    this.juW = parampf;
  }

  public final void a(pf parampf)
  {
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
 * Qualified Name:     com.tencent.mm.ui.chatting.InitCallBackLayout
 * JD-Core Version:    0.6.2
 */