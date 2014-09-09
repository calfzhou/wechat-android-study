package com.tencent.mm.ui.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

public final class a extends ImageSpan
{
  private int kaL = 0;

  public a(Drawable paramDrawable, int paramInt)
  {
    super(paramDrawable, paramInt);
  }

  public final void draw(Canvas paramCanvas, CharSequence paramCharSequence, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, Paint paramPaint)
  {
    Drawable localDrawable = getDrawable();
    paramCanvas.save();
    int i = paramInt5 - localDrawable.getBounds().bottom + this.kaL;
    int j;
    if (this.mVerticalAlignment == 1)
      j = paramCharSequence.length();
    for (int k = 0; ; k++)
      if (k < j)
      {
        if (Character.isLetterOrDigit(paramCharSequence.charAt(k)))
          i -= paramPaint.getFontMetricsInt().descent;
      }
      else
      {
        paramCanvas.translate(paramFloat, i);
        localDrawable.draw(paramCanvas);
        paramCanvas.restore();
        return;
      }
  }

  public final void rB(int paramInt)
  {
    this.kaL = paramInt;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.a
 * JD-Core Version:    0.6.2
 */