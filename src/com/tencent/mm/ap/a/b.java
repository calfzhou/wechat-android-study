package com.tencent.mm.ap.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.tencent.mm.sdk.platformtools.e;
import java.util.Hashtable;

public final class b
{
  private static Bitmap a(d paramd)
  {
    int i = paramd.getWidth();
    int j = paramd.getHeight();
    int[] arrayOfInt = new int[i * j];
    for (int k = 0; k < j; k++)
    {
      int m = k * i;
      int n = 0;
      if (n < i)
      {
        int i1 = m + n;
        if (paramd.aO(n, k));
        for (int i2 = -16777216; ; i2 = -1)
        {
          arrayOfInt[i1] = i2;
          n++;
          break;
        }
      }
    }
    Bitmap localBitmap = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
    localBitmap.setPixels(arrayOfInt, 0, i, 0, 0, i, j);
    return localBitmap;
  }

  public static Bitmap a(String paramString, Context paramContext, a parama)
  {
    int i = e.a(paramContext, 350.0F);
    int j = e.a(paramContext, 130.0F);
    int k = Math.max(95, i);
    Hashtable localHashtable = new Hashtable();
    localHashtable.put(l.izL, Integer.valueOf(1));
    return a(new v().a(paramString, parama, k, j, localHashtable));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ap.a.b
 * JD-Core Version:    0.6.2
 */