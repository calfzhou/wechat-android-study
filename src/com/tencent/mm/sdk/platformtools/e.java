package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public final class e
{
  public static int a(Context paramContext, float paramFloat)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
    return Math.round(paramFloat * localDisplayMetrics.densityDpi / 160.0F);
  }

  public static Bitmap c(String paramString, float paramFloat)
  {
    float f = 160.0F * paramFloat;
    Bitmap localBitmap = i.f(paramString, paramFloat);
    if (localBitmap != null)
      localBitmap.setDensity((int)f);
    return localBitmap;
  }

  public static Bitmap wQ(String paramString)
  {
    try
    {
      z.d("!56@/B4Tb64lLpI7sJ4llUUbo94xDYV6zp6Z2hZMuNWhDuQGnIZsf7Z1zw==", "get bitmap from url:" + paramString);
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(paramString).openConnection();
      localHttpURLConnection.setDoInput(true);
      localHttpURLConnection.connect();
      InputStream localInputStream = localHttpURLConnection.getInputStream();
      Bitmap localBitmap = i.decodeStream(localInputStream);
      localInputStream.close();
      return localBitmap;
    }
    catch (IOException localIOException)
    {
      localIOException = localIOException;
      z.e("!56@/B4Tb64lLpI7sJ4llUUbo94xDYV6zp6Z2hZMuNWhDuQGnIZsf7Z1zw==", "get bitmap from url failed");
      return null;
    }
    finally
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.e
 * JD-Core Version:    0.6.2
 */