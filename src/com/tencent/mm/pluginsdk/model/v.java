package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.tencent.mm.a.f;
import com.tencent.mm.h;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.platformtools.q;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.z;

public final class v
  implements q
{
  private String fHu;
  private boolean huw;
  private int type;
  private String url;

  public v(String paramString1, int paramInt, String paramString2, boolean paramBoolean)
  {
    this.url = paramString1;
    this.type = paramInt;
    this.fHu = paramString2;
    this.huw = paramBoolean;
  }

  public static String i(String paramString1, int paramInt, String paramString2)
  {
    if (bg.oE())
    {
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = bg.qW().pa();
      arrayOfObject[1] = Integer.valueOf(paramInt);
      arrayOfObject[2] = paramString2;
      arrayOfObject[3] = f.d(paramString1.getBytes());
      return String.format("%s/ReaderApp_%d%s_%s", arrayOfObject);
    }
    return "";
  }

  public final String DA()
  {
    return this.url;
  }

  public final String DB()
  {
    return this.url + this.fHu;
  }

  public final boolean DC()
  {
    return false;
  }

  public final boolean DD()
  {
    return this.huw;
  }

  public final Bitmap DE()
  {
    return BitmapFactory.decodeResource(ak.getContext().getResources(), h.Xs);
  }

  public final String Dy()
  {
    return i(this.url, this.type, this.fHu);
  }

  public final String Dz()
  {
    return this.url;
  }

  public final Bitmap a(Bitmap paramBitmap, r paramr)
  {
    int i = 100;
    String str;
    w localw;
    Resources localResources;
    if (r.dUL == paramr)
    {
      str = this.fHu;
      localw = new w();
      Context localContext = ak.getContext();
      if (localContext == null)
        break label221;
      localResources = localContext.getResources();
      if (localResources == null)
        break label221;
    }
    label221: for (DisplayMetrics localDisplayMetrics = localResources.getDisplayMetrics(); ; localDisplayMetrics = null)
    {
      int j;
      if (localDisplayMetrics != null)
        if ("@T".equals(str))
        {
          j = (int)(localDisplayMetrics.widthPixels - 60.0F * localDisplayMetrics.density);
          i = (int)(135.0F * localDisplayMetrics.density);
        }
      while (true)
      {
        localw.w = j;
        localw.LN = i;
        z.d("!56@/B4Tb64lLpIeqqjD22RSX6pYxTSKVSHcFGcHMImkpwmTanK6wm6EGA==", localw.toString());
        paramBitmap = i.b(paramBitmap, localw.w, localw.LN);
        try
        {
          i.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, Dy(), false);
          return paramBitmap;
          i = (int)(50.0F * localDisplayMetrics.density);
          j = i;
          continue;
          if ("@T".equals(str))
          {
            j = 2147483647;
            i = 270;
          }
          else
          {
            j = i;
          }
        }
        catch (Exception localException)
        {
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = this.url;
          z.e("!56@/B4Tb64lLpIeqqjD22RSX6pYxTSKVSHcFGcHMImkpwmTanK6wm6EGA==", "save image %s fail", arrayOfObject);
          return paramBitmap;
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.v
 * JD-Core Version:    0.6.2
 */