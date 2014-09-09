package com.tencent.mm.y;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import junit.framework.Assert;

public final class ax extends BitmapDrawable
{
  private ax(Resources paramResources, Bitmap paramBitmap)
  {
    super(paramResources, paramBitmap);
  }

  public static void a(Bitmap paramBitmap, ImageView paramImageView)
  {
    if ((paramImageView == null) || (paramImageView.getResources() == null))
      return;
    paramImageView.setImageDrawable(new ax(paramImageView.getResources(), paramBitmap));
  }

  public final void draw(Canvas paramCanvas)
  {
    if ((getBitmap() != null) && (!getBitmap().isRecycled()))
      super.draw(paramCanvas);
    while (getBitmap() == null)
      return;
    Assert.assertTrue("Cannot draw recycled bitmaps" + getBitmap().toString(), false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.ax
 * JD-Core Version:    0.6.2
 */