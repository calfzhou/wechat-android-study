package com.tencent.mm.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.mm.platformtools.b;

public class BorderNumView extends View
{
  private static int iHZ = 22;
  private static int iIa = 105;
  private static int iIb = 100;
  private Context context = null;
  private Paint eUY;
  private int iHY = 100;

  public BorderNumView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    init();
  }

  public BorderNumView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    init();
  }

  private void init()
  {
    this.eUY = new Paint();
  }

  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.iHY < 100)
      iHZ = 15 + iHZ;
    if (this.iHY >= 1000)
      iIb = -20 + iIb;
    float f1 = b.a(this.context, iHZ);
    float f2 = b.a(this.context, iIa);
    String str = this.iHY;
    this.eUY.setAntiAlias(true);
    this.eUY.setTextSize(iIb);
    this.eUY.setColor(-11491572);
    this.eUY.setStyle(Paint.Style.STROKE);
    this.eUY.setStrokeWidth(8.0F);
    paramCanvas.drawText(str, f1, f2, this.eUY);
    this.eUY.setTextSize(iIb);
    this.eUY.setColor(-1770573);
    this.eUY.setStyle(Paint.Style.FILL);
    this.eUY.setStrokeWidth(8.0F);
    paramCanvas.drawText(str, f1, f2, this.eUY);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.BorderNumView
 * JD-Core Version:    0.6.2
 */