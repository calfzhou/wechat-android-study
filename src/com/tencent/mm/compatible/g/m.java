package com.tencent.mm.compatible.g;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.Environment;
import com.tencent.mm.compatible.c.n;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.sdk.platformtools.ch;
import java.io.File;

public final class m
{
  public static File getDataDirectory()
  {
    if (ch.jb(v.dNG.dNg))
      return Environment.getDataDirectory();
    return new File(v.dNG.dNg);
  }

  public static File getExternalStorageDirectory()
  {
    if (ch.jb(v.dNG.dNe))
      return Environment.getExternalStorageDirectory();
    return new File(v.dNG.dNe);
  }

  @TargetApi(8)
  public static File getExternalStoragePublicDirectory(String paramString)
  {
    if (ch.jb(v.dNG.dNf))
      return Environment.getExternalStoragePublicDirectory(paramString);
    return new File(v.dNG.dNf);
  }

  public static String getExternalStorageState()
  {
    if (ch.jb(v.dNG.dNi))
      return Environment.getExternalStorageState();
    return v.dNG.dNi;
  }

  public static boolean nI()
  {
    try
    {
      boolean bool1 = getExternalStorageState().equals("mounted");
      boolean bool2 = false;
      if (bool1)
      {
        boolean bool3 = new File(getExternalStorageDirectory().getAbsolutePath()).canWrite();
        bool2 = false;
        if (bool3)
          bool2 = true;
      }
      return bool2;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static int nN()
  {
    if (Build.VERSION.SDK_INT >= 11)
      return new r().mode;
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.g.m
 * JD-Core Version:    0.6.2
 */