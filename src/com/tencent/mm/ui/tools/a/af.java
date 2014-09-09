package com.tencent.mm.ui.tools.a;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

final class af
{
  static void h(InputStream paramInputStream)
  {
    if (paramInputStream == null)
      return;
    try
    {
      paramInputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  static int nb()
  {
    try
    {
      int i = new File("/sys/devices/system/cpu/").listFiles(new ag()).length;
      return i;
    }
    catch (Exception localException)
    {
    }
    return 1;
  }

  static int s(Bitmap paramBitmap)
  {
    if (Build.VERSION.SDK_INT >= 12);
    for (int i = paramBitmap.getByteCount(); i < 0; i = paramBitmap.getRowBytes() * paramBitmap.getHeight())
      throw new IllegalStateException("Negative size: " + paramBitmap);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.af
 * JD-Core Version:    0.6.2
 */