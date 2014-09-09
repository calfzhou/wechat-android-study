package com.tencent.mm.pluginsdk.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Looper;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

public class ab extends BitmapDrawable
  implements f
{
  protected static final Paint evK;
  protected static final cm evL = new cm(Looper.getMainLooper());
  private Paint emx = new Paint();
  private Runnable evO;
  protected final ad fAD;
  private PaintFlagsDrawFilter fln = new PaintFlagsDrawFilter(0, 3);
  private Path flo;
  protected boolean hyL = false;
  protected boolean hyM = false;
  private int hyN = 0;
  private int hyO = 0;
  protected boolean hyP;
  protected boolean hyQ;
  protected float hyR = 1.0F;
  private Rect rect = new Rect();
  protected String tag;

  static
  {
    Paint localPaint = new Paint();
    evK = localPaint;
    localPaint.setAntiAlias(true);
    evK.setFilterBitmap(true);
  }

  public ab(ad paramad, String paramString)
  {
    super(paramad.hK());
    this.emx.setStyle(Paint.Style.STROKE);
    this.emx.setFlags(1);
    this.emx.setAntiAlias(true);
    this.flo = new Path();
    this.evO = new ac(this);
    this.fAD = paramad;
    this.tag = paramString;
    this.fAD.a(this);
  }

  public ab(ad paramad, String paramString, byte paramByte)
  {
    super(paramad.hK());
    this.emx.setStyle(Paint.Style.STROKE);
    this.emx.setFlags(1);
    this.emx.setAntiAlias(true);
    this.flo = new Path();
    this.evO = new ac(this);
    this.hyL = false;
    this.fAD = paramad;
    this.tag = paramString;
    this.fAD.a(this);
  }

  public final void aAh()
  {
    this.hyP = true;
  }

  public final void aAi()
  {
    if (!this.hyP);
    do
    {
      return;
      this.hyP = false;
    }
    while (!this.hyQ);
    this.hyQ = false;
    invalidateSelf();
  }

  public final void dg(boolean paramBoolean)
  {
    this.hyM = paramBoolean;
  }

  public void draw(Canvas paramCanvas)
  {
    Bitmap localBitmap;
    label62: Rect localRect1;
    Rect localRect2;
    if (this.hyM)
    {
      localBitmap = this.fAD.c(this.tag, paramCanvas.getWidth(), paramCanvas.getHeight());
      if ((localBitmap != null) && (!localBitmap.isRecycled()))
        break label193;
      localBitmap = this.fAD.hK();
      if (!this.hyP)
        break label185;
      this.hyQ = true;
      localRect1 = getBounds();
      if ((this.hyR <= 1.0F) && (!this.hyL))
        break label201;
      int i = localBitmap.getHeight() / 15 / 2;
      int j = localBitmap.getWidth() / 15 / 2;
      localRect2 = new Rect(j, i, localBitmap.getWidth() - j, localBitmap.getHeight() - i);
    }
    while (true)
    {
      paramCanvas.drawBitmap(localBitmap, localRect2, localRect1, evK);
      return;
      if (this.hyP)
      {
        localBitmap = this.fAD.ap(this.tag);
        break;
      }
      localBitmap = this.fAD.ao(this.tag);
      break;
      label185: this.hyQ = false;
      break label62;
      label193: this.hyQ = false;
      break label62;
      label201: boolean bool = this.hyR < 0.0F;
      localRect2 = null;
      if (bool)
        localRect2 = null;
    }
  }

  public void eX(String paramString)
  {
    if ((paramString == null) || (!paramString.equals(this.tag)))
      return;
    z.v("!44@/B4Tb64lLpKZSD58W7O6eLJv0xzjKYwp5aOd5vnMqLY=", "notifyChanged :%s", new Object[] { paramString });
    evL.post(this.evO);
  }

  public void onScrollStateChanged(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.hyP = true;
      return;
    }
    aAi();
  }

  public final void vo(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0));
    while (paramString.equals(this.tag))
      return;
    this.tag = paramString;
    evL.post(this.evO);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.ab
 * JD-Core Version:    0.6.2
 */