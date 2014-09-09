package com.tencent.mm.y;

import android.graphics.Bitmap.CompressFormat;
import android.os.AsyncTask;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;

final class at extends AsyncTask
{
  at(ar paramar)
  {
  }

  private static Integer a(av[] paramArrayOfav)
  {
    if ((paramArrayOfav.length == 0) || (ch.jb(paramArrayOfav[0].path)) || (paramArrayOfav[0].bitmap == null))
    {
      z.e("!44@/B4Tb64lLpJDZix/OvlTO00TbpgnCurrdusxe1vELWg=", "nothing to save");
      return null;
    }
    try
    {
      i.a(paramArrayOfav[0].bitmap, 100, Bitmap.CompressFormat.PNG, paramArrayOfav[0].path, false);
      return null;
    }
    catch (IOException localIOException)
    {
      z.e("!44@/B4Tb64lLpJDZix/OvlTO00TbpgnCurrdusxe1vELWg=", "save bitmap to image failed: " + localIOException.toString());
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.at
 * JD-Core Version:    0.6.2
 */