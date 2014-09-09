package com.tencent.mm.network;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.compatible.g.h;
import com.tencent.mm.sdk.platformtools.ak;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public final class bp
{
  public static final String dUq = h.dOH + "/tencent/noop.dat";
  private static long dUr = Ds() / 1000L;
  private static long lastUpdateTime = 0L;

  public static long Ds()
  {
    SharedPreferences localSharedPreferences = ak.getContext().getSharedPreferences("noop_prefs", 0);
    int i = localSharedPreferences.getInt("noop_strategy", 1);
    if (1 == i)
    {
      dUr = 270L;
      new StringBuilder("getNoopIntervalInMs use hard code noop:").append(dUr);
      return 1000L * dUr;
    }
    if (3 == i)
    {
      long l2 = localSharedPreferences.getLong("noop_min_interval", 270L);
      if ((l2 >= 180L) && (l2 <= 3600L))
      {
        dUr = l2;
        return l2 * 1000L;
      }
      dUr = 270L;
      new StringBuilder("getNoopIntervalInMs use wx noop:").append(dUr);
      return 1000L * dUr;
    }
    long l1 = System.currentTimeMillis() / 1000L;
    long[] arrayOfLong;
    if (l1 - lastUpdateTime > 3600L)
    {
      arrayOfLong = Du();
      if ((arrayOfLong[0] < 180L) || (arrayOfLong[0] > 3600L))
        break label215;
    }
    label215: for (dUr = arrayOfLong[0]; ; dUr = 270L)
    {
      lastUpdateTime = l1;
      new StringBuilder("getNoopIntervalInMs use sync noop:").append(dUr);
      return 1000L * dUr;
    }
  }

  public static long Dt()
  {
    return Du()[1];
  }

  private static long[] Du()
  {
    long[] arrayOfLong = { 0L, 0L };
    File localFile = new File(dUq);
    if (!localFile.exists())
      return arrayOfLong;
    DataInputStream localDataInputStream;
    int i;
    try
    {
      localDataInputStream = new DataInputStream(new FileInputStream(localFile));
      i = localDataInputStream.readInt();
      if ((i < 180L) || (i > 3600L))
      {
        localDataInputStream.close();
        return arrayOfLong;
      }
    }
    catch (Exception localException)
    {
      new StringBuilder("getFromFile Exception:").append(localException.getStackTrace());
      return arrayOfLong;
    }
    long l = i;
    arrayOfLong[0] = l;
    int j = localDataInputStream.readInt();
    if (j > System.currentTimeMillis() / 1000L)
    {
      localDataInputStream.close();
      return arrayOfLong;
    }
    arrayOfLong[1] = j;
    localDataInputStream.close();
    return arrayOfLong;
  }

  public static void b(long paramLong1, long paramLong2)
  {
    new StringBuilder("setNoopInterval interval:").append(paramLong1).append(", svr:").append(paramLong2);
    if (paramLong2 <= 0L)
      if (paramLong1 <= 0L)
        ak.getContext().getSharedPreferences("noop_prefs", 0).edit().putInt("noop_strategy", 1).commit();
    do
    {
      return;
      if ((paramLong1 >= 180L) && (paramLong1 <= 3600L))
      {
        ak.getContext().getSharedPreferences("noop_prefs", 0).edit().putInt("noop_strategy", 3).putLong("noop_min_interval", paramLong1).commit();
        return;
      }
      new StringBuilder("setNoopInterval value invalid interval:").append(paramLong1).append(", _svrTime:").append(paramLong2);
      return;
      ak.getContext().getSharedPreferences("noop_prefs", 0).edit().putInt("noop_strategy", 2).commit();
    }
    while ((paramLong1 < 180L) || (paramLong1 > 3600L) || (System.currentTimeMillis() / 1000L < paramLong2));
    boolean bool;
    do
    {
      File localFile1;
      try
      {
        while (true)
        {
          localFile1 = new File(dUq);
          if (localFile1.exists())
          {
            long[] arrayOfLong = Du();
            if (arrayOfLong[1] > 0L)
            {
              long l = arrayOfLong[1];
              if (l >= paramLong2)
                break;
            }
            try
            {
              File localFile2 = new File(dUq);
              if ((!localFile2.exists()) && (!localFile2.createNewFile()))
                break;
              DataOutputStream localDataOutputStream = new DataOutputStream(new FileOutputStream(localFile2));
              localDataOutputStream.writeInt((int)paramLong1);
              localDataOutputStream.writeInt((int)paramLong2);
              localDataOutputStream.flush();
              localDataOutputStream.close();
              return;
            }
            catch (Exception localException2)
            {
              new StringBuilder("writeFile Exception:").append(localException2.getStackTrace());
              return;
            }
          }
        }
      }
      catch (Exception localException1)
      {
        new StringBuilder("setNoopInterval Exception:").append(localException1.getStackTrace());
        return;
      }
      bool = localFile1.createNewFile();
    }
    while (bool);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.bp
 * JD-Core Version:    0.6.2
 */