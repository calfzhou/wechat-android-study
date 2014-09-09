package com.tencent.mm.aq;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;

public final class a
{
  private static float density = -1.0F;
  private static b ibF = null;

  public static int fromDPToPix(Context paramContext, int paramInt)
  {
    return Math.round(getDensity(paramContext) * paramInt);
  }

  public static float getDensity(Context paramContext)
  {
    if (paramContext == null)
      paramContext = ak.getContext();
    if (density < 0.0F)
      density = paramContext.getResources().getDisplayMetrics().density;
    return density;
  }

  public static int l(Context paramContext, int paramInt)
  {
    if (ibF == null)
    {
      if (paramContext == null)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(paramInt);
        z.e("!32@/B4Tb64lLpI6ThRfUFA52fsT5J7x2cIa", "get color, resId %d, but context is null", arrayOfObject);
        return 0;
      }
      return paramContext.getResources().getColor(paramInt);
    }
    return ibF.aFH();
  }

  public static ColorStateList m(Context paramContext, int paramInt)
  {
    if (ibF == null)
    {
      if (paramContext == null)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(paramInt);
        z.e("!32@/B4Tb64lLpI6ThRfUFA52fsT5J7x2cIa", "get color state list, resId %d, but context is null", arrayOfObject);
        return null;
      }
      return paramContext.getResources().getColorStateList(paramInt);
    }
    return ibF.aFI();
  }

  public static Drawable n(Context paramContext, int paramInt)
  {
    if (ibF == null)
    {
      if (paramContext == null)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(paramInt);
        z.e("!32@/B4Tb64lLpI6ThRfUFA52fsT5J7x2cIa", "get drawable, resId %d, but context is null", arrayOfObject);
        return null;
      }
      return paramContext.getResources().getDrawable(paramInt);
    }
    return ibF.aFJ();
  }

  public static int o(Context paramContext, int paramInt)
  {
    if (ibF == null)
    {
      if (paramContext == null)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(paramInt);
        z.e("!32@/B4Tb64lLpI6ThRfUFA52fsT5J7x2cIa", "get dimension pixel size, resId %d, but context is null", arrayOfObject);
        return 0;
      }
      return paramContext.getResources().getDimensionPixelSize(paramInt);
    }
    return ibF.aFK();
  }

  public static String p(Context paramContext, int paramInt)
  {
    if (ibF == null)
    {
      if (paramContext == null)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(paramInt);
        z.e("!32@/B4Tb64lLpI6ThRfUFA52fsT5J7x2cIa", "get string, resId %d, but context is null", arrayOfObject);
        return "";
      }
      return paramContext.getResources().getString(paramInt);
    }
    return ibF.aFL();
  }

  public static int q(Context paramContext, int paramInt)
  {
    return Math.round(paramInt / getDensity(paramContext));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.aq.a
 * JD-Core Version:    0.6.2
 */