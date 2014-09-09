package com.tencent.mm.protocal;

import android.os.Build;
import android.os.Build.VERSION;
import junit.framework.Assert;

public final class a
{
  public static int hNc;
  public static String hrg = "android-" + Build.VERSION.SDK_INT;
  public static final String hrh = Build.BRAND;
  public static final String hri = Build.MODEL + Build.CPU_ABI;
  public static final String hrj = "android-" + Build.VERSION.SDK_INT;
  public static final String hrk = "android-" + Build.MANUFACTURER;
  public static final String hrl = Build.VERSION.SDK_INT;
  public static final String hrm = Build.MANUFACTURER + "-" + Build.MODEL;
  public static int hrn = 621019187;
  private static final int[] hro;
  private static final int[] hrp;
  public static boolean hrq;
  public static boolean hrr;
  public static final byte[] hrs;
  public static final byte[] hrt;
  public static final byte[] hru;

  static
  {
    hNc = 2;
    hro = new int[] { 603979937, 603979938, 604045492, 604111029, 604111031, 604111033, 604111035, 604176592, 604176593, 604176594, 604176595, 604307705, 604307706, 620756993, 620757002, 620757008, 620757013, 620757014, 620757015, 620757768, 620757769, 620757781, 620757782, 620757783, 620758024, 620758025, 620758026, 620758237, 620822536, 620822538, 620822539, 620822540, 620888064, 620888065, 620888082, 620888083, 620888084, 620888085, 620888088, 620888089, 620888328, 620888329, 620888330, 620888331, 620888332, 620888333, 620953608, 620953609, 620953610, 620953611, 620953624, 620953625, 620953626, 620953864, 620953865, 620953880, 620953881, 620953882, 620953883, 621019144, 621019145, 621019160, 621019161, 621019168, 621019162, 621019163 };
    hrp = new int[] { 620822544, 620822545, 620888104, 620888105, 620888106, 620888360, 620888361, 620953632, 620953633, 620953640, 620953641, 620953642, 620953643, 620953888, 621019176, 621019177 };
    hrq = aCw();
    hrr = aCv();
    hrs = null;
    hrt = null;
    hru = null;
    Assert.assertTrue("giveup rtType now ! Use the funcid !", true);
  }

  private static boolean aCv()
  {
    for (int i = 0; ; i++)
    {
      int j = hrp.length;
      boolean bool = false;
      if (i < j)
      {
        if (hrp[i] == hrn)
          bool = true;
      }
      else
        return bool;
    }
  }

  private static boolean aCw()
  {
    for (int i = 0; ; i++)
    {
      int j = hro.length;
      boolean bool = false;
      if (i < j)
      {
        if (hro[i] == hrn)
          bool = true;
      }
      else
        return bool;
    }
  }

  public static boolean aCx()
  {
    return (!hrq) && (!hrr);
  }

  public static void nf(int paramInt)
  {
    hrn = paramInt;
    hrq = aCw();
    hrr = aCv();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a
 * JD-Core Version:    0.6.2
 */