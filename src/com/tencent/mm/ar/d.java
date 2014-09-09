package com.tencent.mm.ar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.tencent.mm.c;
import com.tencent.mm.c.a.eh;
import com.tencent.mm.c.a.ei;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.z;

public final class d
{
  private static d iHc = null;
  private String[] iHd;
  private String[] iHe;
  private String[] iHf;

  private d(Context paramContext)
  {
    this.iHd = paramContext.getResources().getStringArray(c.Np);
    this.iHe = paramContext.getResources().getStringArray(c.adR);
    this.iHf = paramContext.getResources().getStringArray(c.adS);
  }

  public static Drawable C(Context paramContext, int paramInt)
  {
    ce(paramContext);
    int i = E(paramContext, paramInt);
    if (i == 0);
    Bitmap localBitmap;
    do
    {
      return null;
      localBitmap = i.nK(i);
    }
    while (localBitmap == null);
    return new BitmapDrawable(paramContext.getResources(), localBitmap);
  }

  public static Drawable D(Context paramContext, int paramInt)
  {
    if (paramInt < 100)
      paramInt += 100;
    ce(paramContext);
    int i = E(paramContext, paramInt);
    if (i == 0);
    Bitmap localBitmap;
    do
    {
      return null;
      localBitmap = i.nK(i);
    }
    while (localBitmap == null);
    return new BitmapDrawable(paramContext.getResources(), localBitmap);
  }

  private static int E(Context paramContext, int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= 99))
    {
      int k = paramContext.getResources().getIdentifier("smiley_" + paramInt, "drawable", paramContext.getPackageName());
      if (k == 0)
        return 0;
      return k;
    }
    ce(paramContext);
    int i;
    switch (paramInt)
    {
    default:
      i = 0;
    case 100:
    case 101:
    case 102:
    case 103:
    case 104:
    case 105:
    case 106:
    case 107:
    case 108:
    case 109:
    case 110:
    case 111:
    case 112:
    case 113:
    case 114:
    case 115:
    case 116:
    case 117:
    case 118:
    case 119:
    }
    while (true)
    {
      int j = paramContext.getResources().getIdentifier("emoji_" + i, "drawable", paramContext.getPackageName());
      if (j == 0)
        break;
      return j;
      i = 360;
      continue;
      i = 351;
      continue;
      i = 357;
      continue;
      i = 348;
      continue;
      i = 355;
      continue;
      i = 352;
      continue;
      i = 96;
      continue;
      i = 342;
      continue;
      i = 344;
      continue;
      i = 349;
      continue;
      i = 353;
      continue;
      i = 115;
      continue;
      i = 116;
      continue;
      i = 394;
      continue;
      i = 368;
      continue;
      i = 165;
      continue;
      i = 136;
      continue;
      i = 337;
      continue;
      i = 280;
      continue;
      i = 107;
    }
  }

  public static String F(Context paramContext, int paramInt)
  {
    if (paramInt < 0)
    {
      z.w("!44@/B4Tb64lLpJxi1in2U3vw/p95Zq7Urqe742JHP0D8lI=", "get text, error index");
      return "";
    }
    if (ce(paramContext).iHd.length <= paramInt)
      return G(paramContext, paramInt - 100);
    return ce(paramContext).iHd[paramInt];
  }

  public static String G(Context paramContext, int paramInt)
  {
    if (paramInt < 0)
    {
      z.w("!44@/B4Tb64lLpJxi1in2U3vw/p95Zq7Urqe742JHP0D8lI=", "get emoji text, error index down");
      return "";
    }
    if (ce(paramContext).iHe.length <= paramInt)
    {
      z.w("!44@/B4Tb64lLpJxi1in2U3vw/p95Zq7Urqe742JHP0D8lI=", "get emoji text, error index up");
      return "";
    }
    eh localeh = new eh();
    a.aGB().g(localeh);
    if (localeh.cJX.cIb == 1);
    for (int i = 1; i != 0; i = 0)
    {
      String[] arrayOfString = ce(paramContext).iHf[paramInt].split(" ");
      char[] arrayOfChar1 = Character.toChars(Integer.decode(arrayOfString[0]).intValue());
      char[] arrayOfChar2 = Character.toChars(Integer.decode(arrayOfString[1]).intValue());
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(arrayOfChar1);
      localStringBuilder.append(arrayOfChar2);
      return localStringBuilder.toString();
    }
    return ce(paramContext).iHe[paramInt];
  }

  public static int cc(Context paramContext)
  {
    int i = ce(paramContext).iHd.length;
    if (i <= 0)
      i = paramContext.getResources().getStringArray(c.Np).length;
    return i;
  }

  public static int cd(Context paramContext)
  {
    int i = ce(paramContext).iHe.length;
    if (i <= 0)
      i = paramContext.getResources().getStringArray(c.adR).length;
    return i;
  }

  private static d ce(Context paramContext)
  {
    if (iHc == null)
      iHc = new d(paramContext);
    return iHc;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ar.d
 * JD-Core Version:    0.6.2
 */