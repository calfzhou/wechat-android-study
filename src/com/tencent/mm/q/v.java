package com.tencent.mm.q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.z;

public final class v
{
  public static Bitmap J(String paramString1, String paramString2)
  {
    Bitmap localBitmap1;
    if (!bg.qW().isSDCardAvailable())
      localBitmap1 = dm(0);
    do
    {
      boolean bool;
      do
      {
        do
        {
          return localBitmap1;
          localBitmap1 = null;
        }
        while (paramString1 == null);
        bool = bg.oE();
        localBitmap1 = null;
      }
      while (!bool);
      if (paramString2 != null)
        break;
      paramString2 = K(paramString1, null);
      localBitmap1 = null;
    }
    while (paramString2 == null);
    Bitmap localBitmap2 = w.a(aa.uZ(), paramString1);
    if (localBitmap2 != null)
      return localBitmap2;
    aa.uZ().M(paramString1, paramString2);
    return null;
  }

  private static String K(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (!bg.oE()))
      paramString2 = null;
    a locala;
    do
    {
      return paramString2;
      locala = aa.uY().fz(paramString1);
    }
    while (locala.field_brandIconURL == null);
    return locala.field_brandIconURL;
  }

  public static Bitmap b(String paramString1, String paramString2, int paramInt)
  {
    Bitmap localBitmap1;
    if (!bg.qW().isSDCardAvailable())
      localBitmap1 = dm(paramInt);
    do
    {
      boolean bool;
      do
      {
        do
        {
          return localBitmap1;
          localBitmap1 = null;
        }
        while (paramString1 == null);
        bool = bg.oE();
        localBitmap1 = null;
      }
      while (!bool);
      if (paramString2 != null)
        break;
      paramString2 = K(paramString1, null);
      localBitmap1 = null;
    }
    while (paramString2 == null);
    Bitmap localBitmap2 = w.a(aa.uZ(), paramString1, paramString2);
    if (localBitmap2 != null)
      return localBitmap2;
    aa.uZ().M(paramString1, paramString2);
    return null;
  }

  private static Bitmap dm(int paramInt)
  {
    Bitmap localBitmap = null;
    if (paramInt <= 0);
    do
    {
      return localBitmap;
      BitmapFactory.Options localOptions = new BitmapFactory.Options();
      i.a(localOptions);
      localBitmap = BitmapFactory.decodeStream(ak.getContext().getResources().openRawResource(paramInt), null, localOptions);
    }
    while (localBitmap == null);
    return i.a(localBitmap, false, localBitmap.getWidth() >> 1);
  }

  public static Bitmap fJ(String paramString)
  {
    if ((ch.jb(paramString)) || (!bg.qW().isSDCardAvailable()) || (!bg.oE()))
      return null;
    Bitmap localBitmap = w.a(aa.uZ(), paramString, 1.5F);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    boolean bool = false;
    if (localBitmap == null)
      bool = true;
    arrayOfObject[1] = String.valueOf(bool);
    z.d("!32@/B4Tb64lLpKQQogTCo8oV6VgvXdJVE+T", "get verify user icon = %s, is null ? %s", arrayOfObject);
    return localBitmap;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.q.v
 * JD-Core Version:    0.6.2
 */