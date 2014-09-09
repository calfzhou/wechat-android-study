package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.tencent.mm.aq.a;
import com.tencent.mm.n.p;
import com.tencent.mm.pluginsdk.ai;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.i;
import java.io.IOException;

public final class d extends ab
  implements p
{
  Bitmap epn = null;
  private float hxn = 0.5F;

  private d(String paramString)
  {
    super(c.azD(), paramString);
  }

  public d(String paramString, float paramFloat)
  {
    this(paramString);
    this.hxn = paramFloat;
  }

  private void a(Canvas paramCanvas, Bitmap paramBitmap)
  {
    Rect localRect1 = getBounds();
    Rect localRect2;
    if ((this.hyR > 1.0F) || (this.hyL))
    {
      int i = paramBitmap.getHeight() / 15 / 2;
      int j = paramBitmap.getWidth() / 15 / 2;
      localRect2 = new Rect(j, i, paramBitmap.getWidth() - j, paramBitmap.getHeight() - i);
    }
    while (true)
    {
      paramCanvas.drawBitmap(paramBitmap, localRect2, localRect1, evK);
      return;
      boolean bool = this.hyR < 0.0F;
      localRect2 = null;
      if (bool)
        localRect2 = null;
    }
  }

  public final void draw(Canvas paramCanvas)
  {
    ai localai = g.ayb();
    Bitmap localBitmap1 = null;
    if (localai != null)
      localBitmap1 = g.ayb().nO(this.tag);
    if (localBitmap1 != null)
      a(paramCanvas, localBitmap1);
    Bitmap localBitmap2;
    do
    {
      return;
      if (this.hyM);
      for (localBitmap2 = this.fAD.c(this.tag, paramCanvas.getWidth(), paramCanvas.getHeight()); localBitmap2 != null; localBitmap2 = this.fAD.ao(this.tag))
      {
        Bitmap localBitmap3 = i.a(localBitmap2, false, this.hxn * localBitmap2.getWidth());
        if (localai != null)
          localai.l(this.tag, localBitmap3);
        a(paramCanvas, localBitmap3);
        return;
      }
    }
    while ((localBitmap2 != null) && (!localBitmap2.isRecycled()));
    if (this.epn == null);
    try
    {
      this.epn = i.a(ak.getContext().getAssets().open("avatar/default_nor_avatar.png"), a.getDensity(null));
      this.epn = i.a(this.epn, false, this.epn.getWidth() >> 1);
      label194: a(paramCanvas, this.epn);
      return;
    }
    catch (IOException localIOException)
    {
      break label194;
    }
  }

  public final void eX(String paramString)
  {
    super.eX(paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.d
 * JD-Core Version:    0.6.2
 */