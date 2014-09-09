package com.tencent.mm.ap.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.tencent.mm.sdk.platformtools.e;
import java.util.Hashtable;

public final class aa
{
  private static Bitmap c(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    Hashtable localHashtable = new Hashtable();
    localHashtable.put(l.izH, "utf-8");
    localHashtable.put(l.izL, Integer.valueOf(1));
    while (true)
    {
      int i;
      try
      {
        d locald = new ab().a(paramString, a.iyM, paramInt1, paramInt2, localHashtable);
        int[] arrayOfInt = new int[paramInt1 * paramInt2];
        i = 0;
        int j;
        if (j < paramInt1)
        {
          if (locald.aO(j, i))
          {
            arrayOfInt[(j + i * paramInt1)] = -16777216;
          }
          else
          {
            arrayOfInt[(j + i * paramInt1)] = -1;
            continue;
            Bitmap localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
            localBitmap.setPixels(arrayOfInt, 0, paramInt1, 0, 0, paramInt1, paramInt2);
            return localBitmap;
            if (i >= paramInt2)
              continue;
            j = 0;
            continue;
          }
          j++;
          continue;
        }
      }
      catch (ak localak)
      {
        return null;
      }
      i++;
    }
  }

  public static Bitmap k(String paramString, Context paramContext)
  {
    return c(paramString, e.a(paramContext, 250.0F), e.a(paramContext, 250.0F), 1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ap.a.aa
 * JD-Core Version:    0.6.2
 */