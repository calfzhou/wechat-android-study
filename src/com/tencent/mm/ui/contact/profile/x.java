package com.tencent.mm.ui.contact.profile;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import com.tencent.mm.platformtools.s;
import com.tencent.mm.platformtools.t;

final class x extends BitmapDrawable
  implements t
{
  private String url;

  public x(Resources paramResources, String paramString)
  {
  }

  public final void draw(Canvas paramCanvas)
  {
    Bitmap localBitmap = s.a(new y(this));
    if ((localBitmap == null) || (localBitmap.isRecycled()))
      localBitmap = null;
    Rect localRect = getBounds();
    if (localBitmap != null)
      paramCanvas.drawBitmap(localBitmap, null, localRect, null);
  }

  public final void i(String paramString, Bitmap paramBitmap)
  {
    if (this.url.equals(paramString))
      invalidateSelf();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.x
 * JD-Core Version:    0.6.2
 */