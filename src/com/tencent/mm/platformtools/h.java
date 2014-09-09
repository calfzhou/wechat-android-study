package com.tencent.mm.platformtools;

import android.media.ExifInterface;
import com.tencent.mm.sdk.platformtools.z;

final class h
{
  public static int iM(String paramString)
  {
    try
    {
      localExifInterface = new ExifInterface(paramString);
      int i;
      if (localExifInterface != null)
      {
        i = localExifInterface.getAttributeInt("Orientation", -1);
        if (i == -1);
      }
      switch (i)
      {
      case 4:
      case 5:
      case 7:
      default:
        return 0;
      case 6:
      case 3:
      case 8:
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        z.e("!44@/B4Tb64lLpJUqdu9+tLUD3RozCbQUj8LzFLkU1uTMFY=", "cannot read exif" + localThrowable);
        ExifInterface localExifInterface = null;
      }
      return 90;
    }
    return 180;
    return 270;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.h
 * JD-Core Version:    0.6.2
 */