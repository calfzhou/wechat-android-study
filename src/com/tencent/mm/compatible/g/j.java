package com.tencent.mm.compatible.g;

import android.os.Build.VERSION;
import android.os.StatFs;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

public final class j
{
  public static boolean cp(int paramInt)
  {
    return Build.VERSION.SDK_INT >= paramInt;
  }

  public static boolean cq(int paramInt)
  {
    return Build.VERSION.SDK_INT < paramInt;
  }

  public static boolean nI()
  {
    String str = m.getExternalStorageDirectory().getAbsolutePath();
    if (h.dOH.equalsIgnoreCase(str))
      try
      {
        boolean bool2 = m.getExternalStorageState().equals("mounted");
        boolean bool3 = false;
        if (bool2)
        {
          boolean bool4 = new File(m.getExternalStorageDirectory().getAbsolutePath()).canWrite();
          bool3 = false;
          if (bool4)
            bool3 = true;
        }
        return bool3;
      }
      catch (Exception localException2)
      {
        z.d("!24@/B4Tb64lLpJct1kv8RvO0Q==", "summer isSDCardAvail 1 e: " + localException2.getMessage() + " SDCARD_ROOT: " + h.dOH);
        return false;
      }
    try
    {
      boolean bool1 = new File(h.dOH).canWrite();
      return bool1;
    }
    catch (Exception localException1)
    {
      z.d("!24@/B4Tb64lLpJct1kv8RvO0Q==", "summer isSDCardAvail 1 e: " + localException1.getMessage() + " SDCARD_ROOT: " + h.dOH);
    }
    return false;
  }

  public static boolean u(long paramLong)
  {
    if (!nI())
      z.i("!24@/B4Tb64lLpJct1kv8RvO0Q==", "summer isSDCardHaveEnoughSpace sdcard not avail and ret false");
    StatFs localStatFs;
    long l1;
    long l2;
    do
    {
      return false;
      localStatFs = new StatFs(h.dOH);
      l1 = localStatFs.getBlockCount();
      l2 = localStatFs.getAvailableBlocks();
    }
    while ((l1 <= 0L) || (l1 - l2 < 0L));
    if (localStatFs.getBlockSize() * localStatFs.getFreeBlocks() < paramLong)
    {
      z.i("!24@/B4Tb64lLpJct1kv8RvO0Q==", "summer isSDCardHaveEnoughSpace needSize: " + paramLong + " not enough and ret false");
      return false;
    }
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.g.j
 * JD-Core Version:    0.6.2
 */