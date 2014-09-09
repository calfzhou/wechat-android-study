package com.tencent.mm.ui.tools.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

final class r extends a
{
  g jWM;

  r(ImageView paramImageView, ab paramab, boolean paramBoolean1, boolean paramBoolean2, int paramInt, Drawable paramDrawable, String paramString, g paramg)
  {
    super(paramImageView, paramab, paramBoolean1, paramBoolean2, paramInt, paramDrawable, paramString);
    this.jWM = paramg;
  }

  public final void a(Bitmap paramBitmap, s params)
  {
    if (paramBitmap == null)
      throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[] { this }));
    ImageView localImageView = (ImageView)this.jWr.get();
    if (localImageView == null);
    do
    {
      return;
      Context localContext = u.bbu().context;
      boolean bool = u.bbu().jXd;
      z.a(localImageView, localContext, paramBitmap, params, this.jWs, bool);
    }
    while (this.jWM == null);
    this.jWM.baj();
  }

  final void cancel()
  {
    super.cancel();
    if (this.jWM != null)
      this.jWM = null;
  }

  public final void error()
  {
    ImageView localImageView = (ImageView)this.jWr.get();
    if (localImageView == null);
    while (true)
    {
      return;
      if (this.jWt != 0)
        localImageView.setImageResource(this.jWt);
      while (this.jWM != null)
      {
        return;
        if (this.jWu != null)
          localImageView.setImageDrawable(this.jWu);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.r
 * JD-Core Version:    0.6.2
 */