package com.tencent.mm.ui.tools.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.widget.ImageView;

final class z extends Drawable
{
  private static final Paint jXh = new Paint();
  private final float density;
  long eXW;
  boolean eXX;
  private final s jWE;
  private final boolean jXd;
  final BitmapDrawable jXi;
  Drawable jXj;

  private z(Context paramContext, Drawable paramDrawable, Bitmap paramBitmap, s params, boolean paramBoolean1, boolean paramBoolean2)
  {
    Resources localResources = paramContext.getResources();
    this.jXd = paramBoolean2;
    this.density = localResources.getDisplayMetrics().density;
    this.jWE = params;
    this.jXi = new BitmapDrawable(localResources, paramBitmap);
    if ((params != s.jWT) && (paramBoolean1));
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        this.jXj = paramDrawable;
        this.eXX = true;
        this.eXW = SystemClock.uptimeMillis();
      }
      return;
    }
  }

  private static Path a(Point paramPoint, int paramInt)
  {
    Point localPoint1 = new Point(paramInt + paramPoint.x, paramPoint.y);
    Point localPoint2 = new Point(paramPoint.x, paramInt + paramPoint.y);
    Path localPath = new Path();
    localPath.moveTo(paramPoint.x, paramPoint.y);
    localPath.lineTo(localPoint1.x, localPoint1.y);
    localPath.lineTo(localPoint2.x, localPoint2.y);
    return localPath;
  }

  static void a(ImageView paramImageView, int paramInt, Drawable paramDrawable)
  {
    if (paramInt != 0)
    {
      paramImageView.setImageResource(paramInt);
      return;
    }
    paramImageView.setImageDrawable(paramDrawable);
  }

  static void a(ImageView paramImageView, Context paramContext, Bitmap paramBitmap, s params, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramImageView.setImageDrawable(new z(paramContext, paramImageView.getDrawable(), paramBitmap, params, paramBoolean1, paramBoolean2));
  }

  public final void draw(Canvas paramCanvas)
  {
    int i = 1;
    if ((this.jXi == null) || (this.jXi.getBitmap() == null) || (this.jXi.getBitmap().isRecycled()))
    {
      Object[] arrayOfObject = new Object[i];
      if (this.jXi == null)
      {
        i = 0;
        arrayOfObject[0] = Integer.valueOf(i);
        com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpICXoDwOAk+5dzbdLae0o/O", "image == null || image.getBitmap() == null || image.getBitmap().isRecycled(), %s", arrayOfObject);
      }
    }
    while (true)
    {
      return;
      if (this.jXi.getBitmap() == null)
        break;
      if (this.jXi.getBitmap().isRecycled())
      {
        i = 2;
        break;
      }
      i = 3;
      break;
      if (!this.eXX)
        this.jXi.draw(paramCanvas);
      while (this.jXd)
      {
        jXh.setColor(-1);
        paramCanvas.drawPath(a(new Point(0, 0), (int)(16.0F * this.density)), jXh);
        jXh.setColor(this.jWE.jWW);
        paramCanvas.drawPath(a(new Point(0, 0), (int)(15.0F * this.density)), jXh);
        return;
        float f = (float)(SystemClock.uptimeMillis() - this.eXW) / 200.0F;
        if (f >= 1.0F)
        {
          this.eXX = false;
          this.jXj = null;
          this.jXi.draw(paramCanvas);
        }
        else
        {
          if (this.jXj != null)
            this.jXj.draw(paramCanvas);
          int j = (int)(f * 255.0F);
          this.jXi.setAlpha(j);
          this.jXi.draw(paramCanvas);
          this.jXi.setAlpha(255);
          invalidateSelf();
        }
      }
    }
  }

  public final int getIntrinsicHeight()
  {
    return this.jXi.getIntrinsicHeight();
  }

  public final int getIntrinsicWidth()
  {
    return this.jXi.getIntrinsicWidth();
  }

  public final int getOpacity()
  {
    return this.jXi.getOpacity();
  }

  protected final void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    this.jXi.setBounds(paramRect);
    Drawable localDrawable;
    Rect localRect;
    int i;
    int j;
    int k;
    int m;
    if (this.jXj != null)
    {
      localDrawable = this.jXj;
      localRect = getBounds();
      i = localRect.width();
      j = localRect.height();
      float f = i / j;
      k = localDrawable.getIntrinsicWidth();
      m = localDrawable.getIntrinsicHeight();
      if (k / m < f)
      {
        int i3 = (int)(j / m * k);
        int i4 = localRect.left - (i3 - i) / 2;
        int i5 = i3 + i4;
        localDrawable.setBounds(i4, localRect.top, i5, localRect.bottom);
      }
    }
    else
    {
      return;
    }
    int n = (int)(i / k * m);
    int i1 = localRect.top - (n - j) / 2;
    int i2 = n + i1;
    localDrawable.setBounds(localRect.left, i1, localRect.right, i2);
  }

  public final void setAlpha(int paramInt)
  {
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.z
 * JD-Core Version:    0.6.2
 */