package com.tencent.mm.ui.base.preference;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.mm.aq.a;

public final class k
{
  private Bitmap bitmap = null;
  private int jgD = -1;

  public final void c(ImageView paramImageView)
  {
    if (paramImageView == null);
    do
    {
      return;
      if (this.jgD != -1)
        paramImageView.setImageDrawable(a.n(paramImageView.getContext(), this.jgD));
    }
    while (this.bitmap == null);
    paramImageView.setImageBitmap(this.bitmap);
  }

  public final void setImageResource(int paramInt)
  {
    this.jgD = paramInt;
    this.bitmap = null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.k
 * JD-Core Version:    0.6.2
 */