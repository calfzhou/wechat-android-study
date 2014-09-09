package com.tencent.mm.ui.tools;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import com.tencent.mm.sdk.platformtools.cm;
import junit.framework.Assert;

public class MaskImageButton extends ImageButton
{
  private int a = 90;
  private int b = 0;
  private int g = 0;
  private cm gAT;
  private Runnable gAU;
  private int r = 0;

  public MaskImageButton(Context paramContext)
  {
    super(paramContext);
    init();
  }

  public MaskImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  private void init()
  {
    this.gAT = new cm();
    this.gAU = new ev(this);
    super.setOnTouchListener(new ew(this));
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (isPressed())
      paramCanvas.drawARGB(this.a, this.r, this.g, this.b);
  }

  @Deprecated
  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    Assert.assertTrue(false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MaskImageButton
 * JD-Core Version:    0.6.2
 */