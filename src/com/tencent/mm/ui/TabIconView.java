package com.tencent.mm.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.mm.sdk.platformtools.i;

public class TabIconView extends ImageView
{
  private Paint emx;
  private Rect iNA;
  private Rect iNB;
  private int iNC = 0;
  private Bitmap iNy;
  private Bitmap iNz;

  public TabIconView(Context paramContext)
  {
    super(paramContext);
  }

  public TabIconView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public TabIconView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void bb(int paramInt1, int paramInt2)
  {
    this.iNy = i.nK(paramInt1);
    this.iNz = i.nK(paramInt2);
    this.iNA = new Rect(0, 0, this.iNy.getWidth(), this.iNy.getHeight());
    this.iNB = new Rect(0, 0, this.iNz.getWidth(), this.iNz.getHeight());
    this.emx = new Paint(1);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.emx == null)
      return;
    this.emx.setAlpha(255 - this.iNC);
    paramCanvas.drawBitmap(this.iNz, null, this.iNB, this.emx);
    this.emx.setAlpha(this.iNC);
    paramCanvas.drawBitmap(this.iNy, null, this.iNA, this.emx);
  }

  public final void pb(int paramInt)
  {
    this.iNC = paramInt;
    invalidate();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.TabIconView
 * JD-Core Version:    0.6.2
 */