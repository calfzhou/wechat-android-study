package com.tencent.mm.compatible.c;

import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;
import java.io.InputStream;

public final class p
{
  static short dNn = 0;
  static String dNo = null;

  public static short mU()
  {
    int i = 4;
    int j;
    int k;
    if (q.mZ())
    {
      j = 7;
      if ((v.dNA.dNq) && (v.dNA.dNs == 0))
      {
        z.d("!32@/B4Tb64lLpKXjvTgeeSheYNszmd2wFa1", "disable armv6 by server ");
        j &= -3;
      }
      if ((v.dNA.dNq) && (v.dNA.dNr == 0))
      {
        z.d("!32@/B4Tb64lLpKXjvTgeeSheYNszmd2wFa1", "disable armv7 by server ");
        j &= -5;
      }
      k = q.nb();
      if (k <= i)
        break label157;
    }
    while (true)
    {
      label80: int m = Integer.parseInt(mV()) / 1000;
      int n;
      if (i > 2)
        n = m * 2;
      while (true)
      {
        label101: int i1 = n / 100;
        if (i1 > 30)
          i1 = 30;
        while (true)
        {
          short s = (short)(i1 + (j + (i << 4) << 8));
          dNn = s;
          return s;
          if (q.na())
          {
            j = 3;
            break;
          }
          j = 1;
          break;
          label157: if (k > 0)
            break label199;
          i = 1;
          break label80;
          if (i <= 1)
            break label193;
          n = m * 3 >> 1;
          break label101;
          if (i1 < 5)
            i1 = 5;
        }
        label193: n = m;
      }
      label199: i = k;
    }
  }

  private static String mV()
  {
    String str = "0";
    try
    {
      InputStream localInputStream = new ProcessBuilder(new String[] { "/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq" }).start().getInputStream();
      byte[] arrayOfByte = new byte[24];
      while (localInputStream.read(arrayOfByte) != -1)
        str = str + new String(arrayOfByte);
      localInputStream.close();
      return str.trim();
    }
    catch (IOException localIOException)
    {
      while (true)
        str = "0";
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.c.p
 * JD-Core Version:    0.6.2
 */