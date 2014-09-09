package com.tencent.mm.sdk.platformtools;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.View;
import com.tencent.mm.a.c;
import com.tencent.mm.compatible.d.a;
import com.tencent.mm.pointers.PInt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;

public final class i
{
  private static DisplayMetrics dLA = null;
  public static boolean idU;

  public static boolean M(int paramInt1, int paramInt2)
  {
    return paramInt2 > 2.0D * paramInt1;
  }

  public static boolean N(int paramInt1, int paramInt2)
  {
    return paramInt1 > 2.0D * paramInt2;
  }

  public static Bitmap a(int paramInt1, int paramInt2, Bitmap.Config paramConfig, boolean paramBoolean)
  {
    try
    {
      Bitmap localBitmap3 = Bitmap.createBitmap(paramInt1, paramInt2, paramConfig);
      localBitmap1 = localBitmap3;
      return localBitmap1;
    }
    catch (IncompatibleClassChangeError localIncompatibleClassChangeError2)
    {
      z.printErrStackTrace("MicroMsg.Crash", localIncompatibleClassChangeError2, "May cause dvmFindCatchBlock crash!", new Object[0]);
      throw ((IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(localIncompatibleClassChangeError2));
    }
    catch (Throwable localThrowable1)
    {
      do
        Bitmap localBitmap1 = null;
      while (paramBoolean);
      try
      {
        if (dLA == null)
          dLA = ak.getContext().getResources().getDisplayMetrics();
        DisplayMetrics localDisplayMetrics = dLA;
        if ((paramInt1 > localDisplayMetrics.widthPixels) && (paramInt2 > localDisplayMetrics.heightPixels))
        {
          paramInt1 = localDisplayMetrics.widthPixels;
          paramInt2 = localDisplayMetrics.heightPixels;
        }
        Bitmap localBitmap2 = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.RGB_565);
        return localBitmap2;
      }
      catch (IncompatibleClassChangeError localIncompatibleClassChangeError1)
      {
        z.printErrStackTrace("MicroMsg.Crash", localIncompatibleClassChangeError1, "May cause dvmFindCatchBlock crash!", new Object[0]);
        throw ((IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(localIncompatibleClassChangeError1));
      }
      catch (Throwable localThrowable2)
      {
      }
    }
    return null;
  }

  private static Bitmap a(int paramInt1, String paramString, byte[] paramArrayOfByte, Uri paramUri, float paramFloat, int paramInt2, int paramInt3)
  {
    int i = 0;
    if ((paramInt2 == 0) && (paramInt3 == 0));
    for (int j = 1; (paramInt2 < 0) || (paramInt3 < 0); j = 0)
      return null;
    try
    {
      BitmapFactory.Options localOptions1 = new BitmapFactory.Options();
      if (paramFloat != 0.0F)
        localOptions1.inDensity = ((int)(160.0F * paramFloat));
      i = 0;
      if (j == 0)
      {
        localOptions1.inJustDecodeBounds = true;
        a(localOptions1, paramArrayOfByte, paramString, paramUri, false, paramInt1);
        int m = localOptions1.outWidth;
        int n = localOptions1.outHeight;
        localOptions1 = new BitmapFactory.Options();
        localOptions1.inPreferredConfig = Bitmap.Config.ARGB_8888;
        if (m <= paramInt2)
        {
          i = 0;
          if (n <= paramInt3);
        }
        else
        {
          localOptions1.inSampleSize = ((int)Math.max(m / paramInt2, n / paramInt3));
          i = localOptions1.inSampleSize;
        }
      }
      a(localOptions1);
      Bitmap localBitmap2 = a(localOptions1, paramArrayOfByte, paramString, paramUri, false, paramInt1);
      return localBitmap2;
    }
    catch (IncompatibleClassChangeError localIncompatibleClassChangeError2)
    {
      z.printErrStackTrace("MicroMsg.Crash", localIncompatibleClassChangeError2, "May cause dvmFindCatchBlock crash!", new Object[0]);
      throw ((IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(localIncompatibleClassChangeError2));
    }
    catch (Throwable localThrowable1)
    {
      int k = i;
      BitmapFactory.Options localOptions2 = new BitmapFactory.Options();
      if (paramFloat != 0.0F)
        localOptions2.inDensity = ((int)(160.0F * paramFloat));
      localOptions2.inPreferredConfig = Bitmap.Config.RGB_565;
      if ((j == 0) && (k != 0))
        localOptions2.inSampleSize = k;
      a(localOptions2);
      try
      {
        Bitmap localBitmap1 = a(localOptions2, paramArrayOfByte, paramString, paramUri, false, paramInt1);
        return localBitmap1;
      }
      catch (IncompatibleClassChangeError localIncompatibleClassChangeError1)
      {
        z.printErrStackTrace("MicroMsg.Crash", localIncompatibleClassChangeError1, "May cause dvmFindCatchBlock crash!", new Object[0]);
        throw ((IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(localIncompatibleClassChangeError1));
      }
      catch (Throwable localThrowable2)
      {
      }
    }
    return null;
  }

  public static Bitmap a(Bitmap paramBitmap, float paramFloat)
  {
    boolean bool = true;
    if (paramFloat % 360.0F == 0.0F)
      return paramBitmap;
    Matrix localMatrix = new Matrix();
    localMatrix.reset();
    localMatrix.setRotate(paramFloat, paramBitmap.getWidth() / 2, paramBitmap.getHeight() / 2);
    Bitmap localBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), localMatrix, bool);
    StringBuilder localStringBuilder = new StringBuilder("resultBmp is null: ");
    if (localBitmap == null);
    while (true)
    {
      z.d("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", bool + "  degree:" + paramFloat);
      if (paramBitmap != localBitmap)
      {
        z.i("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "rotate bitmap recycle ajsdfasdf adsf." + paramBitmap.toString());
        paramBitmap.recycle();
      }
      return localBitmap;
      bool = false;
    }
  }

  public static Bitmap a(Bitmap paramBitmap, int paramInt)
  {
    z.d("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "begin createChattingImage");
    long l1 = System.currentTimeMillis();
    if (paramBitmap == null)
    {
      z.w("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "sourceBitmap is null .");
      return null;
    }
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    if ((i <= 0) || (j <= 0))
    {
      z.w("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "sourceBitmap width or height is 0.");
      return null;
    }
    long l2 = System.currentTimeMillis();
    Bitmap localBitmap;
    try
    {
      localBitmap = a(i, j, Bitmap.Config.ARGB_8888, false);
      NinePatchDrawable localNinePatchDrawable = (NinePatchDrawable)ak.getContext().getResources().getDrawable(paramInt);
      localNinePatchDrawable.setBounds(0, 0, i, j);
      localNinePatchDrawable.draw(new Canvas(localBitmap));
      z.d("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "create nine patch bitmap " + (System.currentTimeMillis() - l2));
      if (localBitmap == null)
      {
        z.e("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "[createChattingImage] maskBitmap is null.");
        return null;
      }
    }
    catch (Exception localException1)
    {
      z.e("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "[createChattingImage] create nine pathc bitmap faild.");
      return null;
    }
    int k = localBitmap.getWidth();
    int m = localBitmap.getHeight();
    if ((k <= 0) || (m <= 0))
    {
      z.w("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "maskBitmap width or height is 0.");
      return null;
    }
    if ((m != j) || (k != i))
    {
      z.e("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "maskHeiht maskWidth != height width.");
      return null;
    }
    int[] arrayOfInt1 = new int[i * j];
    int[] arrayOfInt2 = new int[k * m];
    paramBitmap.getPixels(arrayOfInt1, 0, i, 0, 0, i, j);
    localBitmap.getPixels(arrayOfInt2, 0, i, 0, 0, i, j);
    long l3 = System.currentTimeMillis();
    for (int n = 0; ; n++)
      try
      {
        if (n < arrayOfInt2.length)
        {
          if (arrayOfInt2[n] == -16777216)
            continue;
          if (arrayOfInt2[n] == 0)
            arrayOfInt1[n] = 0;
          else if (arrayOfInt2[n] != -1)
            arrayOfInt1[n] &= arrayOfInt2[n];
        }
      }
      catch (Exception localException2)
      {
        z.e("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", localException2.toString());
        z.d("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "meger pixels  " + (System.currentTimeMillis() - l3));
        long l4 = System.currentTimeMillis();
        localBitmap.setPixels(arrayOfInt1, 0, i, 0, 0, i, j);
        z.d("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "setPixels " + (System.currentTimeMillis() - l4));
        z.d("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "createTime" + (System.currentTimeMillis() - l1));
        return localBitmap;
      }
  }

  public static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    double d1 = 1.0D * paramBitmap.getHeight() / paramInt1;
    double d2 = 1.0D * paramBitmap.getWidth() / paramInt2;
    if (d1 < d2);
    for (double d3 = d2; (int)d3 <= 1; d3 = d1)
    {
      z.d("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "no need to scale");
      return paramBitmap;
    }
    int j;
    int i;
    if (d1 < d2)
    {
      j = (int)(1.0D * paramInt2 * paramBitmap.getHeight() / paramBitmap.getWidth());
      i = paramInt2;
      label85: if (j <= 0)
        break label211;
      label90: if (i <= 0)
        break label217;
    }
    while (true)
    {
      z.d("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "bitmap decoded size=" + paramBitmap.getWidth() + "x" + paramBitmap.getHeight());
      Bitmap localBitmap = Bitmap.createScaledBitmap(paramBitmap, i, j, true);
      if ((localBitmap == null) || (paramBitmap == localBitmap))
        break;
      z.i("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "extractThumeNail bitmap recycle" + paramBitmap.toString());
      paramBitmap.recycle();
      return localBitmap;
      i = (int)(1.0D * paramInt1 * paramBitmap.getWidth() / paramBitmap.getHeight());
      j = paramInt1;
      break label85;
      label211: j = 1;
      break label90;
      label217: i = 1;
    }
  }

  public static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    Bitmap localBitmap1;
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
    {
      z.e("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "extractThumbNail height:" + paramInt1 + " width:" + paramInt2);
      localBitmap1 = null;
      return localBitmap1;
    }
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    a(localOptions);
    localOptions.outHeight = paramBitmap.getHeight();
    localOptions.outWidth = paramBitmap.getWidth();
    z.i("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "extractThumbNail: round=" + paramInt2 + "x" + paramInt1 + ", crop=" + paramBoolean1 + ", recycle=" + paramBoolean2);
    double d1 = 1.0D * localOptions.outHeight / paramInt1;
    double d2 = 1.0D * localOptions.outWidth / paramInt2;
    z.d("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "extractThumbNail: extract beX = " + d2 + ", beY = " + d1);
    double d3;
    if (paramBoolean1)
      if (d1 > d2)
        d3 = d2;
    while (true)
    {
      localOptions.inSampleSize = ((int)d3);
      if (localOptions.inSampleSize <= 1);
      for (localOptions.inSampleSize = 1; localOptions.outHeight * localOptions.outWidth / localOptions.inSampleSize / localOptions.inSampleSize > 2764800; localOptions.inSampleSize = (1 + localOptions.inSampleSize));
      d3 = d1;
      continue;
      if (d1 < d2)
        d3 = d2;
      else
        d3 = d1;
    }
    int j;
    int i;
    if (paramBoolean1)
      if (d1 > d2)
      {
        j = (int)Math.ceil(1.0D * paramInt2 * localOptions.outHeight / localOptions.outWidth);
        i = paramInt2;
        localOptions.inJustDecodeBounds = false;
        z.i("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "bitmap required size=" + i + "x" + j + ", orig=" + localOptions.outWidth + "x" + localOptions.outHeight + ", sample=" + localOptions.inSampleSize);
        localBitmap1 = Bitmap.createScaledBitmap(paramBitmap, i, j, true);
        if (localBitmap1 == null)
          break label707;
        if ((paramBoolean2) && (paramBitmap != localBitmap1))
        {
          z.i("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "extractThumbNail bitmap recycle asdfjasjdfja asdfasd." + paramBitmap.toString());
          paramBitmap.recycle();
        }
      }
    while (true)
    {
      Bitmap localBitmap2;
      if (paramBoolean1)
      {
        localBitmap2 = Bitmap.createBitmap(localBitmap1, localBitmap1.getWidth() - paramInt2 >> 1, localBitmap1.getHeight() - paramInt1 >> 1, paramInt2, paramInt1);
        if (localBitmap2 == null)
          break;
        if ((paramBoolean2) && (localBitmap1 != localBitmap2))
        {
          z.i("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "extractThumbNail bitmap recycle ajdfjajsdfjdsajjfsad." + localBitmap1.toString());
          localBitmap1.recycle();
        }
        z.d("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "bitmap croped size=" + localBitmap2.getWidth() + "x" + localBitmap2.getHeight());
      }
      while (true)
      {
        return localBitmap2;
        i = (int)Math.ceil(1.0D * paramInt1 * localOptions.outWidth / localOptions.outHeight);
        j = paramInt1;
        break;
        if (d1 < d2)
        {
          j = (int)Math.ceil(1.0D * paramInt2 * localOptions.outHeight / localOptions.outWidth);
          i = paramInt2;
          break;
        }
        i = (int)Math.ceil(1.0D * paramInt1 * localOptions.outWidth / localOptions.outHeight);
        j = paramInt1;
        break;
        localBitmap2 = localBitmap1;
      }
      label707: localBitmap1 = paramBitmap;
    }
  }

  public static Bitmap a(Bitmap paramBitmap, boolean paramBoolean, float paramFloat)
  {
    return a(paramBitmap, paramBoolean, paramFloat, false);
  }

  public static Bitmap a(Bitmap paramBitmap, boolean paramBoolean1, float paramFloat, boolean paramBoolean2)
  {
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
      z.e("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "getRoundedCornerBitmap in bitmap is null");
    Bitmap localBitmap;
    do
    {
      return null;
      localBitmap = a(paramBitmap.getWidth(), paramBitmap.getHeight(), Bitmap.Config.ARGB_8888, paramBoolean2);
    }
    while (localBitmap == null);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint();
    Rect localRect = new Rect(0, 0, paramBitmap.getWidth(), paramBitmap.getHeight());
    RectF localRectF = new RectF(localRect);
    localPaint.setAntiAlias(true);
    localPaint.setDither(true);
    localPaint.setFilterBitmap(true);
    localCanvas.drawARGB(0, 0, 0, 0);
    localPaint.setColor(-4144960);
    localCanvas.drawRoundRect(localRectF, paramFloat, paramFloat, localPaint);
    localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    localCanvas.drawBitmap(paramBitmap, localRect, localRect, localPaint);
    if (paramBoolean1)
    {
      z.i("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "getRoundedCornerBitmap bitmap recycle." + paramBitmap.toString());
      paramBitmap.recycle();
    }
    return localBitmap;
  }

  private static Bitmap a(BitmapFactory.Options paramOptions, byte[] paramArrayOfByte, String paramString, Uri paramUri, boolean paramBoolean, int paramInt)
  {
    if ((ch.B(paramArrayOfByte)) && (ch.jb(paramString)) && (paramUri == null) && (paramInt <= 0))
      return null;
    if (!ch.B(paramArrayOfByte));
    for (int i = 1; i != 0; i = 0)
      return BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length, paramOptions);
    if (paramUri != null)
    {
      InputStream localInputStream = ak.getContext().getContentResolver().openInputStream(paramUri);
      Bitmap localBitmap = BitmapFactory.decodeStream(localInputStream, null, paramOptions);
      localInputStream.close();
      return localBitmap;
    }
    if (paramInt > 0)
      return a.decodeResource(ak.getContext().getResources(), paramInt, paramOptions);
    return BitmapFactory.decodeFile(paramString, paramOptions);
  }

  public static Bitmap a(InputStream paramInputStream, float paramFloat)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    if (paramFloat != 0.0F)
      localOptions.inDensity = ((int)(160.0F * paramFloat));
    localOptions.inPreferredConfig = Bitmap.Config.ARGB_8888;
    a(localOptions);
    try
    {
      Bitmap localBitmap2 = BitmapFactory.decodeStream(paramInputStream, null, localOptions);
      return localBitmap2;
    }
    catch (OutOfMemoryError localOutOfMemoryError1)
    {
      localOptions.inPreferredConfig = Bitmap.Config.RGB_565;
      a(localOptions);
      try
      {
        Bitmap localBitmap1 = BitmapFactory.decodeStream(paramInputStream, null, localOptions);
        return localBitmap1;
      }
      catch (OutOfMemoryError localOutOfMemoryError2)
      {
      }
    }
    return null;
  }

  private static Bitmap a(String paramString, int paramInt1, int paramInt2, float paramFloat)
  {
    return a(0, paramString, null, null, paramFloat, paramInt1, paramInt2);
  }

  @TargetApi(11)
  public static Bitmap a(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (ch.jb(paramString))
    {
      z.e("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "extractThumbNail path null or nil");
      localObject1 = null;
      return localObject1;
    }
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
    {
      z.e("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "extractThumbNail height:" + paramInt1 + " width:" + paramInt2);
      return null;
    }
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    double d1;
    double d2;
    while (true)
    {
      try
      {
        localOptions.inJustDecodeBounds = true;
        Bitmap localBitmap1 = BitmapFactory.decodeFile(paramString, localOptions);
        if (localBitmap1 != null)
        {
          z.i("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "extractThumeNail bitmap recycle, adsf." + localBitmap1.toString());
          localBitmap1.recycle();
        }
        if ((localOptions.outHeight <= 0) || (localOptions.outWidth <= 0))
        {
          Object[] arrayOfObject1 = new Object[3];
          arrayOfObject1[0] = paramString;
          arrayOfObject1[1] = Integer.valueOf(localOptions.outHeight);
          arrayOfObject1[2] = Integer.valueOf(localOptions.outWidth);
          z.e("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "decode[%s] error, outHeight[%d] outWidth[%d]", arrayOfObject1);
          return null;
        }
        z.i("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "extractThumbNail: round=" + paramInt2 + "x" + paramInt1 + ", crop=" + paramBoolean);
        d1 = 1.0D * localOptions.outHeight / paramInt1;
        d2 = 1.0D * localOptions.outWidth / paramInt2;
        z.d("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "extractThumbNail: extract beX = " + d2 + ", beY = " + d1);
        if (!paramBoolean)
          break label407;
        if (d1 > d2)
        {
          d3 = d2;
          localOptions.inSampleSize = ((int)d3);
          if (localOptions.inSampleSize <= 1)
            localOptions.inSampleSize = 1;
          if (localOptions.outHeight * localOptions.outWidth / localOptions.inSampleSize / localOptions.inSampleSize <= 2764800)
            break;
          localOptions.inSampleSize = (1 + localOptions.inSampleSize);
          continue;
        }
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        z.e("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "decode bitmap failed: " + localOutOfMemoryError.getMessage());
        return null;
      }
      double d3 = d1;
      continue;
      label407: if (d1 < d2)
        d3 = d2;
      else
        d3 = d1;
    }
    int i;
    int j;
    label475: int m;
    int k;
    Bitmap localBitmap2;
    if (paramBoolean)
    {
      if (d1 > d2)
      {
        double d4 = 1.0D * paramInt2;
        i = (int)Math.ceil(d4 * localOptions.outHeight / localOptions.outWidth);
        j = paramInt2;
        break label1014;
        localOptions.inJustDecodeBounds = false;
        if (Build.VERSION.SDK_INT >= 11)
          localOptions.inMutable = true;
        z.i("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "bitmap required size=" + m + "x" + k + ", orig=" + localOptions.outWidth + "x" + localOptions.outHeight + ", sample=" + localOptions.inSampleSize);
        localBitmap2 = BitmapFactory.decodeFile(paramString, localOptions);
        a(localOptions);
        if (localBitmap2 == null)
        {
          z.e("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "bitmap decode failed");
          return null;
        }
      }
      else
      {
        j = (int)Math.ceil(1.0D * paramInt1 * localOptions.outWidth / localOptions.outHeight);
        i = paramInt1;
        break label1014;
      }
    }
    else
    {
      if (d1 < d2)
      {
        i = (int)Math.ceil(1.0D * paramInt2 * localOptions.outHeight / localOptions.outWidth);
        j = paramInt2;
        break label1014;
      }
      j = (int)Math.ceil(1.0D * paramInt1 * localOptions.outWidth / localOptions.outHeight);
      i = paramInt1;
      break label1014;
    }
    z.d("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "bitmap decoded size=" + localBitmap2.getWidth() + "x" + localBitmap2.getHeight());
    Object localObject1 = Bitmap.createScaledBitmap(localBitmap2, m, k, true);
    label791: int n;
    int i1;
    if ((localBitmap2 != localObject1) && (localObject1 != null))
    {
      z.i("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "extractThumbNail bitmap recycle adsfad." + localBitmap2.toString());
      localBitmap2.recycle();
      if (paramBoolean)
      {
        n = ((Bitmap)localObject1).getWidth() - paramInt2 >> 1;
        i1 = ((Bitmap)localObject1).getHeight() - paramInt1 >> 1;
        if ((n < 0) || (i1 < 0))
        {
          Object[] arrayOfObject2 = new Object[4];
          arrayOfObject2[0] = Integer.valueOf(((Bitmap)localObject1).getWidth());
          arrayOfObject2[1] = Integer.valueOf(((Bitmap)localObject1).getHeight());
          arrayOfObject2[2] = Integer.valueOf(paramInt2);
          arrayOfObject2[3] = Integer.valueOf(paramInt1);
          z.e("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "fix crop image error %d %d %d %d", arrayOfObject2);
          if (n >= 0)
            break label1047;
          n = 0;
          break label1047;
        }
      }
    }
    while (true)
    {
      Object localObject2 = Bitmap.createBitmap((Bitmap)localObject1, n, i1, paramInt2, paramInt1);
      if (localObject2 == null)
        break;
      if (localObject2 != localObject1)
      {
        z.i("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "extractThumbNail bitmap recycle adsfaasdfad." + localObject1.toString());
        ((Bitmap)localObject1).recycle();
        z.d("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "bitmap croped size=" + ((Bitmap)localObject2).getWidth() + "x" + ((Bitmap)localObject2).getHeight());
      }
      while (true)
      {
        return localObject2;
        localObject2 = localObject1;
        break;
        localObject2 = localObject1;
      }
      localObject1 = localBitmap2;
      break label791;
      label1014: if (i > 0);
      for (k = i; ; k = 1)
      {
        if (j <= 0)
          break label1041;
        m = j;
        break;
      }
      label1041: m = 1;
      break label475;
      label1047: if (i1 < 0)
        i1 = 0;
    }
  }

  public static Bitmap a(int[] paramArrayOfInt, int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    Bitmap localBitmap = a(paramInt1, paramInt2, paramConfig, false);
    if (localBitmap != null)
    {
      if ((paramInt1 == localBitmap.getWidth()) && (paramInt2 == localBitmap.getHeight()))
        localBitmap.setPixels(paramArrayOfInt, 0, paramInt1, 0, 0, paramInt1, paramInt2);
    }
    else
      return localBitmap;
    return null;
  }

  public static void a(Bitmap paramBitmap, int paramInt, Bitmap.CompressFormat paramCompressFormat, String paramString, boolean paramBoolean)
  {
    if (ch.jb(paramString))
      throw new IOException("saveBitmapToImage pathName null or nil");
    z.d("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "saving to " + paramString);
    File localFile = new File(paramString);
    try
    {
      if (!localFile.exists())
      {
        localFile.getParentFile().mkdirs();
        localFile.createNewFile();
      }
      FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
      paramBitmap.compress(paramCompressFormat, paramInt, localFileOutputStream);
      localFileOutputStream.flush();
      localFileOutputStream.close();
      if (paramBoolean)
      {
        z.i("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "saveBitmapToImage bitmap recycle." + paramBitmap.toString());
        paramBitmap.recycle();
      }
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = localFileNotFoundException.toString();
      z.w("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "FileNotFoundException %s", arrayOfObject3);
      return;
    }
    catch (IOException localIOException)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = localIOException.toString();
      z.w("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "IOException %s", arrayOfObject2);
      return;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localException.toString();
      z.w("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "Exception %s", arrayOfObject1);
    }
  }

  public static void a(BitmapFactory.Options paramOptions)
  {
    if ((Build.VERSION.SDK_INT < 14) && (!idU));
    try
    {
      BitmapFactory.Options.class.getField("inNativeAlloc").setBoolean(paramOptions, true);
      return;
    }
    catch (Exception localException)
    {
      idU = true;
    }
  }

  public static void a(String paramString, PInt paramPInt1, PInt paramPInt2)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    a(localOptions);
    Bitmap localBitmap = BitmapFactory.decodeFile(paramString, localOptions);
    if (localBitmap != null)
    {
      z.i("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "getRent bitmap recycle." + localBitmap.toString());
      localBitmap.recycle();
    }
    paramPInt1.value = localOptions.outWidth;
    paramPInt2.value = localOptions.outHeight;
  }

  public static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2)
  {
    return a(paramString1, paramInt1, paramInt2, paramCompressFormat, paramInt3, paramString2, false);
  }

  public static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2, int paramInt4, int paramInt5, PInt paramPInt1, PInt paramPInt2)
  {
    Bitmap localBitmap2;
    Bitmap localBitmap1;
    if (paramInt4 == 1)
    {
      localBitmap2 = a(paramString1, 50, 2000, true);
      localBitmap1 = Bitmap.createBitmap(localBitmap2, (-100 + localBitmap2.getWidth()) / 2, 0, 100, 50);
    }
    while (true)
    {
      if (localBitmap2 != localBitmap1)
      {
        z.i("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "createLongPictureThumbNail bitmap recycle." + localBitmap2.toString());
        localBitmap2.recycle();
      }
      if (localBitmap1 != null)
        break;
      return false;
      localBitmap1 = null;
      localBitmap2 = null;
      if (paramInt4 == 2)
      {
        localBitmap2 = a(paramString1, 2000, 50, true);
        localBitmap1 = Bitmap.createBitmap(localBitmap2, 0, (-100 + localBitmap2.getHeight()) / 2, 50, 100);
      }
    }
    if (paramInt5 != 0)
      localBitmap1 = a(localBitmap1, paramInt5);
    try
    {
      paramPInt1.value = localBitmap1.getWidth();
      paramPInt2.value = localBitmap1.getHeight();
      a(localBitmap1, 90, paramCompressFormat, paramString2, true);
      return true;
    }
    catch (IOException localIOException)
    {
      z.e("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "create thumbnail from orig failed: " + paramString2);
    }
    return false;
  }

  public static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2, boolean paramBoolean)
  {
    return a(paramString1, paramInt1, paramInt2, paramCompressFormat, paramInt3, paramString2, paramBoolean, new PInt(), new PInt());
  }

  public static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2, boolean paramBoolean, PInt paramPInt1, PInt paramPInt2)
  {
    return a(paramString1, paramInt1, paramInt2, paramCompressFormat, paramInt3, paramString2, paramBoolean, paramPInt1, paramPInt2, false);
  }

  public static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2, boolean paramBoolean1, PInt paramPInt1, PInt paramPInt2, boolean paramBoolean2)
  {
    Bitmap localBitmap = a(paramString1, paramInt1, paramInt2, paramBoolean2);
    if (localBitmap == null)
      return false;
    if (paramBoolean1)
      localBitmap = a(localBitmap, f.iM(paramString1));
    try
    {
      paramPInt1.value = localBitmap.getWidth();
      paramPInt2.value = localBitmap.getHeight();
      a(localBitmap, paramInt3, paramCompressFormat, paramString2, true);
      return true;
    }
    catch (IOException localIOException)
    {
      z.e("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "create thumbnail from orig failed: " + paramString2);
    }
    return false;
  }

  public static boolean a(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, String paramString2, PInt paramPInt1, PInt paramPInt2)
  {
    if (ch.jb(paramString1))
    {
      z.w("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "file path is null.");
      return false;
    }
    if (!new File(paramString1).exists())
    {
      z.w("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "file did not exists.");
      return false;
    }
    int i = f.iM(paramString1);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(i);
    z.d("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "degress:%d", arrayOfObject);
    Bitmap localBitmap;
    if ((i == 90) || (i == 270))
      localBitmap = a(a(paramString1, paramInt2, paramInt1, true), i);
    while (localBitmap != null)
      try
      {
        paramPInt1.value = localBitmap.getWidth();
        paramPInt2.value = localBitmap.getHeight();
        a(localBitmap, 80, paramCompressFormat, paramString2, true);
        return true;
        localBitmap = a(a(paramString1, paramInt1, paramInt2, true), i);
      }
      catch (IOException localIOException)
      {
        z.e("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "create thumbnail from orig failed: " + paramString2);
      }
    return false;
  }

  public static boolean a(String paramString1, int paramInt1, Bitmap.CompressFormat paramCompressFormat, int paramInt2, String paramString2)
  {
    Bitmap localBitmap1 = a(paramString1, 0, 0, 0.0F);
    if (localBitmap1 == null)
    {
      z.e("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "rotate: create bitmap fialed");
      return false;
    }
    float f1 = localBitmap1.getWidth();
    float f2 = localBitmap1.getHeight();
    Matrix localMatrix = new Matrix();
    localMatrix.setRotate(paramInt1, f1 / 2.0F, f2 / 2.0F);
    Bitmap localBitmap2 = Bitmap.createBitmap(localBitmap1, 0, 0, (int)f1, (int)f2, localMatrix, true);
    if (localBitmap1 != localBitmap2)
    {
      z.i("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "rotate bitmap recycle adjfjads fadsj fsadjf dsa." + localBitmap1.toString());
      localBitmap1.recycle();
    }
    try
    {
      a(localBitmap2, paramInt2, paramCompressFormat, paramString2, true);
      return true;
    }
    catch (IOException localIOException)
    {
      z.e("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "create thumbnail from orig failed: " + paramString2);
    }
    return false;
  }

  public static boolean a(String paramString1, int paramInt, Bitmap.CompressFormat paramCompressFormat, String paramString2, String paramString3)
  {
    return a(paramString1, paramInt, paramCompressFormat, 90, paramString2 + paramString3);
  }

  public static boolean a(String paramString1, Bitmap.CompressFormat paramCompressFormat, String paramString2, int paramInt)
  {
    return a(paramString1, 2000, 2000, paramCompressFormat, 90, paramString2, paramInt, 0, new PInt(), new PInt());
  }

  public static Bitmap aGD()
  {
    Bitmap localBitmap = a(320, 480, Bitmap.Config.ARGB_8888, false);
    new Canvas(localBitmap).drawColor(-16777216);
    return localBitmap;
  }

  // ERROR //
  public static void ai(View paramView)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aload_0
    //   6: aconst_null
    //   7: invokevirtual 596	android/view/View:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   10: aload_0
    //   11: aconst_null
    //   12: invokevirtual 600	android/view/View:setOnCreateContextMenuListener	(Landroid/view/View$OnCreateContextMenuListener;)V
    //   15: aload_0
    //   16: aconst_null
    //   17: invokevirtual 604	android/view/View:setOnFocusChangeListener	(Landroid/view/View$OnFocusChangeListener;)V
    //   20: aload_0
    //   21: aconst_null
    //   22: invokevirtual 608	android/view/View:setOnKeyListener	(Landroid/view/View$OnKeyListener;)V
    //   25: aload_0
    //   26: aconst_null
    //   27: invokevirtual 612	android/view/View:setOnLongClickListener	(Landroid/view/View$OnLongClickListener;)V
    //   30: aload_0
    //   31: aconst_null
    //   32: invokevirtual 596	android/view/View:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   35: aload_0
    //   36: aconst_null
    //   37: invokevirtual 616	android/view/View:setOnTouchListener	(Landroid/view/View$OnTouchListener;)V
    //   40: aload_0
    //   41: invokevirtual 620	android/view/View:getBackground	()Landroid/graphics/drawable/Drawable;
    //   44: ifnull +16 -> 60
    //   47: aload_0
    //   48: invokevirtual 620	android/view/View:getBackground	()Landroid/graphics/drawable/Drawable;
    //   51: aconst_null
    //   52: invokevirtual 626	android/graphics/drawable/Drawable:setCallback	(Landroid/graphics/drawable/Drawable$Callback;)V
    //   55: aload_0
    //   56: aconst_null
    //   57: invokevirtual 630	android/view/View:setBackgroundDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   60: aload_0
    //   61: instanceof 632
    //   64: ifeq +39 -> 103
    //   67: aload_0
    //   68: checkcast 632	android/widget/ImageView
    //   71: astore 29
    //   73: aload 29
    //   75: invokevirtual 634	android/widget/ImageView:getDrawable	()Landroid/graphics/drawable/Drawable;
    //   78: astore 30
    //   80: aload 30
    //   82: ifnull +9 -> 91
    //   85: aload 30
    //   87: aconst_null
    //   88: invokevirtual 626	android/graphics/drawable/Drawable:setCallback	(Landroid/graphics/drawable/Drawable$Callback;)V
    //   91: aload 29
    //   93: aconst_null
    //   94: invokevirtual 637	android/widget/ImageView:setImageDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   97: aload 29
    //   99: aconst_null
    //   100: invokevirtual 640	android/widget/ImageView:setImageBitmap	(Landroid/graphics/Bitmap;)V
    //   103: aload_0
    //   104: instanceof 642
    //   107: ifeq +39 -> 146
    //   110: aload_0
    //   111: checkcast 642	android/widget/ImageButton
    //   114: astore 27
    //   116: aload 27
    //   118: invokevirtual 643	android/widget/ImageButton:getDrawable	()Landroid/graphics/drawable/Drawable;
    //   121: astore 28
    //   123: aload 28
    //   125: ifnull +9 -> 134
    //   128: aload 28
    //   130: aconst_null
    //   131: invokevirtual 626	android/graphics/drawable/Drawable:setCallback	(Landroid/graphics/drawable/Drawable$Callback;)V
    //   134: aload 27
    //   136: aconst_null
    //   137: invokevirtual 644	android/widget/ImageButton:setImageDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   140: aload 27
    //   142: aconst_null
    //   143: invokevirtual 645	android/widget/ImageButton:setImageBitmap	(Landroid/graphics/Bitmap;)V
    //   146: aload_0
    //   147: instanceof 647
    //   150: ifeq +321 -> 471
    //   153: aload_0
    //   154: checkcast 647	android/widget/ListView
    //   157: astore 12
    //   159: aload_0
    //   160: instanceof 649
    //   163: ifeq +278 -> 441
    //   166: aload_0
    //   167: checkcast 649	android/view/ViewGroup
    //   170: invokevirtual 652	android/view/ViewGroup:getChildCount	()I
    //   173: istore 23
    //   175: iconst_0
    //   176: istore 24
    //   178: iload 24
    //   180: iload 23
    //   182: if_icmpge +252 -> 434
    //   185: aload_0
    //   186: checkcast 649	android/view/ViewGroup
    //   189: iload 24
    //   191: invokevirtual 656	android/view/ViewGroup:getChildAt	(I)Landroid/view/View;
    //   194: invokestatic 658	com/tencent/mm/sdk/platformtools/i:ai	(Landroid/view/View;)V
    //   197: iinc 24 1
    //   200: goto -22 -> 178
    //   203: astore 37
    //   205: ldc 31
    //   207: aload 37
    //   209: ldc 33
    //   211: iconst_0
    //   212: anewarray 4	java/lang/Object
    //   215: invokestatic 39	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   218: new 21	java/lang/IncompatibleClassChangeError
    //   221: dup
    //   222: ldc 33
    //   224: invokespecial 43	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   227: aload 37
    //   229: invokevirtual 47	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   232: checkcast 21	java/lang/IncompatibleClassChangeError
    //   235: athrow
    //   236: astore 36
    //   238: ldc 31
    //   240: aload 36
    //   242: ldc 33
    //   244: iconst_0
    //   245: anewarray 4	java/lang/Object
    //   248: invokestatic 39	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   251: new 21	java/lang/IncompatibleClassChangeError
    //   254: dup
    //   255: ldc 33
    //   257: invokespecial 43	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   260: aload 36
    //   262: invokevirtual 47	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   265: checkcast 21	java/lang/IncompatibleClassChangeError
    //   268: athrow
    //   269: astore 35
    //   271: ldc 31
    //   273: aload 35
    //   275: ldc 33
    //   277: iconst_0
    //   278: anewarray 4	java/lang/Object
    //   281: invokestatic 39	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   284: new 21	java/lang/IncompatibleClassChangeError
    //   287: dup
    //   288: ldc 33
    //   290: invokespecial 43	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   293: aload 35
    //   295: invokevirtual 47	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   298: checkcast 21	java/lang/IncompatibleClassChangeError
    //   301: athrow
    //   302: astore 34
    //   304: ldc 31
    //   306: aload 34
    //   308: ldc 33
    //   310: iconst_0
    //   311: anewarray 4	java/lang/Object
    //   314: invokestatic 39	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   317: new 21	java/lang/IncompatibleClassChangeError
    //   320: dup
    //   321: ldc 33
    //   323: invokespecial 43	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   326: aload 34
    //   328: invokevirtual 47	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   331: checkcast 21	java/lang/IncompatibleClassChangeError
    //   334: athrow
    //   335: astore 33
    //   337: ldc 31
    //   339: aload 33
    //   341: ldc 33
    //   343: iconst_0
    //   344: anewarray 4	java/lang/Object
    //   347: invokestatic 39	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   350: new 21	java/lang/IncompatibleClassChangeError
    //   353: dup
    //   354: ldc 33
    //   356: invokespecial 43	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   359: aload 33
    //   361: invokevirtual 47	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   364: checkcast 21	java/lang/IncompatibleClassChangeError
    //   367: athrow
    //   368: astore 32
    //   370: ldc 31
    //   372: aload 32
    //   374: ldc 33
    //   376: iconst_0
    //   377: anewarray 4	java/lang/Object
    //   380: invokestatic 39	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   383: new 21	java/lang/IncompatibleClassChangeError
    //   386: dup
    //   387: ldc 33
    //   389: invokespecial 43	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   392: aload 32
    //   394: invokevirtual 47	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   397: checkcast 21	java/lang/IncompatibleClassChangeError
    //   400: athrow
    //   401: astore 31
    //   403: ldc 31
    //   405: aload 31
    //   407: ldc 33
    //   409: iconst_0
    //   410: anewarray 4	java/lang/Object
    //   413: invokestatic 39	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   416: new 21	java/lang/IncompatibleClassChangeError
    //   419: dup
    //   420: ldc 33
    //   422: invokespecial 43	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   425: aload 31
    //   427: invokevirtual 47	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   430: checkcast 21	java/lang/IncompatibleClassChangeError
    //   433: athrow
    //   434: aload_0
    //   435: checkcast 649	android/view/ViewGroup
    //   438: invokevirtual 661	android/view/ViewGroup:removeAllViews	()V
    //   441: aload 12
    //   443: aconst_null
    //   444: invokevirtual 665	android/widget/ListView:setAdapter	(Landroid/widget/ListAdapter;)V
    //   447: aload 12
    //   449: aconst_null
    //   450: invokevirtual 669	android/widget/ListView:setOnScrollListener	(Landroid/widget/AbsListView$OnScrollListener;)V
    //   453: aload 12
    //   455: aconst_null
    //   456: invokevirtual 673	android/widget/ListView:setOnItemClickListener	(Landroid/widget/AdapterView$OnItemClickListener;)V
    //   459: aload 12
    //   461: aconst_null
    //   462: invokevirtual 677	android/widget/ListView:setOnItemLongClickListener	(Landroid/widget/AdapterView$OnItemLongClickListener;)V
    //   465: aload 12
    //   467: aconst_null
    //   468: invokevirtual 681	android/widget/ListView:setOnItemSelectedListener	(Landroid/widget/AdapterView$OnItemSelectedListener;)V
    //   471: aload_0
    //   472: invokevirtual 684	android/view/View:destroyDrawingCache	()V
    //   475: aload_0
    //   476: instanceof 649
    //   479: ifeq -475 -> 4
    //   482: aload_0
    //   483: checkcast 649	android/view/ViewGroup
    //   486: invokevirtual 652	android/view/ViewGroup:getChildCount	()I
    //   489: istore 8
    //   491: iconst_0
    //   492: istore 9
    //   494: iload 9
    //   496: iload 8
    //   498: if_icmpge +219 -> 717
    //   501: aload_0
    //   502: checkcast 649	android/view/ViewGroup
    //   505: iload 9
    //   507: invokevirtual 656	android/view/ViewGroup:getChildAt	(I)Landroid/view/View;
    //   510: invokestatic 658	com/tencent/mm/sdk/platformtools/i:ai	(Landroid/view/View;)V
    //   513: iinc 9 1
    //   516: goto -22 -> 494
    //   519: astore 26
    //   521: ldc 31
    //   523: aload 26
    //   525: ldc 33
    //   527: iconst_0
    //   528: anewarray 4	java/lang/Object
    //   531: invokestatic 39	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   534: new 21	java/lang/IncompatibleClassChangeError
    //   537: dup
    //   538: ldc 33
    //   540: invokespecial 43	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   543: aload 26
    //   545: invokevirtual 47	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   548: checkcast 21	java/lang/IncompatibleClassChangeError
    //   551: athrow
    //   552: astore 22
    //   554: ldc 31
    //   556: aload 22
    //   558: ldc 33
    //   560: iconst_0
    //   561: anewarray 4	java/lang/Object
    //   564: invokestatic 39	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   567: new 21	java/lang/IncompatibleClassChangeError
    //   570: dup
    //   571: ldc 33
    //   573: invokespecial 43	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   576: aload 22
    //   578: invokevirtual 47	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   581: checkcast 21	java/lang/IncompatibleClassChangeError
    //   584: athrow
    //   585: astore 21
    //   587: ldc 31
    //   589: aload 21
    //   591: ldc 33
    //   593: iconst_0
    //   594: anewarray 4	java/lang/Object
    //   597: invokestatic 39	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   600: new 21	java/lang/IncompatibleClassChangeError
    //   603: dup
    //   604: ldc 33
    //   606: invokespecial 43	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   609: aload 21
    //   611: invokevirtual 47	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   614: checkcast 21	java/lang/IncompatibleClassChangeError
    //   617: athrow
    //   618: astore 20
    //   620: ldc 31
    //   622: aload 20
    //   624: ldc 33
    //   626: iconst_0
    //   627: anewarray 4	java/lang/Object
    //   630: invokestatic 39	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   633: new 21	java/lang/IncompatibleClassChangeError
    //   636: dup
    //   637: ldc 33
    //   639: invokespecial 43	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   642: aload 20
    //   644: invokevirtual 47	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   647: checkcast 21	java/lang/IncompatibleClassChangeError
    //   650: athrow
    //   651: astore 19
    //   653: ldc 31
    //   655: aload 19
    //   657: ldc 33
    //   659: iconst_0
    //   660: anewarray 4	java/lang/Object
    //   663: invokestatic 39	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   666: new 21	java/lang/IncompatibleClassChangeError
    //   669: dup
    //   670: ldc 33
    //   672: invokespecial 43	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   675: aload 19
    //   677: invokevirtual 47	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   680: checkcast 21	java/lang/IncompatibleClassChangeError
    //   683: athrow
    //   684: astore 18
    //   686: ldc 31
    //   688: aload 18
    //   690: ldc 33
    //   692: iconst_0
    //   693: anewarray 4	java/lang/Object
    //   696: invokestatic 39	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   699: new 21	java/lang/IncompatibleClassChangeError
    //   702: dup
    //   703: ldc 33
    //   705: invokespecial 43	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   708: aload 18
    //   710: invokevirtual 47	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   713: checkcast 21	java/lang/IncompatibleClassChangeError
    //   716: athrow
    //   717: aload_0
    //   718: checkcast 649	android/view/ViewGroup
    //   721: invokevirtual 661	android/view/ViewGroup:removeAllViews	()V
    //   724: return
    //   725: astore 11
    //   727: ldc 31
    //   729: aload 11
    //   731: ldc 33
    //   733: iconst_0
    //   734: anewarray 4	java/lang/Object
    //   737: invokestatic 39	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   740: new 21	java/lang/IncompatibleClassChangeError
    //   743: dup
    //   744: ldc 33
    //   746: invokespecial 43	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   749: aload 11
    //   751: invokevirtual 47	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   754: checkcast 21	java/lang/IncompatibleClassChangeError
    //   757: athrow
    //   758: astore_1
    //   759: goto -749 -> 10
    //   762: astore_2
    //   763: goto -748 -> 15
    //   766: astore_3
    //   767: goto -747 -> 20
    //   770: astore 4
    //   772: goto -747 -> 25
    //   775: astore 5
    //   777: goto -747 -> 30
    //   780: astore 6
    //   782: goto -747 -> 35
    //   785: astore 7
    //   787: goto -747 -> 40
    //   790: astore 13
    //   792: goto -345 -> 447
    //   795: astore 14
    //   797: goto -344 -> 453
    //   800: astore 15
    //   802: goto -343 -> 459
    //   805: astore 16
    //   807: goto -342 -> 465
    //   810: astore 17
    //   812: goto -341 -> 471
    //   815: astore 10
    //   817: return
    //   818: astore 25
    //   820: goto -379 -> 441
    //
    // Exception table:
    //   from	to	target	type
    //   5	10	203	java/lang/IncompatibleClassChangeError
    //   10	15	236	java/lang/IncompatibleClassChangeError
    //   15	20	269	java/lang/IncompatibleClassChangeError
    //   20	25	302	java/lang/IncompatibleClassChangeError
    //   25	30	335	java/lang/IncompatibleClassChangeError
    //   30	35	368	java/lang/IncompatibleClassChangeError
    //   35	40	401	java/lang/IncompatibleClassChangeError
    //   434	441	519	java/lang/IncompatibleClassChangeError
    //   441	447	552	java/lang/IncompatibleClassChangeError
    //   447	453	585	java/lang/IncompatibleClassChangeError
    //   453	459	618	java/lang/IncompatibleClassChangeError
    //   459	465	651	java/lang/IncompatibleClassChangeError
    //   465	471	684	java/lang/IncompatibleClassChangeError
    //   717	724	725	java/lang/IncompatibleClassChangeError
    //   5	10	758	java/lang/Throwable
    //   10	15	762	java/lang/Throwable
    //   15	20	766	java/lang/Throwable
    //   20	25	770	java/lang/Throwable
    //   25	30	775	java/lang/Throwable
    //   30	35	780	java/lang/Throwable
    //   35	40	785	java/lang/Throwable
    //   441	447	790	java/lang/Throwable
    //   447	453	795	java/lang/Throwable
    //   453	459	800	java/lang/Throwable
    //   459	465	805	java/lang/Throwable
    //   465	471	810	java/lang/Throwable
    //   717	724	815	java/lang/Throwable
    //   434	441	818	java/lang/Throwable
  }

  public static Bitmap aj(View paramView)
  {
    if (paramView == null)
      return null;
    Bitmap localBitmap = Bitmap.createBitmap(paramView.getWidth(), paramView.getHeight(), Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Drawable localDrawable = paramView.getBackground();
    if (localDrawable != null)
      localDrawable.draw(localCanvas);
    paramView.draw(localCanvas);
    return localBitmap;
  }

  public static Bitmap b(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    if (paramBitmap == null)
      return null;
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    float f1 = Math.max(paramInt1 / i, paramInt2 / j);
    float f2 = f1 * i;
    float f3 = f1 * j;
    float f4 = (paramInt1 - f2) / 2.0F;
    float f5 = (paramInt2 - f3) / 2.0F;
    RectF localRectF = new RectF(f4, f5, f2 + f4, f3 + f5);
    Bitmap.Config localConfig = paramBitmap.getConfig();
    if (localConfig == null)
    {
      z.w("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "get center crop bitmap, config is null");
      localConfig = Bitmap.Config.ARGB_8888;
    }
    try
    {
      Bitmap localBitmap2 = Bitmap.createBitmap(paramInt1, paramInt2, localConfig);
      localObject = localBitmap2;
      new Canvas((Bitmap)localObject).drawBitmap(paramBitmap, null, localRectF, null);
      z.i("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "getCenterCropBitmap bitmap recycle." + paramBitmap.toString());
      paramBitmap.recycle();
      return localObject;
    }
    catch (IncompatibleClassChangeError localIncompatibleClassChangeError2)
    {
      z.printErrStackTrace("MicroMsg.Crash", localIncompatibleClassChangeError2, "May cause dvmFindCatchBlock crash!", new Object[0]);
      throw ((IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(localIncompatibleClassChangeError2));
    }
    catch (Throwable localThrowable1)
    {
      try
      {
        Bitmap localBitmap1 = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.RGB_565);
        Object localObject = localBitmap1;
      }
      catch (IncompatibleClassChangeError localIncompatibleClassChangeError1)
      {
        z.printErrStackTrace("MicroMsg.Crash", localIncompatibleClassChangeError1, "May cause dvmFindCatchBlock crash!", new Object[0]);
        throw ((IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(localIncompatibleClassChangeError1));
      }
      catch (Throwable localThrowable2)
      {
        z.e("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "BitmapUtil decode getCenterCropBitmap fail");
      }
    }
    return paramBitmap;
  }

  public static boolean b(String paramString1, int paramInt1, int paramInt2, Bitmap.CompressFormat paramCompressFormat, int paramInt3, String paramString2, String paramString3)
  {
    return a(paramString1, paramInt1, paramInt2, paramCompressFormat, paramInt3, paramString2 + paramString3, false);
  }

  public static Bitmap cB(byte[] paramArrayOfByte)
  {
    return decodeByteArray(paramArrayOfByte, 0, 0);
  }

  public static Bitmap createBitmap(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    return a(paramInt1, paramInt2, paramConfig, false);
  }

  public static Bitmap d(Drawable paramDrawable)
  {
    if ((paramDrawable instanceof BitmapDrawable))
      return ((BitmapDrawable)paramDrawable).getBitmap();
    Bitmap localBitmap = a(paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888, false);
    Canvas localCanvas = new Canvas(localBitmap);
    paramDrawable.setBounds(0, 0, localCanvas.getWidth(), localCanvas.getHeight());
    paramDrawable.draw(localCanvas);
    return localBitmap;
  }

  public static Bitmap d(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramString == null) || (paramString.equals("")) || (paramInt1 < 0) || (paramInt2 < 0) || (paramInt3 < 0))
      z.w("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "createLocation fail. srcResId or maskResId is null,or width/height <0");
    Bitmap localBitmap1;
    do
    {
      return null;
      localBitmap1 = decodeByteArray(c.b(paramString, 0, -1), 0, 0);
    }
    while ((localBitmap1 == null) || (localBitmap1.isRecycled()));
    long l = System.currentTimeMillis();
    Bitmap localBitmap2 = a(paramInt2, paramInt3, Bitmap.Config.ARGB_8888, false);
    Canvas localCanvas = new Canvas(localBitmap2);
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(localBitmap1.getWidth());
    arrayOfObject[1] = Integer.valueOf(localBitmap1.getHeight());
    arrayOfObject[2] = Integer.valueOf(paramInt2);
    arrayOfObject[3] = Integer.valueOf(paramInt3);
    z.d("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "bm size w %d h %d target w %d h %d", arrayOfObject);
    localCanvas.drawBitmap(localBitmap1, null, new Rect(0, 0, paramInt2, paramInt3), new Paint());
    z.d("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "create nine patch bitmap " + (System.currentTimeMillis() - l));
    return a(localBitmap2, paramInt1);
  }

  public static Bitmap decodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (ch.B(paramArrayOfByte))
    {
      z.w("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "error input: data is null");
      return null;
    }
    if ((paramInt1 < 0) || (paramInt2 < 0))
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramInt1);
      arrayOfObject[1] = Integer.valueOf(paramInt2);
      z.w("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "error input: targetWidth %d, targetHeight %d", arrayOfObject);
      return null;
    }
    return a(0, null, paramArrayOfByte, null, 0.0F, paramInt1, paramInt2);
  }

  public static Bitmap decodeStream(InputStream paramInputStream)
  {
    return a(paramInputStream, 0.0F);
  }

  public static Bitmap e(Uri paramUri)
  {
    return a(0, null, null, paramUri, 0.0F, 0, 0);
  }

  public static Bitmap f(String paramString, float paramFloat)
  {
    return a(paramString, 0, 0, paramFloat);
  }

  public static Bitmap j(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt1 < 0) || (paramInt2 < 0) || (paramInt3 < 0) || (paramInt4 < 0))
    {
      z.w("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "createLocation fail. srcResId or maskResId is null,or width/height <0");
      return null;
    }
    long l = System.currentTimeMillis();
    Bitmap localBitmap = a(paramInt3, paramInt4, Bitmap.Config.ARGB_8888, false);
    NinePatchDrawable localNinePatchDrawable = (NinePatchDrawable)ak.getContext().getResources().getDrawable(paramInt1);
    localNinePatchDrawable.setBounds(0, 0, paramInt3, paramInt4);
    localNinePatchDrawable.draw(new Canvas(localBitmap));
    z.d("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "create nine patch bitmap " + (System.currentTimeMillis() - l));
    return a(localBitmap, paramInt2);
  }

  public static byte[] m(Bitmap paramBitmap)
  {
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
      return new byte[0];
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.JPEG, 100, localByteArrayOutputStream);
    byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
    try
    {
      localByteArrayOutputStream.close();
      return arrayOfByte;
    }
    catch (Exception localException)
    {
    }
    return arrayOfByte;
  }

  public static byte[] n(Bitmap paramBitmap)
  {
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
      return new byte[0];
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
    byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
    try
    {
      localByteArrayOutputStream.close();
      return arrayOfByte;
    }
    catch (Exception localException)
    {
    }
    return arrayOfByte;
  }

  public static Bitmap nK(int paramInt)
  {
    return a(paramInt, null, null, null, 0.0F, 0, 0);
  }

  public static Bitmap o(String paramString, int paramInt1, int paramInt2)
  {
    return a(paramString, paramInt1, paramInt2, 0.0F);
  }

  public static Bitmap q(Bitmap paramBitmap)
  {
    if (paramBitmap == null)
    {
      z.w("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "fastblur: but sentBitmap is null");
      return null;
    }
    Bitmap localBitmap = paramBitmap.copy(paramBitmap.getConfig(), true);
    int i = localBitmap.getWidth();
    int j = localBitmap.getHeight();
    int[] arrayOfInt1 = new int[i * j];
    z.e("pix", i + " " + j + " " + arrayOfInt1.length);
    localBitmap.getPixels(arrayOfInt1, 0, i, 0, 0, i, j);
    int k = i - 1;
    int m = j - 1;
    int n = i * j;
    int[] arrayOfInt2 = new int[n];
    int[] arrayOfInt3 = new int[n];
    int[] arrayOfInt4 = new int[n];
    int[] arrayOfInt5 = new int[Math.max(i, j)];
    int[] arrayOfInt6 = new int[20736];
    for (int i1 = 0; i1 < 20736; i1++)
      arrayOfInt6[i1] = (i1 / 81);
    int[] arrayOfInt7 = { 17, 3 };
    int[][] arrayOfInt = (int[][])Array.newInstance(Integer.TYPE, arrayOfInt7);
    int i2 = 0;
    int i3 = 0;
    int i55;
    for (int i4 = 0; i4 < j; i4 = i55)
    {
      int i42 = 0;
      int i43 = 0;
      int i44 = 0;
      int i45 = 0;
      int i46 = 0;
      int i47 = -8;
      int i48 = 0;
      int i49 = 0;
      int i50 = 0;
      int i51 = 0;
      if (i47 <= 8)
      {
        int i66 = arrayOfInt1[(i3 + Math.min(k, Math.max(i47, 0)))];
        int[] arrayOfInt13 = arrayOfInt[(i47 + 8)];
        arrayOfInt13[0] = ((0xFF0000 & i66) >> 16);
        arrayOfInt13[1] = ((0xFF00 & i66) >> 8);
        arrayOfInt13[2] = (i66 & 0xFF);
        int i67 = 9 - Math.abs(i47);
        i50 += i67 * arrayOfInt13[0];
        i49 += i67 * arrayOfInt13[1];
        i48 += i67 * arrayOfInt13[2];
        if (i47 > 0)
        {
          i43 += arrayOfInt13[0];
          i51 += arrayOfInt13[1];
          i42 += arrayOfInt13[2];
        }
        while (true)
        {
          i47++;
          break;
          i46 += arrayOfInt13[0];
          i45 += arrayOfInt13[1];
          i44 += arrayOfInt13[2];
        }
      }
      int i52 = 8;
      for (int i53 = 0; i53 < i; i53++)
      {
        arrayOfInt2[i3] = arrayOfInt6[i50];
        arrayOfInt3[i3] = arrayOfInt6[i49];
        arrayOfInt4[i3] = arrayOfInt6[i48];
        int i56 = i50 - i46;
        int i57 = i49 - i45;
        int i58 = i48 - i44;
        int[] arrayOfInt11 = arrayOfInt[((17 + (i52 - 8)) % 17)];
        int i59 = i46 - arrayOfInt11[0];
        int i60 = i45 - arrayOfInt11[1];
        int i61 = i44 - arrayOfInt11[2];
        if (i4 == 0)
          arrayOfInt5[i53] = Math.min(1 + (i53 + 8), k);
        int i62 = arrayOfInt1[(i2 + arrayOfInt5[i53])];
        arrayOfInt11[0] = ((0xFF0000 & i62) >> 16);
        arrayOfInt11[1] = ((0xFF00 & i62) >> 8);
        arrayOfInt11[2] = (i62 & 0xFF);
        int i63 = i43 + arrayOfInt11[0];
        int i64 = i51 + arrayOfInt11[1];
        int i65 = i42 + arrayOfInt11[2];
        i50 = i56 + i63;
        i49 = i57 + i64;
        i48 = i58 + i65;
        i52 = (i52 + 1) % 17;
        int[] arrayOfInt12 = arrayOfInt[(i52 % 17)];
        i46 = i59 + arrayOfInt12[0];
        i45 = i60 + arrayOfInt12[1];
        i44 = i61 + arrayOfInt12[2];
        i43 = i63 - arrayOfInt12[0];
        i51 = i64 - arrayOfInt12[1];
        i42 = i65 - arrayOfInt12[2];
        i3++;
      }
      int i54 = i2 + i;
      i55 = i4 + 1;
      i2 = i54;
    }
    for (int i5 = 0; i5 < i; i5++)
    {
      int i6 = 0;
      int i7 = i * -8;
      int i8 = 0;
      int i9 = 0;
      int i10 = 0;
      int i11 = 0;
      int i12 = -8;
      int i13 = 0;
      int i14 = 0;
      int i15 = 0;
      int i16 = 0;
      if (i12 <= 8)
      {
        int i40 = i5 + Math.max(0, i7);
        int[] arrayOfInt10 = arrayOfInt[(i12 + 8)];
        arrayOfInt10[0] = arrayOfInt2[i40];
        arrayOfInt10[1] = arrayOfInt3[i40];
        arrayOfInt10[2] = arrayOfInt4[i40];
        int i41 = 9 - Math.abs(i12);
        i15 += i41 * arrayOfInt2[i40];
        i14 += i41 * arrayOfInt3[i40];
        i13 += i41 * arrayOfInt4[i40];
        if (i12 > 0)
        {
          i8 += arrayOfInt10[0];
          i16 += arrayOfInt10[1];
          i6 += arrayOfInt10[2];
        }
        while (true)
        {
          if (i12 < m)
            i7 += i;
          i12++;
          break;
          i11 += arrayOfInt10[0];
          i10 += arrayOfInt10[1];
          i9 += arrayOfInt10[2];
        }
      }
      int i17 = i15;
      int i18 = i14;
      int i19 = i13;
      int i20 = 0;
      int i21 = i5;
      int i22 = i11;
      int i23 = 8;
      int i24 = i6;
      int i25 = i16;
      int i26 = i8;
      int i27 = i9;
      int i28 = i10;
      int i29 = i22;
      while (i20 < j)
      {
        arrayOfInt1[i21] = (0xFF000000 & arrayOfInt1[i21] | arrayOfInt6[i17] << 16 | arrayOfInt6[i18] << 8 | arrayOfInt6[i19]);
        int i30 = i17 - i29;
        int i31 = i18 - i28;
        int i32 = i19 - i27;
        int[] arrayOfInt8 = arrayOfInt[((17 + (i23 - 8)) % 17)];
        int i33 = i29 - arrayOfInt8[0];
        int i34 = i28 - arrayOfInt8[1];
        int i35 = i27 - arrayOfInt8[2];
        if (i5 == 0)
          arrayOfInt5[i20] = (i * Math.min(i20 + 9, m));
        int i36 = i5 + arrayOfInt5[i20];
        arrayOfInt8[0] = arrayOfInt2[i36];
        arrayOfInt8[1] = arrayOfInt3[i36];
        arrayOfInt8[2] = arrayOfInt4[i36];
        int i37 = i26 + arrayOfInt8[0];
        int i38 = i25 + arrayOfInt8[1];
        int i39 = i24 + arrayOfInt8[2];
        i17 = i30 + i37;
        i18 = i31 + i38;
        i19 = i32 + i39;
        i23 = (i23 + 1) % 17;
        int[] arrayOfInt9 = arrayOfInt[i23];
        i29 = i33 + arrayOfInt9[0];
        i28 = i34 + arrayOfInt9[1];
        i27 = i35 + arrayOfInt9[2];
        i26 = i37 - arrayOfInt9[0];
        i25 = i38 - arrayOfInt9[1];
        i24 = i39 - arrayOfInt9[2];
        i21 += i;
        i20++;
      }
    }
    z.e("pix", i + " " + j + " " + n);
    localBitmap.setPixels(arrayOfInt1, 0, i, 0, 0, i, j);
    return localBitmap;
  }

  public static BitmapFactory.Options wS(String paramString)
  {
    BitmapFactory.Options localOptions;
    if (ch.jb(paramString))
    {
      z.e("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "getImageOptions invalid path");
      localOptions = null;
    }
    while (true)
    {
      return localOptions;
      localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      a(localOptions);
      try
      {
        Bitmap localBitmap = BitmapFactory.decodeFile(paramString, localOptions);
        if (localBitmap != null)
        {
          z.i("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "getImageOptions bitmpa recycle." + localBitmap.toString());
          localBitmap.recycle();
          return localOptions;
        }
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        z.e("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "decode bitmap failed: " + localOutOfMemoryError.getMessage());
      }
    }
    return localOptions;
  }

  public static int wT(String paramString)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    Bitmap localBitmap = BitmapFactory.decodeFile(paramString, localOptions);
    if (localBitmap != null)
    {
      z.i("!32@/B4Tb64lLpJz54b3QptX9YiY+qcxYDqz", "isLongPicture bitmap recycle." + localBitmap.toString());
      localBitmap.recycle();
    }
    float f1 = localOptions.outWidth / localOptions.outHeight;
    float f2 = localOptions.outHeight / localOptions.outWidth;
    if (f1 >= 2.0F)
      return 1;
    if (f2 >= 2.0F)
      return 2;
    return -1;
  }

  public static Bitmap wU(String paramString)
  {
    return a(paramString, 0, 0, 0.0F);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.i
 * JD-Core Version:    0.6.2
 */