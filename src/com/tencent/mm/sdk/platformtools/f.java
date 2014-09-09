package com.tencent.mm.sdk.platformtools;

import android.media.ExifInterface;
import java.io.IOException;

public final class f
{
  public static int iM(String paramString)
  {
    if (!c.Gw);
    while (true)
    {
      return 0;
      if (ch.jb(paramString))
      {
        z.d("!56@/B4Tb64lLpI7sJ4llUUbo94xDYV6zp6Z2hZMuNWhDuQGnIZsf7Z1zw==", "filepath is null or nil");
        return 0;
      }
      if (!com.tencent.mm.a.c.ac(paramString))
      {
        z.d("!56@/B4Tb64lLpI7sJ4llUUbo94xDYV6zp6Z2hZMuNWhDuQGnIZsf7Z1zw==", "file not exist:[%s]", new Object[] { paramString });
        return 0;
      }
      try
      {
        localExifInterface = new ExifInterface(paramString);
        if (localExifInterface != null)
        {
          int i = localExifInterface.getAttributeInt("Orientation", -1);
          if (i != -1)
            switch (i)
            {
            case 4:
            case 5:
            case 7:
            default:
              return 0;
            case 3:
              return 180;
            case 6:
            case 8:
            }
        }
      }
      catch (IOException localIOException)
      {
        while (true)
        {
          z.e("!56@/B4Tb64lLpI7sJ4llUUbo94xDYV6zp6Z2hZMuNWhDuQGnIZsf7Z1zw==", "cannot read exif" + localIOException);
          ExifInterface localExifInterface = null;
        }
        return 90;
      }
    }
    return 270;
  }

  public static g wR(String paramString)
  {
    if (!c.Gw);
    while (true)
    {
      return null;
      if (ch.jb(paramString))
      {
        z.d("!56@/B4Tb64lLpI7sJ4llUUbo94xDYV6zp6Z2hZMuNWhDuQGnIZsf7Z1zw==", "filepath is null or nil");
        return null;
      }
      if (!com.tencent.mm.a.c.ac(paramString))
      {
        z.d("!56@/B4Tb64lLpI7sJ4llUUbo94xDYV6zp6Z2hZMuNWhDuQGnIZsf7Z1zw==", "file not exist:[%s]", new Object[] { paramString });
        return null;
      }
      try
      {
        localExifInterface = new ExifInterface(paramString);
        if (localExifInterface == null)
          continue;
        float[] arrayOfFloat = new float[2];
        if (!localExifInterface.getLatLong(arrayOfFloat))
          continue;
        g localg = new g();
        localg.cGl = arrayOfFloat[0];
        localg.idT = arrayOfFloat[1];
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Float.valueOf(localg.cGl);
        arrayOfObject[1] = Float.valueOf(localg.idT);
        z.d("!56@/B4Tb64lLpI7sJ4llUUbo94xDYV6zp6Z2hZMuNWhDuQGnIZsf7Z1zw==", "exif info, latitude:%f, longtitude:%f", arrayOfObject);
        return localg;
      }
      catch (IOException localIOException)
      {
        while (true)
        {
          z.e("!56@/B4Tb64lLpI7sJ4llUUbo94xDYV6zp6Z2hZMuNWhDuQGnIZsf7Z1zw==", "cannot read exif" + localIOException);
          ExifInterface localExifInterface = null;
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.f
 * JD-Core Version:    0.6.2
 */