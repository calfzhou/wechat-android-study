package com.tencent.mm.pluginsdk.ui.tools;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

public final class at extends Drawable
{
  static final Paint hLW = new Paint(6);
  final Rect hLX = new Rect();
  WeakReference hLY = new WeakReference(null);

  public static void b(ImageView paramImageView, Bitmap paramBitmap)
  {
    if ((paramImageView.getDrawable() instanceof at));
    for (at localat = (at)paramImageView.getDrawable(); ; localat = new at())
    {
      localat.hLY = new WeakReference(paramBitmap);
      paramImageView.setImageDrawable(localat);
      paramImageView.postInvalidate();
      return;
    }
  }

  public final void draw(Canvas paramCanvas)
  {
    Bitmap localBitmap = (Bitmap)this.hLY.get();
    if ((localBitmap == null) || (localBitmap.isRecycled()))
      return;
    copyBounds(this.hLX);
    paramCanvas.drawBitmap(localBitmap, null, this.hLX, hLW);
  }

  public final int getOpacity()
  {
    return 0;
  }

  public final void setAlpha(int paramInt)
  {
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.at
 * JD-Core Version:    0.6.2
 */