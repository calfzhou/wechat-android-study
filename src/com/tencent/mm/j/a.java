package com.tencent.mm.j;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.StatFs;
import android.preference.PreferenceManager;
import com.tencent.mm.compatible.g.m;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

public final class a
{
  public static int Ac()
  {
    try
    {
      localStatFs = new StatFs(m.getDataDirectory().getPath());
      long l5 = localStatFs.getAvailableBlocks();
      int i = localStatFs.getBlockSize();
      l2 = l5 * i;
    }
    catch (Exception localException1)
    {
      try
      {
        StatFs localStatFs;
        long l3 = localStatFs.getBlockCount() * localStatFs.getBlockSize();
        long l6 = localStatFs.getFreeBlocks();
        int j = localStatFs.getBlockSize();
        for (long l4 = l6 * j; ; l4 = 0L)
        {
          Object[] arrayOfObject = new Object[3];
          arrayOfObject[0] = Long.valueOf(l2);
          arrayOfObject[1] = Long.valueOf(l3);
          arrayOfObject[2] = Long.valueOf(l4);
          z.i("!32@/B4Tb64lLpJTdx1LqNowoXUlOfngbDfg", "checkRomSparespace available:%d all:%d freeSize :%d", arrayOfObject);
          if ((l3 == 0L) || (l2 / l3 >= 0.1000000014901161D))
            break label184;
          if (l2 >= 5242880L)
            break;
          return 2;
          localException1 = localException1;
          l1 = 0L;
          z.e("!32@/B4Tb64lLpJTdx1LqNowoXUlOfngbDfg", "get db spare space error");
          l2 = l1;
          l3 = 0L;
        }
        if (l2 < 10485760L)
          return 1;
      }
      catch (Exception localException2)
      {
        while (true)
        {
          long l2;
          long l1 = l2;
        }
      }
    }
    label184: return 0;
  }

  public static void a(Context paramContext, long paramLong)
  {
    PreferenceManager.getDefaultSharedPreferences(paramContext).edit().putLong("db_check_tip_time", paramLong).commit();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.j.a
 * JD-Core Version:    0.6.2
 */